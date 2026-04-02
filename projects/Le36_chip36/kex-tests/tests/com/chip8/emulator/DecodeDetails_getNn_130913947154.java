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

public class DecodeDetails_getNn_130913947154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4718006;

    public DecodeDetails_getNn_130913947154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4718006 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4718006, term4718006.getClass(), "opcode", (short) -30198);
        setField(term4718006, term4718006.getClass(), "x", "XnZHOhTfxL");
        setField(term4718006, term4718006.getClass(), "y", "oFBhNamtAs");
        setField(term4718006, term4718006.getClass(), "nnn", "YURcpRjwSt");
        setField(term4718006, term4718006.getClass(), "nn", "SXMdNSGPog");
        setField(term4718006, term4718006.getClass(), "n", "vsqwOLpDjj");
        setField(term4718006, term4718006.getClass(), "iBefore", "rJgXQRsPCl");
        setField(term4718006, term4718006.getClass(), "i", "RgqpoBknjN");
        setField(term4718006, term4718006.getClass(), "pc", "nUDhadopHE");
        setBooleanField(term4718006, term4718006.getClass(), "state", false);
        setBooleanField(term4718006, term4718006.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNn", argTypes, term4718006, args);
    }

};


