package com.slov;

public class NumericValidation implements Validated {
    public NumericValidation() {
    }

    public String validateKey(String key) {
        if (key.matches(Const.V_NUM)) {
            if (key.length() == Const.I_NUM) {
                return key;
            }
            return Const.SIZE_NUMERIC_ERROR;
        }
        return Const.INVALID_DICTIONARY_CHARACTERS;
    }
}