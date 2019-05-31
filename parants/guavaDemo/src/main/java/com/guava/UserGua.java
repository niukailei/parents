package com.guava;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

public class UserGua {

    private static final Integer size=1000000;
    private static BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(), size);

    public static void main(String[] args) {

       for(int i=0;i<1001000;i++){
           bloomFilter.put(i);
       }
       int a=0;
       for(int i=1001000;i<1005000;i++){
           if(!bloomFilter.mightContain(i)){
               a++;
               System.out.println(a);
           }
       }
    }
}
