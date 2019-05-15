package cc.whohow.jui.engine.java2d;

import java.awt.*;
import java.awt.event.PaintEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App extends Frame {
    private static ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                System.out.println("shutdown executor");
                executor.shutdownNow();
                executor.awaitTermination(3, TimeUnit.SECONDS);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
    }

    public App() {
        super(null, null);
        setSize(800, 600);
        setLocation(100, 100);
        enableEvents(PaintEvent.PAINT);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        executor.scheduleAtFixedRate(() -> {
//            System.out.println("repaint " + Thread.currentThread());
            repaint();
        }, 160, 160, TimeUnit.MILLISECONDS);

//        Toolkit.getDefaultToolkit().addAWTEventListener(event -> {
//            System.out.println(Thread.currentThread());
//            System.out.println(event);
//        }, AWTEvent.PAINT_EVENT_MASK);
    }

    @Override
    public void paint(Graphics g) {
//        System.out.println("paint");
        g.setColor(Color.BLACK);
        g.drawString(new Date().toString(), 70, 70);
        super.paint(g);
    }

    public static void main(String[] args) {
        App app = new App();
        app.setVisible(true);
    }
}
