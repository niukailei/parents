package com.guava;

import com.google.common.base.Joiner;

public class Demo1 {

      private static Joiner jo;

     public static void main(String[] args) {
        jo= jo.on(":").skipNulls();
        String join = jo.join("dd", "yy", "pp");
        System.out.println(join);
        String[] ss={"r","t","b"};
        jo.join(ss);
        join=jo.join("ll","oo","qq");
        System.out.println(join);
    }
}
