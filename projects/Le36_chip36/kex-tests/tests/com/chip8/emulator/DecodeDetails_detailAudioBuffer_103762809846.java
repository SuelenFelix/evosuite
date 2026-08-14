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

public class DecodeDetails_detailAudioBuffer_103762809846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4716746;

    public DecodeDetails_detailAudioBuffer_103762809846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4716746 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4716746, term4716746.getClass(), "opcode", (short) -29885);
        setField(term4716746, term4716746.getClass(), "x", "ziYEsRkZmD");
        setField(term4716746, term4716746.getClass(), "y", "RFbJNwiLtv");
        setField(term4716746, term4716746.getClass(), "nnn", "eCxWMOpomA");
        setField(term4716746, term4716746.getClass(), "nn", "pkQawlBtEF");
        setField(term4716746, term4716746.getClass(), "n", "rdKTcvHHnV");
        setField(term4716746, term4716746.getClass(), "iBefore", "ELfUfLbXZf");
        setField(term4716746, term4716746.getClass(), "i", "SAglaHkagn");
        setField(term4716746, term4716746.getClass(), "pc", "eZGxUfdoFn");
        setBooleanField(term4716746, term4716746.getClass(), "state", true);
        setBooleanField(term4716746, term4716746.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailAudioBuffer", argTypes, term4716746, args);
    }

};


