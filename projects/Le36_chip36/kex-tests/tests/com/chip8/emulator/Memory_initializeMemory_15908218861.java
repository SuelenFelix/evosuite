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
import java.lang.Short;
import java.lang.Byte;

public class Memory_initializeMemory_15908218861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722498;
     Object term4732561;
     Object term4732563;

    public Memory_initializeMemory_15908218861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term4732557 = new ArrayDeque();
        term4722498 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term4722499 = (byte[]) newByteArray(16);
        byte[] term4722516 = (byte[]) newByteArray(16);
        byte[] term4722533 = (byte[]) newByteArray(16);
        byte[] term4722553 = (byte[]) newByteArray(65535);
        setField(term4722498, term4722498.getClass(), "v", term4722499);
        setField(term4722498, term4722498.getClass(), "rpl", term4722516);
        setByteElement(term4722533, 3, (byte) 32);
        setByteElement(term4722533, 4, (byte) 64);
        setByteElement(term4722533, 5, (byte) 32);
        setByteElement(term4722533, 7, (byte) 32);
        setByteElement(term4722533, 8, (byte) 64);
        setByteElement(term4722533, 9, (byte) 32);
        setByteElement(term4722533, 11, (byte) 32);
        setByteElement(term4722533, 12, (byte) 64);
        setByteElement(term4722533, 13, (byte) 32);
        setField(term4722498, term4722498.getClass(), "audio", term4722533);
        setShortField(term4722498, term4722498.getClass(), "pitch", (short) 64);
        setShortField(term4722498, term4722498.getClass(), "i", (short) 19648);
        setShortField(term4722498, term4722498.getClass(), "pc", (short) 512);
        setField(term4722498, term4722498.getClass(), "ram", term4722553);
        setByteField(term4722498, term4722498.getClass(), "delayTimer", (byte) 90);
        setByteField(term4722498, term4722498.getClass(), "soundTimer", (byte) -40);
        setField(term4722498, term4722498.getClass(), "stack", term4732557);
        term4732561 = new Short((short) 27499);
        term4732563 = new Byte((byte) 79);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = short.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term4732561;
        args[1] = term4732563;
        callMethod(klass, "initializeMemory", argTypes, term4722498, args);
    }

};


