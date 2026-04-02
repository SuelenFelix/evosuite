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

public class DecodeDetails_isResolutionMode_155392890960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4719086;

    public DecodeDetails_isResolutionMode_155392890960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4719086 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4719086, term4719086.getClass(), "opcode", (short) -312);
        setField(term4719086, term4719086.getClass(), "x", "QHYZiyDyPC");
        setField(term4719086, term4719086.getClass(), "y", "kcHMyiheuH");
        setField(term4719086, term4719086.getClass(), "nnn", "DGMBBNDEYs");
        setField(term4719086, term4719086.getClass(), "nn", "vpuKZSMmKQ");
        setField(term4719086, term4719086.getClass(), "n", "IXQQwaXITf");
        setField(term4719086, term4719086.getClass(), "iBefore", "fNzFTiRCjp");
        setField(term4719086, term4719086.getClass(), "i", "yaCGGogKro");
        setField(term4719086, term4719086.getClass(), "pc", "qxrRUnjshF");
        setBooleanField(term4719086, term4719086.getClass(), "state", false);
        setBooleanField(term4719086, term4719086.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isResolutionMode", argTypes, term4719086, args);
    }

};


