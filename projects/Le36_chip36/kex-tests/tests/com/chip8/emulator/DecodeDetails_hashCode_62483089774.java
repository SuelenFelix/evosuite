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

public class DecodeDetails_hashCode_62483089774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4721790;

    public DecodeDetails_hashCode_62483089774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4721790 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4721790, term4721790.getClass(), "opcode", (short) -13772);
        setField(term4721790, term4721790.getClass(), "x", "QqsjlsXtmm");
        setField(term4721790, term4721790.getClass(), "y", "FuWUjAYXxz");
        setField(term4721790, term4721790.getClass(), "nnn", "rKIvvYydou");
        setField(term4721790, term4721790.getClass(), "nn", "KNgeIkQoef");
        setField(term4721790, term4721790.getClass(), "n", "MeMWAHyjMR");
        setField(term4721790, term4721790.getClass(), "iBefore", "lTuLOcnSnJ");
        setField(term4721790, term4721790.getClass(), "i", "govbBrRstA");
        setField(term4721790, term4721790.getClass(), "pc", "zSMUNzRRyM");
        setBooleanField(term4721790, term4721790.getClass(), "state", false);
        setBooleanField(term4721790, term4721790.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4721790, args);
    }

};


