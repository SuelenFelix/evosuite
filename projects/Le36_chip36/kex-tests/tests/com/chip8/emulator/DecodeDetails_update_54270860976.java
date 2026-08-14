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
import java.lang.Short;
import java.lang.Boolean;

public class DecodeDetails_update_54270860976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722150;
     Object term4722154;
     Object term4722156;
     Object term4722158;
     Object term4722160;

    public DecodeDetails_update_54270860976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722150 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4722150, term4722150.getClass(), "opcode", (short) 0);
        setField(term4722150, term4722150.getClass(), "x", null);
        setField(term4722150, term4722150.getClass(), "y", null);
        setField(term4722150, term4722150.getClass(), "nnn", null);
        setField(term4722150, term4722150.getClass(), "nn", null);
        setField(term4722150, term4722150.getClass(), "n", null);
        setField(term4722150, term4722150.getClass(), "iBefore", null);
        setField(term4722150, term4722150.getClass(), "i", null);
        setField(term4722150, term4722150.getClass(), "pc", null);
        setBooleanField(term4722150, term4722150.getClass(), "state", false);
        setBooleanField(term4722150, term4722150.getClass(), "resolutionMode", false);
        term4722154 = new Short((short) 0);
        term4722156 = new Short((short) 0);
        term4722158 = new Short((short) 0);
        term4722160 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = short.class;
        argTypes[1] = short.class;
        argTypes[2] = short.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term4722154;
        args[1] = term4722156;
        args[2] = term4722158;
        args[3] = term4722160;
        callMethod(klass, "update", argTypes, term4722150, args);
    }

};


