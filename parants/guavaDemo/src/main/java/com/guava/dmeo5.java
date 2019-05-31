package com.guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class dmeo5 {


    /**
     *
     * @param args
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        LoadingCache<String,User> cache= CacheBuilder.newBuilder()
                .maximumSize(1000l)
                .expireAfterWrite(1, TimeUnit.MINUTES)
                .build(new CacheLoader<String, User>() {
                    @Override
                    public User load(String key) throws Exception {
                        System.out.println("今天还是可以的");
                        return null;
                    }
                });
        cache.put("1",new User("妞妞"));
        cache.put("2",new User("云云"));
         //Thread.sleep(70000);
        System.out.println("___________________");

        System.out.println(9);

    }
}
