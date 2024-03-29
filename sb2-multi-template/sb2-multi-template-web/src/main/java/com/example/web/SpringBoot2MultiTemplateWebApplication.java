/**
 * Copyright 2020 장동선.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * */
package com.example.web;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.web.client.HttpClientMetricsAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JndiDataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.example.cmmnlib.configuration.ComponentScanConfiguration;

@EnableAutoConfiguration(exclude= {
        DataSourceAutoConfiguration.class // dataSource yml 설정시 제거
      , MybatisAutoConfiguration.class    // mybatis yml 설정시 제거
      , DataSourceTransactionManagerAutoConfiguration.class
      , JndiDataSourceAutoConfiguration.class
      , SecurityAutoConfiguration.class
      , ManagementWebSecurityAutoConfiguration.class
      , JacksonAutoConfiguration.class
      , HttpClientMetricsAutoConfiguration.class // spring-boot-actuator-autoconfigure
//      , org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration.class
})
@SpringBootApplication( scanBasePackageClasses = { ComponentScanConfiguration.class } )
public class SpringBoot2MultiTemplateWebApplication  {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2MultiTemplateWebApplication.class, args);
    }

}
