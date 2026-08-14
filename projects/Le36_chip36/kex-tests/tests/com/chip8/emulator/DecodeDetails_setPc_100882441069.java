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

public class DecodeDetails_setPc_100882441069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4720862;

    public DecodeDetails_setPc_100882441069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4720862 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4720862, term4720862.getClass(), "opcode", (short) 17190);
        setField(term4720862, term4720862.getClass(), "x", "orHcHVrwHz");
        setField(term4720862, term4720862.getClass(), "y", "mkEWcQdwUn");
        setField(term4720862, term4720862.getClass(), "nnn", "VRjVlzFSIx");
        setField(term4720862, term4720862.getClass(), "nn", "fNlDLqQZFT");
        setField(term4720862, term4720862.getClass(), "n", "szCfpoTDXX");
        setField(term4720862, term4720862.getClass(), "iBefore", "blnSDUyHkS");
        setField(term4720862, term4720862.getClass(), "i", "byyepwHlHN");
        setField(term4720862, term4720862.getClass(), "pc", "akVNsUcFra");
        setBooleanField(term4720862, term4720862.getClass(), "state", true);
        setBooleanField(term4720862, term4720862.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BKiHMTzLoY";
        callMethod(klass, "setPc", argTypes, term4720862, args);
    }

};


