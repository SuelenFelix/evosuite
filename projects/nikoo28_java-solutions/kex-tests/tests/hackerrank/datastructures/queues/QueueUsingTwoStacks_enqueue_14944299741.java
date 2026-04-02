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
import java.lang.Integer;

public class QueueUsingTwoStacks_enqueue_14944299741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term12;

    public QueueUsingTwoStacks_enqueue_14944299741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("hackerrank.datastructures.queues.QueueUsingTwoStacks"));
        Object term2 = newInstance(Class.forName("java.util.Stack"));
        Object[] term3 = (Object[]) newArray("java.lang.Object", 10);
        Object term7 = newInstance(Class.forName("java.util.Stack"));
        Object[] term8 = (Object[]) newArray("java.lang.Object", 10);
        setField(term2, term2.getClass(), "elementData", term3);
        setIntField(term2, term2.getClass(), "elementCount", 0);
        setIntField(term2, term2.getClass(), "capacityIncrement", 0);
        setIntField(term2, term2.getClass(), "modCount", 0);
        setField(term1, term1.getClass(), "input", term2);
        setField(term7, term7.getClass(), "elementData", term8);
        setIntField(term7, term7.getClass(), "elementCount", 0);
        setIntField(term7, term7.getClass(), "capacityIncrement", 0);
        setIntField(term7, term7.getClass(), "modCount", 0);
        setField(term1, term1.getClass(), "output", term7);
        term12 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.queues.QueueUsingTwoStacks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term12;
        callMethod(klass, "enqueue", argTypes, term1, args);
    }

};


