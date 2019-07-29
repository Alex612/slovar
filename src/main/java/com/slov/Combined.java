package com.slov;

import java.util.Map;

public interface Combined {

    String listOfValidation(String key, String c);

    Map<String, String> getString(String c);

    String removeKey(String key, String c);

    String addKey(String key, String value, String c);

    String getKey(String key, String c);
}