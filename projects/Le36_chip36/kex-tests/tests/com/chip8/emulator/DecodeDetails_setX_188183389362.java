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

public class DecodeDetails_setX_188183389362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4719448;

    public DecodeDetails_setX_188183389362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4719448 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4719448, term4719448.getClass(), "opcode", (short) -1986);
        setField(term4719448, term4719448.getClass(), "x", "DvfOYWcNBN");
        setField(term4719448, term4719448.getClass(), "y", "cvbvwpPlNk");
        setField(term4719448, term4719448.getClass(), "nnn", "uCdLbhvYeG");
        setField(term4719448, term4719448.getClass(), "nn", "ipoyEHBfoG");
        setField(term4719448, term4719448.getClass(), "n", "iSBTpbiteU");
        setField(term4719448, term4719448.getClass(), "iBefore", "MTwFbEoMZj");
        setField(term4719448, term4719448.getClass(), "i", "uEQbnHbyAn");
        setField(term4719448, term4719448.getClass(), "pc", "JpFIuyNEKW");
        setBooleanField(term4719448, term4719448.getClass(), "state", false);
        setBooleanField(term4719448, term4719448.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NksHsgcqDx";
        callMethod(klass, "setX", argTypes, term4719448, args);
    }

};


