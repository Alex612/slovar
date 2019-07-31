package com.slov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NumericValidation implements Validated {
    @Autowired
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