package org.nlpub.watset.eval;

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
import static org.nlpub.watset.eval.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Sampling_sample_11515464071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;
     Object term45;

    public Sampling_sample_11515464071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43 = (Object[]) newArray("java.lang.Object", 1);
        Object term44 = newInstance(Class.forName("java.lang.Object"));
        setElement(term43, 0, term44);
        term45 = newInstance(Class.forName("java.util.Random"));
        Object term46 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term46, term46.getClass(), "value", 231080238727981L);
        setField(term45, term45.getClass(), "seed", term46);
        setDoubleField(term45, term45.getClass(), "nextNextGaussian", 0.1374549299694151);
        setBooleanField(term45, term45.getClass(), "haveNextNextGaussian", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.nlpub.watset.eval.Sampling");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.util.Random");
        Object[] args = new Object[2];
        args[0] = term43;
        args[1] = term45;
        callMethod(klass, "sample", argTypes, null, args);
    }

};


