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

public class DecodeDetails_scrollRight_12513834481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4708480;

    public DecodeDetails_scrollRight_12513834481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4708480 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4708480, term4708480.getClass(), "opcode", (short) -12099);
        setField(term4708480, term4708480.getClass(), "x", "cNoFvpHBHw");
        setField(term4708480, term4708480.getClass(), "y", "DoSWbCtsBg");
        setField(term4708480, term4708480.getClass(), "nnn", "NrXtkbXwDc");
        setField(term4708480, term4708480.getClass(), "nn", "EUapSrAmOe");
        setField(term4708480, term4708480.getClass(), "n", "dUHylIprea");
        setField(term4708480, term4708480.getClass(), "iBefore", "FKDqHRpMcc");
        setField(term4708480, term4708480.getClass(), "i", "mIRMQIxHUD");
        setField(term4708480, term4708480.getClass(), "pc", "FbBMtntDbw");
        setBooleanField(term4708480, term4708480.getClass(), "state", true);
        setBooleanField(term4708480, term4708480.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "scrollRight", argTypes, term4708480, args);
    }

};


