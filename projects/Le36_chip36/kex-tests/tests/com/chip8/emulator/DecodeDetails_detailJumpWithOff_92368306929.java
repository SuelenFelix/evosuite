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

public class DecodeDetails_detailJumpWithOff_92368306929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4713684;

    public DecodeDetails_detailJumpWithOff_92368306929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4713684 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4713684, term4713684.getClass(), "opcode", (short) 11603);
        setField(term4713684, term4713684.getClass(), "x", "EGQLusEtRN");
        setField(term4713684, term4713684.getClass(), "y", "GwGUMPdvZq");
        setField(term4713684, term4713684.getClass(), "nnn", "iXRAYcFyfS");
        setField(term4713684, term4713684.getClass(), "nn", "lokyclbLEz");
        setField(term4713684, term4713684.getClass(), "n", "hAPmQGaxkI");
        setField(term4713684, term4713684.getClass(), "iBefore", "ojrnLnJZjT");
        setField(term4713684, term4713684.getClass(), "i", "rtvXSMjOdJ");
        setField(term4713684, term4713684.getClass(), "pc", "EDkfjuDpNv");
        setBooleanField(term4713684, term4713684.getClass(), "state", false);
        setBooleanField(term4713684, term4713684.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailJumpWithOff", argTypes, term4713684, args);
    }

};


