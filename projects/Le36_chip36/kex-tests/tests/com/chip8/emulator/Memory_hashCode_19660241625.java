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

public class Memory_hashCode_19660241625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5205274;

    public Memory_hashCode_19660241625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5215333 = new ArrayDeque();
        term5205274 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5205275 = (byte[]) newByteArray(16);
        byte[] term5205292 = (byte[]) newByteArray(16);
        byte[] term5205309 = (byte[]) newByteArray(16);
        byte[] term5205329 = (byte[]) newByteArray(65535);
        setField(term5205274, term5205274.getClass(), "v", term5205275);
        setField(term5205274, term5205274.getClass(), "rpl", term5205292);
        setByteElement(term5205309, 3, (byte) 32);
        setByteElement(term5205309, 4, (byte) 64);
        setByteElement(term5205309, 5, (byte) 32);
        setByteElement(term5205309, 7, (byte) 32);
        setByteElement(term5205309, 8, (byte) 64);
        setByteElement(term5205309, 9, (byte) 32);
        setByteElement(term5205309, 11, (byte) 32);
        setByteElement(term5205309, 12, (byte) 64);
        setByteElement(term5205309, 13, (byte) 32);
        setField(term5205274, term5205274.getClass(), "audio", term5205309);
        setShortField(term5205274, term5205274.getClass(), "pitch", (short) 64);
        setShortField(term5205274, term5205274.getClass(), "i", (short) 12579);
        setShortField(term5205274, term5205274.getClass(), "pc", (short) 512);
        setField(term5205274, term5205274.getClass(), "ram", term5205329);
        setByteField(term5205274, term5205274.getClass(), "delayTimer", (byte) 23);
        setByteField(term5205274, term5205274.getClass(), "soundTimer", (byte) 98);
        setField(term5205274, term5205274.getClass(), "stack", term5215333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5205274, args);
    }

};


