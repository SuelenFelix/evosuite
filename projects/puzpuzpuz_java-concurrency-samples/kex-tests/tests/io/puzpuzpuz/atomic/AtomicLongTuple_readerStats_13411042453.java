package io.puzpuzpuz.atomic;

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
import static io.puzpuzpuz.atomic.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AtomicLongTuple_readerStats_13411042453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;

    public AtomicLongTuple_readerStats_13411042453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21 = newInstance(Class.forName("io.puzpuzpuz.atomic.AtomicLongTuple"));
        setField(term21, term21.getClass(), "writerHolder", null);
        setField(term21, term21.getClass(), "readerStats", null);
        setLongField(term21, term21.getClass(), "l1", 0L);
        setLongField(term21, term21.getClass(), "l2", 0L);
        setLongField(term21, term21.getClass(), "l3", 0L);
        setLongField(term21, term21.getClass(), "l4", 0L);
        setLongField(term21, term21.getClass(), "version", 0L);
        setLongField(term21, term21.getClass(), "x", 0L);
        setLongField(term21, term21.getClass(), "y", 0L);
        setLongField(term21, term21.getClass(), "z", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.atomic.AtomicLongTuple");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readerStats", argTypes, term21, args);
    }

};


