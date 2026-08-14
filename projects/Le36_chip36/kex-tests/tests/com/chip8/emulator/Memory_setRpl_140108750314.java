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

public class Memory_setRpl_140108750314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4983977;
     Object term4994040;

    public Memory_setRpl_140108750314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term4994036 = new ArrayDeque();
        term4983977 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term4983978 = (byte[]) newByteArray(16);
        byte[] term4983995 = (byte[]) newByteArray(16);
        byte[] term4984012 = (byte[]) newByteArray(16);
        byte[] term4984032 = (byte[]) newByteArray(65535);
        setField(term4983977, term4983977.getClass(), "v", term4983978);
        setField(term4983977, term4983977.getClass(), "rpl", term4983995);
        setByteElement(term4984012, 3, (byte) 32);
        setByteElement(term4984012, 4, (byte) 64);
        setByteElement(term4984012, 5, (byte) 32);
        setByteElement(term4984012, 7, (byte) 32);
        setByteElement(term4984012, 8, (byte) 64);
        setByteElement(term4984012, 9, (byte) 32);
        setByteElement(term4984012, 11, (byte) 32);
        setByteElement(term4984012, 12, (byte) 64);
        setByteElement(term4984012, 13, (byte) 32);
        setField(term4983977, term4983977.getClass(), "audio", term4984012);
        setShortField(term4983977, term4983977.getClass(), "pitch", (short) 64);
        setShortField(term4983977, term4983977.getClass(), "i", (short) -15717);
        setShortField(term4983977, term4983977.getClass(), "pc", (short) 512);
        setField(term4983977, term4983977.getClass(), "ram", term4984032);
        setByteField(term4983977, term4983977.getClass(), "delayTimer", (byte) -55);
        setByteField(term4983977, term4983977.getClass(), "soundTimer", (byte) 67);
        setField(term4983977, term4983977.getClass(), "stack", term4994036);
        term4994040 = (byte[]) newByteArray(3);
        setByteElement(term4994040, 0, (byte) 8);
        setByteElement(term4994040, 1, (byte) -11);
        setByteElement(term4994040, 2, (byte) 104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4994040;
        callMethod(klass, "setRpl", argTypes, term4983977, args);
    }

};


