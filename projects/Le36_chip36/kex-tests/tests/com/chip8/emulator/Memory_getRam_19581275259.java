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

public class Memory_getRam_19581275259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4883402;

    public Memory_getRam_19581275259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term4893461 = new ArrayDeque();
        term4883402 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term4883403 = (byte[]) newByteArray(16);
        byte[] term4883420 = (byte[]) newByteArray(16);
        byte[] term4883437 = (byte[]) newByteArray(16);
        byte[] term4883457 = (byte[]) newByteArray(65535);
        setField(term4883402, term4883402.getClass(), "v", term4883403);
        setField(term4883402, term4883402.getClass(), "rpl", term4883420);
        setByteElement(term4883437, 3, (byte) 32);
        setByteElement(term4883437, 4, (byte) 64);
        setByteElement(term4883437, 5, (byte) 32);
        setByteElement(term4883437, 7, (byte) 32);
        setByteElement(term4883437, 8, (byte) 64);
        setByteElement(term4883437, 9, (byte) 32);
        setByteElement(term4883437, 11, (byte) 32);
        setByteElement(term4883437, 12, (byte) 64);
        setByteElement(term4883437, 13, (byte) 32);
        setField(term4883402, term4883402.getClass(), "audio", term4883437);
        setShortField(term4883402, term4883402.getClass(), "pitch", (short) 64);
        setShortField(term4883402, term4883402.getClass(), "i", (short) -3998);
        setShortField(term4883402, term4883402.getClass(), "pc", (short) 512);
        setField(term4883402, term4883402.getClass(), "ram", term4883457);
        setByteField(term4883402, term4883402.getClass(), "delayTimer", (byte) -31);
        setByteField(term4883402, term4883402.getClass(), "soundTimer", (byte) 83);
        setField(term4883402, term4883402.getClass(), "stack", term4893461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRam", argTypes, term4883402, args);
    }

};


