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
import java.lang.Integer;

public class Memory_varReg_127299399429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5245508;
     Object term5245514;
     Object term5245516;

    public Memory_varReg_127299399429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5245508 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        setField(term5245508, term5245508.getClass(), "v", null);
        setField(term5245508, term5245508.getClass(), "rpl", null);
        setField(term5245508, term5245508.getClass(), "audio", null);
        setShortField(term5245508, term5245508.getClass(), "pitch", (short) 0);
        setShortField(term5245508, term5245508.getClass(), "i", (short) 0);
        setShortField(term5245508, term5245508.getClass(), "pc", (short) 0);
        setField(term5245508, term5245508.getClass(), "ram", null);
        setByteField(term5245508, term5245508.getClass(), "delayTimer", (byte) 0);
        setByteField(term5245508, term5245508.getClass(), "soundTimer", (byte) 0);
        setField(term5245508, term5245508.getClass(), "stack", null);
        term5245514 = new Integer(0);
        term5245516 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5245514;
        args[1] = term5245516;
        callMethod(klass, "varReg", argTypes, term5245508, args);
    }

};


