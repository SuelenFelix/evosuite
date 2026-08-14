package io.puzpuzpuz.queue;

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
import static io.puzpuzpuz.queue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SpscBoundedQueue_size_21124721904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6;

    public SpscBoundedQueue_size_21124721904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6 = newInstance(Class.forName("io.puzpuzpuz.queue.SpscBoundedQueue"));
        setField(term6, term6.getClass(), "data", null);
        setField(term6, term6.getClass(), "producerIdx", null);
        setField(term6, term6.getClass(), "producerCachedIdx", null);
        setField(term6, term6.getClass(), "consumerIdx", null);
        setField(term6, term6.getClass(), "consumerCachedIdx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.queue.SpscBoundedQueue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "size", argTypes, term6, args);
    }

};


