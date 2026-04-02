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

public class DecodeDetails_equals_17614422272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4721428;
     Object term4721528;

    public DecodeDetails_equals_17614422272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4721428 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4721428, term4721428.getClass(), "opcode", (short) -6731);
        setField(term4721428, term4721428.getClass(), "x", "NeEetzFhTt");
        setField(term4721428, term4721428.getClass(), "y", "UgvuvUxKed");
        setField(term4721428, term4721428.getClass(), "nnn", "ljBBMsQpaM");
        setField(term4721428, term4721428.getClass(), "nn", "hHNIOlOzJc");
        setField(term4721428, term4721428.getClass(), "n", "ALRSeULyWV");
        setField(term4721428, term4721428.getClass(), "iBefore", "WVhzXHdyFF");
        setField(term4721428, term4721428.getClass(), "i", "GLAWYoxkyw");
        setField(term4721428, term4721428.getClass(), "pc", "cfpPTNNVnW");
        setBooleanField(term4721428, term4721428.getClass(), "state", false);
        setBooleanField(term4721428, term4721428.getClass(), "resolutionMode", false);
        term4721528 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4721528;
        callMethod(klass, "equals", argTypes, term4721428, args);
    }

};


