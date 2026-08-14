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

public class Loader_loadToMemory_2177363592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5286126;

    public Loader_loadToMemory_2177363592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5296208 = new ArrayDeque();
        Class<? extends Object> term5306316 = Class.forName((String) "java.io.File$PathStatus");
        Field term5306315 = ((Class) term5306316).getDeclaredField((String) "CHECKED");
        ((Field) term5306315).setAccessible(true);
        Object enum18 = ((Field) term5306315).get((Object) null);
        term5286126 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5286127 = (byte[]) newByteArray(9);
        Object term5286149 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5286150 = (byte[]) newByteArray(16);
        byte[] term5286167 = (byte[]) newByteArray(16);
        byte[] term5286184 = (byte[]) newByteArray(16);
        byte[] term5286204 = (byte[]) newByteArray(65535);
        Object term5296212 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5286127, 0, (byte) -64);
        setByteElement(term5286127, 1, (byte) -25);
        setByteElement(term5286127, 2, (byte) 28);
        setByteElement(term5286127, 3, (byte) 56);
        setByteElement(term5286127, 4, (byte) -111);
        setByteElement(term5286127, 5, (byte) -98);
        setByteElement(term5286127, 6, (byte) -91);
        setByteElement(term5286127, 7, (byte) -12);
        setByteElement(term5286127, 8, (byte) 13);
        setField(term5286126, term5286126.getClass(), "bytes", term5286127);
        setField(term5286126, term5286126.getClass(), "name", "eWIWfWobXm");
        setField(term5286149, term5286149.getClass(), "v", term5286150);
        setField(term5286149, term5286149.getClass(), "rpl", term5286167);
        setByteElement(term5286184, 3, (byte) 32);
        setByteElement(term5286184, 4, (byte) 64);
        setByteElement(term5286184, 5, (byte) 32);
        setByteElement(term5286184, 7, (byte) 32);
        setByteElement(term5286184, 8, (byte) 64);
        setByteElement(term5286184, 9, (byte) 32);
        setByteElement(term5286184, 11, (byte) 32);
        setByteElement(term5286184, 12, (byte) 64);
        setByteElement(term5286184, 13, (byte) 32);
        setField(term5286149, term5286149.getClass(), "audio", term5286184);
        setShortField(term5286149, term5286149.getClass(), "pitch", (short) 64);
        setShortField(term5286149, term5286149.getClass(), "i", (short) -28902);
        setShortField(term5286149, term5286149.getClass(), "pc", (short) 512);
        setField(term5286149, term5286149.getClass(), "ram", term5286204);
        setByteField(term5286149, term5286149.getClass(), "delayTimer", (byte) 35);
        setByteField(term5286149, term5286149.getClass(), "soundTimer", (byte) -41);
        setField(term5286149, term5286149.getClass(), "stack", term5296208);
        setField(term5286126, term5286126.getClass(), "memory", term5286149);
        setField(term5296212, term5296212.getClass(), "path", "lkPJVVXhDd");
        setField(term5296212, term5296212.getClass(), "status", enum18);
        setIntField(term5296212, term5296212.getClass(), "prefixLength", -1849105286);
        setField(term5296212, term5296212.getClass(), "filePath", null);
        setField(term5286126, term5286126.getClass(), "loadedRom", term5296212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "loadToMemory", argTypes, term5286126, args);
    }

};


