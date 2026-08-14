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

public class DecodeDetails_isState_99063823559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4718906;

    public DecodeDetails_isState_99063823559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4718906 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4718906, term4718906.getClass(), "opcode", (short) 1103);
        setField(term4718906, term4718906.getClass(), "x", "qOZXeUUmdz");
        setField(term4718906, term4718906.getClass(), "y", "FCovVZHqPx");
        setField(term4718906, term4718906.getClass(), "nnn", "jSTBfkWjge");
        setField(term4718906, term4718906.getClass(), "nn", "uKYhZULSHp");
        setField(term4718906, term4718906.getClass(), "n", "xdYuLllgpn");
        setField(term4718906, term4718906.getClass(), "iBefore", "ayonlqalLA");
        setField(term4718906, term4718906.getClass(), "i", "fzzIOVxKdF");
        setField(term4718906, term4718906.getClass(), "pc", "cdvmxZaBEK");
        setBooleanField(term4718906, term4718906.getClass(), "state", true);
        setBooleanField(term4718906, term4718906.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isState", argTypes, term4718906, args);
    }

};


