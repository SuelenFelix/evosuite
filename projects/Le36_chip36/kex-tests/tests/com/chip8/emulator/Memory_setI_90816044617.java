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

public class Memory_setI_90816044617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5044341;
     Object term5054404;

    public Memory_setI_90816044617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5054400 = new ArrayDeque();
        term5044341 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5044342 = (byte[]) newByteArray(16);
        byte[] term5044359 = (byte[]) newByteArray(16);
        byte[] term5044376 = (byte[]) newByteArray(16);
        byte[] term5044396 = (byte[]) newByteArray(65535);
        setField(term5044341, term5044341.getClass(), "v", term5044342);
        setField(term5044341, term5044341.getClass(), "rpl", term5044359);
        setByteElement(term5044376, 3, (byte) 32);
        setByteElement(term5044376, 4, (byte) 64);
        setByteElement(term5044376, 5, (byte) 32);
        setByteElement(term5044376, 7, (byte) 32);
        setByteElement(term5044376, 8, (byte) 64);
        setByteElement(term5044376, 9, (byte) 32);
        setByteElement(term5044376, 11, (byte) 32);
        setByteElement(term5044376, 12, (byte) 64);
        setByteElement(term5044376, 13, (byte) 32);
        setField(term5044341, term5044341.getClass(), "audio", term5044376);
        setShortField(term5044341, term5044341.getClass(), "pitch", (short) 64);
        setShortField(term5044341, term5044341.getClass(), "i", (short) 14893);
        setShortField(term5044341, term5044341.getClass(), "pc", (short) 512);
        setField(term5044341, term5044341.getClass(), "ram", term5044396);
        setByteField(term5044341, term5044341.getClass(), "delayTimer", (byte) 38);
        setByteField(term5044341, term5044341.getClass(), "soundTimer", (byte) 31);
        setField(term5044341, term5044341.getClass(), "stack", term5054400);
        term5054404 = new Short((short) -26944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = short.class;
        Object[] args = new Object[1];
        args[0] = term5054404;
        callMethod(klass, "setI", argTypes, term5044341, args);
    }

};


