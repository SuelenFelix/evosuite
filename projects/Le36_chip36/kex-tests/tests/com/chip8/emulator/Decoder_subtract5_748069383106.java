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
import java.lang.Byte;

public class Decoder_subtract5_748069383106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3189095;
     Object term3189097;
     Object term3189099;

    public Decoder_subtract5_748069383106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3189095 = newInstance(Class.forName("com.chip8.emulator.Decoder"));
        setField(term3189095, term3189095.getClass(), "m", null);
        setField(term3189095, term3189095.getClass(), "fetcher", null);
        setField(term3189095, term3189095.getClass(), "pixels", null);
        setShortField(term3189095, term3189095.getClass(), "opcode", (short) 0);
        setField(term3189095, term3189095.getClass(), "keys", null);
        setField(term3189095, term3189095.getClass(), "detailed", null);
        setField(term3189095, term3189095.getClass(), "d", null);
        setField(term3189095, term3189095.getClass(), "c", null);
        term3189097 = new Byte((byte) 0);
        term3189099 = new Byte((byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Decoder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = byte.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term3189097;
        args[1] = term3189099;
        callMethod(klass, "subtract5", argTypes, term3189095, args);
    }

};


