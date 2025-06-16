package deadlock;

public class DeadLockDemo {


    Pen pen = new Pen();
    Paper paper = new Paper();

    public static void main(String[] args) {
        DeadLockDemo deadLockDemo = new DeadLockDemo();
        deadLockDemo.startWriting();
    }

    private void startWriting() {
        Runnable penWithPaper = () -> {
           pen.write(paper);

        };
        Runnable paperWithPen = () -> {
            paper.write(pen);
        };

        new Thread(penWithPaper).start();
        new Thread(paperWithPen).start();
    }


}
