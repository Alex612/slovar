package com.slov;

import java.util.Map;

public interface Combined {

    String listOfValidation(String key, Integer type);

    Map<String, String> getString(Integer type);

    String removeKey(String key, Integer type);

    String addKey(String key, String value, Integer type);

    String getKey(String key, Integer type);
}