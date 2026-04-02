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
import java.lang.Object;
import java.util.ArrayDeque;

public class Fetcher_equals_134031086312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5924630;
     Object term5934696;

    public Fetcher_equals_134031086312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5934691 = new ArrayDeque();
        term5924630 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term5924632 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5924633 = (byte[]) newByteArray(16);
        byte[] term5924650 = (byte[]) newByteArray(16);
        byte[] term5924667 = (byte[]) newByteArray(16);
        byte[] term5924687 = (byte[]) newByteArray(65535);
        setShortField(term5924630, term5924630.getClass(), "opcode", (short) 25610);
        setField(term5924632, term5924632.getClass(), "v", term5924633);
        setField(term5924632, term5924632.getClass(), "rpl", term5924650);
        setByteElement(term5924667, 3, (byte) 32);
        setByteElement(term5924667, 4, (byte) 64);
        setByteElement(term5924667, 5, (byte) 32);
        setByteElement(term5924667, 7, (byte) 32);
        setByteElement(term5924667, 8, (byte) 64);
        setByteElement(term5924667, 9, (byte) 32);
        setByteElement(term5924667, 11, (byte) 32);
        setByteElement(term5924667, 12, (byte) 64);
        setByteElement(term5924667, 13, (byte) 32);
        setField(term5924632, term5924632.getClass(), "audio", term5924667);
        setShortField(term5924632, term5924632.getClass(), "pitch", (short) 64);
        setShortField(term5924632, term5924632.getClass(), "i", (short) 9278);
        setShortField(term5924632, term5924632.getClass(), "pc", (short) 512);
        setField(term5924632, term5924632.getClass(), "ram", term5924687);
        setByteField(term5924632, term5924632.getClass(), "delayTimer", (byte) -111);
        setByteField(term5924632, term5924632.getClass(), "soundTimer", (byte) 0);
        setField(term5924632, term5924632.getClass(), "stack", term5934691);
        setField(term5924630, term5924630.getClass(), "m", term5924632);
        setLongField(term5924630, term5924630.getClass(), "currentTime", 5671808784468963649L);
        term5934696 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5934696;
        callMethod(klass, "equals", argTypes, term5924630, args);
    }

};


