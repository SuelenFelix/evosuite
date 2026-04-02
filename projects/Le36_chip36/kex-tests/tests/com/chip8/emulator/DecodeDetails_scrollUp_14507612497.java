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

public class DecodeDetails_scrollUp_14507612497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4709560;

    public DecodeDetails_scrollUp_14507612497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4709560 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4709560, term4709560.getClass(), "opcode", (short) 11879);
        setField(term4709560, term4709560.getClass(), "x", "FiqETbKjpv");
        setField(term4709560, term4709560.getClass(), "y", "FxXtdhhXyS");
        setField(term4709560, term4709560.getClass(), "nnn", "HxCEzaCcgj");
        setField(term4709560, term4709560.getClass(), "nn", "PDYPOQncAB");
        setField(term4709560, term4709560.getClass(), "n", "cHqLMqZSmc");
        setField(term4709560, term4709560.getClass(), "iBefore", "hkWmAkXSOW");
        setField(term4709560, term4709560.getClass(), "i", "DwQmZEKeOp");
        setField(term4709560, term4709560.getClass(), "pc", "DbxrFiyttv");
        setBooleanField(term4709560, term4709560.getClass(), "state", false);
        setBooleanField(term4709560, term4709560.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "scrollUp", argTypes, term4709560, args);
    }

};


