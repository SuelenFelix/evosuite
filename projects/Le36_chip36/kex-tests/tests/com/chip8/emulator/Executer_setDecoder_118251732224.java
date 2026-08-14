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

public class Executer_setDecoder_118251732224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4707951;

    public Executer_setDecoder_118251732224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4707951 = newInstance(Class.forName("com.chip8.emulator.Executer"));
        setField(term4707951, term4707951.getClass(), "memory", null);
        setField(term4707951, term4707951.getClass(), "fetcher", null);
        setField(term4707951, term4707951.getClass(), "decoder", null);
        setField(term4707951, term4707951.getClass(), "loader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Executer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.chip8.emulator.Decoder");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDecoder", argTypes, term4707951, args);
    }

};


