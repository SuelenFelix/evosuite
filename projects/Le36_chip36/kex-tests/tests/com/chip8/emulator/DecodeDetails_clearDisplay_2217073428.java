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

public class DecodeDetails_clearDisplay_2217073428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4709740;

    public DecodeDetails_clearDisplay_2217073428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4709740 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4709740, term4709740.getClass(), "opcode", (short) 20335);
        setField(term4709740, term4709740.getClass(), "x", "iVIrSxTsaM");
        setField(term4709740, term4709740.getClass(), "y", "FmJNEfmYgq");
        setField(term4709740, term4709740.getClass(), "nnn", "NqQofgWsJd");
        setField(term4709740, term4709740.getClass(), "nn", "ZlVRdHsBMO");
        setField(term4709740, term4709740.getClass(), "n", "UMMXkhuqzw");
        setField(term4709740, term4709740.getClass(), "iBefore", "KyGXZcXJwq");
        setField(term4709740, term4709740.getClass(), "i", "TqiCjeuoWE");
        setField(term4709740, term4709740.getClass(), "pc", "GWWfkXOYLP");
        setBooleanField(term4709740, term4709740.getClass(), "state", false);
        setBooleanField(term4709740, term4709740.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearDisplay", argTypes, term4709740, args);
    }

};


