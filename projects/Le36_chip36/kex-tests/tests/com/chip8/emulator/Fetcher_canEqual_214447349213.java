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
import java.lang.Object;
import java.util.ArrayDeque;

public class Fetcher_canEqual_214447349213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5944746;
     Object term5954812;

    public Fetcher_canEqual_214447349213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5954807 = new ArrayDeque();
        term5944746 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term5944748 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5944749 = (byte[]) newByteArray(16);
        byte[] term5944766 = (byte[]) newByteArray(16);
        byte[] term5944783 = (byte[]) newByteArray(16);
        byte[] term5944803 = (byte[]) newByteArray(65535);
        setShortField(term5944746, term5944746.getClass(), "opcode", (short) -2957);
        setField(term5944748, term5944748.getClass(), "v", term5944749);
        setField(term5944748, term5944748.getClass(), "rpl", term5944766);
        setByteElement(term5944783, 3, (byte) 32);
        setByteElement(term5944783, 4, (byte) 64);
        setByteElement(term5944783, 5, (byte) 32);
        setByteElement(term5944783, 7, (byte) 32);
        setByteElement(term5944783, 8, (byte) 64);
        setByteElement(term5944783, 9, (byte) 32);
        setByteElement(term5944783, 11, (byte) 32);
        setByteElement(term5944783, 12, (byte) 64);
        setByteElement(term5944783, 13, (byte) 32);
        setField(term5944748, term5944748.getClass(), "audio", term5944783);
        setShortField(term5944748, term5944748.getClass(), "pitch", (short) 64);
        setShortField(term5944748, term5944748.getClass(), "i", (short) -17280);
        setShortField(term5944748, term5944748.getClass(), "pc", (short) 512);
        setField(term5944748, term5944748.getClass(), "ram", term5944803);
        setByteField(term5944748, term5944748.getClass(), "delayTimer", (byte) -92);
        setByteField(term5944748, term5944748.getClass(), "soundTimer", (byte) 16);
        setField(term5944748, term5944748.getClass(), "stack", term5954807);
        setField(term5944746, term5944746.getClass(), "m", term5944748);
        setLongField(term5944746, term5944746.getClass(), "currentTime", 2297097306706899827L);
        term5954812 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5954812;
        callMethod(klass, "canEqual", argTypes, term5944746, args);
    }

};


