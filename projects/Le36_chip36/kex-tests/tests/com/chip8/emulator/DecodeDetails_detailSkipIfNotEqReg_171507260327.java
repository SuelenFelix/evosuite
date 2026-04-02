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

public class DecodeDetails_detailSkipIfNotEqReg_171507260327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4713324;

    public DecodeDetails_detailSkipIfNotEqReg_171507260327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4713324 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4713324, term4713324.getClass(), "opcode", (short) 4904);
        setField(term4713324, term4713324.getClass(), "x", "rawiXxuyRn");
        setField(term4713324, term4713324.getClass(), "y", "ZyAecZGope");
        setField(term4713324, term4713324.getClass(), "nnn", "uYnmxkwLfB");
        setField(term4713324, term4713324.getClass(), "nn", "RVZTQxYOUO");
        setField(term4713324, term4713324.getClass(), "n", "tydPpKxAbv");
        setField(term4713324, term4713324.getClass(), "iBefore", "CJxQpJUfLJ");
        setField(term4713324, term4713324.getClass(), "i", "NUUjAyqOva");
        setField(term4713324, term4713324.getClass(), "pc", "EoAMIIUdDX");
        setBooleanField(term4713324, term4713324.getClass(), "state", false);
        setBooleanField(term4713324, term4713324.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailSkipIfNotEqReg", argTypes, term4713324, args);
    }

};


