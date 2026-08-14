package com.chip8.emulator;

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
import static com.chip8.emulator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fetcher_setM_21910919226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6005123;

    public Fetcher_setM_21910919226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6005123 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        setShortField(term6005123, term6005123.getClass(), "opcode", (short) 0);
        setField(term6005123, term6005123.getClass(), "m", null);
        setLongField(term6005123, term6005123.getClass(), "currentTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.chip8.emulator.Memory");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setM", argTypes, term6005123, args);
    }

};


