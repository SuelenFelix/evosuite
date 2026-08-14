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

public class Memory_canEqual_144945172024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5185161;
     Object term5195224;

    public Memory_canEqual_144945172024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5195220 = new ArrayDeque();
        term5185161 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5185162 = (byte[]) newByteArray(16);
        byte[] term5185179 = (byte[]) newByteArray(16);
        byte[] term5185196 = (byte[]) newByteArray(16);
        byte[] term5185216 = (byte[]) newByteArray(65535);
        setField(term5185161, term5185161.getClass(), "v", term5185162);
        setField(term5185161, term5185161.getClass(), "rpl", term5185179);
        setByteElement(term5185196, 3, (byte) 32);
        setByteElement(term5185196, 4, (byte) 64);
        setByteElement(term5185196, 5, (byte) 32);
        setByteElement(term5185196, 7, (byte) 32);
        setByteElement(term5185196, 8, (byte) 64);
        setByteElement(term5185196, 9, (byte) 32);
        setByteElement(term5185196, 11, (byte) 32);
        setByteElement(term5185196, 12, (byte) 64);
        setByteElement(term5185196, 13, (byte) 32);
        setField(term5185161, term5185161.getClass(), "audio", term5185196);
        setShortField(term5185161, term5185161.getClass(), "pitch", (short) 64);
        setShortField(term5185161, term5185161.getClass(), "i", (short) 17421);
        setShortField(term5185161, term5185161.getClass(), "pc", (short) 512);
        setField(term5185161, term5185161.getClass(), "ram", term5185216);
        setByteField(term5185161, term5185161.getClass(), "delayTimer", (byte) 82);
        setByteField(term5185161, term5185161.getClass(), "soundTimer", (byte) -127);
        setField(term5185161, term5185161.getClass(), "stack", term5195220);
        term5195224 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5195224;
        callMethod(klass, "canEqual", argTypes, term5185161, args);
    }

};


