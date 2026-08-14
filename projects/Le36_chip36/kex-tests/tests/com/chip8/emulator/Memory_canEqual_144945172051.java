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

public class Memory_canEqual_144945172051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5245654;

    public Memory_canEqual_144945172051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5245654 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        setField(term5245654, term5245654.getClass(), "v", null);
        setField(term5245654, term5245654.getClass(), "rpl", null);
        setField(term5245654, term5245654.getClass(), "audio", null);
        setShortField(term5245654, term5245654.getClass(), "pitch", (short) 0);
        setShortField(term5245654, term5245654.getClass(), "i", (short) 0);
        setShortField(term5245654, term5245654.getClass(), "pc", (short) 0);
        setField(term5245654, term5245654.getClass(), "ram", null);
        setByteField(term5245654, term5245654.getClass(), "delayTimer", (byte) 0);
        setByteField(term5245654, term5245654.getClass(), "soundTimer", (byte) 0);
        setField(term5245654, term5245654.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term5245654, args);
    }

};


