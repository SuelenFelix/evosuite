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

public class DecodeDetails_setN_188184350366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4720256;

    public DecodeDetails_setN_188184350366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4720256 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4720256, term4720256.getClass(), "opcode", (short) 8265);
        setField(term4720256, term4720256.getClass(), "x", "PqduvNFXXw");
        setField(term4720256, term4720256.getClass(), "y", "bMQrxvaBAI");
        setField(term4720256, term4720256.getClass(), "nnn", "StFtysZlWm");
        setField(term4720256, term4720256.getClass(), "nn", "CoqUcmjnkF");
        setField(term4720256, term4720256.getClass(), "n", "oOrXvGaFwa");
        setField(term4720256, term4720256.getClass(), "iBefore", "KJSTLGsSvO");
        setField(term4720256, term4720256.getClass(), "i", "kSkiIpaepq");
        setField(term4720256, term4720256.getClass(), "pc", "FzJhDecyvI");
        setBooleanField(term4720256, term4720256.getClass(), "state", false);
        setBooleanField(term4720256, term4720256.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zOxseYMSdY";
        callMethod(klass, "setN", argTypes, term4720256, args);
    }

};


