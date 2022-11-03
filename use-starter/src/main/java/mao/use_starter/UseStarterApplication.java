package mao.use_starter;

import com.example.tools_jwt.server.EnableAuthServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAuthServer
public class UseStarterApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(UseStarterApplication.class, args);
    }

}
