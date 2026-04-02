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

public class Loader_setMemory_73132158613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5509755;
     Object term5519861;

    public Loader_setMemory_73132158613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5519832 = new ArrayDeque();
        Class<? extends Object> term5539998 = Class.forName((String) "java.io.File$PathStatus");
        Field term5539997 = ((Class) term5539998).getDeclaredField((String) "INVALID");
        ((Field) term5539997).setAccessible(true);
        Object enum29 = ((Field) term5539997).get((Object) null);
        term5509755 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5509756 = (byte[]) newByteArray(4);
        Object term5509773 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5509774 = (byte[]) newByteArray(16);
        byte[] term5509791 = (byte[]) newByteArray(16);
        byte[] term5509808 = (byte[]) newByteArray(16);
        byte[] term5509828 = (byte[]) newByteArray(65535);
        Object term5519836 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5509756, 0, (byte) 104);
        setByteElement(term5509756, 1, (byte) 85);
        setByteElement(term5509756, 2, (byte) -27);
        setByteElement(term5509756, 3, (byte) 106);
        setField(term5509755, term5509755.getClass(), "bytes", term5509756);
        setField(term5509755, term5509755.getClass(), "name", "UFGOnIMOzf");
        setField(term5509773, term5509773.getClass(), "v", term5509774);
        setField(term5509773, term5509773.getClass(), "rpl", term5509791);
        setByteElement(term5509808, 3, (byte) 32);
        setByteElement(term5509808, 4, (byte) 64);
        setByteElement(term5509808, 5, (byte) 32);
        setByteElement(term5509808, 7, (byte) 32);
        setByteElement(term5509808, 8, (byte) 64);
        setByteElement(term5509808, 9, (byte) 32);
        setByteElement(term5509808, 11, (byte) 32);
        setByteElement(term5509808, 12, (byte) 64);
        setByteElement(term5509808, 13, (byte) 32);
        setField(term5509773, term5509773.getClass(), "audio", term5509808);
        setShortField(term5509773, term5509773.getClass(), "pitch", (short) 64);
        setShortField(term5509773, term5509773.getClass(), "i", (short) 14117);
        setShortField(term5509773, term5509773.getClass(), "pc", (short) 512);
        setField(term5509773, term5509773.getClass(), "ram", term5509828);
        setByteField(term5509773, term5509773.getClass(), "delayTimer", (byte) 104);
        setByteField(term5509773, term5509773.getClass(), "soundTimer", (byte) 28);
        setField(term5509773, term5509773.getClass(), "stack", term5519832);
        setField(term5509755, term5509755.getClass(), "memory", term5509773);
        setField(term5519836, term5519836.getClass(), "path", "ySiyRlAQpt");
        setField(term5519836, term5519836.getClass(), "status", enum29);
        setIntField(term5519836, term5519836.getClass(), "prefixLength", 765731371);
        setField(term5519836, term5519836.getClass(), "filePath", null);
        setField(term5509755, term5509755.getClass(), "loadedRom", term5519836);
        ArrayDeque term5529920 = new ArrayDeque();
        term5519861 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5519862 = (byte[]) newByteArray(16);
        byte[] term5519879 = (byte[]) newByteArray(16);
        byte[] term5519896 = (byte[]) newByteArray(16);
        byte[] term5519916 = (byte[]) newByteArray(65535);
        setField(term5519861, term5519861.getClass(), "v", term5519862);
        setField(term5519861, term5519861.getClass(), "rpl", term5519879);
        setByteElement(term5519896, 3, (byte) 32);
        setByteElement(term5519896, 4, (byte) 64);
        setByteElement(term5519896, 5, (byte) 32);
        setByteElement(term5519896, 7, (byte) 32);
        setByteElement(term5519896, 8, (byte) 64);
        setByteElement(term5519896, 9, (byte) 32);
        setByteElement(term5519896, 11, (byte) 32);
        setByteElement(term5519896, 12, (byte) 64);
        setByteElement(term5519896, 13, (byte) 32);
        setField(term5519861, term5519861.getClass(), "audio", term5519896);
        setShortField(term5519861, term5519861.getClass(), "pitch", (short) 64);
        setShortField(term5519861, term5519861.getClass(), "i", (short) -12809);
        setShortField(term5519861, term5519861.getClass(), "pc", (short) 512);
        setField(term5519861, term5519861.getClass(), "ram", term5519916);
        setByteField(term5519861, term5519861.getClass(), "delayTimer", (byte) -84);
        setByteField(term5519861, term5519861.getClass(), "soundTimer", (byte) 69);
        setField(term5519861, term5519861.getClass(), "stack", term5529920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.chip8.emulator.Memory");
        Object[] args = new Object[1];
        args[0] = term5519861;
        callMethod(klass, "setMemory", argTypes, term5509755, args);
    }

};


