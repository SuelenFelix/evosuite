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

public class TSG_isClosed_217228696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144;

    public TSG_isClosed_217228696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term144, term144.getClass(), "startTime", -8885298608300233488L);
        setField(term144, term144.getClass(), "outBit", null);
        setLongField(term144, term144.getClass(), "time", -4325723315152823407L);
        setDoubleField(term144, term144.getClass(), "value", 0.28570734989730284);
        setIntField(term144, term144.getClass(), "timeDelta", -6029667);
        setIntField(term144, term144.getClass(), "leading", -2068769794);
        setIntField(term144, term144.getClass(), "trailing", -117576464);
        setBooleanField(term144, term144.getClass(), "closed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClosed", argTypes, term144, args);
    }

};


