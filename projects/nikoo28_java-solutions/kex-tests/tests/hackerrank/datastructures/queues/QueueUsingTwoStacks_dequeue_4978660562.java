package hackerrank.datastructures.queues;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static hackerrank.datastructures.queues.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class QueueUsingTwoStacks_dequeue_4978660562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;

    public QueueUsingTwoStacks_dequeue_4978660562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14 = newInstance(Class.forName("hackerrank.datastructures.queues.QueueUsingTwoStacks"));
        Object term15 = newInstance(Class.forName("java.util.Stack"));
        Object[] term16 = (Object[]) newArray("java.lang.Object", 10);
        Object term20 = newInstance(Class.forName("java.util.Stack"));
        Object[] term21 = (Object[]) newArray("java.lang.Object", 10);
        setField(term15, term15.getClass(), "elementData", term16);
        setIntField(term15, term15.getClass(), "elementCount", 0);
        setIntField(term15, term15.getClass(), "capacityIncrement", 0);
        setIntField(term15, term15.getClass(), "modCount", 0);
        setField(term14, term14.getClass(), "input", term15);
        setField(term20, term20.getClass(), "elementData", term21);
        setIntField(term20, term20.getClass(), "elementCount", 0);
        setIntField(term20, term20.getClass(), "capacityIncrement", 0);
        setIntField(term20, term20.getClass(), "modCount", 0);
        setField(term14, term14.getClass(), "output", term20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.queues.QueueUsingTwoStacks");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dequeue", argTypes, term14, args);
    }

};


