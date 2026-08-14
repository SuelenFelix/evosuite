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

public class DecodeDetails_getX_13508994751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4717466;

    public DecodeDetails_getX_13508994751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4717466 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4717466, term4717466.getClass(), "opcode", (short) 20792);
        setField(term4717466, term4717466.getClass(), "x", "vbRAJCwftU");
        setField(term4717466, term4717466.getClass(), "y", "baJbjUImxp");
        setField(term4717466, term4717466.getClass(), "nnn", "lPERFqPpGz");
        setField(term4717466, term4717466.getClass(), "nn", "jleFBTYSNb");
        setField(term4717466, term4717466.getClass(), "n", "WmSSWHEELj");
        setField(term4717466, term4717466.getClass(), "iBefore", "ggFhMyQvdw");
        setField(term4717466, term4717466.getClass(), "i", "vZpMxQNHKu");
        setField(term4717466, term4717466.getClass(), "pc", "QLMSDWYwBC");
        setBooleanField(term4717466, term4717466.getClass(), "state", false);
        setBooleanField(term4717466, term4717466.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getX", argTypes, term4717466, args);
    }

};


