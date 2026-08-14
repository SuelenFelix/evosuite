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

public class DecodeDetails_detailReturnFrom_173109209210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4710100;
     Object term4710200;
     Object term4710202;

    public DecodeDetails_detailReturnFrom_173109209210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4710100 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4710100, term4710100.getClass(), "opcode", (short) -2781);
        setField(term4710100, term4710100.getClass(), "x", "bqIuFFFwnP");
        setField(term4710100, term4710100.getClass(), "y", "hDxvvVgGlk");
        setField(term4710100, term4710100.getClass(), "nnn", "XdjSvjaTqk");
        setField(term4710100, term4710100.getClass(), "nn", "ukrlYVcvsg");
        setField(term4710100, term4710100.getClass(), "n", "cpjqTCNflQ");
        setField(term4710100, term4710100.getClass(), "iBefore", "wiYGATEfmw");
        setField(term4710100, term4710100.getClass(), "i", "FiALSqneIg");
        setField(term4710100, term4710100.getClass(), "pc", "lGVACSQceQ");
        setBooleanField(term4710100, term4710100.getClass(), "state", true);
        setBooleanField(term4710100, term4710100.getClass(), "resolutionMode", false);
        term4710200 = new Integer(1137624258);
        term4710202 = new Integer(977862393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4710200;
        args[1] = term4710202;
        callMethod(klass, "detailReturnFrom", argTypes, term4710100, args);
    }

};


