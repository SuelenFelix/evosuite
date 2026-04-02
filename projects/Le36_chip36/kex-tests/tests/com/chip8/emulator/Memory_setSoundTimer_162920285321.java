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
import java.lang.Byte;

public class Memory_setSoundTimer_162920285321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5124802;
     Object term5134865;

    public Memory_setSoundTimer_162920285321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5134861 = new ArrayDeque();
        term5124802 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5124803 = (byte[]) newByteArray(16);
        byte[] term5124820 = (byte[]) newByteArray(16);
        byte[] term5124837 = (byte[]) newByteArray(16);
        byte[] term5124857 = (byte[]) newByteArray(65535);
        setField(term5124802, term5124802.getClass(), "v", term5124803);
        setField(term5124802, term5124802.getClass(), "rpl", term5124820);
        setByteElement(term5124837, 3, (byte) 32);
        setByteElement(term5124837, 4, (byte) 64);
        setByteElement(term5124837, 5, (byte) 32);
        setByteElement(term5124837, 7, (byte) 32);
        setByteElement(term5124837, 8, (byte) 64);
        setByteElement(term5124837, 9, (byte) 32);
        setByteElement(term5124837, 11, (byte) 32);
        setByteElement(term5124837, 12, (byte) 64);
        setByteElement(term5124837, 13, (byte) 32);
        setField(term5124802, term5124802.getClass(), "audio", term5124837);
        setShortField(term5124802, term5124802.getClass(), "pitch", (short) 64);
        setShortField(term5124802, term5124802.getClass(), "i", (short) -98);
        setShortField(term5124802, term5124802.getClass(), "pc", (short) 512);
        setField(term5124802, term5124802.getClass(), "ram", term5124857);
        setByteField(term5124802, term5124802.getClass(), "delayTimer", (byte) -101);
        setByteField(term5124802, term5124802.getClass(), "soundTimer", (byte) -64);
        setField(term5124802, term5124802.getClass(), "stack", term5134861);
        term5134865 = new Byte((byte) 107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = term5134865;
        callMethod(klass, "setSoundTimer", argTypes, term5124802, args);
    }

};


