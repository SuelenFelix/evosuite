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

public class Loader_getMemory_1293196209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5428400;

    public Loader_getMemory_1293196209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5438479 = new ArrayDeque();
        Class<? extends Object> term5448584 = Class.forName((String) "java.io.File$PathStatus");
        Field term5448583 = ((Class) term5448584).getDeclaredField((String) "CHECKED");
        ((Field) term5448583).setAccessible(true);
        Object enum25 = ((Field) term5448583).get((Object) null);
        term5428400 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5428401 = (byte[]) newByteArray(6);
        Object term5428420 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5428421 = (byte[]) newByteArray(16);
        byte[] term5428438 = (byte[]) newByteArray(16);
        byte[] term5428455 = (byte[]) newByteArray(16);
        byte[] term5428475 = (byte[]) newByteArray(65535);
        Object term5438483 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5428401, 0, (byte) 84);
        setByteElement(term5428401, 1, (byte) 38);
        setByteElement(term5428401, 2, (byte) 126);
        setByteElement(term5428401, 3, (byte) -47);
        setByteElement(term5428401, 4, (byte) 63);
        setByteElement(term5428401, 5, (byte) 10);
        setField(term5428400, term5428400.getClass(), "bytes", term5428401);
        setField(term5428400, term5428400.getClass(), "name", "vQbiGKncal");
        setField(term5428420, term5428420.getClass(), "v", term5428421);
        setField(term5428420, term5428420.getClass(), "rpl", term5428438);
        setByteElement(term5428455, 3, (byte) 32);
        setByteElement(term5428455, 4, (byte) 64);
        setByteElement(term5428455, 5, (byte) 32);
        setByteElement(term5428455, 7, (byte) 32);
        setByteElement(term5428455, 8, (byte) 64);
        setByteElement(term5428455, 9, (byte) 32);
        setByteElement(term5428455, 11, (byte) 32);
        setByteElement(term5428455, 12, (byte) 64);
        setByteElement(term5428455, 13, (byte) 32);
        setField(term5428420, term5428420.getClass(), "audio", term5428455);
        setShortField(term5428420, term5428420.getClass(), "pitch", (short) 64);
        setShortField(term5428420, term5428420.getClass(), "i", (short) -6481);
        setShortField(term5428420, term5428420.getClass(), "pc", (short) 512);
        setField(term5428420, term5428420.getClass(), "ram", term5428475);
        setByteField(term5428420, term5428420.getClass(), "delayTimer", (byte) 62);
        setByteField(term5428420, term5428420.getClass(), "soundTimer", (byte) 115);
        setField(term5428420, term5428420.getClass(), "stack", term5438479);
        setField(term5428400, term5428400.getClass(), "memory", term5428420);
        setField(term5438483, term5438483.getClass(), "path", "NTSNSiYeUu");
        setField(term5438483, term5438483.getClass(), "status", enum25);
        setIntField(term5438483, term5438483.getClass(), "prefixLength", 1241164745);
        setField(term5438483, term5438483.getClass(), "filePath", null);
        setField(term5428400, term5428400.getClass(), "loadedRom", term5438483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemory", argTypes, term5428400, args);
    }

};


