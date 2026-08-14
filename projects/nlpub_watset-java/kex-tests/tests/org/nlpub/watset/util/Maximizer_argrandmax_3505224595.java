package org.nlpub.watset.util;

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
import static org.nlpub.watset.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Maximizer_argrandmax_3505224595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Maximizer_argrandmax_3505224595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.util.Random"));
        Object term2 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term2, term2.getClass(), "value", 265842771846412L);
        setField(term1, term1.getClass(), "seed", term2);
        setDoubleField(term1, term1.getClass(), "nextNextGaussian", 0.13238746331190498);
        setBooleanField(term1, term1.getClass(), "haveNextNextGaussian", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.nlpub.watset.util.Maximizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Iterable");
        argTypes[1] = Class.forName("java.util.function.Function");
        argTypes[2] = Class.forName("java.util.Random");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1;
        callMethod(klass, "argrandmax", argTypes, null, args);
    }

};


