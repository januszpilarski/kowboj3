package kowboj3f;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"kowboj3b", "kowboj3f"})
public class AppConfig implements WebMvcConfigurer {

    @Value("${spring.mvc.view.prefix}")
    String prefix;

    @Value("${spring.mvc.view.suffix}")
    String suffix;

    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix(prefix);
        viewResolver.setSuffix(suffix);

        return viewResolver;
    }

}
