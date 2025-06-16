package deadlock;

public class Pen {
    public synchronized void write(Paper paper) {
//for below line, paper wont be locked, as no lock is acquired on paper
// to try to acquire a lock on paper, any synchronized method of paper should be called
        System.out.println("Writing on paper with pen: " + paper);

        // below line tries to acquire lock on paper by calling a synchronized method of paper
        //this will cause a deadlock if paper is already locked by another thread
        paper.done();

    }
    synchronized public void done() {
        System.out.println("Done writing with pen");
    }
}

