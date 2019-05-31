package com.guava;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;
import com.google.common.collect.Sets;


import java.util.HashSet;
import java.util.Iterator;

public class Test {


    @org.junit.Test
     public void get(){
        Iterable<String> it = Splitter.fixedLength(3).trimResults().omitEmptyStrings().split("gjiejeodferofhhieh");
        Iterator<String> its = it.iterator();
        while(its.hasNext()){
            System.out.println(its.next());
        }
    }

    @org.junit.Test
     public void tt(){
         HashSet<String> b = Sets.newHashSet();
         HashSet<String> a = Sets.newHashSet();
         a.add("1");
         a.add("2");
         a.add("3");
         b.add("4");
         b.add("3");
         b.add("5");
         System.out.println(Sets.intersection(a,b));
         System.out.println(Sets.union(a,b));
         System.out.println(Sets.difference(a,b));
         System.out.println(Sets.difference(b,a));
     }
}
