package org.tutorial.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.tutorial.service", "org.tutorial.aspect"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
