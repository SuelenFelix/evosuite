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

public class Loader_largeFontData_187565671325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5651828;

    public Loader_largeFontData_187565671325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5651828 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        setField(term5651828, term5651828.getClass(), "bytes", null);
        setField(term5651828, term5651828.getClass(), "name", null);
        setField(term5651828, term5651828.getClass(), "memory", null);
        setField(term5651828, term5651828.getClass(), "loadedRom", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "largeFontData", argTypes, term5651828, args);
    }

};


