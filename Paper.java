package deadlock;

public class Paper {
    public synchronized void write(Pen pen) {
        System.out.println("Writing on paper with pen: " + pen);
        pen.done();

    }
    synchronized public void done() {
        System.out.println("Done writing on paper");
    }
}
