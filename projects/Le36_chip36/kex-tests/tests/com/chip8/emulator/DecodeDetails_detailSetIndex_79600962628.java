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

public class DecodeDetails_detailSetIndex_79600962628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4713504;

    public DecodeDetails_detailSetIndex_79600962628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4713504 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4713504, term4713504.getClass(), "opcode", (short) -2591);
        setField(term4713504, term4713504.getClass(), "x", "OATNwRncsv");
        setField(term4713504, term4713504.getClass(), "y", "rACmzcmIPm");
        setField(term4713504, term4713504.getClass(), "nnn", "OCtePrLDhe");
        setField(term4713504, term4713504.getClass(), "nn", "yqEphNxUPZ");
        setField(term4713504, term4713504.getClass(), "n", "mJJxTuZuKO");
        setField(term4713504, term4713504.getClass(), "iBefore", "anSZCikKpS");
        setField(term4713504, term4713504.getClass(), "i", "zvMQGbTtsV");
        setField(term4713504, term4713504.getClass(), "pc", "DyUuIDzZPG");
        setBooleanField(term4713504, term4713504.getClass(), "state", false);
        setBooleanField(term4713504, term4713504.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailSetIndex", argTypes, term4713504, args);
    }

};


