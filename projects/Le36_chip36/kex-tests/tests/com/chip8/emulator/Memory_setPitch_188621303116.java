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

public class Memory_setPitch_188621303116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5024227;
     Object term5034290;

    public Memory_setPitch_188621303116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5034286 = new ArrayDeque();
        term5024227 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5024228 = (byte[]) newByteArray(16);
        byte[] term5024245 = (byte[]) newByteArray(16);
        byte[] term5024262 = (byte[]) newByteArray(16);
        byte[] term5024282 = (byte[]) newByteArray(65535);
        setField(term5024227, term5024227.getClass(), "v", term5024228);
        setField(term5024227, term5024227.getClass(), "rpl", term5024245);
        setByteElement(term5024262, 3, (byte) 32);
        setByteElement(term5024262, 4, (byte) 64);
        setByteElement(term5024262, 5, (byte) 32);
        setByteElement(term5024262, 7, (byte) 32);
        setByteElement(term5024262, 8, (byte) 64);
        setByteElement(term5024262, 9, (byte) 32);
        setByteElement(term5024262, 11, (byte) 32);
        setByteElement(term5024262, 12, (byte) 64);
        setByteElement(term5024262, 13, (byte) 32);
        setField(term5024227, term5024227.getClass(), "audio", term5024262);
        setShortField(term5024227, term5024227.getClass(), "pitch", (short) 64);
        setShortField(term5024227, term5024227.getClass(), "i", (short) -19678);
        setShortField(term5024227, term5024227.getClass(), "pc", (short) 512);
        setField(term5024227, term5024227.getClass(), "ram", term5024282);
        setByteField(term5024227, term5024227.getClass(), "delayTimer", (byte) -8);
        setByteField(term5024227, term5024227.getClass(), "soundTimer", (byte) 62);
        setField(term5024227, term5024227.getClass(), "stack", term5034286);
        term5034290 = new Short((short) 7145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = short.class;
        Object[] args = new Object[1];
        args[0] = term5034290;
        callMethod(klass, "setPitch", argTypes, term5024227, args);
    }

};


