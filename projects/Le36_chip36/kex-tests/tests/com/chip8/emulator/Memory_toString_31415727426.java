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

public class Memory_toString_31415727426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5225386;

    public Memory_toString_31415727426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5235445 = new ArrayDeque();
        term5225386 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5225387 = (byte[]) newByteArray(16);
        byte[] term5225404 = (byte[]) newByteArray(16);
        byte[] term5225421 = (byte[]) newByteArray(16);
        byte[] term5225441 = (byte[]) newByteArray(65535);
        setField(term5225386, term5225386.getClass(), "v", term5225387);
        setField(term5225386, term5225386.getClass(), "rpl", term5225404);
        setByteElement(term5225421, 3, (byte) 32);
        setByteElement(term5225421, 4, (byte) 64);
        setByteElement(term5225421, 5, (byte) 32);
        setByteElement(term5225421, 7, (byte) 32);
        setByteElement(term5225421, 8, (byte) 64);
        setByteElement(term5225421, 9, (byte) 32);
        setByteElement(term5225421, 11, (byte) 32);
        setByteElement(term5225421, 12, (byte) 64);
        setByteElement(term5225421, 13, (byte) 32);
        setField(term5225386, term5225386.getClass(), "audio", term5225421);
        setShortField(term5225386, term5225386.getClass(), "pitch", (short) 64);
        setShortField(term5225386, term5225386.getClass(), "i", (short) -26665);
        setShortField(term5225386, term5225386.getClass(), "pc", (short) 512);
        setField(term5225386, term5225386.getClass(), "ram", term5225441);
        setByteField(term5225386, term5225386.getClass(), "delayTimer", (byte) 11);
        setByteField(term5225386, term5225386.getClass(), "soundTimer", (byte) 108);
        setField(term5225386, term5225386.getClass(), "stack", term5235445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5225386, args);
    }

};


