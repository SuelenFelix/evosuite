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
import java.lang.Long;
import java.lang.Double;

public class TSG_put_16778836335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132;
     Object term140;
     Object term142;

    public TSG_put_16778836335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term132, term132.getClass(), "startTime", -7237588299778557629L);
        setField(term132, term132.getClass(), "outBit", null);
        setLongField(term132, term132.getClass(), "time", 6967924379644551255L);
        setDoubleField(term132, term132.getClass(), "value", 0.5523635872663106);
        setIntField(term132, term132.getClass(), "timeDelta", 1622346318);
        setIntField(term132, term132.getClass(), "leading", 1048535127);
        setIntField(term132, term132.getClass(), "trailing", -655067527);
        setBooleanField(term132, term132.getClass(), "closed", false);
        term140 = new Long(-2813493605142626659L);
        term142 = new Double(0.544608645520025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term140;
        args[1] = term142;
        callMethod(klass, "put", argTypes, term132, args);
    }

};


