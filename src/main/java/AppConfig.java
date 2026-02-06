import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
private final String CAT="cat";
private final String HELLO_WORLD="helloworld";
 
    @Bean
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean
    @Scope("prototype")
    public Cat getCat(){
        Cat cat = new Cat();
        cat.setNickname("it's a cat");
        return cat;
    }
}