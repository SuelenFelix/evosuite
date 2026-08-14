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
import java.lang.Short;

public class DecodeDetails_detailJumpAddress_94665446487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722206;
     Object term4722210;

    public DecodeDetails_detailJumpAddress_94665446487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722206 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4722206, term4722206.getClass(), "opcode", (short) 0);
        setField(term4722206, term4722206.getClass(), "x", null);
        setField(term4722206, term4722206.getClass(), "y", null);
        setField(term4722206, term4722206.getClass(), "nnn", null);
        setField(term4722206, term4722206.getClass(), "nn", null);
        setField(term4722206, term4722206.getClass(), "n", null);
        setField(term4722206, term4722206.getClass(), "iBefore", null);
        setField(term4722206, term4722206.getClass(), "i", null);
        setField(term4722206, term4722206.getClass(), "pc", null);
        setBooleanField(term4722206, term4722206.getClass(), "state", false);
        setBooleanField(term4722206, term4722206.getClass(), "resolutionMode", false);
        term4722210 = new Short((short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = short.class;
        Object[] args = new Object[1];
        args[0] = term4722210;
        callMethod(klass, "detailJumpAddress", argTypes, term4722206, args);
    }

};


