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

public class DecodeDetails_lores_17368250464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4709020;

    public DecodeDetails_lores_17368250464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4709020 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4709020, term4709020.getClass(), "opcode", (short) 5454);
        setField(term4709020, term4709020.getClass(), "x", "oTGxFdiaIW");
        setField(term4709020, term4709020.getClass(), "y", "jlyFvaZlmv");
        setField(term4709020, term4709020.getClass(), "nnn", "sofyLEfomV");
        setField(term4709020, term4709020.getClass(), "nn", "zHcDSJHKAb");
        setField(term4709020, term4709020.getClass(), "n", "WRIQkTdeMl");
        setField(term4709020, term4709020.getClass(), "iBefore", "rLSEheWsHd");
        setField(term4709020, term4709020.getClass(), "i", "DoUKDhlGCY");
        setField(term4709020, term4709020.getClass(), "pc", "IeoToWsQWU");
        setBooleanField(term4709020, term4709020.getClass(), "state", false);
        setBooleanField(term4709020, term4709020.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "lores", argTypes, term4709020, args);
    }

};


