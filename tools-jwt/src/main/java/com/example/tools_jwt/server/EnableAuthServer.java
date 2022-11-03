package com.example.tools_jwt.server;

import com.example.tools_jwt.server.config.AuthServerConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(AuthServerConfiguration.class)
public @interface EnableAuthServer
{

}
