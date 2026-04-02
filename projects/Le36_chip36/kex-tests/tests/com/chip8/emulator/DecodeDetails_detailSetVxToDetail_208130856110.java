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

public class DecodeDetails_detailSetVxToDetail_208130856110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722326;

    public DecodeDetails_detailSetVxToDetail_208130856110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722326 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4722326, term4722326.getClass(), "opcode", (short) 0);
        setField(term4722326, term4722326.getClass(), "x", null);
        setField(term4722326, term4722326.getClass(), "y", null);
        setField(term4722326, term4722326.getClass(), "nnn", null);
        setField(term4722326, term4722326.getClass(), "nn", null);
        setField(term4722326, term4722326.getClass(), "n", null);
        setField(term4722326, term4722326.getClass(), "iBefore", null);
        setField(term4722326, term4722326.getClass(), "i", null);
        setField(term4722326, term4722326.getClass(), "pc", null);
        setBooleanField(term4722326, term4722326.getClass(), "state", false);
        setBooleanField(term4722326, term4722326.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailSetVxToDetail", argTypes, term4722326, args);
    }

};


