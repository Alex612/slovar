package com.slov;

import java.util.Map;

public interface FileProcessing {

    String addKey(String key, String value,Integer type);

    String removeKey(String key);

    String getKey(String key);

    Map<String,String> getMap(Integer type);

}