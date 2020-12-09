package org.mattpayne.demo;

import java.util.HashMap;
import java.util.Map;

public class JavaJunk {
    public static Map<String,String> staticMethod() {
        Map<String, String> m=new HashMap<>();
        m.put("eggColor","green");
        return m;
    }
}
