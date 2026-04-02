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

public class Loader_equals_3265425715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5570537;
     Object term5580643;

    public Loader_equals_3265425715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5580614 = new ArrayDeque();
        Class<? extends Object> term5590718 = Class.forName((String) "java.io.File$PathStatus");
        Field term5590717 = ((Class) term5590718).getDeclaredField((String) "CHECKED");
        ((Field) term5590717).setAccessible(true);
        Object enum31 = ((Field) term5590717).get((Object) null);
        term5570537 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5570538 = (byte[]) newByteArray(4);
        Object term5570555 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5570556 = (byte[]) newByteArray(16);
        byte[] term5570573 = (byte[]) newByteArray(16);
        byte[] term5570590 = (byte[]) newByteArray(16);
        byte[] term5570610 = (byte[]) newByteArray(65535);
        Object term5580618 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5570538, 0, (byte) -70);
        setByteElement(term5570538, 1, (byte) -124);
        setByteElement(term5570538, 2, (byte) 82);
        setByteElement(term5570538, 3, (byte) 37);
        setField(term5570537, term5570537.getClass(), "bytes", term5570538);
        setField(term5570537, term5570537.getClass(), "name", "ritBUyuuKt");
        setField(term5570555, term5570555.getClass(), "v", term5570556);
        setField(term5570555, term5570555.getClass(), "rpl", term5570573);
        setByteElement(term5570590, 3, (byte) 32);
        setByteElement(term5570590, 4, (byte) 64);
        setByteElement(term5570590, 5, (byte) 32);
        setByteElement(term5570590, 7, (byte) 32);
        setByteElement(term5570590, 8, (byte) 64);
        setByteElement(term5570590, 9, (byte) 32);
        setByteElement(term5570590, 11, (byte) 32);
        setByteElement(term5570590, 12, (byte) 64);
        setByteElement(term5570590, 13, (byte) 32);
        setField(term5570555, term5570555.getClass(), "audio", term5570590);
        setShortField(term5570555, term5570555.getClass(), "pitch", (short) 64);
        setShortField(term5570555, term5570555.getClass(), "i", (short) -29628);
        setShortField(term5570555, term5570555.getClass(), "pc", (short) 512);
        setField(term5570555, term5570555.getClass(), "ram", term5570610);
        setByteField(term5570555, term5570555.getClass(), "delayTimer", (byte) -10);
        setByteField(term5570555, term5570555.getClass(), "soundTimer", (byte) 100);
        setField(term5570555, term5570555.getClass(), "stack", term5580614);
        setField(term5570537, term5570537.getClass(), "memory", term5570555);
        setField(term5580618, term5580618.getClass(), "path", "YfziBBiPvL");
        setField(term5580618, term5580618.getClass(), "status", enum31);
        setIntField(term5580618, term5580618.getClass(), "prefixLength", -1284825282);
        setField(term5580618, term5580618.getClass(), "filePath", null);
        setField(term5570537, term5570537.getClass(), "loadedRom", term5580618);
        term5580643 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5580643;
        callMethod(klass, "equals", argTypes, term5570537, args);
    }

};


