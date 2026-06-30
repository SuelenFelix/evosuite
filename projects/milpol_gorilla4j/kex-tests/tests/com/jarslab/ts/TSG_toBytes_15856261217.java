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

public class TSG_toBytes_15856261217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152;

    public TSG_toBytes_15856261217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152 = newInstance(Class.forName("com.jarslab.ts.TSG"));
        setLongField(term152, term152.getClass(), "startTime", 2535595959091595249L);
        setField(term152, term152.getClass(), "outBit", null);
        setLongField(term152, term152.getClass(), "time", -5476826692763582090L);
        setDoubleField(term152, term152.getClass(), "value", 0.40176586625454525);
        setIntField(term152, term152.getClass(), "timeDelta", -1007160944);
        setIntField(term152, term152.getClass(), "leading", 1135664017);
        setIntField(term152, term152.getClass(), "trailing", 590364439);
        setBooleanField(term152, term152.getClass(), "closed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jarslab.ts.TSG");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBytes", argTypes, term152, args);
    }

};


