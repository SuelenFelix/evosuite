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

public class DecodeDetails_setIBefore_129029649167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4720458;

    public DecodeDetails_setIBefore_129029649167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4720458 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4720458, term4720458.getClass(), "opcode", (short) 29629);
        setField(term4720458, term4720458.getClass(), "x", "jEKlkqpHMQ");
        setField(term4720458, term4720458.getClass(), "y", "QpEVWispEh");
        setField(term4720458, term4720458.getClass(), "nnn", "STofGrqXqL");
        setField(term4720458, term4720458.getClass(), "nn", "IoRhBfdSuN");
        setField(term4720458, term4720458.getClass(), "n", "JGdxVjQzts");
        setField(term4720458, term4720458.getClass(), "iBefore", "jEdjRikQtN");
        setField(term4720458, term4720458.getClass(), "i", "fSNUaokVWs");
        setField(term4720458, term4720458.getClass(), "pc", "dTxnMmHoVm");
        setBooleanField(term4720458, term4720458.getClass(), "state", true);
        setBooleanField(term4720458, term4720458.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iswxaQUQgT";
        callMethod(klass, "setIBefore", argTypes, term4720458, args);
    }

};


