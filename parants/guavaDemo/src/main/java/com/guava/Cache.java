package com.guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Cache {

    private static LoadingCache<String,User> cache;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
       final  User j=new User("ee",1,"1");
        cache=CacheBuilder.newBuilder().expireAfterWrite(10, TimeUnit.MINUTES)
                .maximumSize(100)
                .expireAfterAccess(10,TimeUnit.SECONDS)
                //更新方法
               // .refreshAfterWrite(10,TimeUnit.SECONDS)
                .build(new CacheLoader<String, User>() {
                    @Override
                    public User load(String key) throws Exception {
                        return j;
                    }
                });

        User u=new User("11",12,"huoshan");
        User q=new User("12",12,"huoshan");
        cache.put("11",u);
        cache.put("12",q);
        Thread.sleep(9990);
        System.out.println(System.currentTimeMillis());
        for (int i=0;i<10000;i++){
            User user = cache.get("11");
            System.out.println(user);
        }
        System.out.println(System.currentTimeMillis());

    }
}
