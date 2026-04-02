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

public class Memory_setAudio_198490765715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5004096;
     Object term5014159;

    public Memory_setAudio_198490765715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5014155 = new ArrayDeque();
        term5004096 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5004097 = (byte[]) newByteArray(16);
        byte[] term5004114 = (byte[]) newByteArray(16);
        byte[] term5004131 = (byte[]) newByteArray(16);
        byte[] term5004151 = (byte[]) newByteArray(65535);
        setField(term5004096, term5004096.getClass(), "v", term5004097);
        setField(term5004096, term5004096.getClass(), "rpl", term5004114);
        setByteElement(term5004131, 3, (byte) 32);
        setByteElement(term5004131, 4, (byte) 64);
        setByteElement(term5004131, 5, (byte) 32);
        setByteElement(term5004131, 7, (byte) 32);
        setByteElement(term5004131, 8, (byte) 64);
        setByteElement(term5004131, 9, (byte) 32);
        setByteElement(term5004131, 11, (byte) 32);
        setByteElement(term5004131, 12, (byte) 64);
        setByteElement(term5004131, 13, (byte) 32);
        setField(term5004096, term5004096.getClass(), "audio", term5004131);
        setShortField(term5004096, term5004096.getClass(), "pitch", (short) 64);
        setShortField(term5004096, term5004096.getClass(), "i", (short) -10703);
        setShortField(term5004096, term5004096.getClass(), "pc", (short) 512);
        setField(term5004096, term5004096.getClass(), "ram", term5004151);
        setByteField(term5004096, term5004096.getClass(), "delayTimer", (byte) 56);
        setByteField(term5004096, term5004096.getClass(), "soundTimer", (byte) -61);
        setField(term5004096, term5004096.getClass(), "stack", term5014155);
        term5014159 = (byte[]) newByteArray(9);
        setByteElement(term5014159, 0, (byte) -108);
        setByteElement(term5014159, 1, (byte) 10);
        setByteElement(term5014159, 2, (byte) -83);
        setByteElement(term5014159, 3, (byte) -117);
        setByteElement(term5014159, 4, (byte) 97);
        setByteElement(term5014159, 5, (byte) 100);
        setByteElement(term5014159, 6, (byte) 79);
        setByteElement(term5014159, 7, (byte) -56);
        setByteElement(term5014159, 8, (byte) 105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5014159;
        callMethod(klass, "setAudio", argTypes, term5004096, args);
    }

};


