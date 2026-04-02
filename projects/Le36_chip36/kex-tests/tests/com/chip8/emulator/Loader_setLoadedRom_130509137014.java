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

public class Loader_setLoadedRom_130509137014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5550189;
     Object term5560296;

    public Loader_setLoadedRom_130509137014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5560267 = new ArrayDeque();
        Class<? extends Object> term5570385 = Class.forName((String) "java.io.File$PathStatus");
        Field term5570384 = ((Class) term5570385).getDeclaredField((String) "CHECKED");
        ((Field) term5570384).setAccessible(true);
        Object enum30 = ((Field) term5570384).get((Object) null);
        term5550189 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5550190 = (byte[]) newByteArray(5);
        Object term5550208 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5550209 = (byte[]) newByteArray(16);
        byte[] term5550226 = (byte[]) newByteArray(16);
        byte[] term5550243 = (byte[]) newByteArray(16);
        byte[] term5550263 = (byte[]) newByteArray(65535);
        Object term5560271 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5550190, 0, (byte) -101);
        setByteElement(term5550190, 1, (byte) -44);
        setByteElement(term5550190, 3, (byte) -99);
        setByteElement(term5550190, 4, (byte) 36);
        setField(term5550189, term5550189.getClass(), "bytes", term5550190);
        setField(term5550189, term5550189.getClass(), "name", "MiankJgKCp");
        setField(term5550208, term5550208.getClass(), "v", term5550209);
        setField(term5550208, term5550208.getClass(), "rpl", term5550226);
        setByteElement(term5550243, 3, (byte) 32);
        setByteElement(term5550243, 4, (byte) 64);
        setByteElement(term5550243, 5, (byte) 32);
        setByteElement(term5550243, 7, (byte) 32);
        setByteElement(term5550243, 8, (byte) 64);
        setByteElement(term5550243, 9, (byte) 32);
        setByteElement(term5550243, 11, (byte) 32);
        setByteElement(term5550243, 12, (byte) 64);
        setByteElement(term5550243, 13, (byte) 32);
        setField(term5550208, term5550208.getClass(), "audio", term5550243);
        setShortField(term5550208, term5550208.getClass(), "pitch", (short) 64);
        setShortField(term5550208, term5550208.getClass(), "i", (short) -31747);
        setShortField(term5550208, term5550208.getClass(), "pc", (short) 512);
        setField(term5550208, term5550208.getClass(), "ram", term5550263);
        setByteField(term5550208, term5550208.getClass(), "delayTimer", (byte) 46);
        setByteField(term5550208, term5550208.getClass(), "soundTimer", (byte) -104);
        setField(term5550208, term5550208.getClass(), "stack", term5560267);
        setField(term5550189, term5550189.getClass(), "memory", term5550208);
        setField(term5560271, term5560271.getClass(), "path", "lmZBCmpOeb");
        setField(term5560271, term5560271.getClass(), "status", enum30);
        setIntField(term5560271, term5560271.getClass(), "prefixLength", -1703035419);
        setField(term5560271, term5560271.getClass(), "filePath", null);
        setField(term5550189, term5550189.getClass(), "loadedRom", term5560271);
        term5560296 = newInstance(Class.forName("java.io.File"));
        setField(term5560296, term5560296.getClass(), "path", "cPlYOAUqsP");
        setField(term5560296, term5560296.getClass(), "status", enum30);
        setIntField(term5560296, term5560296.getClass(), "prefixLength", 765766290);
        setField(term5560296, term5560296.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term5560296;
        callMethod(klass, "setLoadedRom", argTypes, term5550189, args);
    }

};


