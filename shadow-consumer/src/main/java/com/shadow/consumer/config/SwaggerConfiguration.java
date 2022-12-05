package com.shadow.consumer.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    public static final String CONTROLLER_PACKAGE = "com.shadow.consumer.controller";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage(CONTROLLER_PACKAGE)).paths(PathSelectors.any()).build()
                .apiInfo(new ApiInfoBuilder()
                        .title("shadow")
                        .description("shadow RESTful APIs")
                        .version("1.0")
                        .contact(new Contact("shadow","shadow","shadow.com.cn"))
                        .license("License for shadow")
                        .licenseUrl("#")
                        .build()
                ).globalOperationParameters(globalOperationParameters());
    }

    private List<Parameter> globalOperationParameters() {
        List<Parameter> params = new ArrayList<Parameter>();
        params.add(new ParameterBuilder().name("token").description("用户token")
                .modelRef(new ModelRef("string")).parameterType("header").required(true)
                .defaultValue("8a93707a-d709-4a4a-b5cc-7b1b90512190").build());
        return params;
    }
}
