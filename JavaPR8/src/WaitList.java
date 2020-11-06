import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> {
    protected Collection<E> content = new ConcurrentLinkedQueue<>();

    public WaitList() {
    }

    public WaitList(Collection<E> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
