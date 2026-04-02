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

public class Executer_setLoader_104296380025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4707952;

    public Executer_setLoader_104296380025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4707952 = newInstance(Class.forName("com.chip8.emulator.Executer"));
        setField(term4707952, term4707952.getClass(), "memory", null);
        setField(term4707952, term4707952.getClass(), "fetcher", null);
        setField(term4707952, term4707952.getClass(), "decoder", null);
        setField(term4707952, term4707952.getClass(), "loader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Executer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.chip8.emulator.Loader");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLoader", argTypes, term4707952, args);
    }

};


