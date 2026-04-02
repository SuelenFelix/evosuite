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

public class Memory_equals_64528909150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5245648;

    public Memory_equals_64528909150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5245648 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        setField(term5245648, term5245648.getClass(), "v", null);
        setField(term5245648, term5245648.getClass(), "rpl", null);
        setField(term5245648, term5245648.getClass(), "audio", null);
        setShortField(term5245648, term5245648.getClass(), "pitch", (short) 0);
        setShortField(term5245648, term5245648.getClass(), "i", (short) 0);
        setShortField(term5245648, term5245648.getClass(), "pc", (short) 0);
        setField(term5245648, term5245648.getClass(), "ram", null);
        setByteField(term5245648, term5245648.getClass(), "delayTimer", (byte) 0);
        setByteField(term5245648, term5245648.getClass(), "soundTimer", (byte) 0);
        setField(term5245648, term5245648.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term5245648, args);
    }

};


