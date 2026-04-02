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

public class Decoder_canEqual_1816879657151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3189209;

    public Decoder_canEqual_1816879657151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3189209 = newInstance(Class.forName("com.chip8.emulator.Decoder"));
        setField(term3189209, term3189209.getClass(), "m", null);
        setField(term3189209, term3189209.getClass(), "fetcher", null);
        setField(term3189209, term3189209.getClass(), "pixels", null);
        setShortField(term3189209, term3189209.getClass(), "opcode", (short) 0);
        setField(term3189209, term3189209.getClass(), "keys", null);
        setField(term3189209, term3189209.getClass(), "detailed", null);
        setField(term3189209, term3189209.getClass(), "d", null);
        setField(term3189209, term3189209.getClass(), "c", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Decoder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term3189209, args);
    }

};


