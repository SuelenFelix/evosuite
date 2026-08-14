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

public class Loader_toString_92679210818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5631499;

    public Loader_toString_92679210818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5641577 = new ArrayDeque();
        Class<? extends Object> term5651681 = Class.forName((String) "java.io.File$PathStatus");
        Field term5651680 = ((Class) term5651681).getDeclaredField((String) "CHECKED");
        ((Field) term5651680).setAccessible(true);
        Object enum34 = ((Field) term5651680).get((Object) null);
        term5631499 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5631500 = (byte[]) newByteArray(5);
        Object term5631518 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5631519 = (byte[]) newByteArray(16);
        byte[] term5631536 = (byte[]) newByteArray(16);
        byte[] term5631553 = (byte[]) newByteArray(16);
        byte[] term5631573 = (byte[]) newByteArray(65535);
        Object term5641581 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5631500, 0, (byte) 1);
        setByteElement(term5631500, 1, (byte) 112);
        setByteElement(term5631500, 2, (byte) -79);
        setByteElement(term5631500, 3, (byte) 83);
        setByteElement(term5631500, 4, (byte) -72);
        setField(term5631499, term5631499.getClass(), "bytes", term5631500);
        setField(term5631499, term5631499.getClass(), "name", "OQqBkSGDem");
        setField(term5631518, term5631518.getClass(), "v", term5631519);
        setField(term5631518, term5631518.getClass(), "rpl", term5631536);
        setByteElement(term5631553, 3, (byte) 32);
        setByteElement(term5631553, 4, (byte) 64);
        setByteElement(term5631553, 5, (byte) 32);
        setByteElement(term5631553, 7, (byte) 32);
        setByteElement(term5631553, 8, (byte) 64);
        setByteElement(term5631553, 9, (byte) 32);
        setByteElement(term5631553, 11, (byte) 32);
        setByteElement(term5631553, 12, (byte) 64);
        setByteElement(term5631553, 13, (byte) 32);
        setField(term5631518, term5631518.getClass(), "audio", term5631553);
        setShortField(term5631518, term5631518.getClass(), "pitch", (short) 64);
        setShortField(term5631518, term5631518.getClass(), "i", (short) 23151);
        setShortField(term5631518, term5631518.getClass(), "pc", (short) 512);
        setField(term5631518, term5631518.getClass(), "ram", term5631573);
        setByteField(term5631518, term5631518.getClass(), "delayTimer", (byte) 18);
        setByteField(term5631518, term5631518.getClass(), "soundTimer", (byte) -80);
        setField(term5631518, term5631518.getClass(), "stack", term5641577);
        setField(term5631499, term5631499.getClass(), "memory", term5631518);
        setField(term5641581, term5641581.getClass(), "path", "vZzZOvsIYn");
        setField(term5641581, term5641581.getClass(), "status", enum34);
        setIntField(term5641581, term5641581.getClass(), "prefixLength", 1496340209);
        setField(term5641581, term5641581.getClass(), "filePath", null);
        setField(term5631499, term5631499.getClass(), "loadedRom", term5641581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5631499, args);
    }

};


