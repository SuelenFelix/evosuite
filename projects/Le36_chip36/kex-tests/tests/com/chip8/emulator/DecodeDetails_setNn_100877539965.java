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

public class DecodeDetails_setNn_100877539965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4720054;

    public DecodeDetails_setNn_100877539965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4720054 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4720054, term4720054.getClass(), "opcode", (short) -14697);
        setField(term4720054, term4720054.getClass(), "x", "rfFHGPcfpz");
        setField(term4720054, term4720054.getClass(), "y", "fViQeyMrrL");
        setField(term4720054, term4720054.getClass(), "nnn", "zzeaToyLmI");
        setField(term4720054, term4720054.getClass(), "nn", "sKYWhmRMLx");
        setField(term4720054, term4720054.getClass(), "n", "SOJpgWUZCf");
        setField(term4720054, term4720054.getClass(), "iBefore", "jgywFOzBDw");
        setField(term4720054, term4720054.getClass(), "i", "yKIXLtCWYi");
        setField(term4720054, term4720054.getClass(), "pc", "EhuyRKrUJu");
        setBooleanField(term4720054, term4720054.getClass(), "state", false);
        setBooleanField(term4720054, term4720054.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UlBxuoBXcJ";
        callMethod(klass, "setNn", argTypes, term4720054, args);
    }

};


