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

public class Loader_getName_20585498478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5408082;

    public Loader_getName_20585498478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5418157 = new ArrayDeque();
        Class<? extends Object> term5428258 = Class.forName((String) "java.io.File$PathStatus");
        Field term5428257 = ((Class) term5428258).getDeclaredField((String) "CHECKED");
        ((Field) term5428257).setAccessible(true);
        Object enum24 = ((Field) term5428257).get((Object) null);
        term5408082 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5408083 = (byte[]) newByteArray(2);
        Object term5408098 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5408099 = (byte[]) newByteArray(16);
        byte[] term5408116 = (byte[]) newByteArray(16);
        byte[] term5408133 = (byte[]) newByteArray(16);
        byte[] term5408153 = (byte[]) newByteArray(65535);
        Object term5418161 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5408083, 0, (byte) -13);
        setByteElement(term5408083, 1, (byte) -91);
        setField(term5408082, term5408082.getClass(), "bytes", term5408083);
        setField(term5408082, term5408082.getClass(), "name", "EYJXMlkLoO");
        setField(term5408098, term5408098.getClass(), "v", term5408099);
        setField(term5408098, term5408098.getClass(), "rpl", term5408116);
        setByteElement(term5408133, 3, (byte) 32);
        setByteElement(term5408133, 4, (byte) 64);
        setByteElement(term5408133, 5, (byte) 32);
        setByteElement(term5408133, 7, (byte) 32);
        setByteElement(term5408133, 8, (byte) 64);
        setByteElement(term5408133, 9, (byte) 32);
        setByteElement(term5408133, 11, (byte) 32);
        setByteElement(term5408133, 12, (byte) 64);
        setByteElement(term5408133, 13, (byte) 32);
        setField(term5408098, term5408098.getClass(), "audio", term5408133);
        setShortField(term5408098, term5408098.getClass(), "pitch", (short) 64);
        setShortField(term5408098, term5408098.getClass(), "i", (short) 8736);
        setShortField(term5408098, term5408098.getClass(), "pc", (short) 512);
        setField(term5408098, term5408098.getClass(), "ram", term5408153);
        setByteField(term5408098, term5408098.getClass(), "delayTimer", (byte) 59);
        setByteField(term5408098, term5408098.getClass(), "soundTimer", (byte) -54);
        setField(term5408098, term5408098.getClass(), "stack", term5418157);
        setField(term5408082, term5408082.getClass(), "memory", term5408098);
        setField(term5418161, term5418161.getClass(), "path", "qJtkJJhOSV");
        setField(term5418161, term5418161.getClass(), "status", enum24);
        setIntField(term5418161, term5418161.getClass(), "prefixLength", 320711637);
        setField(term5418161, term5418161.getClass(), "filePath", null);
        setField(term5408082, term5408082.getClass(), "loadedRom", term5418161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term5408082, args);
    }

};


