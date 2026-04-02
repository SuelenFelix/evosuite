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

public class DecodeDetails_getPc_1309188482134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722420;

    public DecodeDetails_getPc_1309188482134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722420 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4722420, term4722420.getClass(), "opcode", (short) 0);
        setField(term4722420, term4722420.getClass(), "x", null);
        setField(term4722420, term4722420.getClass(), "y", null);
        setField(term4722420, term4722420.getClass(), "nnn", null);
        setField(term4722420, term4722420.getClass(), "nn", null);
        setField(term4722420, term4722420.getClass(), "n", null);
        setField(term4722420, term4722420.getClass(), "iBefore", null);
        setField(term4722420, term4722420.getClass(), "i", null);
        setField(term4722420, term4722420.getClass(), "pc", null);
        setBooleanField(term4722420, term4722420.getClass(), "state", false);
        setBooleanField(term4722420, term4722420.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPc", argTypes, term4722420, args);
    }

};


