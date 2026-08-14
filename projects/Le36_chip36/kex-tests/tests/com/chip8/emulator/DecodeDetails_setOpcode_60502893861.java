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
import java.lang.Short;

public class DecodeDetails_setOpcode_60502893861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4719266;
     Object term4719366;

    public DecodeDetails_setOpcode_60502893861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4719266 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4719266, term4719266.getClass(), "opcode", (short) 13929);
        setField(term4719266, term4719266.getClass(), "x", "WmVcapKAeJ");
        setField(term4719266, term4719266.getClass(), "y", "jevOVdQdpc");
        setField(term4719266, term4719266.getClass(), "nnn", "TLLVSGTNsz");
        setField(term4719266, term4719266.getClass(), "nn", "mbBWfaHCrP");
        setField(term4719266, term4719266.getClass(), "n", "wFyiZloCxg");
        setField(term4719266, term4719266.getClass(), "iBefore", "xYztJEIPWy");
        setField(term4719266, term4719266.getClass(), "i", "TDQIAXaJru");
        setField(term4719266, term4719266.getClass(), "pc", "frPMFqGmrE");
        setBooleanField(term4719266, term4719266.getClass(), "state", true);
        setBooleanField(term4719266, term4719266.getClass(), "resolutionMode", false);
        term4719366 = new Short((short) -9736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = short.class;
        Object[] args = new Object[1];
        args[0] = term4719366;
        callMethod(klass, "setOpcode", argTypes, term4719266, args);
    }

};


