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

public class DecodeDetails_detailBcd_692921075117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722354;
     Object term4722358;

    public DecodeDetails_detailBcd_692921075117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722354 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4722354, term4722354.getClass(), "opcode", (short) 0);
        setField(term4722354, term4722354.getClass(), "x", null);
        setField(term4722354, term4722354.getClass(), "y", null);
        setField(term4722354, term4722354.getClass(), "nnn", null);
        setField(term4722354, term4722354.getClass(), "nn", null);
        setField(term4722354, term4722354.getClass(), "n", null);
        setField(term4722354, term4722354.getClass(), "iBefore", null);
        setField(term4722354, term4722354.getClass(), "i", null);
        setField(term4722354, term4722354.getClass(), "pc", null);
        setBooleanField(term4722354, term4722354.getClass(), "state", false);
        setBooleanField(term4722354, term4722354.getClass(), "resolutionMode", false);
        term4722358 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4722358;
        callMethod(klass, "detailBcd", argTypes, term4722354, args);
    }

};


