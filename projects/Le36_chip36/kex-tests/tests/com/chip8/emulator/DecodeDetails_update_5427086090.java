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

public class DecodeDetails_update_5427086090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4708292;
     Object term4708392;
     Object term4708394;
     Object term4708396;
     Object term4708398;

    public DecodeDetails_update_5427086090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4708292 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4708292, term4708292.getClass(), "opcode", (short) -20955);
        setField(term4708292, term4708292.getClass(), "x", "fheZXFNQZh");
        setField(term4708292, term4708292.getClass(), "y", "YxHVWlebna");
        setField(term4708292, term4708292.getClass(), "nnn", "IEmAQCkrPE");
        setField(term4708292, term4708292.getClass(), "nn", "lqFGhtlNRM");
        setField(term4708292, term4708292.getClass(), "n", "GLxLHUsuLw");
        setField(term4708292, term4708292.getClass(), "iBefore", "HuKdqrrxIm");
        setField(term4708292, term4708292.getClass(), "i", "yJKKddLqMb");
        setField(term4708292, term4708292.getClass(), "pc", "LWEYaXeKBe");
        setBooleanField(term4708292, term4708292.getClass(), "state", true);
        setBooleanField(term4708292, term4708292.getClass(), "resolutionMode", false);
        term4708392 = new Short((short) -3406);
        term4708394 = new Short((short) -18941);
        term4708396 = new Short((short) -32286);
        term4708398 = new Boolean(false);
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
        args[0] = term4708392;
        args[1] = term4708394;
        args[2] = term4708396;
        args[3] = term4708398;
        callMethod(klass, "update", argTypes, term4708292, args);
    }

};


