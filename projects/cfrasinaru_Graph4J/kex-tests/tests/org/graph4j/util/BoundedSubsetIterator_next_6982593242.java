package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BoundedSubsetIterator_next_6982593242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56561;

    public BoundedSubsetIterator_next_6982593242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56561 = newInstance(Class.forName("org.graph4j.util.BoundedSubsetIterator"));
        int[] term56562 = (int[]) newIntArray(1);
        int[] term56567 = (int[]) newIntArray(4);
        setIntElement(term56562, 0, 1306551461);
        setField(term56561, term56561.getClass(), "elements", term56562);
        setIntField(term56561, term56561.getClass(), "numElements", -141757322);
        setIntField(term56561, term56561.getClass(), "maxSubsetSize", 507424812);
        setIntField(term56561, term56561.getClass(), "currentSubsetSize", -844787500);
        setIntElement(term56567, 0, 917456811);
        setIntElement(term56567, 1, 78789367);
        setIntElement(term56567, 2, -437074400);
        setIntElement(term56567, 3, -1058580635);
        setField(term56561, term56561.getClass(), "indices", term56567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.BoundedSubsetIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term56561, args);
    }

};


