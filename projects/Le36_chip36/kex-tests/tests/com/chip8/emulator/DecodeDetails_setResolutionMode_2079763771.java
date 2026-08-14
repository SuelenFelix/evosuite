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
import java.lang.Boolean;

public class DecodeDetails_setResolutionMode_2079763771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4721246;
     Object term4721346;

    public DecodeDetails_setResolutionMode_2079763771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4721246 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4721246, term4721246.getClass(), "opcode", (short) 31857);
        setField(term4721246, term4721246.getClass(), "x", "zsglFxvzdp");
        setField(term4721246, term4721246.getClass(), "y", "zhXtSGLnJR");
        setField(term4721246, term4721246.getClass(), "nnn", "XlNXxsYNss");
        setField(term4721246, term4721246.getClass(), "nn", "jheRZWjuaB");
        setField(term4721246, term4721246.getClass(), "n", "IERziToRSQ");
        setField(term4721246, term4721246.getClass(), "iBefore", "mDTRMwjBpc");
        setField(term4721246, term4721246.getClass(), "i", "sCLAuKoiVL");
        setField(term4721246, term4721246.getClass(), "pc", "pFWiDEnVnU");
        setBooleanField(term4721246, term4721246.getClass(), "state", true);
        setBooleanField(term4721246, term4721246.getClass(), "resolutionMode", false);
        term4721346 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4721346;
        callMethod(klass, "setResolutionMode", argTypes, term4721246, args);
    }

};


