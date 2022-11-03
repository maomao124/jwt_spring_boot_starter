package com.example.tools_jwt.client;


import com.example.tools_jwt.client.config.AuthClientConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(AuthClientConfiguration.class)
public @interface EnableAuthClient
{

}
