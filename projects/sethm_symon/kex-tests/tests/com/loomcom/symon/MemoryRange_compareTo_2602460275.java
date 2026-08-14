package com.loomcom.symon;

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
import static com.loomcom.symon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MemoryRange_compareTo_2602460275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58531;
     Object term58534;

    public MemoryRange_compareTo_2602460275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58531 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        setIntField(term58531, term58531.getClass(), "startAddress", -1740998635);
        setIntField(term58531, term58531.getClass(), "endAddress", 183857482);
        term58534 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        setIntField(term58534, term58534.getClass(), "startAddress", -1845135476);
        setIntField(term58534, term58534.getClass(), "endAddress", -811321521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.MemoryRange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.MemoryRange");
        Object[] args = new Object[1];
        args[0] = term58534;
        callMethod(klass, "compareTo", argTypes, term58531, args);
    }

};


