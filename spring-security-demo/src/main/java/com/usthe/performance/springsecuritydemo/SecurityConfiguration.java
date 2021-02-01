package com.usthe.performance.springsecuritydemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author tomsun28
 * @date 2021/1/28 23:22
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(username -> {
            return User.withUsername("root")
                    // 密码使用BCryptPasswordEncoder()方法验证，因此存储的密码也需要BCryptPasswordEncoder().encode(明文密码)方法加密密码
                    .password(new BCryptPasswordEncoder().encode("23456")).roles("role2").build();
        }).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/api/v1/source3").anonymous()
                .antMatchers(HttpMethod.POST, "/api/v1/account/auth").anonymous()
                .antMatchers(HttpMethod.GET, "/**/*.html").anonymous()
                .antMatchers(HttpMethod.GET, "/**/*.js").anonymous()
                .antMatchers(HttpMethod.GET, "/**/*.css").anonymous()
                .antMatchers(HttpMethod.GET, "/**/*.icon").anonymous()

                .antMatchers(HttpMethod.GET, "/api/v3/source1").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source2").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source3").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source4").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source5").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source6").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source7").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source8").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source9").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source10").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source11").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source12").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source13").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source14").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source15").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source16").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source17").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source18").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v3/source19").hasRole("role2")

                .antMatchers(HttpMethod.GET, "/api/v2/source1").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source2").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source3").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source4").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source5").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source6").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source7").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source8").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source9").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source10").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source11").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source12").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source13").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source14").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source15").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source16").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source17").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source18").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v2/source19").hasRole("role2")

                .antMatchers(HttpMethod.GET, "/api/v1/source1").hasRole("role2")
                .antMatchers(HttpMethod.DELETE, "/api/v1/source1").hasRole("role3")
                .antMatchers(HttpMethod.PUT, "/api/v1/source1").hasAnyRole("role1","role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source2").permitAll()
                .antMatchers(HttpMethod.GET, "/api/v1/source2/*/*").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source3").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source3/*").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source4").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source5").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source6").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source7").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source8").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source9").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source10").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source11").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source12").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source13").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source14").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source15").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source16").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source17").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source18").hasRole("role2")
                .antMatchers(HttpMethod.GET, "/api/v1/source19").hasRole("role2")
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }
}
