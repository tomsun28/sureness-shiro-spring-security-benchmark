package com.usthe.performance.shirodemo;

import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tomsun28
 * @date 2021/1/28 22:34
 */
@Configuration
public class ShiroConfig {
    @Bean
    MyRealm myRealm() {
        return new MyRealm();
    }
    @Bean
    DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
        manager.setRealm(myRealm());
        return manager;
    }
    @Bean
    ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition definition = new DefaultShiroFilterChainDefinition();

        Map<String, String> pathDefinition = new HashMap<>(60);
        pathDefinition.put("/api/v1/account/auth", "anon");
        pathDefinition.put("/api/v1/source3", "anon");
        pathDefinition.put("/**/*.html", "anon");
        pathDefinition.put("/**/*.js", "anon");
        pathDefinition.put("/**/*.css", "anon");
        pathDefinition.put("/**/*.icon", "anon");

        pathDefinition.put("/api/v3/source1", "authcBasic");
        pathDefinition.put("/api/v3/source2", "authcBasic");
        pathDefinition.put("/api/v3/source3", "authcBasic");
        pathDefinition.put("/api/v3/source4", "authcBasic");
        pathDefinition.put("/api/v3/source5", "authcBasic");
        pathDefinition.put("/api/v3/source6", "authcBasic");
        pathDefinition.put("/api/v3/source7", "authcBasic");
        pathDefinition.put("/api/v3/source8", "authcBasic");
        pathDefinition.put("/api/v3/source9", "authcBasic");
        pathDefinition.put("/api/v3/source10", "authcBasic");
        pathDefinition.put("/api/v3/source11", "authcBasic");
        pathDefinition.put("/api/v3/source12", "authcBasic");
        pathDefinition.put("/api/v3/source13", "authcBasic");
        pathDefinition.put("/api/v3/source14", "authcBasic");
        pathDefinition.put("/api/v3/source15", "authcBasic");
        pathDefinition.put("/api/v3/source16", "authcBasic");
        pathDefinition.put("/api/v3/source17", "authcBasic");
        pathDefinition.put("/api/v3/source18", "authcBasic");
        pathDefinition.put("/api/v3/source19", "authcBasic");
        pathDefinition.put("/api/v3/source20", "authcBasic");

        pathDefinition.put("/api/v2/source1", "authcBasic");
        pathDefinition.put("/api/v2/source2", "authcBasic");
        pathDefinition.put("/api/v2/source3", "authcBasic");
        pathDefinition.put("/api/v2/source4", "authcBasic");
        pathDefinition.put("/api/v2/source5", "authcBasic");
        pathDefinition.put("/api/v2/source6", "authcBasic");
        pathDefinition.put("/api/v2/source7", "authcBasic");
        pathDefinition.put("/api/v2/source8", "authcBasic");
        pathDefinition.put("/api/v2/source9", "authcBasic");
        pathDefinition.put("/api/v2/source10", "authcBasic");
        pathDefinition.put("/api/v2/source11", "authcBasic");
        pathDefinition.put("/api/v2/source12", "authcBasic");
        pathDefinition.put("/api/v2/source13", "authcBasic");
        pathDefinition.put("/api/v2/source14", "authcBasic");
        pathDefinition.put("/api/v2/source15", "authcBasic");
        pathDefinition.put("/api/v2/source16", "authcBasic");
        pathDefinition.put("/api/v2/source17", "authcBasic");
        pathDefinition.put("/api/v2/source18", "authcBasic");
        pathDefinition.put("/api/v2/source19", "authcBasic");
        pathDefinition.put("/api/v2/source20", "authcBasic");

        pathDefinition.put("/api/v1/source1", "authcBasic");
        pathDefinition.put("/api/v1/source2", "authcBasic");
        pathDefinition.put("/api/v1/source2/*/*", "authcBasic");
        pathDefinition.put("/api/v1/source3/*", "authcBasic");
        pathDefinition.put("/api/v1/source4", "authcBasic");
        pathDefinition.put("/api/v1/source5", "authcBasic");
        pathDefinition.put("/api/v1/source6", "authcBasic");
        pathDefinition.put("/api/v1/source7", "authcBasic");
        pathDefinition.put("/api/v1/source8", "authcBasic");
        pathDefinition.put("/api/v1/source9", "authcBasic");
        pathDefinition.put("/api/v1/source10", "authcBasic");
        pathDefinition.put("/api/v1/source11", "authcBasic");
        pathDefinition.put("/api/v1/source12", "authcBasic");
        pathDefinition.put("/api/v1/source13", "authcBasic");
        pathDefinition.put("/api/v1/source14", "authcBasic");
        pathDefinition.put("/api/v1/source15", "authcBasic");
        pathDefinition.put("/api/v1/source16", "authcBasic");
        pathDefinition.put("/api/v1/source17", "authcBasic");
        pathDefinition.put("/api/v1/source18", "authcBasic");
        pathDefinition.put("/api/v1/source19", "authcBasic");
        pathDefinition.put("/api/v1/source20", "authcBasic");
        definition.addPathDefinitions(pathDefinition);
        return definition;
    }
}