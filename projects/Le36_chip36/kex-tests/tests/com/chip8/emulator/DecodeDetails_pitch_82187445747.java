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

public class DecodeDetails_pitch_82187445747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4716926;

    public DecodeDetails_pitch_82187445747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4716926 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4716926, term4716926.getClass(), "opcode", (short) 27912);
        setField(term4716926, term4716926.getClass(), "x", "yCWSlaOrSv");
        setField(term4716926, term4716926.getClass(), "y", "PFpWKxDIRz");
        setField(term4716926, term4716926.getClass(), "nnn", "qePuOCwoCf");
        setField(term4716926, term4716926.getClass(), "nn", "vJPujDInGq");
        setField(term4716926, term4716926.getClass(), "n", "cHZGcMhatT");
        setField(term4716926, term4716926.getClass(), "iBefore", "OZGyrUPedG");
        setField(term4716926, term4716926.getClass(), "i", "GAxMzRqmXU");
        setField(term4716926, term4716926.getClass(), "pc", "XMhUDGKSWO");
        setBooleanField(term4716926, term4716926.getClass(), "state", true);
        setBooleanField(term4716926, term4716926.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pitch", argTypes, term4716926, args);
    }

};


