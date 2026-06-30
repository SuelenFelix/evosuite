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

public class TSG_close_5923253233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116;

    public TSG_close_5923253233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term116, term116.getClass(), "startTime", 5270370404989704783L);
        setField(term116, term116.getClass(), "outBit", null);
        setLongField(term116, term116.getClass(), "time", 7411271909051562686L);
        setDoubleField(term116, term116.getClass(), "value", 0.13238746331190498);
        setIntField(term116, term116.getClass(), "timeDelta", 1134449235);
        setIntField(term116, term116.getClass(), "leading", -883034806);
        setIntField(term116, term116.getClass(), "trailing", 1585847225);
        setBooleanField(term116, term116.getClass(), "closed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term116, args);
    }

};


