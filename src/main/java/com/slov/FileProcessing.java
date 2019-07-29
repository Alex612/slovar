package com.slov;

import java.util.Map;

public interface FileProcessing {

    String addKey(String key, String value);

    String removeKey(String key);

    String getKey(String key);

    Map<String, String> getMapNumber();

    Map<String, String> getMapString();
}