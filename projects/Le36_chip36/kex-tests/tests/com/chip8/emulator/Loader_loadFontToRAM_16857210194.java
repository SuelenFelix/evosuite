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

public class Loader_loadFontToRAM_16857210194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5326780;

    public Loader_loadFontToRAM_16857210194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5336862 = new ArrayDeque();
        Class<? extends Object> term5346970 = Class.forName((String) "java.io.File$PathStatus");
        Field term5346969 = ((Class) term5346970).getDeclaredField((String) "INVALID");
        ((Field) term5346969).setAccessible(true);
        Object enum20 = ((Field) term5346969).get((Object) null);
        term5326780 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5326781 = (byte[]) newByteArray(9);
        Object term5326803 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5326804 = (byte[]) newByteArray(16);
        byte[] term5326821 = (byte[]) newByteArray(16);
        byte[] term5326838 = (byte[]) newByteArray(16);
        byte[] term5326858 = (byte[]) newByteArray(65535);
        Object term5336866 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5326781, 0, (byte) -1);
        setByteElement(term5326781, 1, (byte) 99);
        setByteElement(term5326781, 2, (byte) 32);
        setByteElement(term5326781, 3, (byte) -81);
        setByteElement(term5326781, 4, (byte) 122);
        setByteElement(term5326781, 5, (byte) 27);
        setByteElement(term5326781, 6, (byte) -118);
        setByteElement(term5326781, 7, (byte) 37);
        setByteElement(term5326781, 8, (byte) -9);
        setField(term5326780, term5326780.getClass(), "bytes", term5326781);
        setField(term5326780, term5326780.getClass(), "name", "rcbQDpUkab");
        setField(term5326803, term5326803.getClass(), "v", term5326804);
        setField(term5326803, term5326803.getClass(), "rpl", term5326821);
        setByteElement(term5326838, 3, (byte) 32);
        setByteElement(term5326838, 4, (byte) 64);
        setByteElement(term5326838, 5, (byte) 32);
        setByteElement(term5326838, 7, (byte) 32);
        setByteElement(term5326838, 8, (byte) 64);
        setByteElement(term5326838, 9, (byte) 32);
        setByteElement(term5326838, 11, (byte) 32);
        setByteElement(term5326838, 12, (byte) 64);
        setByteElement(term5326838, 13, (byte) 32);
        setField(term5326803, term5326803.getClass(), "audio", term5326838);
        setShortField(term5326803, term5326803.getClass(), "pitch", (short) 64);
        setShortField(term5326803, term5326803.getClass(), "i", (short) 20873);
        setShortField(term5326803, term5326803.getClass(), "pc", (short) 512);
        setField(term5326803, term5326803.getClass(), "ram", term5326858);
        setByteField(term5326803, term5326803.getClass(), "delayTimer", (byte) -3);
        setByteField(term5326803, term5326803.getClass(), "soundTimer", (byte) 68);
        setField(term5326803, term5326803.getClass(), "stack", term5336862);
        setField(term5326780, term5326780.getClass(), "memory", term5326803);
        setField(term5336866, term5336866.getClass(), "path", "oZAbUeXmhW");
        setField(term5336866, term5336866.getClass(), "status", enum20);
        setIntField(term5336866, term5336866.getClass(), "prefixLength", 917513193);
        setField(term5336866, term5336866.getClass(), "filePath", null);
        setField(term5326780, term5326780.getClass(), "loadedRom", term5336866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "loadFontToRAM", argTypes, term5326780, args);
    }

};


