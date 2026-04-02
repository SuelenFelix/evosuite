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

public class Fetcher_getOpcode_20885302196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5783824;

    public Fetcher_getOpcode_20885302196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5793885 = new ArrayDeque();
        term5783824 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term5783826 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5783827 = (byte[]) newByteArray(16);
        byte[] term5783844 = (byte[]) newByteArray(16);
        byte[] term5783861 = (byte[]) newByteArray(16);
        byte[] term5783881 = (byte[]) newByteArray(65535);
        setShortField(term5783824, term5783824.getClass(), "opcode", (short) 23120);
        setField(term5783826, term5783826.getClass(), "v", term5783827);
        setField(term5783826, term5783826.getClass(), "rpl", term5783844);
        setByteElement(term5783861, 3, (byte) 32);
        setByteElement(term5783861, 4, (byte) 64);
        setByteElement(term5783861, 5, (byte) 32);
        setByteElement(term5783861, 7, (byte) 32);
        setByteElement(term5783861, 8, (byte) 64);
        setByteElement(term5783861, 9, (byte) 32);
        setByteElement(term5783861, 11, (byte) 32);
        setByteElement(term5783861, 12, (byte) 64);
        setByteElement(term5783861, 13, (byte) 32);
        setField(term5783826, term5783826.getClass(), "audio", term5783861);
        setShortField(term5783826, term5783826.getClass(), "pitch", (short) 64);
        setShortField(term5783826, term5783826.getClass(), "i", (short) -23534);
        setShortField(term5783826, term5783826.getClass(), "pc", (short) 512);
        setField(term5783826, term5783826.getClass(), "ram", term5783881);
        setByteField(term5783826, term5783826.getClass(), "delayTimer", (byte) 38);
        setByteField(term5783826, term5783826.getClass(), "soundTimer", (byte) -20);
        setField(term5783826, term5783826.getClass(), "stack", term5793885);
        setField(term5783824, term5783824.getClass(), "m", term5783826);
        setLongField(term5783824, term5783824.getClass(), "currentTime", 1667122142089513324L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpcode", argTypes, term5783824, args);
    }

};


