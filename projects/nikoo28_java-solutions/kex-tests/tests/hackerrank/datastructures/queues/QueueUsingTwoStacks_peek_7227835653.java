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

public class QueueUsingTwoStacks_peek_7227835653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public QueueUsingTwoStacks_peek_7227835653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("hackerrank.datastructures.queues.QueueUsingTwoStacks"));
        Object term26 = newInstance(Class.forName("java.util.Stack"));
        Object[] term27 = (Object[]) newArray("java.lang.Object", 10);
        Object term31 = newInstance(Class.forName("java.util.Stack"));
        Object[] term32 = (Object[]) newArray("java.lang.Object", 10);
        setField(term26, term26.getClass(), "elementData", term27);
        setIntField(term26, term26.getClass(), "elementCount", 0);
        setIntField(term26, term26.getClass(), "capacityIncrement", 0);
        setIntField(term26, term26.getClass(), "modCount", 0);
        setField(term25, term25.getClass(), "input", term26);
        setField(term31, term31.getClass(), "elementData", term32);
        setIntField(term31, term31.getClass(), "elementCount", 0);
        setIntField(term31, term31.getClass(), "capacityIncrement", 0);
        setIntField(term31, term31.getClass(), "modCount", 0);
        setField(term25, term25.getClass(), "output", term31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.queues.QueueUsingTwoStacks");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term25, args);
    }

};


