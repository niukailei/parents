package itcast.aop;


import itcast.aoontation.apiRater;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//@Aspect
@Component
public class AopDemo {

    @Pointcut("execution(* itcast..*.*(..))")
     public void getNema(){
     }

     @Around("getNema()")
     public void Cut(ProceedingJoinPoint pc) throws IllegalAccessException, InstantiationException, InvocationTargetException {

        //获取字节码文件
         Class<?> classs = pc.getTarget().getClass();
         //获取 实例对象
         Object o = classs.newInstance();
         //获取方法名称
         String name = pc.getSignature().getName();
         //获取所有的方法
         Method[] me = classs.getDeclaredMethods();
         //获取所有的参数
         Object[] args = pc.getArgs();
         for (Method m:me
              )
             if (m.getName().equals(name)) {
                 apiRater annotation = m.getAnnotation(apiRater.class);

                 System.out.println("看看注解执行了");
                 System.out.println("执行的方法参数为:key="+annotation.getKey()+"value为:value="+annotation.value());
                 Object invoke = m.invoke(o, args);
                 System.out.println("注解成功了");
                 break;
             }
     }
}
