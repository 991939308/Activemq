package consumers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appconsumer {
    /*
    *   订阅模式
    * 这里是让Spring去管理消费者的
    *
    * */
    public static void main(String[] arge){
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

    }
}
