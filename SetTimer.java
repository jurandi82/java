/**
 *
 * @author Oleg Mikhailov
 * https://stackoverflow.com/questions/26311470/what-is-the-equivalent-of-javascript-settimeout-in-java
 * 
 * Usage:    Timer.setTimeout( () -> function(), milliseconds);
 * Usage:    Timer.setTimeout( () -> System.out.println("2 seconds");, 2000);
*/

public class Timer {
    public static void setTimeout(Runnable runnable, int delay){
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            }
            catch (InterruptedException e){
                System.err.println(e);
            }
        }).start();
    }
}
