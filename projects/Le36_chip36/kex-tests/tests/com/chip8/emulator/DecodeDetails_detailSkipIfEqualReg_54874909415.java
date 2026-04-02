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

public class DecodeDetails_detailSkipIfEqualReg_54874909415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4711010;

    public DecodeDetails_detailSkipIfEqualReg_54874909415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4711010 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4711010, term4711010.getClass(), "opcode", (short) -31945);
        setField(term4711010, term4711010.getClass(), "x", "zUXaSvayQe");
        setField(term4711010, term4711010.getClass(), "y", "bPVcnnQPSC");
        setField(term4711010, term4711010.getClass(), "nnn", "PQLyoEKWSa");
        setField(term4711010, term4711010.getClass(), "nn", "HOgkhttJZS");
        setField(term4711010, term4711010.getClass(), "n", "goqNSmXSSS");
        setField(term4711010, term4711010.getClass(), "iBefore", "AkViBLdqXM");
        setField(term4711010, term4711010.getClass(), "i", "UlxGFzEifL");
        setField(term4711010, term4711010.getClass(), "pc", "HilHTbDKDF");
        setBooleanField(term4711010, term4711010.getClass(), "state", false);
        setBooleanField(term4711010, term4711010.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailSkipIfEqualReg", argTypes, term4711010, args);
    }

};


