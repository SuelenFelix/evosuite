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

public class Decoder_vfOrder_332502424110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3189111;
     Object term3189113;
     Object term3189115;
     Object term3189117;

    public Decoder_vfOrder_332502424110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3189111 = newInstance(Class.forName("com.chip8.emulator.Decoder"));
        setField(term3189111, term3189111.getClass(), "m", null);
        setField(term3189111, term3189111.getClass(), "fetcher", null);
        setField(term3189111, term3189111.getClass(), "pixels", null);
        setShortField(term3189111, term3189111.getClass(), "opcode", (short) 0);
        setField(term3189111, term3189111.getClass(), "keys", null);
        setField(term3189111, term3189111.getClass(), "detailed", null);
        setField(term3189111, term3189111.getClass(), "d", null);
        setField(term3189111, term3189111.getClass(), "c", null);
        term3189113 = new Integer(0);
        term3189115 = new Integer(0);
        term3189117 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Decoder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3189113;
        args[1] = term3189115;
        args[2] = term3189117;
        callMethod(klass, "vfOrder", argTypes, term3189111, args);
    }

};


