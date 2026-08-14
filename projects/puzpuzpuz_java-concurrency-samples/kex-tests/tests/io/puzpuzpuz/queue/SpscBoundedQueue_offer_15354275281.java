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

public class SpscBoundedQueue_offer_15354275281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public SpscBoundedQueue_offer_15354275281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("io.puzpuzpuz.queue.SpscBoundedQueue"));
        setField(term3, term3.getClass(), "data", null);
        setField(term3, term3.getClass(), "producerIdx", null);
        setField(term3, term3.getClass(), "producerCachedIdx", null);
        setField(term3, term3.getClass(), "consumerIdx", null);
        setField(term3, term3.getClass(), "consumerCachedIdx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.queue.SpscBoundedQueue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "offer", argTypes, term3, args);
    }

};


