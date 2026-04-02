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

public class Memory_getSoundTimer_175138538511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4923626;

    public Memory_getSoundTimer_175138538511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term4933685 = new ArrayDeque();
        term4923626 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term4923627 = (byte[]) newByteArray(16);
        byte[] term4923644 = (byte[]) newByteArray(16);
        byte[] term4923661 = (byte[]) newByteArray(16);
        byte[] term4923681 = (byte[]) newByteArray(65535);
        setField(term4923626, term4923626.getClass(), "v", term4923627);
        setField(term4923626, term4923626.getClass(), "rpl", term4923644);
        setByteElement(term4923661, 3, (byte) 32);
        setByteElement(term4923661, 4, (byte) 64);
        setByteElement(term4923661, 5, (byte) 32);
        setByteElement(term4923661, 7, (byte) 32);
        setByteElement(term4923661, 8, (byte) 64);
        setByteElement(term4923661, 9, (byte) 32);
        setByteElement(term4923661, 11, (byte) 32);
        setByteElement(term4923661, 12, (byte) 64);
        setByteElement(term4923661, 13, (byte) 32);
        setField(term4923626, term4923626.getClass(), "audio", term4923661);
        setShortField(term4923626, term4923626.getClass(), "pitch", (short) 64);
        setShortField(term4923626, term4923626.getClass(), "i", (short) 12908);
        setShortField(term4923626, term4923626.getClass(), "pc", (short) 512);
        setField(term4923626, term4923626.getClass(), "ram", term4923681);
        setByteField(term4923626, term4923626.getClass(), "delayTimer", (byte) 95);
        setByteField(term4923626, term4923626.getClass(), "soundTimer", (byte) 15);
        setField(term4923626, term4923626.getClass(), "stack", term4933685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSoundTimer", argTypes, term4923626, args);
    }

};


