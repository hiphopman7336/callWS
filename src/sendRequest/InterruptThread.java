package sendRequest;

import java.net.HttpURLConnection;

/**
 * Created by Kritsana J. on 18/11/2563.
 */
public class InterruptThread implements Runnable {

    HttpURLConnection con;
    public InterruptThread(HttpURLConnection con) {
        this.con = con;
    }

    public void run() {
        try {
            Thread.sleep(HttpConnectionUtil.TIMR_OUT); // or Thread.sleep(con.getConnectTimeout())
        } catch (InterruptedException e) {

        }
        con.disconnect();
        System.out.println("Timer thread forcing to quit connection");
    }
}
