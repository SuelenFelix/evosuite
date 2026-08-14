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

public class DecodeDetails_detailRplFill_171444092145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4716566;

    public DecodeDetails_detailRplFill_171444092145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4716566 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4716566, term4716566.getClass(), "opcode", (short) 201);
        setField(term4716566, term4716566.getClass(), "x", "VUVgiQvSYa");
        setField(term4716566, term4716566.getClass(), "y", "sEGgJJplmE");
        setField(term4716566, term4716566.getClass(), "nnn", "jyexiarswN");
        setField(term4716566, term4716566.getClass(), "nn", "ZBLFNFVEHD");
        setField(term4716566, term4716566.getClass(), "n", "miNxpUfOyL");
        setField(term4716566, term4716566.getClass(), "iBefore", "BAPTojeHRU");
        setField(term4716566, term4716566.getClass(), "i", "uqDEIRoVVf");
        setField(term4716566, term4716566.getClass(), "pc", "HnLeZhnLzz");
        setBooleanField(term4716566, term4716566.getClass(), "state", true);
        setBooleanField(term4716566, term4716566.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailRplFill", argTypes, term4716566, args);
    }

};


