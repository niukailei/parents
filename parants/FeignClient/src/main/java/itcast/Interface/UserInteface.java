package itcast.Interface;

import itcast.controller.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="producer-clients")
public interface UserInteface {

    @RequestMapping(value="/gets",method = RequestMethod.POST)
    public User getUsr(@RequestBody User user);
}
