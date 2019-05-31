package itcast.controller;


import itcast.Interface.UserInteface;
import itcast.aoontation.apiRater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

   @Autowired
    private UserInteface in;
    @RequestMapping("/get")
     public String getName(){
        System.out.println("获取了参数");
        User user = new User("珊珊",21,"尖山");
        User usr = in.getUsr(user);
        System.out.println(usr.toString());
        return "开始执行吧";
     }

     @RequestMapping("/oo")
     @apiRater
     public String hit(){
         System.out.println("方法正在执行了");
         return "";
     }
}
