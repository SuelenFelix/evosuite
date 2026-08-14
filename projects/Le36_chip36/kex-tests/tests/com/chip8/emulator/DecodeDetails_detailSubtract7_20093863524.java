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
import java.lang.Byte;

public class DecodeDetails_detailSubtract7_20093863524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4712732;
     Object term4712832;
     Object term4712834;

    public DecodeDetails_detailSubtract7_20093863524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4712732 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4712732, term4712732.getClass(), "opcode", (short) 4878);
        setField(term4712732, term4712732.getClass(), "x", "XQiKmsCacK");
        setField(term4712732, term4712732.getClass(), "y", "cTCixEbHYT");
        setField(term4712732, term4712732.getClass(), "nnn", "bqKksqtAdT");
        setField(term4712732, term4712732.getClass(), "nn", "jAIAdEmULK");
        setField(term4712732, term4712732.getClass(), "n", "EuAshkmbna");
        setField(term4712732, term4712732.getClass(), "iBefore", "JwQlbBbGJR");
        setField(term4712732, term4712732.getClass(), "i", "HdWLwfVsAM");
        setField(term4712732, term4712732.getClass(), "pc", "SxeKEdHXSl");
        setBooleanField(term4712732, term4712732.getClass(), "state", true);
        setBooleanField(term4712732, term4712732.getClass(), "resolutionMode", false);
        term4712832 = new Byte((byte) 111);
        term4712834 = new Byte((byte) -43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = byte.class;
        argTypes[1] = byte.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term4712832;
        args[1] = term4712834;
        args[2] = "BCAlJpNjIX";
        args[3] = "PKClfBAwUr";
        callMethod(klass, "detailSubtract7", argTypes, term4712732, args);
    }

};


