package com.bignerdranch.android.criminallntent;

import android.content.Context;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/**
 * Created by Leo on 2017/7/13.
 */

public class CrimeLab{
    //sCrimeLab的前缀s 这是android开发的命名约定，表示为静态变量。
    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes; //用来存放Crime对象的List

    public static CrimeLab get(Context context){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();
    }

    public void addCrime(Crime c){
        mCrimes.add(c);
    }

    public List<Crime> getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for(Crime crime : mCrimes){
            if(crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }

        public void removeCrime(UUID id){
            Iterator<Crime> it = mCrimes.iterator();
            while(it.hasNext()) {
                Crime crime  = it.next();
                if(crime.getId().equals(id)) {
                    it.remove();
                }
            }
        }
}
