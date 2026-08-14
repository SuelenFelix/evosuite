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

public class Fetcher_getM_12532407987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5803939;

    public Fetcher_getM_12532407987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5814000 = new ArrayDeque();
        term5803939 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term5803941 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5803942 = (byte[]) newByteArray(16);
        byte[] term5803959 = (byte[]) newByteArray(16);
        byte[] term5803976 = (byte[]) newByteArray(16);
        byte[] term5803996 = (byte[]) newByteArray(65535);
        setShortField(term5803939, term5803939.getClass(), "opcode", (short) -32702);
        setField(term5803941, term5803941.getClass(), "v", term5803942);
        setField(term5803941, term5803941.getClass(), "rpl", term5803959);
        setByteElement(term5803976, 3, (byte) 32);
        setByteElement(term5803976, 4, (byte) 64);
        setByteElement(term5803976, 5, (byte) 32);
        setByteElement(term5803976, 7, (byte) 32);
        setByteElement(term5803976, 8, (byte) 64);
        setByteElement(term5803976, 9, (byte) 32);
        setByteElement(term5803976, 11, (byte) 32);
        setByteElement(term5803976, 12, (byte) 64);
        setByteElement(term5803976, 13, (byte) 32);
        setField(term5803941, term5803941.getClass(), "audio", term5803976);
        setShortField(term5803941, term5803941.getClass(), "pitch", (short) 64);
        setShortField(term5803941, term5803941.getClass(), "i", (short) 19271);
        setShortField(term5803941, term5803941.getClass(), "pc", (short) 512);
        setField(term5803941, term5803941.getClass(), "ram", term5803996);
        setByteField(term5803941, term5803941.getClass(), "delayTimer", (byte) -20);
        setByteField(term5803941, term5803941.getClass(), "soundTimer", (byte) 53);
        setField(term5803941, term5803941.getClass(), "stack", term5814000);
        setField(term5803939, term5803939.getClass(), "m", term5803941);
        setLongField(term5803939, term5803939.getClass(), "currentTime", -6342139649364011743L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getM", argTypes, term5803939, args);
    }

};


