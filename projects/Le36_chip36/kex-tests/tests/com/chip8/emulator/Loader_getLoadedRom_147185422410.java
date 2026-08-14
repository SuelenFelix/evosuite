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

public class Loader_getLoadedRom_147185422410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5448726;

    public Loader_getLoadedRom_147185422410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5458808 = new ArrayDeque();
        Class<? extends Object> term5468916 = Class.forName((String) "java.io.File$PathStatus");
        Field term5468915 = ((Class) term5468916).getDeclaredField((String) "CHECKED");
        ((Field) term5468915).setAccessible(true);
        Object enum26 = ((Field) term5468915).get((Object) null);
        term5448726 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5448727 = (byte[]) newByteArray(9);
        Object term5448749 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5448750 = (byte[]) newByteArray(16);
        byte[] term5448767 = (byte[]) newByteArray(16);
        byte[] term5448784 = (byte[]) newByteArray(16);
        byte[] term5448804 = (byte[]) newByteArray(65535);
        Object term5458812 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5448727, 0, (byte) -128);
        setByteElement(term5448727, 1, (byte) -52);
        setByteElement(term5448727, 2, (byte) -48);
        setByteElement(term5448727, 3, (byte) -15);
        setByteElement(term5448727, 4, (byte) -117);
        setByteElement(term5448727, 5, (byte) 45);
        setByteElement(term5448727, 6, (byte) 60);
        setByteElement(term5448727, 7, (byte) 22);
        setByteElement(term5448727, 8, (byte) -98);
        setField(term5448726, term5448726.getClass(), "bytes", term5448727);
        setField(term5448726, term5448726.getClass(), "name", "SBTEFDmQVY");
        setField(term5448749, term5448749.getClass(), "v", term5448750);
        setField(term5448749, term5448749.getClass(), "rpl", term5448767);
        setByteElement(term5448784, 3, (byte) 32);
        setByteElement(term5448784, 4, (byte) 64);
        setByteElement(term5448784, 5, (byte) 32);
        setByteElement(term5448784, 7, (byte) 32);
        setByteElement(term5448784, 8, (byte) 64);
        setByteElement(term5448784, 9, (byte) 32);
        setByteElement(term5448784, 11, (byte) 32);
        setByteElement(term5448784, 12, (byte) 64);
        setByteElement(term5448784, 13, (byte) 32);
        setField(term5448749, term5448749.getClass(), "audio", term5448784);
        setShortField(term5448749, term5448749.getClass(), "pitch", (short) 64);
        setShortField(term5448749, term5448749.getClass(), "i", (short) -6790);
        setShortField(term5448749, term5448749.getClass(), "pc", (short) 512);
        setField(term5448749, term5448749.getClass(), "ram", term5448804);
        setByteField(term5448749, term5448749.getClass(), "delayTimer", (byte) -113);
        setByteField(term5448749, term5448749.getClass(), "soundTimer", (byte) -1);
        setField(term5448749, term5448749.getClass(), "stack", term5458808);
        setField(term5448726, term5448726.getClass(), "memory", term5448749);
        setField(term5458812, term5458812.getClass(), "path", "ohZpRiNDZM");
        setField(term5458812, term5458812.getClass(), "status", enum26);
        setIntField(term5458812, term5458812.getClass(), "prefixLength", 1723148410);
        setField(term5458812, term5458812.getClass(), "filePath", null);
        setField(term5448726, term5448726.getClass(), "loadedRom", term5458812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLoadedRom", argTypes, term5448726, args);
    }

};


