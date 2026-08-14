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

public class DecodeDetails_getY_13509090852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4717646;

    public DecodeDetails_getY_13509090852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4717646 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4717646, term4717646.getClass(), "opcode", (short) 19907);
        setField(term4717646, term4717646.getClass(), "x", "feyxNWUenU");
        setField(term4717646, term4717646.getClass(), "y", "qvqwmSUIiP");
        setField(term4717646, term4717646.getClass(), "nnn", "eNOEXYoAtV");
        setField(term4717646, term4717646.getClass(), "nn", "SNqwfZGLFh");
        setField(term4717646, term4717646.getClass(), "n", "sMqpXbgEga");
        setField(term4717646, term4717646.getClass(), "iBefore", "nYJlDpoMcL");
        setField(term4717646, term4717646.getClass(), "i", "SQnbnBmbcf");
        setField(term4717646, term4717646.getClass(), "pc", "jaNVteZrZi");
        setBooleanField(term4717646, term4717646.getClass(), "state", true);
        setBooleanField(term4717646, term4717646.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getY", argTypes, term4717646, args);
    }

};


