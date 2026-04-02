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
import java.lang.Byte;

public class DecodeDetails_detailAddVxVy_60376004622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4712320;
     Object term4712420;
     Object term4712422;

    public DecodeDetails_detailAddVxVy_60376004622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4712320 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4712320, term4712320.getClass(), "opcode", (short) -6199);
        setField(term4712320, term4712320.getClass(), "x", "YMmtjELJuB");
        setField(term4712320, term4712320.getClass(), "y", "FzyIShiOmb");
        setField(term4712320, term4712320.getClass(), "nnn", "PEUfeJaZTk");
        setField(term4712320, term4712320.getClass(), "nn", "AIvyeIdskz");
        setField(term4712320, term4712320.getClass(), "n", "iSQqMWMRlU");
        setField(term4712320, term4712320.getClass(), "iBefore", "djWEnlbOXu");
        setField(term4712320, term4712320.getClass(), "i", "MvDMzQBWME");
        setField(term4712320, term4712320.getClass(), "pc", "sZyAwmdGVS");
        setBooleanField(term4712320, term4712320.getClass(), "state", true);
        setBooleanField(term4712320, term4712320.getClass(), "resolutionMode", true);
        term4712420 = new Byte((byte) 78);
        term4712422 = new Byte((byte) 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = byte.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term4712420;
        args[1] = term4712422;
        callMethod(klass, "detailAddVxVy", argTypes, term4712320, args);
    }

};


