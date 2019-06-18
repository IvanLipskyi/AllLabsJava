package Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import static java.lang.Thread.sleep;

/**
 * Created by Brainacad4 on 18.06.2019.
 */

public class Race {
    static void startRace(List<Thread> cars) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(500);
                    System.out.println("3");
                    sleep(500);
                    System.out.println("2");
                    sleep(500);
                    System.out.println("1");
                    sleep(500);
                    System.out.println("GO!!!");
                    for (Thread t : cars) {
                        t.start();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<RaceCarRunnable> cars = new ArrayList<>();
        CountDownLatch cdl = new CountDownLatch(3);
        cars.add(new RaceCarRunnable("Mazda", 120, 300, cdl));
        cars.add(new RaceCarRunnable("BMW", 140, 300, cdl));
        cars.add(new RaceCarRunnable("Toyota", 135, 300, cdl));

        ArrayList<Thread> thr = new ArrayList<>();
        for (RaceCarRunnable car : cars) thr.add(new Thread(car));
        startRace(thr);
        cdl.await();
        System.out.println("Race is over. All cars finished");
    }
}

