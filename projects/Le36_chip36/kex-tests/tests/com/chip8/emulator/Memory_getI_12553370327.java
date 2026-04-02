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

public class Memory_getI_12553370327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4843178;

    public Memory_getI_12553370327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term4853237 = new ArrayDeque();
        term4843178 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term4843179 = (byte[]) newByteArray(16);
        byte[] term4843196 = (byte[]) newByteArray(16);
        byte[] term4843213 = (byte[]) newByteArray(16);
        byte[] term4843233 = (byte[]) newByteArray(65535);
        setField(term4843178, term4843178.getClass(), "v", term4843179);
        setField(term4843178, term4843178.getClass(), "rpl", term4843196);
        setByteElement(term4843213, 3, (byte) 32);
        setByteElement(term4843213, 4, (byte) 64);
        setByteElement(term4843213, 5, (byte) 32);
        setByteElement(term4843213, 7, (byte) 32);
        setByteElement(term4843213, 8, (byte) 64);
        setByteElement(term4843213, 9, (byte) 32);
        setByteElement(term4843213, 11, (byte) 32);
        setByteElement(term4843213, 12, (byte) 64);
        setByteElement(term4843213, 13, (byte) 32);
        setField(term4843178, term4843178.getClass(), "audio", term4843213);
        setShortField(term4843178, term4843178.getClass(), "pitch", (short) 64);
        setShortField(term4843178, term4843178.getClass(), "i", (short) -20863);
        setShortField(term4843178, term4843178.getClass(), "pc", (short) 512);
        setField(term4843178, term4843178.getClass(), "ram", term4843233);
        setByteField(term4843178, term4843178.getClass(), "delayTimer", (byte) 14);
        setByteField(term4843178, term4843178.getClass(), "soundTimer", (byte) 125);
        setField(term4843178, term4843178.getClass(), "stack", term4853237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getI", argTypes, term4843178, args);
    }

};


