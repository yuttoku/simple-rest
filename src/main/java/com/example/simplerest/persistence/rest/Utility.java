package com.example.demo.persistence.rest;

import java.util.Map;

/**
 * @author Yudai Tokunaga
 */
public class Utility {

   public static String createUrl(Map<String, String> params, String... args) {
        StringBuilder url = new StringBuilder();
        for (String str: args) url.append(str);
        url.append(createParam(params));
        return url.toString();
    }

    private static String createParam(Map<String, String> params) {
        StringBuilder buffer = new StringBuilder();
        int paramsCount = 0;
        for(Map.Entry<String, String> entry : params.entrySet()) {
            if (paramsCount == 0) buffer.append("?");
            buffer.append(entry.getKey());
            buffer.append("=");
            buffer.append(entry.getValue());
            paramsCount ++;
            if (paramsCount < params.size()) buffer.append("&");
        }
        return  buffer.toString();
    }
}
