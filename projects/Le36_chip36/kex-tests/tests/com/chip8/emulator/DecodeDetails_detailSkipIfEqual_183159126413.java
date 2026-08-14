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

public class DecodeDetails_detailSkipIfEqual_183159126413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4710650;

    public DecodeDetails_detailSkipIfEqual_183159126413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4710650 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4710650, term4710650.getClass(), "opcode", (short) -11953);
        setField(term4710650, term4710650.getClass(), "x", "VesRqDfjMa");
        setField(term4710650, term4710650.getClass(), "y", "AQTTebOiZR");
        setField(term4710650, term4710650.getClass(), "nnn", "mgeIhswNtk");
        setField(term4710650, term4710650.getClass(), "nn", "QwKYpiVQlL");
        setField(term4710650, term4710650.getClass(), "n", "kSGsHNQQoW");
        setField(term4710650, term4710650.getClass(), "iBefore", "MWezlyjdaG");
        setField(term4710650, term4710650.getClass(), "i", "drpBJuEKQG");
        setField(term4710650, term4710650.getClass(), "pc", "GGpORnLrOW");
        setBooleanField(term4710650, term4710650.getClass(), "state", true);
        setBooleanField(term4710650, term4710650.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailSkipIfEqual", argTypes, term4710650, args);
    }

};


