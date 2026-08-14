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

public class DecodeDetails_detailRandom_160676026930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4713864;

    public DecodeDetails_detailRandom_160676026930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4713864 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4713864, term4713864.getClass(), "opcode", (short) 24083);
        setField(term4713864, term4713864.getClass(), "x", "LNHkTUfuHX");
        setField(term4713864, term4713864.getClass(), "y", "SVWcOAHiTp");
        setField(term4713864, term4713864.getClass(), "nnn", "oShLCaneoQ");
        setField(term4713864, term4713864.getClass(), "nn", "nwKkzNpzyC");
        setField(term4713864, term4713864.getClass(), "n", "CwrsdYnHpH");
        setField(term4713864, term4713864.getClass(), "iBefore", "jifjXNXluS");
        setField(term4713864, term4713864.getClass(), "i", "uDayZDXPOP");
        setField(term4713864, term4713864.getClass(), "pc", "kbjWxMAIhY");
        setBooleanField(term4713864, term4713864.getClass(), "state", true);
        setBooleanField(term4713864, term4713864.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailRandom", argTypes, term4713864, args);
    }

};


