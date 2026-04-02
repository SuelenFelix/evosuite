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

public class DecodeDetails_getOpcode_68998199250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4717286;

    public DecodeDetails_getOpcode_68998199250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4717286 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4717286, term4717286.getClass(), "opcode", (short) 5992);
        setField(term4717286, term4717286.getClass(), "x", "uIgRFcwqLd");
        setField(term4717286, term4717286.getClass(), "y", "AvdsiEyCve");
        setField(term4717286, term4717286.getClass(), "nnn", "XMArCaVAEc");
        setField(term4717286, term4717286.getClass(), "nn", "URWnZtbrQH");
        setField(term4717286, term4717286.getClass(), "n", "hpTAdtnQku");
        setField(term4717286, term4717286.getClass(), "iBefore", "GdMAXFBAtl");
        setField(term4717286, term4717286.getClass(), "i", "KWVRAlcIqd");
        setField(term4717286, term4717286.getClass(), "pc", "GeVOqtDiGv");
        setBooleanField(term4717286, term4717286.getClass(), "state", false);
        setBooleanField(term4717286, term4717286.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpcode", argTypes, term4717286, args);
    }

};


