package vip.wush.server.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName: Server
 * @Description: 入口
 * @Author: wush
 * @Date: 2019/5/20 16:29
 */

@SpringBootApplication
public class Server {

    public static void main(String[] args) {

        SpringApplication.run(Server.class, args);
    }

    /**
     * 注册内嵌式Undertow Servlet容器
     * @return
     */
    @Bean
    public EmbeddedServletContainerFactory servletContainerFactory() {
        UndertowEmbeddedServletContainerFactory factory = new UndertowEmbeddedServletContainerFactory();
        return factory;
    }
}
