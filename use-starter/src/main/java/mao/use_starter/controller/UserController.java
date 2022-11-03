package mao.use_starter.controller;

import com.example.tools_jwt.entity.JwtUserInfo;
import com.example.tools_jwt.entity.Token;
import com.example.tools_jwt.exception.BizException;
import com.example.tools_jwt.server.utils.JwtTokenServerUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Project name(项目名称)：jwt_spring_boot_starter
 * Package(包名): mao.use_starter.controller
 * Class(类名): UserController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/11/3
 * Time(创建时间)： 13:24
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@RestController
@RequestMapping("/user")
public class UserController
{

    @Autowired
    private JwtTokenServerUtils jwtTokenServerUtils;

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/login")
    public Token login()
    {
        JwtUserInfo jwtUserInfo = new JwtUserInfo();
        jwtUserInfo.setName("张三");
        jwtUserInfo.setOrgId(100001L);
        jwtUserInfo.setUserId(100000001L);
        jwtUserInfo.setAccount("张三");
        jwtUserInfo.setStationId(20001L);
        Token token = jwtTokenServerUtils.generateUserToken(jwtUserInfo, null);
        log.info(token.getToken());
        return token;
    }

    @GetMapping("/{token}")
    public boolean test(@PathVariable String token)
    {
        log.info(token);

        try
        {
            JwtUserInfo userInfo = jwtTokenServerUtils.getUserInfo(token);
            log.info(userInfo.toString());
            return true;
        }
        catch (BizException e)
        {
            log.error(e.getMessage());
            return false;
        }
    }
}
