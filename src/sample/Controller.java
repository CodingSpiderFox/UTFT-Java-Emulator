package sample;

public class Controller {

    UTFT myGLCD;

    public Controller(UTFT lcd) {
        myGLCD = lcd;
    }

    public void loop() {
        for(int i = 0; i < 10; i++) {
            myGLCD.print("Loop " +i ,0,(i+1) * 20 );
            //delay(2000);
            System.out.println("loop" + i);
        }
    }

    public void setup() {

    }

    public void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
