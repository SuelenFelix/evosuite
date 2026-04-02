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

public class DecodeDetails_detailJumpAddress_94665446411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4710284;
     Object term4710384;

    public DecodeDetails_detailJumpAddress_94665446411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4710284 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4710284, term4710284.getClass(), "opcode", (short) -31938);
        setField(term4710284, term4710284.getClass(), "x", "jpgWRbSvyQ");
        setField(term4710284, term4710284.getClass(), "y", "tFMlYmPEBX");
        setField(term4710284, term4710284.getClass(), "nnn", "ljkZxGNgjZ");
        setField(term4710284, term4710284.getClass(), "nn", "hrFtgdcZKS");
        setField(term4710284, term4710284.getClass(), "n", "ZhZJvpPaTU");
        setField(term4710284, term4710284.getClass(), "iBefore", "NZwUsJxDLI");
        setField(term4710284, term4710284.getClass(), "i", "wlusYBOfXW");
        setField(term4710284, term4710284.getClass(), "pc", "HEWWLhfKIa");
        setBooleanField(term4710284, term4710284.getClass(), "state", false);
        setBooleanField(term4710284, term4710284.getClass(), "resolutionMode", false);
        term4710384 = new Short((short) -2982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = short.class;
        Object[] args = new Object[1];
        args[0] = term4710384;
        callMethod(klass, "detailJumpAddress", argTypes, term4710284, args);
    }

};


