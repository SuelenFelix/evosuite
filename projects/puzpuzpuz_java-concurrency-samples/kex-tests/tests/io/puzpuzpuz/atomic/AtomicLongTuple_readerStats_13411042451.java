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
import java.lang.Object;

public class AtomicLongTuple_readerStats_13411042451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public AtomicLongTuple_readerStats_13411042451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("io.puzpuzpuz.atomic.AtomicLongTuple"));
        Object term2 = newInstance(Class.forName("io.puzpuzpuz.atomic.AtomicLongTuple$PaddedTupleHolder"));
        Object term11 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        setLongField(term2, term2.getClass(), "l1", 0L);
        setLongField(term2, term2.getClass(), "l2", 0L);
        setLongField(term2, term2.getClass(), "l3", 0L);
        setLongField(term2, term2.getClass(), "l4", 0L);
        setLongField(term2, term2.getClass(), "l5", 0L);
        setLongField(term2, term2.getClass(), "x", 0L);
        setLongField(term2, term2.getClass(), "y", 0L);
        setLongField(term2, term2.getClass(), "z", 0L);
        setField(term1, term1.getClass(), "writerHolder", term2);
        setField(term11, term11.getClass(), "supplier", null);
        setIntField(term11, term11.getClass(), "threadLocalHashCode", -1091989333);
        setField(term1, term1.getClass(), "readerStats", term11);
        setLongField(term1, term1.getClass(), "l1", 2442117782898005296L);
        setLongField(term1, term1.getClass(), "l2", 6375119433582206027L);
        setLongField(term1, term1.getClass(), "l3", -8257434502486459194L);
        setLongField(term1, term1.getClass(), "l4", -8400487765614892086L);
        setLongField(term1, term1.getClass(), "version", 5270370404989704783L);
        setLongField(term1, term1.getClass(), "x", 7411271909051562686L);
        setLongField(term1, term1.getClass(), "y", 4872422362414183754L);
        setLongField(term1, term1.getClass(), "z", 6811161968424632369L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.atomic.AtomicLongTuple");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readerStats", argTypes, term1, args);
    }

};


