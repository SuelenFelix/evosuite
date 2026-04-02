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

public class Memory_setPc_198251227218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5064455;
     Object term5074518;

    public Memory_setPc_198251227218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5074514 = new ArrayDeque();
        term5064455 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5064456 = (byte[]) newByteArray(16);
        byte[] term5064473 = (byte[]) newByteArray(16);
        byte[] term5064490 = (byte[]) newByteArray(16);
        byte[] term5064510 = (byte[]) newByteArray(65535);
        setField(term5064455, term5064455.getClass(), "v", term5064456);
        setField(term5064455, term5064455.getClass(), "rpl", term5064473);
        setByteElement(term5064490, 3, (byte) 32);
        setByteElement(term5064490, 4, (byte) 64);
        setByteElement(term5064490, 5, (byte) 32);
        setByteElement(term5064490, 7, (byte) 32);
        setByteElement(term5064490, 8, (byte) 64);
        setByteElement(term5064490, 9, (byte) 32);
        setByteElement(term5064490, 11, (byte) 32);
        setByteElement(term5064490, 12, (byte) 64);
        setByteElement(term5064490, 13, (byte) 32);
        setField(term5064455, term5064455.getClass(), "audio", term5064490);
        setShortField(term5064455, term5064455.getClass(), "pitch", (short) 64);
        setShortField(term5064455, term5064455.getClass(), "i", (short) 23783);
        setShortField(term5064455, term5064455.getClass(), "pc", (short) 512);
        setField(term5064455, term5064455.getClass(), "ram", term5064510);
        setByteField(term5064455, term5064455.getClass(), "delayTimer", (byte) -105);
        setByteField(term5064455, term5064455.getClass(), "soundTimer", (byte) 73);
        setField(term5064455, term5064455.getClass(), "stack", term5074514);
        term5074518 = new Short((short) -4068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = short.class;
        Object[] args = new Object[1];
        args[0] = term5074518;
        callMethod(klass, "setPc", argTypes, term5064455, args);
    }

};


