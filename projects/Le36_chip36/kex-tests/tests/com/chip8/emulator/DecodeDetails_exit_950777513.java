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

public class DecodeDetails_exit_950777513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4708840;

    public DecodeDetails_exit_950777513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4708840 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4708840, term4708840.getClass(), "opcode", (short) 13218);
        setField(term4708840, term4708840.getClass(), "x", "MFIdGVLoDo");
        setField(term4708840, term4708840.getClass(), "y", "kbxgTcnXyU");
        setField(term4708840, term4708840.getClass(), "nnn", "lnJvDbbuwo");
        setField(term4708840, term4708840.getClass(), "nn", "KExnWkKGvF");
        setField(term4708840, term4708840.getClass(), "n", "luGUNfvmKk");
        setField(term4708840, term4708840.getClass(), "iBefore", "oOUHomyJff");
        setField(term4708840, term4708840.getClass(), "i", "KnnoLMOuur");
        setField(term4708840, term4708840.getClass(), "pc", "buRpVghIvt");
        setBooleanField(term4708840, term4708840.getClass(), "state", false);
        setBooleanField(term4708840, term4708840.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "exit", argTypes, term4708840, args);
    }

};


