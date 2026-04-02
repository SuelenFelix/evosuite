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
import java.lang.Short;

public class Decoder_decode_159709474478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3189037;
     Object term3189039;

    public Decoder_decode_159709474478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3189037 = newInstance(Class.forName("com.chip8.emulator.Decoder"));
        setField(term3189037, term3189037.getClass(), "m", null);
        setField(term3189037, term3189037.getClass(), "fetcher", null);
        setField(term3189037, term3189037.getClass(), "pixels", null);
        setShortField(term3189037, term3189037.getClass(), "opcode", (short) 0);
        setField(term3189037, term3189037.getClass(), "keys", null);
        setField(term3189037, term3189037.getClass(), "detailed", null);
        setField(term3189037, term3189037.getClass(), "d", null);
        setField(term3189037, term3189037.getClass(), "c", null);
        term3189039 = new Short((short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Decoder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = short.class;
        Object[] args = new Object[1];
        args[0] = term3189039;
        callMethod(klass, "decode", argTypes, term3189037, args);
    }

};


