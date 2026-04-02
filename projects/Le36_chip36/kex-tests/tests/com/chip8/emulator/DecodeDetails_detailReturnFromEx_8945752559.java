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

public class DecodeDetails_detailReturnFromEx_8945752559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4709920;

    public DecodeDetails_detailReturnFromEx_8945752559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4709920 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4709920, term4709920.getClass(), "opcode", (short) -25643);
        setField(term4709920, term4709920.getClass(), "x", "qvykDllgpT");
        setField(term4709920, term4709920.getClass(), "y", "hzdUbcLZhZ");
        setField(term4709920, term4709920.getClass(), "nnn", "GlxnEJvYeC");
        setField(term4709920, term4709920.getClass(), "nn", "SLdOGaqmNv");
        setField(term4709920, term4709920.getClass(), "n", "QZfhwDBzyR");
        setField(term4709920, term4709920.getClass(), "iBefore", "HvnMmAOZev");
        setField(term4709920, term4709920.getClass(), "i", "JTPAQsfRtT");
        setField(term4709920, term4709920.getClass(), "pc", "otxkkKfDfl");
        setBooleanField(term4709920, term4709920.getClass(), "state", false);
        setBooleanField(term4709920, term4709920.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailReturnFromEx", argTypes, term4709920, args);
    }

};


