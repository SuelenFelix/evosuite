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

public class MemoryRange_overlaps_18009237434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58525;
     Object term58528;

    public MemoryRange_overlaps_18009237434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58525 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        setIntField(term58525, term58525.getClass(), "startAddress", 1629059877);
        setIntField(term58525, term58525.getClass(), "endAddress", -649940550);
        term58528 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        setIntField(term58528, term58528.getClass(), "startAddress", 36785954);
        setIntField(term58528, term58528.getClass(), "endAddress", -907057089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.MemoryRange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.MemoryRange");
        Object[] args = new Object[1];
        args[0] = term58528;
        callMethod(klass, "overlaps", argTypes, term58525, args);
    }

};


