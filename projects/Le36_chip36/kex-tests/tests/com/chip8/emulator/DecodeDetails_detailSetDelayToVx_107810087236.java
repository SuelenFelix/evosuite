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

public class DecodeDetails_detailSetDelayToVx_107810087236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4714944;

    public DecodeDetails_detailSetDelayToVx_107810087236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4714944 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4714944, term4714944.getClass(), "opcode", (short) -27650);
        setField(term4714944, term4714944.getClass(), "x", "BRMTHqqoRg");
        setField(term4714944, term4714944.getClass(), "y", "nOElYZBeyU");
        setField(term4714944, term4714944.getClass(), "nnn", "eUXPtGmoNg");
        setField(term4714944, term4714944.getClass(), "nn", "ZjqXyUmAJY");
        setField(term4714944, term4714944.getClass(), "n", "pjEERkBbYo");
        setField(term4714944, term4714944.getClass(), "iBefore", "FQPqmjhWog");
        setField(term4714944, term4714944.getClass(), "i", "sYtJsiIiSX");
        setField(term4714944, term4714944.getClass(), "pc", "KgfsAwTFFn");
        setBooleanField(term4714944, term4714944.getClass(), "state", false);
        setBooleanField(term4714944, term4714944.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailSetDelayToVx", argTypes, term4714944, args);
    }

};


