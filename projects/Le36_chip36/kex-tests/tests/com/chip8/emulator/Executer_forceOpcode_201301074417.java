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
import java.lang.Integer;

public class Executer_forceOpcode_201301074417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4707942;
     Object term4707943;

    public Executer_forceOpcode_201301074417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4707942 = newInstance(Class.forName("com.chip8.emulator.Executer"));
        setField(term4707942, term4707942.getClass(), "memory", null);
        setField(term4707942, term4707942.getClass(), "fetcher", null);
        setField(term4707942, term4707942.getClass(), "decoder", null);
        setField(term4707942, term4707942.getClass(), "loader", null);
        term4707943 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Executer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4707943;
        callMethod(klass, "forceOpcode", argTypes, term4707942, args);
    }

};


