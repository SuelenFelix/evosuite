package com.jarslab.ts;

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
import static com.jarslab.ts.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TSG_toIterator_12349699949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168;

    public TSG_toIterator_12349699949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term168, term168.getClass(), "startTime", 5127676408959197577L);
        setField(term168, term168.getClass(), "outBit", null);
        setLongField(term168, term168.getClass(), "time", -6573104506744284592L);
        setDoubleField(term168, term168.getClass(), "value", 0.36923381893433327);
        setIntField(term168, term168.getClass(), "timeDelta", -203030934);
        setIntField(term168, term168.getClass(), "leading", -1179120542);
        setIntField(term168, term168.getClass(), "trailing", -73683645);
        setBooleanField(term168, term168.getClass(), "closed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toIterator", argTypes, term168, args);
    }

};


