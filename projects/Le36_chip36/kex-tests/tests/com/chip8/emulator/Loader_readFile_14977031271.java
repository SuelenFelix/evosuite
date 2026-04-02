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
import java.lang.String;

public class Loader_readFile_14977031271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5265806;

    public Loader_readFile_14977031271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5275882 = new ArrayDeque();
        Class<? extends Object> term5285984 = Class.forName((String) "java.io.File$PathStatus");
        Field term5285983 = ((Class) term5285984).getDeclaredField((String) "INVALID");
        ((Field) term5285983).setAccessible(true);
        Object enum17 = ((Field) term5285983).get((Object) null);
        term5265806 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5265807 = (byte[]) newByteArray(3);
        Object term5265823 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5265824 = (byte[]) newByteArray(16);
        byte[] term5265841 = (byte[]) newByteArray(16);
        byte[] term5265858 = (byte[]) newByteArray(16);
        byte[] term5265878 = (byte[]) newByteArray(65535);
        Object term5275886 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5265807, 0, (byte) -101);
        setByteElement(term5265807, 1, (byte) 49);
        setByteElement(term5265807, 2, (byte) 34);
        setField(term5265806, term5265806.getClass(), "bytes", term5265807);
        setField(term5265806, term5265806.getClass(), "name", "lnJVsFNsCN");
        setField(term5265823, term5265823.getClass(), "v", term5265824);
        setField(term5265823, term5265823.getClass(), "rpl", term5265841);
        setByteElement(term5265858, 3, (byte) 32);
        setByteElement(term5265858, 4, (byte) 64);
        setByteElement(term5265858, 5, (byte) 32);
        setByteElement(term5265858, 7, (byte) 32);
        setByteElement(term5265858, 8, (byte) 64);
        setByteElement(term5265858, 9, (byte) 32);
        setByteElement(term5265858, 11, (byte) 32);
        setByteElement(term5265858, 12, (byte) 64);
        setByteElement(term5265858, 13, (byte) 32);
        setField(term5265823, term5265823.getClass(), "audio", term5265858);
        setShortField(term5265823, term5265823.getClass(), "pitch", (short) 64);
        setShortField(term5265823, term5265823.getClass(), "i", (short) -32212);
        setShortField(term5265823, term5265823.getClass(), "pc", (short) 512);
        setField(term5265823, term5265823.getClass(), "ram", term5265878);
        setByteField(term5265823, term5265823.getClass(), "delayTimer", (byte) -23);
        setByteField(term5265823, term5265823.getClass(), "soundTimer", (byte) 45);
        setField(term5265823, term5265823.getClass(), "stack", term5275882);
        setField(term5265806, term5265806.getClass(), "memory", term5265823);
        setField(term5275886, term5275886.getClass(), "path", "CUagRkEuzN");
        setField(term5275886, term5275886.getClass(), "status", enum17);
        setIntField(term5275886, term5275886.getClass(), "prefixLength", -439048495);
        setField(term5275886, term5275886.getClass(), "filePath", null);
        setField(term5265806, term5265806.getClass(), "loadedRom", term5275886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readFile", argTypes, term5265806, args);
    }

};


