package deadlock;

public class DeadLockFreePen extends Pen {
    public void write(Paper paper) {

        synchronized (paper) {
            synchronized (this) {

                System.out.println("Writing on paper with pen: " + paper);
                paper.done();
            }
        }
    }


synchronized public void done() {
    System.out.println("Done writing with pen");
}
}

