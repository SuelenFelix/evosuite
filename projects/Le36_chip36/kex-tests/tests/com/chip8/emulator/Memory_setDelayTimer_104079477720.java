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
import java.lang.Byte;

public class Memory_setDelayTimer_104079477720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5104688;
     Object term5114751;

    public Memory_setDelayTimer_104079477720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5114747 = new ArrayDeque();
        term5104688 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5104689 = (byte[]) newByteArray(16);
        byte[] term5104706 = (byte[]) newByteArray(16);
        byte[] term5104723 = (byte[]) newByteArray(16);
        byte[] term5104743 = (byte[]) newByteArray(65535);
        setField(term5104688, term5104688.getClass(), "v", term5104689);
        setField(term5104688, term5104688.getClass(), "rpl", term5104706);
        setByteElement(term5104723, 3, (byte) 32);
        setByteElement(term5104723, 4, (byte) 64);
        setByteElement(term5104723, 5, (byte) 32);
        setByteElement(term5104723, 7, (byte) 32);
        setByteElement(term5104723, 8, (byte) 64);
        setByteElement(term5104723, 9, (byte) 32);
        setByteElement(term5104723, 11, (byte) 32);
        setByteElement(term5104723, 12, (byte) 64);
        setByteElement(term5104723, 13, (byte) 32);
        setField(term5104688, term5104688.getClass(), "audio", term5104723);
        setShortField(term5104688, term5104688.getClass(), "pitch", (short) 64);
        setShortField(term5104688, term5104688.getClass(), "i", (short) 5777);
        setShortField(term5104688, term5104688.getClass(), "pc", (short) 512);
        setField(term5104688, term5104688.getClass(), "ram", term5104743);
        setByteField(term5104688, term5104688.getClass(), "delayTimer", (byte) -75);
        setByteField(term5104688, term5104688.getClass(), "soundTimer", (byte) -92);
        setField(term5104688, term5104688.getClass(), "stack", term5114747);
        term5114751 = new Byte((byte) 52);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = term5114751;
        callMethod(klass, "setDelayTimer", argTypes, term5104688, args);
    }

};


