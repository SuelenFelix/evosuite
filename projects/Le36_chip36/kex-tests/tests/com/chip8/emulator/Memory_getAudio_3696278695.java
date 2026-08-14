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

public class Memory_getAudio_3696278695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4802954;

    public Memory_getAudio_3696278695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term4813013 = new ArrayDeque();
        term4802954 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term4802955 = (byte[]) newByteArray(16);
        byte[] term4802972 = (byte[]) newByteArray(16);
        byte[] term4802989 = (byte[]) newByteArray(16);
        byte[] term4803009 = (byte[]) newByteArray(65535);
        setField(term4802954, term4802954.getClass(), "v", term4802955);
        setField(term4802954, term4802954.getClass(), "rpl", term4802972);
        setByteElement(term4802989, 3, (byte) 32);
        setByteElement(term4802989, 4, (byte) 64);
        setByteElement(term4802989, 5, (byte) 32);
        setByteElement(term4802989, 7, (byte) 32);
        setByteElement(term4802989, 8, (byte) 64);
        setByteElement(term4802989, 9, (byte) 32);
        setByteElement(term4802989, 11, (byte) 32);
        setByteElement(term4802989, 12, (byte) 64);
        setByteElement(term4802989, 13, (byte) 32);
        setField(term4802954, term4802954.getClass(), "audio", term4802989);
        setShortField(term4802954, term4802954.getClass(), "pitch", (short) 64);
        setShortField(term4802954, term4802954.getClass(), "i", (short) 16565);
        setShortField(term4802954, term4802954.getClass(), "pc", (short) 512);
        setField(term4802954, term4802954.getClass(), "ram", term4803009);
        setByteField(term4802954, term4802954.getClass(), "delayTimer", (byte) -119);
        setByteField(term4802954, term4802954.getClass(), "soundTimer", (byte) -51);
        setField(term4802954, term4802954.getClass(), "stack", term4813013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAudio", argTypes, term4802954, args);
    }

};


