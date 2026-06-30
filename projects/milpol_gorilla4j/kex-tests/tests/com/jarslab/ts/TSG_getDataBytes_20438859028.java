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

public class TSG_getDataBytes_20438859028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160;

    public TSG_getDataBytes_20438859028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term160, term160.getClass(), "startTime", -872011222785455006L);
        setField(term160, term160.getClass(), "outBit", null);
        setLongField(term160, term160.getClass(), "time", -316468845751588286L);
        setDoubleField(term160, term160.getClass(), "value", 0.2641345529914265);
        setIntField(term160, term160.getClass(), "timeDelta", 865208305);
        setIntField(term160, term160.getClass(), "leading", -1275173084);
        setIntField(term160, term160.getClass(), "trailing", -244121226);
        setBooleanField(term160, term160.getClass(), "closed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataBytes", argTypes, term160, args);
    }

};


