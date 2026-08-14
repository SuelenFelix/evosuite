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

public class DecodeDetails_getPc_130918848258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4718726;

    public DecodeDetails_getPc_130918848258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4718726 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4718726, term4718726.getClass(), "opcode", (short) 30820);
        setField(term4718726, term4718726.getClass(), "x", "zqykonsLIo");
        setField(term4718726, term4718726.getClass(), "y", "KoPzTuvIeK");
        setField(term4718726, term4718726.getClass(), "nnn", "SMoWUILIhn");
        setField(term4718726, term4718726.getClass(), "nn", "SvSKSCjgTM");
        setField(term4718726, term4718726.getClass(), "n", "UFxnRbWtog");
        setField(term4718726, term4718726.getClass(), "iBefore", "NSxzAUSujy");
        setField(term4718726, term4718726.getClass(), "i", "FEezgglqXC");
        setField(term4718726, term4718726.getClass(), "pc", "rvYqMRgiPA");
        setBooleanField(term4718726, term4718726.getClass(), "state", false);
        setBooleanField(term4718726, term4718726.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPc", argTypes, term4718726, args);
    }

};


