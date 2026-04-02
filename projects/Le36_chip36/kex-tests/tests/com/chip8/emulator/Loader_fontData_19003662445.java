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

public class Loader_fontData_19003662445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5347112;

    public Loader_fontData_19003662445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5357187 = new ArrayDeque();
        Class<? extends Object> term5367288 = Class.forName((String) "java.io.File$PathStatus");
        Field term5367287 = ((Class) term5367288).getDeclaredField((String) "INVALID");
        ((Field) term5367287).setAccessible(true);
        Object enum21 = ((Field) term5367287).get((Object) null);
        term5347112 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5347113 = (byte[]) newByteArray(2);
        Object term5347128 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5347129 = (byte[]) newByteArray(16);
        byte[] term5347146 = (byte[]) newByteArray(16);
        byte[] term5347163 = (byte[]) newByteArray(16);
        byte[] term5347183 = (byte[]) newByteArray(65535);
        Object term5357191 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5347113, 0, (byte) 108);
        setByteElement(term5347113, 1, (byte) 118);
        setField(term5347112, term5347112.getClass(), "bytes", term5347113);
        setField(term5347112, term5347112.getClass(), "name", "NDSDpOeQda");
        setField(term5347128, term5347128.getClass(), "v", term5347129);
        setField(term5347128, term5347128.getClass(), "rpl", term5347146);
        setByteElement(term5347163, 3, (byte) 32);
        setByteElement(term5347163, 4, (byte) 64);
        setByteElement(term5347163, 5, (byte) 32);
        setByteElement(term5347163, 7, (byte) 32);
        setByteElement(term5347163, 8, (byte) 64);
        setByteElement(term5347163, 9, (byte) 32);
        setByteElement(term5347163, 11, (byte) 32);
        setByteElement(term5347163, 12, (byte) 64);
        setByteElement(term5347163, 13, (byte) 32);
        setField(term5347128, term5347128.getClass(), "audio", term5347163);
        setShortField(term5347128, term5347128.getClass(), "pitch", (short) 64);
        setShortField(term5347128, term5347128.getClass(), "i", (short) 14174);
        setShortField(term5347128, term5347128.getClass(), "pc", (short) 512);
        setField(term5347128, term5347128.getClass(), "ram", term5347183);
        setByteField(term5347128, term5347128.getClass(), "delayTimer", (byte) 111);
        setByteField(term5347128, term5347128.getClass(), "soundTimer", (byte) -122);
        setField(term5347128, term5347128.getClass(), "stack", term5357187);
        setField(term5347112, term5347112.getClass(), "memory", term5347128);
        setField(term5357191, term5357191.getClass(), "path", "HlKwxzAqTg");
        setField(term5357191, term5357191.getClass(), "status", enum21);
        setIntField(term5357191, term5357191.getClass(), "prefixLength", 787278105);
        setField(term5357191, term5357191.getClass(), "filePath", null);
        setField(term5347112, term5347112.getClass(), "loadedRom", term5357191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "fontData", argTypes, term5347112, args);
    }

};


