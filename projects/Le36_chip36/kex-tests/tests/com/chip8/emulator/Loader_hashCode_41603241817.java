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

public class Loader_hashCode_41603241817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5611185;

    public Loader_hashCode_41603241817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5621258 = new ArrayDeque();
        Class<? extends Object> term5631357 = Class.forName((String) "java.io.File$PathStatus");
        Field term5631356 = ((Class) term5631357).getDeclaredField((String) "CHECKED");
        ((Field) term5631356).setAccessible(true);
        Object enum33 = ((Field) term5631356).get((Object) null);
        term5611185 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5611186 = (byte[]) newByteArray(0);
        Object term5611199 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5611200 = (byte[]) newByteArray(16);
        byte[] term5611217 = (byte[]) newByteArray(16);
        byte[] term5611234 = (byte[]) newByteArray(16);
        byte[] term5611254 = (byte[]) newByteArray(65535);
        Object term5621262 = newInstance(Class.forName("java.io.File"));
        setField(term5611185, term5611185.getClass(), "bytes", term5611186);
        setField(term5611185, term5611185.getClass(), "name", "KHPDZjrXQp");
        setField(term5611199, term5611199.getClass(), "v", term5611200);
        setField(term5611199, term5611199.getClass(), "rpl", term5611217);
        setByteElement(term5611234, 3, (byte) 32);
        setByteElement(term5611234, 4, (byte) 64);
        setByteElement(term5611234, 5, (byte) 32);
        setByteElement(term5611234, 7, (byte) 32);
        setByteElement(term5611234, 8, (byte) 64);
        setByteElement(term5611234, 9, (byte) 32);
        setByteElement(term5611234, 11, (byte) 32);
        setByteElement(term5611234, 12, (byte) 64);
        setByteElement(term5611234, 13, (byte) 32);
        setField(term5611199, term5611199.getClass(), "audio", term5611234);
        setShortField(term5611199, term5611199.getClass(), "pitch", (short) 64);
        setShortField(term5611199, term5611199.getClass(), "i", (short) -31882);
        setShortField(term5611199, term5611199.getClass(), "pc", (short) 512);
        setField(term5611199, term5611199.getClass(), "ram", term5611254);
        setByteField(term5611199, term5611199.getClass(), "delayTimer", (byte) 71);
        setByteField(term5611199, term5611199.getClass(), "soundTimer", (byte) -95);
        setField(term5611199, term5611199.getClass(), "stack", term5621258);
        setField(term5611185, term5611185.getClass(), "memory", term5611199);
        setField(term5621262, term5621262.getClass(), "path", "fpyUFzdCwQ");
        setField(term5621262, term5621262.getClass(), "status", enum33);
        setIntField(term5621262, term5621262.getClass(), "prefixLength", 947897214);
        setField(term5621262, term5621262.getClass(), "filePath", null);
        setField(term5611185, term5611185.getClass(), "loadedRom", term5621262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5611185, args);
    }

};


