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

public class Decoder_draw_297441572116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3189129;
     Object term3189131;
     Object term3189133;

    public Decoder_draw_297441572116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3189129 = newInstance(Class.forName("com.chip8.emulator.Decoder"));
        setField(term3189129, term3189129.getClass(), "m", null);
        setField(term3189129, term3189129.getClass(), "fetcher", null);
        setField(term3189129, term3189129.getClass(), "pixels", null);
        setShortField(term3189129, term3189129.getClass(), "opcode", (short) 0);
        setField(term3189129, term3189129.getClass(), "keys", null);
        setField(term3189129, term3189129.getClass(), "detailed", null);
        setField(term3189129, term3189129.getClass(), "d", null);
        setField(term3189129, term3189129.getClass(), "c", null);
        term3189131 = new Byte((byte) 0);
        term3189133 = new Byte((byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Decoder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = byte.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term3189131;
        args[1] = term3189133;
        callMethod(klass, "draw", argTypes, term3189129, args);
    }

};


