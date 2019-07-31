package com.slov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;


public class ProcessedFiles implements FileProcessing {
    private BufferedReader bufR;
    private Map<String, String> map = new HashMap<>();
    private List<String> list = new ArrayList<>();
    private String fileName = "perv.txt";
    private String directory = "resourses";


    public ProcessedFiles() {
    }

    public Map<String,String> getMap(Integer type){
        if (type==0){ getFileString(); return map;}
        else { getFileNumber(); return map;}
    }


    public void getFileNumber() {
        try {
            FileInputStream str = new FileInputStream(directory + "//" + fileName);
            bufR = new BufferedReader(new InputStreamReader(str));
            String strL;
            map.clear();
            while ((strL = bufR.readLine()) != null) {
                String[] count = strL.split(" ");
                if (count.length == 3) {
                    if (count[0].length() == Const.I_NUM) {
                        map.put(count[0],  count[1]);
                    }
                }
            }
        } catch (Exception e) {
        }
    }




    public void getFileString() {
        try {
            FileInputStream str = new FileInputStream(directory + "//" + fileName);
            bufR = new BufferedReader(new InputStreamReader(str));
            String strL;
            map.clear();
            while ((strL = bufR.readLine()) != null) {
                String[] count = strL.split(" ");
                if (count.length == 3) {
                    if (count[0].length() == Const.I_PL) {
                        map.put(count[0], count[1]);
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    public void searchKey(String key) {
        try {
            FileInputStream str = new FileInputStream(directory + "//" + fileName);
            bufR = new BufferedReader(new InputStreamReader(str));
            String strL;
            while ((strL = bufR.readLine()) != null) {
                String[] count = strL.split(" ");
                String line;
                if (count.length == 3) {
                    String st = count[0];
                    if (!st.equals(key)) {
                        line = count[0] + " " + count[1] + " " + count[3];
                        list.add(line);
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    public String removeKey(String key) {
        try {
            FileInputStream str = new FileInputStream(directory + "//" + fileName);
            bufR = new BufferedReader(new InputStreamReader(str));
            String strL;
            while ((strL = bufR.readLine()) != null) {
                String[] count = strL.split(" ");
                if (count.length == 3) {
                    String st = count[0];
                    if (st.equals(key)) {
                        BufferedWriter BufW = new BufferedWriter(new FileWriter(directory + "//" + fileName, true));
                        searchKey(key);
                        new FileWriter(fileName).close();
                        for (String lists : list) {
                            if (lists != null) {
                                BufW.write(lists + "\n");
                            }
                        }
                        list.removeAll(list);
                        BufW.flush();
                        BufW.close();
                        return Const.DELETE;
                    }
                }
            }
            return Const.NO_KEY;
        } catch (Exception e) {
            return Const.ERROR;
        }
    }


    public String addKey(String key, String value,Integer type) {
        try {
            FileInputStream str = new FileInputStream(directory + "//" + fileName);
            bufR = new BufferedReader(new InputStreamReader(str));
            String strL;
            while ((strL = bufR.readLine()) != null) {
                String[] count = strL.split(" ");
                if (count.length == 3) {
                    String st = count[0];
                    if (st.equals(key)) {
                        return Const.EXIST_KEY;
                    }
                }
            }
            BufferedWriter BufW = new BufferedWriter(new FileWriter(directory + "//" + fileName, true));
            BufW.write(key + " " + value + type +"\n");
            BufW.flush();
            BufW.close();
            return Const.ADD;
        } catch (Exception e) {
            return Const.ERROR;
        }

    }


    public String getKey(String key) {
        try {
            FileInputStream str = new FileInputStream(directory + "//" + fileName);
            bufR = new BufferedReader(new InputStreamReader(str));
            String strL;
            while ((strL = bufR.readLine()) != null) {
                String[] count = strL.split(" ");
                if (count.length == 3) {
                    String st = count[0];
                    if (st.equals(key)) {
                        return count[0] + " = " + count[1];
                    }
                }
            }
            return Const.NO_KEY;
        } catch (Exception e) {
            return Const.ERROR;
        }
    }
}