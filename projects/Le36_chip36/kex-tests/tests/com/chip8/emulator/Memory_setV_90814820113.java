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

public class Memory_setV_90814820113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4963850;
     Object term4973913;

    public Memory_setV_90814820113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term4973909 = new ArrayDeque();
        term4963850 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term4963851 = (byte[]) newByteArray(16);
        byte[] term4963868 = (byte[]) newByteArray(16);
        byte[] term4963885 = (byte[]) newByteArray(16);
        byte[] term4963905 = (byte[]) newByteArray(65535);
        setField(term4963850, term4963850.getClass(), "v", term4963851);
        setField(term4963850, term4963850.getClass(), "rpl", term4963868);
        setByteElement(term4963885, 3, (byte) 32);
        setByteElement(term4963885, 4, (byte) 64);
        setByteElement(term4963885, 5, (byte) 32);
        setByteElement(term4963885, 7, (byte) 32);
        setByteElement(term4963885, 8, (byte) 64);
        setByteElement(term4963885, 9, (byte) 32);
        setByteElement(term4963885, 11, (byte) 32);
        setByteElement(term4963885, 12, (byte) 64);
        setByteElement(term4963885, 13, (byte) 32);
        setField(term4963850, term4963850.getClass(), "audio", term4963885);
        setShortField(term4963850, term4963850.getClass(), "pitch", (short) 64);
        setShortField(term4963850, term4963850.getClass(), "i", (short) 19703);
        setShortField(term4963850, term4963850.getClass(), "pc", (short) 512);
        setField(term4963850, term4963850.getClass(), "ram", term4963905);
        setByteField(term4963850, term4963850.getClass(), "delayTimer", (byte) -2);
        setByteField(term4963850, term4963850.getClass(), "soundTimer", (byte) 101);
        setField(term4963850, term4963850.getClass(), "stack", term4973909);
        term4973913 = (byte[]) newByteArray(7);
        setByteElement(term4973913, 0, (byte) 14);
        setByteElement(term4973913, 1, (byte) 106);
        setByteElement(term4973913, 2, (byte) -24);
        setByteElement(term4973913, 4, (byte) -88);
        setByteElement(term4973913, 5, (byte) 87);
        setByteElement(term4973913, 6, (byte) -51);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4973913;
        callMethod(klass, "setV", argTypes, term4963850, args);
    }

};


