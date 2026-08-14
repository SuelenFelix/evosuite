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

public class Loader_largeFontData_18756567136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5367430;

    public Loader_largeFontData_18756567136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5377506 = new ArrayDeque();
        Class<? extends Object> term5387608 = Class.forName((String) "java.io.File$PathStatus");
        Field term5387607 = ((Class) term5387608).getDeclaredField((String) "CHECKED");
        ((Field) term5387607).setAccessible(true);
        Object enum22 = ((Field) term5387607).get((Object) null);
        term5367430 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5367431 = (byte[]) newByteArray(3);
        Object term5367447 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5367448 = (byte[]) newByteArray(16);
        byte[] term5367465 = (byte[]) newByteArray(16);
        byte[] term5367482 = (byte[]) newByteArray(16);
        byte[] term5367502 = (byte[]) newByteArray(65535);
        Object term5377510 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5367431, 0, (byte) -76);
        setByteElement(term5367431, 1, (byte) -97);
        setByteElement(term5367431, 2, (byte) 101);
        setField(term5367430, term5367430.getClass(), "bytes", term5367431);
        setField(term5367430, term5367430.getClass(), "name", "xKjkdjTYfe");
        setField(term5367447, term5367447.getClass(), "v", term5367448);
        setField(term5367447, term5367447.getClass(), "rpl", term5367465);
        setByteElement(term5367482, 3, (byte) 32);
        setByteElement(term5367482, 4, (byte) 64);
        setByteElement(term5367482, 5, (byte) 32);
        setByteElement(term5367482, 7, (byte) 32);
        setByteElement(term5367482, 8, (byte) 64);
        setByteElement(term5367482, 9, (byte) 32);
        setByteElement(term5367482, 11, (byte) 32);
        setByteElement(term5367482, 12, (byte) 64);
        setByteElement(term5367482, 13, (byte) 32);
        setField(term5367447, term5367447.getClass(), "audio", term5367482);
        setShortField(term5367447, term5367447.getClass(), "pitch", (short) 64);
        setShortField(term5367447, term5367447.getClass(), "i", (short) 28159);
        setShortField(term5367447, term5367447.getClass(), "pc", (short) 512);
        setField(term5367447, term5367447.getClass(), "ram", term5367502);
        setByteField(term5367447, term5367447.getClass(), "delayTimer", (byte) 111);
        setByteField(term5367447, term5367447.getClass(), "soundTimer", (byte) -38);
        setField(term5367447, term5367447.getClass(), "stack", term5377506);
        setField(term5367430, term5367430.getClass(), "memory", term5367447);
        setField(term5377510, term5377510.getClass(), "path", "HcfabJkuEQ");
        setField(term5377510, term5377510.getClass(), "status", enum22);
        setIntField(term5377510, term5377510.getClass(), "prefixLength", -2063843486);
        setField(term5377510, term5377510.getClass(), "filePath", null);
        setField(term5367430, term5367430.getClass(), "loadedRom", term5377510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "largeFontData", argTypes, term5367430, args);
    }

};


