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

public class Loader_hexDump_5838001053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5306458;

    public Loader_hexDump_5838001053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5316535 = new ArrayDeque();
        Class<? extends Object> term5326638 = Class.forName((String) "java.io.File$PathStatus");
        Field term5326637 = ((Class) term5326638).getDeclaredField((String) "CHECKED");
        ((Field) term5326637).setAccessible(true);
        Object enum19 = ((Field) term5326637).get((Object) null);
        term5306458 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5306459 = (byte[]) newByteArray(4);
        Object term5306476 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5306477 = (byte[]) newByteArray(16);
        byte[] term5306494 = (byte[]) newByteArray(16);
        byte[] term5306511 = (byte[]) newByteArray(16);
        byte[] term5306531 = (byte[]) newByteArray(65535);
        Object term5316539 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5306459, 0, (byte) 9);
        setByteElement(term5306459, 1, (byte) 44);
        setByteElement(term5306459, 2, (byte) 26);
        setByteElement(term5306459, 3, (byte) 125);
        setField(term5306458, term5306458.getClass(), "bytes", term5306459);
        setField(term5306458, term5306458.getClass(), "name", "OpMnUyJTrb");
        setField(term5306476, term5306476.getClass(), "v", term5306477);
        setField(term5306476, term5306476.getClass(), "rpl", term5306494);
        setByteElement(term5306511, 3, (byte) 32);
        setByteElement(term5306511, 4, (byte) 64);
        setByteElement(term5306511, 5, (byte) 32);
        setByteElement(term5306511, 7, (byte) 32);
        setByteElement(term5306511, 8, (byte) 64);
        setByteElement(term5306511, 9, (byte) 32);
        setByteElement(term5306511, 11, (byte) 32);
        setByteElement(term5306511, 12, (byte) 64);
        setByteElement(term5306511, 13, (byte) 32);
        setField(term5306476, term5306476.getClass(), "audio", term5306511);
        setShortField(term5306476, term5306476.getClass(), "pitch", (short) 64);
        setShortField(term5306476, term5306476.getClass(), "i", (short) -27011);
        setShortField(term5306476, term5306476.getClass(), "pc", (short) 512);
        setField(term5306476, term5306476.getClass(), "ram", term5306531);
        setByteField(term5306476, term5306476.getClass(), "delayTimer", (byte) -119);
        setByteField(term5306476, term5306476.getClass(), "soundTimer", (byte) 94);
        setField(term5306476, term5306476.getClass(), "stack", term5316535);
        setField(term5306458, term5306458.getClass(), "memory", term5306476);
        setField(term5316539, term5316539.getClass(), "path", "ACBGZgugev");
        setField(term5316539, term5316539.getClass(), "status", enum19);
        setIntField(term5316539, term5316539.getClass(), "prefixLength", 1334483645);
        setField(term5316539, term5316539.getClass(), "filePath", null);
        setField(term5306458, term5306458.getClass(), "loadedRom", term5316539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hexDump", argTypes, term5306458, args);
    }

};


