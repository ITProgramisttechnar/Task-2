import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    private static final String CAT = "cat";
    private static final String HELLO_WORLD = "helloworld";

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean(HELLO_WORLD);
        System.out.println(bean1.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean(HELLO_WORLD);
        System.out.println(bean2.getMessage());

        Cat bean3 =
                (Cat) applicationContext.getBean(CAT);
        System.out.println(bean3.getNickname());

        Cat bean4 =
                (Cat) applicationContext.getBean(CAT);
        System.out.println(bean4.getNickname());

        System.out.println(bean1==bean2);

        System.out.println(bean3==bean4);
    }
}