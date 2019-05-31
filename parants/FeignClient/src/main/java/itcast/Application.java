package itcast;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("加载完成");
    }
}
