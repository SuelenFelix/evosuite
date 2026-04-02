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

public class Loader_setBytes_158086119011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5469058;
     Object term5479168;

    public Loader_setBytes_158086119011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5479139 = new ArrayDeque();
        Class<? extends Object> term5489255 = Class.forName((String) "java.io.File$PathStatus");
        Field term5489254 = ((Class) term5489255).getDeclaredField((String) "INVALID");
        ((Field) term5489254).setAccessible(true);
        Object enum27 = ((Field) term5489254).get((Object) null);
        term5469058 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5469059 = (byte[]) newByteArray(8);
        Object term5469080 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5469081 = (byte[]) newByteArray(16);
        byte[] term5469098 = (byte[]) newByteArray(16);
        byte[] term5469115 = (byte[]) newByteArray(16);
        byte[] term5469135 = (byte[]) newByteArray(65535);
        Object term5479143 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5469059, 0, (byte) -84);
        setByteElement(term5469059, 1, (byte) 34);
        setByteElement(term5469059, 2, (byte) -125);
        setByteElement(term5469059, 3, (byte) 11);
        setByteElement(term5469059, 4, (byte) 50);
        setByteElement(term5469059, 5, (byte) 86);
        setByteElement(term5469059, 6, (byte) -96);
        setByteElement(term5469059, 7, (byte) 18);
        setField(term5469058, term5469058.getClass(), "bytes", term5469059);
        setField(term5469058, term5469058.getClass(), "name", "qEXIxhmUwz");
        setField(term5469080, term5469080.getClass(), "v", term5469081);
        setField(term5469080, term5469080.getClass(), "rpl", term5469098);
        setByteElement(term5469115, 3, (byte) 32);
        setByteElement(term5469115, 4, (byte) 64);
        setByteElement(term5469115, 5, (byte) 32);
        setByteElement(term5469115, 7, (byte) 32);
        setByteElement(term5469115, 8, (byte) 64);
        setByteElement(term5469115, 9, (byte) 32);
        setByteElement(term5469115, 11, (byte) 32);
        setByteElement(term5469115, 12, (byte) 64);
        setByteElement(term5469115, 13, (byte) 32);
        setField(term5469080, term5469080.getClass(), "audio", term5469115);
        setShortField(term5469080, term5469080.getClass(), "pitch", (short) 64);
        setShortField(term5469080, term5469080.getClass(), "i", (short) 3867);
        setShortField(term5469080, term5469080.getClass(), "pc", (short) 512);
        setField(term5469080, term5469080.getClass(), "ram", term5469135);
        setByteField(term5469080, term5469080.getClass(), "delayTimer", (byte) -53);
        setByteField(term5469080, term5469080.getClass(), "soundTimer", (byte) 46);
        setField(term5469080, term5469080.getClass(), "stack", term5479139);
        setField(term5469058, term5469058.getClass(), "memory", term5469080);
        setField(term5479143, term5479143.getClass(), "path", "RlyxtfCqKY");
        setField(term5479143, term5479143.getClass(), "status", enum27);
        setIntField(term5479143, term5479143.getClass(), "prefixLength", -920797484);
        setField(term5479143, term5479143.getClass(), "filePath", null);
        setField(term5469058, term5469058.getClass(), "loadedRom", term5479143);
        term5479168 = (byte[]) newByteArray(8);
        setByteElement(term5479168, 0, (byte) -106);
        setByteElement(term5479168, 1, (byte) 3);
        setByteElement(term5479168, 2, (byte) 120);
        setByteElement(term5479168, 3, (byte) 120);
        setByteElement(term5479168, 4, (byte) -126);
        setByteElement(term5479168, 5, (byte) -44);
        setByteElement(term5479168, 6, (byte) -119);
        setByteElement(term5479168, 7, (byte) 65);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5479168;
        callMethod(klass, "setBytes", argTypes, term5469058, args);
    }

};


