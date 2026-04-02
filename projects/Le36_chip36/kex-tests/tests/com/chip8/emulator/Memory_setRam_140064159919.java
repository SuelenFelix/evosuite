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
import java.util.ArrayDeque;

public class Memory_setRam_140064159919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5084569;
     Object term5094632;

    public Memory_setRam_140064159919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5094628 = new ArrayDeque();
        term5084569 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5084570 = (byte[]) newByteArray(16);
        byte[] term5084587 = (byte[]) newByteArray(16);
        byte[] term5084604 = (byte[]) newByteArray(16);
        byte[] term5084624 = (byte[]) newByteArray(65535);
        setField(term5084569, term5084569.getClass(), "v", term5084570);
        setField(term5084569, term5084569.getClass(), "rpl", term5084587);
        setByteElement(term5084604, 3, (byte) 32);
        setByteElement(term5084604, 4, (byte) 64);
        setByteElement(term5084604, 5, (byte) 32);
        setByteElement(term5084604, 7, (byte) 32);
        setByteElement(term5084604, 8, (byte) 64);
        setByteElement(term5084604, 9, (byte) 32);
        setByteElement(term5084604, 11, (byte) 32);
        setByteElement(term5084604, 12, (byte) 64);
        setByteElement(term5084604, 13, (byte) 32);
        setField(term5084569, term5084569.getClass(), "audio", term5084604);
        setShortField(term5084569, term5084569.getClass(), "pitch", (short) 64);
        setShortField(term5084569, term5084569.getClass(), "i", (short) 10552);
        setShortField(term5084569, term5084569.getClass(), "pc", (short) 512);
        setField(term5084569, term5084569.getClass(), "ram", term5084624);
        setByteField(term5084569, term5084569.getClass(), "delayTimer", (byte) -67);
        setByteField(term5084569, term5084569.getClass(), "soundTimer", (byte) -72);
        setField(term5084569, term5084569.getClass(), "stack", term5094628);
        term5094632 = (byte[]) newByteArray(3);
        setByteElement(term5094632, 0, (byte) 38);
        setByteElement(term5094632, 1, (byte) 91);
        setByteElement(term5094632, 2, (byte) 113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5094632;
        callMethod(klass, "setRam", argTypes, term5084569, args);
    }

};


