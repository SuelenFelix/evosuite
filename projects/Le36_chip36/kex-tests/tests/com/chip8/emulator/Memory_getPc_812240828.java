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

public class Memory_getPc_812240828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4863290;

    public Memory_getPc_812240828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term4873349 = new ArrayDeque();
        term4863290 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term4863291 = (byte[]) newByteArray(16);
        byte[] term4863308 = (byte[]) newByteArray(16);
        byte[] term4863325 = (byte[]) newByteArray(16);
        byte[] term4863345 = (byte[]) newByteArray(65535);
        setField(term4863290, term4863290.getClass(), "v", term4863291);
        setField(term4863290, term4863290.getClass(), "rpl", term4863308);
        setByteElement(term4863325, 3, (byte) 32);
        setByteElement(term4863325, 4, (byte) 64);
        setByteElement(term4863325, 5, (byte) 32);
        setByteElement(term4863325, 7, (byte) 32);
        setByteElement(term4863325, 8, (byte) 64);
        setByteElement(term4863325, 9, (byte) 32);
        setByteElement(term4863325, 11, (byte) 32);
        setByteElement(term4863325, 12, (byte) 64);
        setByteElement(term4863325, 13, (byte) 32);
        setField(term4863290, term4863290.getClass(), "audio", term4863325);
        setShortField(term4863290, term4863290.getClass(), "pitch", (short) 64);
        setShortField(term4863290, term4863290.getClass(), "i", (short) 11287);
        setShortField(term4863290, term4863290.getClass(), "pc", (short) 512);
        setField(term4863290, term4863290.getClass(), "ram", term4863345);
        setByteField(term4863290, term4863290.getClass(), "delayTimer", (byte) 57);
        setByteField(term4863290, term4863290.getClass(), "soundTimer", (byte) 40);
        setField(term4863290, term4863290.getClass(), "stack", term4873349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPc", argTypes, term4863290, args);
    }

};


