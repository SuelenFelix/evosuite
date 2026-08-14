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

public class DecodeDetails_detailSkipIfKeyNotEq_160076540233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4714404;

    public DecodeDetails_detailSkipIfKeyNotEq_160076540233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4714404 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4714404, term4714404.getClass(), "opcode", (short) -32497);
        setField(term4714404, term4714404.getClass(), "x", "LqNgPziYtv");
        setField(term4714404, term4714404.getClass(), "y", "wiDfuaXnrP");
        setField(term4714404, term4714404.getClass(), "nnn", "btdGZUcaZl");
        setField(term4714404, term4714404.getClass(), "nn", "WnEAVdCxna");
        setField(term4714404, term4714404.getClass(), "n", "lnPIxHHyEK");
        setField(term4714404, term4714404.getClass(), "iBefore", "unvQfYuBUz");
        setField(term4714404, term4714404.getClass(), "i", "RqnYUpQBbG");
        setField(term4714404, term4714404.getClass(), "pc", "sKnuhmcjCC");
        setBooleanField(term4714404, term4714404.getClass(), "state", false);
        setBooleanField(term4714404, term4714404.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailSkipIfKeyNotEq", argTypes, term4714404, args);
    }

};


