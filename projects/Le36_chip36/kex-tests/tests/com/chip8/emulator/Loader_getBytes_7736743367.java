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

public class Loader_getBytes_7736743367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5387750;

    public Loader_getBytes_7736743367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5397832 = new ArrayDeque();
        Class<? extends Object> term5407940 = Class.forName((String) "java.io.File$PathStatus");
        Field term5407939 = ((Class) term5407940).getDeclaredField((String) "CHECKED");
        ((Field) term5407939).setAccessible(true);
        Object enum23 = ((Field) term5407939).get((Object) null);
        term5387750 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5387751 = (byte[]) newByteArray(9);
        Object term5387773 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5387774 = (byte[]) newByteArray(16);
        byte[] term5387791 = (byte[]) newByteArray(16);
        byte[] term5387808 = (byte[]) newByteArray(16);
        byte[] term5387828 = (byte[]) newByteArray(65535);
        Object term5397836 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5387751, 0, (byte) 24);
        setByteElement(term5387751, 1, (byte) 43);
        setByteElement(term5387751, 2, (byte) -126);
        setByteElement(term5387751, 3, (byte) -59);
        setByteElement(term5387751, 4, (byte) 27);
        setByteElement(term5387751, 5, (byte) 98);
        setByteElement(term5387751, 6, (byte) 80);
        setByteElement(term5387751, 7, (byte) 18);
        setByteElement(term5387751, 8, (byte) 66);
        setField(term5387750, term5387750.getClass(), "bytes", term5387751);
        setField(term5387750, term5387750.getClass(), "name", "JlnoFYxLfk");
        setField(term5387773, term5387773.getClass(), "v", term5387774);
        setField(term5387773, term5387773.getClass(), "rpl", term5387791);
        setByteElement(term5387808, 3, (byte) 32);
        setByteElement(term5387808, 4, (byte) 64);
        setByteElement(term5387808, 5, (byte) 32);
        setByteElement(term5387808, 7, (byte) 32);
        setByteElement(term5387808, 8, (byte) 64);
        setByteElement(term5387808, 9, (byte) 32);
        setByteElement(term5387808, 11, (byte) 32);
        setByteElement(term5387808, 12, (byte) 64);
        setByteElement(term5387808, 13, (byte) 32);
        setField(term5387773, term5387773.getClass(), "audio", term5387808);
        setShortField(term5387773, term5387773.getClass(), "pitch", (short) 64);
        setShortField(term5387773, term5387773.getClass(), "i", (short) -30877);
        setShortField(term5387773, term5387773.getClass(), "pc", (short) 512);
        setField(term5387773, term5387773.getClass(), "ram", term5387828);
        setByteField(term5387773, term5387773.getClass(), "delayTimer", (byte) 71);
        setByteField(term5387773, term5387773.getClass(), "soundTimer", (byte) 119);
        setField(term5387773, term5387773.getClass(), "stack", term5397832);
        setField(term5387750, term5387750.getClass(), "memory", term5387773);
        setField(term5397836, term5397836.getClass(), "path", "tMMLkDkFYW");
        setField(term5397836, term5397836.getClass(), "status", enum23);
        setIntField(term5397836, term5397836.getClass(), "prefixLength", 833762980);
        setField(term5397836, term5397836.getClass(), "filePath", null);
        setField(term5387750, term5387750.getClass(), "loadedRom", term5397836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBytes", argTypes, term5387750, args);
    }

};


