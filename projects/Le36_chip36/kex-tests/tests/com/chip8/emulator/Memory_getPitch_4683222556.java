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
import java.util.ArrayDeque;

public class Memory_getPitch_4683222556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4823066;

    public Memory_getPitch_4683222556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term4833125 = new ArrayDeque();
        term4823066 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term4823067 = (byte[]) newByteArray(16);
        byte[] term4823084 = (byte[]) newByteArray(16);
        byte[] term4823101 = (byte[]) newByteArray(16);
        byte[] term4823121 = (byte[]) newByteArray(65535);
        setField(term4823066, term4823066.getClass(), "v", term4823067);
        setField(term4823066, term4823066.getClass(), "rpl", term4823084);
        setByteElement(term4823101, 3, (byte) 32);
        setByteElement(term4823101, 4, (byte) 64);
        setByteElement(term4823101, 5, (byte) 32);
        setByteElement(term4823101, 7, (byte) 32);
        setByteElement(term4823101, 8, (byte) 64);
        setByteElement(term4823101, 9, (byte) 32);
        setByteElement(term4823101, 11, (byte) 32);
        setByteElement(term4823101, 12, (byte) 64);
        setByteElement(term4823101, 13, (byte) 32);
        setField(term4823066, term4823066.getClass(), "audio", term4823101);
        setShortField(term4823066, term4823066.getClass(), "pitch", (short) 64);
        setShortField(term4823066, term4823066.getClass(), "i", (short) -430);
        setShortField(term4823066, term4823066.getClass(), "pc", (short) 512);
        setField(term4823066, term4823066.getClass(), "ram", term4823121);
        setByteField(term4823066, term4823066.getClass(), "delayTimer", (byte) -55);
        setByteField(term4823066, term4823066.getClass(), "soundTimer", (byte) -5);
        setField(term4823066, term4823066.getClass(), "stack", term4833125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPitch", argTypes, term4823066, args);
    }

};


