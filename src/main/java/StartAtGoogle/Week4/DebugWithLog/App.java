package StartAtGoogle.Week4.DebugWithLog;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static Logger logger = LogManager.getLogger(App.class.getName());

    public static void main(String[] args) {
        Debugger debugger = new Debugger();
        loggerPrint();
        long r,sum=0,temp;
        long n= 123456789765421L;
        Debugger.log("start here");
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
            debugger.log(n);
        }
        if (temp==sum)
            System.out.println("palindrome number");
        else System.out.println("not palindrome");

    }

    public static void loggerPrint(){

        logger.fatal("this is a fatal print int level:100");
        logger.error("this is a error print int level:200");
        logger.warn("this is a warn print int level:300");
        logger.info("this is a info print int level:400");

    }

}
