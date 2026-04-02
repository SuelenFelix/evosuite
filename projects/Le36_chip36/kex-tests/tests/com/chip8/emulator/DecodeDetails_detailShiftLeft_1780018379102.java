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
import java.lang.Byte;

public class DecodeDetails_detailShiftLeft_1780018379102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722292;
     Object term4722296;

    public DecodeDetails_detailShiftLeft_1780018379102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722292 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4722292, term4722292.getClass(), "opcode", (short) 0);
        setField(term4722292, term4722292.getClass(), "x", null);
        setField(term4722292, term4722292.getClass(), "y", null);
        setField(term4722292, term4722292.getClass(), "nnn", null);
        setField(term4722292, term4722292.getClass(), "nn", null);
        setField(term4722292, term4722292.getClass(), "n", null);
        setField(term4722292, term4722292.getClass(), "iBefore", null);
        setField(term4722292, term4722292.getClass(), "i", null);
        setField(term4722292, term4722292.getClass(), "pc", null);
        setBooleanField(term4722292, term4722292.getClass(), "state", false);
        setBooleanField(term4722292, term4722292.getClass(), "resolutionMode", false);
        term4722296 = new Byte((byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = term4722296;
        callMethod(klass, "detailShiftLeft", argTypes, term4722292, args);
    }

};


