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

public class DecodeDetails_detailShiftLeft_178001837926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4713142;
     Object term4713242;

    public DecodeDetails_detailShiftLeft_178001837926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4713142 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4713142, term4713142.getClass(), "opcode", (short) 29241);
        setField(term4713142, term4713142.getClass(), "x", "NsphHxYiuC");
        setField(term4713142, term4713142.getClass(), "y", "XYJztkznbY");
        setField(term4713142, term4713142.getClass(), "nnn", "NeTiWVoyjZ");
        setField(term4713142, term4713142.getClass(), "nn", "CGeclMyIOP");
        setField(term4713142, term4713142.getClass(), "n", "yyWOYvIBsp");
        setField(term4713142, term4713142.getClass(), "iBefore", "mmpgARMYFV");
        setField(term4713142, term4713142.getClass(), "i", "NUqhsZprdZ");
        setField(term4713142, term4713142.getClass(), "pc", "jkzgCqWJrA");
        setBooleanField(term4713142, term4713142.getClass(), "state", true);
        setBooleanField(term4713142, term4713142.getClass(), "resolutionMode", false);
        term4713242 = new Byte((byte) 62);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = term4713242;
        callMethod(klass, "detailShiftLeft", argTypes, term4713142, args);
    }

};


