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

public class DecodeDetails_setI_188184830868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4720660;

    public DecodeDetails_setI_188184830868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4720660 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4720660, term4720660.getClass(), "opcode", (short) 184);
        setField(term4720660, term4720660.getClass(), "x", "MxUSQqhNse");
        setField(term4720660, term4720660.getClass(), "y", "skwxdosvQV");
        setField(term4720660, term4720660.getClass(), "nnn", "DBYTggnCkD");
        setField(term4720660, term4720660.getClass(), "nn", "RyXrJxJQiY");
        setField(term4720660, term4720660.getClass(), "n", "JfnQeTdzWs");
        setField(term4720660, term4720660.getClass(), "iBefore", "HGhGqMiMOk");
        setField(term4720660, term4720660.getClass(), "i", "VtTzFdKpZI");
        setField(term4720660, term4720660.getClass(), "pc", "yCqQIOXRXO");
        setBooleanField(term4720660, term4720660.getClass(), "state", false);
        setBooleanField(term4720660, term4720660.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aevLPMVcYW";
        callMethod(klass, "setI", argTypes, term4720660, args);
    }

};


