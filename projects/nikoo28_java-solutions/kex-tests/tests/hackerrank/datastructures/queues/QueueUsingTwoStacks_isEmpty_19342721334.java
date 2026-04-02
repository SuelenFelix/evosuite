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

public class QueueUsingTwoStacks_isEmpty_19342721334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36;

    public QueueUsingTwoStacks_isEmpty_19342721334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36 = newInstance(Class.forName("hackerrank.datastructures.queues.QueueUsingTwoStacks"));
        Object term37 = newInstance(Class.forName("java.util.Stack"));
        Object[] term38 = (Object[]) newArray("java.lang.Object", 10);
        Object term42 = newInstance(Class.forName("java.util.Stack"));
        Object[] term43 = (Object[]) newArray("java.lang.Object", 10);
        setField(term37, term37.getClass(), "elementData", term38);
        setIntField(term37, term37.getClass(), "elementCount", 0);
        setIntField(term37, term37.getClass(), "capacityIncrement", 0);
        setIntField(term37, term37.getClass(), "modCount", 0);
        setField(term36, term36.getClass(), "input", term37);
        setField(term42, term42.getClass(), "elementData", term43);
        setIntField(term42, term42.getClass(), "elementCount", 0);
        setIntField(term42, term42.getClass(), "capacityIncrement", 0);
        setIntField(term42, term42.getClass(), "modCount", 0);
        setField(term36, term36.getClass(), "output", term42);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.queues.QueueUsingTwoStacks");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEmpty", argTypes, term36, args);
    }

};


