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

public class DecodeDetails_getNnn_94973303953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4717826;

    public DecodeDetails_getNnn_94973303953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4717826 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4717826, term4717826.getClass(), "opcode", (short) 10388);
        setField(term4717826, term4717826.getClass(), "x", "bMRkDiPUGu");
        setField(term4717826, term4717826.getClass(), "y", "xjKxECGyLT");
        setField(term4717826, term4717826.getClass(), "nnn", "ffKeJGEXBT");
        setField(term4717826, term4717826.getClass(), "nn", "rsnXTpfhqf");
        setField(term4717826, term4717826.getClass(), "n", "gzvlGZVfnZ");
        setField(term4717826, term4717826.getClass(), "iBefore", "rmSqCaXWHi");
        setField(term4717826, term4717826.getClass(), "i", "ScztqspySK");
        setField(term4717826, term4717826.getClass(), "pc", "IvYxGwWoVu");
        setBooleanField(term4717826, term4717826.getClass(), "state", false);
        setBooleanField(term4717826, term4717826.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNnn", argTypes, term4717826, args);
    }

};


