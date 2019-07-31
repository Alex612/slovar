package com.slov;

//import java.util.List;

import java.util.Map;

public class Combination implements Combined {
    private ProcessedFiles fp;
    //private List<Validated> val;
    private NumericValidation numericValidation;
    private PlainValidation plainValidation;


    public Combination(NumericValidation numericValidation, PlainValidation plainValidation, ProcessedFiles fp) {
        this.numericValidation = numericValidation;
        this.plainValidation = plainValidation;
        this.fp = fp;
    }

    public Map<String, String> getString(Integer type) {
        return fp.getMap(type);

    }

    public String listOfValidation(String key, Integer type) {
        if (type == 0) {
            return plainValidation.validateKey(key);
        }
        if (type == 1) {
            return numericValidation.validateKey(key);
        } else return Const.ERROR;
    }

    public String removeKey(String key, Integer type) {
        try {
            if (listOfValidation(key, type).equals(key)) {
                return fp.removeKey(key);
            }
            return listOfValidation(key, type);
        } catch (Exception e) {
            return Const.ERROR;
        }
    }


    public String addKey(String key, String value, Integer type) {
        try {
            if (listOfValidation(key, type).equals(key)) {
                return fp.addKey(key, value, type);
            }
            return listOfValidation(key, type);
        } catch (Exception e) {
            return Const.ERROR;
        }
    }


    public String getKey(String key, Integer type) {
        try {
            if ((key.length() == Const.I_PL && type == 0) || (key.length() == Const.I_NUM && type == 1)) {
                return fp.getKey(key);
            }
            return Const.NO_KEY;

        } catch (Exception e) {
            return Const.ERROR;
        }
    }
}