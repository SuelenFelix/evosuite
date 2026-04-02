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

public class Fetcher_init_1705642890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5663135;

    public Fetcher_init_1705642890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5673194 = new ArrayDeque();
        term5663135 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5663136 = (byte[]) newByteArray(16);
        byte[] term5663153 = (byte[]) newByteArray(16);
        byte[] term5663170 = (byte[]) newByteArray(16);
        byte[] term5663190 = (byte[]) newByteArray(65535);
        setField(term5663135, term5663135.getClass(), "v", term5663136);
        setField(term5663135, term5663135.getClass(), "rpl", term5663153);
        setByteElement(term5663170, 3, (byte) 32);
        setByteElement(term5663170, 4, (byte) 64);
        setByteElement(term5663170, 5, (byte) 32);
        setByteElement(term5663170, 7, (byte) 32);
        setByteElement(term5663170, 8, (byte) 64);
        setByteElement(term5663170, 9, (byte) 32);
        setByteElement(term5663170, 11, (byte) 32);
        setByteElement(term5663170, 12, (byte) 64);
        setByteElement(term5663170, 13, (byte) 32);
        setField(term5663135, term5663135.getClass(), "audio", term5663170);
        setShortField(term5663135, term5663135.getClass(), "pitch", (short) 64);
        setShortField(term5663135, term5663135.getClass(), "i", (short) -12922);
        setShortField(term5663135, term5663135.getClass(), "pc", (short) 512);
        setField(term5663135, term5663135.getClass(), "ram", term5663190);
        setByteField(term5663135, term5663135.getClass(), "delayTimer", (byte) -71);
        setByteField(term5663135, term5663135.getClass(), "soundTimer", (byte) -6);
        setField(term5663135, term5663135.getClass(), "stack", term5673194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.chip8.emulator.Memory");
        Object[] args = new Object[1];
        args[0] = term5663135;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


