package com.slov;

import java.util.List;

import java.util.Map;


public class Combination implements Combined {
    private ProcessedFiles fp;
    private List<Validated> val;

    public Combination(List<Validated> val, ProcessedFiles fp) {
        this.val = val;
        this.fp = fp;
    }

    public Map<String, String> getString(String c) {
        if (Integer.parseInt(c) == 0) {
            return fp.getMapString();
        } else {
            return fp.getMapNumber();
        }
    }

    public String listOfValidation(String key, String c) {
        if (Integer.parseInt(c) == 0) {
            return val.get(0).validateKey(key);
        }
        if (Integer.parseInt(c) == 1) {
            return val.get(1).validateKey(key);
        } else return Const.ERROR;
    }

    public String removeKey(String key, String c) {
        try {
            if (listOfValidation(key, c).equals(key)) {
                return fp.removeKey(key);
            }
            return listOfValidation(key, c);
        } catch (Exception e) {
            return Const.ERROR;
        }
    }


    public String addKey(String key, String value, String c) {
        try {
            if (listOfValidation(key, c).equals(key)) {
                return fp.addKey(key, value);
            }
            return listOfValidation(key, c);
        } catch (Exception e) {
            return Const.ERROR;
        }
    }


    public String getKey(String key, String c) {
        try {
            if ((key.length() == Const.I_PL && Integer.parseInt(c) == 0) || (key.length() == Const.I_NUM && Integer.parseInt(c) == 1)) {
                return fp.getKey(key);
            }
            return Const.NO_KEY;

        } catch (Exception e) {
            return Const.ERROR;
        }
    }
}