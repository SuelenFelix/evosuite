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

public class Decoder_skipIfNotEqual_198068411794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3189071;

    public Decoder_skipIfNotEqual_198068411794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3189071 = newInstance(Class.forName("com.chip8.emulator.Decoder"));
        setField(term3189071, term3189071.getClass(), "m", null);
        setField(term3189071, term3189071.getClass(), "fetcher", null);
        setField(term3189071, term3189071.getClass(), "pixels", null);
        setShortField(term3189071, term3189071.getClass(), "opcode", (short) 0);
        setField(term3189071, term3189071.getClass(), "keys", null);
        setField(term3189071, term3189071.getClass(), "detailed", null);
        setField(term3189071, term3189071.getClass(), "d", null);
        setField(term3189071, term3189071.getClass(), "c", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Decoder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipIfNotEqual", argTypes, term3189071, args);
    }

};


