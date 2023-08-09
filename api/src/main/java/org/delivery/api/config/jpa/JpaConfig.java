package org.delivery.api.config.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "org.delivery.db")  //Entity 클래스가, Entity를 사용하고자 하는 application main package와 전혀 다른 package에 있을 때 사용합니다.
@EnableJpaRepositories(basePackages = "org.delivery.db") // @EnableJpaRepositories는 JPA Repository들을 활성화하기 위한 애노테이션입니다.
public class JpaConfig {
}
