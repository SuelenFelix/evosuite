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

public class Loader_canEqual_83681688616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5590860;
     Object term5600967;

    public Loader_canEqual_83681688616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5600938 = new ArrayDeque();
        Class<? extends Object> term5611043 = Class.forName((String) "java.io.File$PathStatus");
        Field term5611042 = ((Class) term5611043).getDeclaredField((String) "CHECKED");
        ((Field) term5611042).setAccessible(true);
        Object enum32 = ((Field) term5611042).get((Object) null);
        term5590860 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5590861 = (byte[]) newByteArray(5);
        Object term5590879 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5590880 = (byte[]) newByteArray(16);
        byte[] term5590897 = (byte[]) newByteArray(16);
        byte[] term5590914 = (byte[]) newByteArray(16);
        byte[] term5590934 = (byte[]) newByteArray(65535);
        Object term5600942 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5590861, 0, (byte) 90);
        setByteElement(term5590861, 1, (byte) -76);
        setByteElement(term5590861, 2, (byte) 72);
        setByteElement(term5590861, 3, (byte) -111);
        setByteElement(term5590861, 4, (byte) 3);
        setField(term5590860, term5590860.getClass(), "bytes", term5590861);
        setField(term5590860, term5590860.getClass(), "name", "lNBaHEkYui");
        setField(term5590879, term5590879.getClass(), "v", term5590880);
        setField(term5590879, term5590879.getClass(), "rpl", term5590897);
        setByteElement(term5590914, 3, (byte) 32);
        setByteElement(term5590914, 4, (byte) 64);
        setByteElement(term5590914, 5, (byte) 32);
        setByteElement(term5590914, 7, (byte) 32);
        setByteElement(term5590914, 8, (byte) 64);
        setByteElement(term5590914, 9, (byte) 32);
        setByteElement(term5590914, 11, (byte) 32);
        setByteElement(term5590914, 12, (byte) 64);
        setByteElement(term5590914, 13, (byte) 32);
        setField(term5590879, term5590879.getClass(), "audio", term5590914);
        setShortField(term5590879, term5590879.getClass(), "pitch", (short) 64);
        setShortField(term5590879, term5590879.getClass(), "i", (short) -29332);
        setShortField(term5590879, term5590879.getClass(), "pc", (short) 512);
        setField(term5590879, term5590879.getClass(), "ram", term5590934);
        setByteField(term5590879, term5590879.getClass(), "delayTimer", (byte) 85);
        setByteField(term5590879, term5590879.getClass(), "soundTimer", (byte) 31);
        setField(term5590879, term5590879.getClass(), "stack", term5600938);
        setField(term5590860, term5590860.getClass(), "memory", term5590879);
        setField(term5600942, term5600942.getClass(), "path", "BqxRCYZwmn");
        setField(term5600942, term5600942.getClass(), "status", enum32);
        setIntField(term5600942, term5600942.getClass(), "prefixLength", -1941343035);
        setField(term5600942, term5600942.getClass(), "filePath", null);
        setField(term5590860, term5590860.getClass(), "loadedRom", term5600942);
        term5600967 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5600967;
        callMethod(klass, "canEqual", argTypes, term5590860, args);
    }

};


