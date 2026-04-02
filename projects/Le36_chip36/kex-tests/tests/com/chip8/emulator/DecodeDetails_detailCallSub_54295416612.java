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
import java.lang.Integer;

public class DecodeDetails_detailCallSub_54295416612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4710466;
     Object term4710566;
     Object term4710568;

    public DecodeDetails_detailCallSub_54295416612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4710466 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4710466, term4710466.getClass(), "opcode", (short) -23848);
        setField(term4710466, term4710466.getClass(), "x", "mJJkYzNPob");
        setField(term4710466, term4710466.getClass(), "y", "mRDwekkZQg");
        setField(term4710466, term4710466.getClass(), "nnn", "RIGChgqpTI");
        setField(term4710466, term4710466.getClass(), "nn", "YCrgXnhgoK");
        setField(term4710466, term4710466.getClass(), "n", "nQodIeQekM");
        setField(term4710466, term4710466.getClass(), "iBefore", "YXORpHCDcd");
        setField(term4710466, term4710466.getClass(), "i", "XzZbAcRADD");
        setField(term4710466, term4710466.getClass(), "pc", "UqSNWSoTRy");
        setBooleanField(term4710466, term4710466.getClass(), "state", true);
        setBooleanField(term4710466, term4710466.getClass(), "resolutionMode", true);
        term4710566 = new Integer(301401782);
        term4710568 = new Integer(1988605357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4710566;
        args[1] = term4710568;
        callMethod(klass, "detailCallSub", argTypes, term4710466, args);
    }

};


