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

public class Memory_equals_64528909123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5165048;
     Object term5175111;

    public Memory_equals_64528909123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5175107 = new ArrayDeque();
        term5165048 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5165049 = (byte[]) newByteArray(16);
        byte[] term5165066 = (byte[]) newByteArray(16);
        byte[] term5165083 = (byte[]) newByteArray(16);
        byte[] term5165103 = (byte[]) newByteArray(65535);
        setField(term5165048, term5165048.getClass(), "v", term5165049);
        setField(term5165048, term5165048.getClass(), "rpl", term5165066);
        setByteElement(term5165083, 3, (byte) 32);
        setByteElement(term5165083, 4, (byte) 64);
        setByteElement(term5165083, 5, (byte) 32);
        setByteElement(term5165083, 7, (byte) 32);
        setByteElement(term5165083, 8, (byte) 64);
        setByteElement(term5165083, 9, (byte) 32);
        setByteElement(term5165083, 11, (byte) 32);
        setByteElement(term5165083, 12, (byte) 64);
        setByteElement(term5165083, 13, (byte) 32);
        setField(term5165048, term5165048.getClass(), "audio", term5165083);
        setShortField(term5165048, term5165048.getClass(), "pitch", (short) 64);
        setShortField(term5165048, term5165048.getClass(), "i", (short) -26892);
        setShortField(term5165048, term5165048.getClass(), "pc", (short) 512);
        setField(term5165048, term5165048.getClass(), "ram", term5165103);
        setByteField(term5165048, term5165048.getClass(), "delayTimer", (byte) -68);
        setByteField(term5165048, term5165048.getClass(), "soundTimer", (byte) -75);
        setField(term5165048, term5165048.getClass(), "stack", term5175107);
        term5175111 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5175111;
        callMethod(klass, "equals", argTypes, term5165048, args);
    }

};


