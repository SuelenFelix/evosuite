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

public class DecodeDetails_setY_188183293263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4719650;

    public DecodeDetails_setY_188183293263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4719650 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4719650, term4719650.getClass(), "opcode", (short) 29478);
        setField(term4719650, term4719650.getClass(), "x", "RjSNvOEvcT");
        setField(term4719650, term4719650.getClass(), "y", "HLzuMxigqS");
        setField(term4719650, term4719650.getClass(), "nnn", "wiBOoDCyzd");
        setField(term4719650, term4719650.getClass(), "nn", "TIaFKUJELS");
        setField(term4719650, term4719650.getClass(), "n", "IPmndzGjtG");
        setField(term4719650, term4719650.getClass(), "iBefore", "pkQiBgYrkQ");
        setField(term4719650, term4719650.getClass(), "i", "SJLRFsNagf");
        setField(term4719650, term4719650.getClass(), "pc", "UsCZaSgXzI");
        setBooleanField(term4719650, term4719650.getClass(), "state", true);
        setBooleanField(term4719650, term4719650.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IXZCeVwvBM";
        callMethod(klass, "setY", argTypes, term4719650, args);
    }

};


