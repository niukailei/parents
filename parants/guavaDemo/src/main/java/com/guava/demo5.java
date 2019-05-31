package com.guava;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import org.assertj.core.util.Lists;

import javax.sql.RowSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class demo5 {

    public static void main(String[] args) {

        Predicate<User> p1=new Predicate<User>(){
            @Override
            public boolean apply(User input) {
                return  input.getName().equals("huahua");
            }
        };
        Predicate<User> p2=new Predicate<User>(){
            @Override
            public boolean apply(User input) {
                return input.getAge()>12;
            }
        };

         User u1=new User("huahua",11,"shanxi");
        User u2=new User("huahua1",12,"shanxi");
        User u3=new User("huahua2",12,"shanxi");
        User u4=new User("huahua",124,"shanxi");
        ArrayList<User> users = Lists.newArrayList(u1, u2, u3, u4);
        Predicate<User> p= Predicates.or(p1,p2);
        ArrayList<User> users1 = Lists.newArrayList(Iterables.filter(users, p));
        users1.stream().forEach(i -> System.out.println(i));


    }
}
