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

public class DecodeDetails_detailRegisterDump_188119449542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4716026;

    public DecodeDetails_detailRegisterDump_188119449542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4716026 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4716026, term4716026.getClass(), "opcode", (short) 22184);
        setField(term4716026, term4716026.getClass(), "x", "qkMduZHBXR");
        setField(term4716026, term4716026.getClass(), "y", "jMQsCLYfKd");
        setField(term4716026, term4716026.getClass(), "nnn", "dpcpGqEQLd");
        setField(term4716026, term4716026.getClass(), "nn", "pButgbcWlR");
        setField(term4716026, term4716026.getClass(), "n", "tPiZMhJIXj");
        setField(term4716026, term4716026.getClass(), "iBefore", "lrEkNimddJ");
        setField(term4716026, term4716026.getClass(), "i", "fkeYGEUxMA");
        setField(term4716026, term4716026.getClass(), "pc", "aJUGPodUIW");
        setBooleanField(term4716026, term4716026.getClass(), "state", true);
        setBooleanField(term4716026, term4716026.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailRegisterDump", argTypes, term4716026, args);
    }

};


