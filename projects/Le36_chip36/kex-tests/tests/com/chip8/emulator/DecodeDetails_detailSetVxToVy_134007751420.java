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

public class DecodeDetails_detailSetVxToVy_134007751420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4711912;

    public DecodeDetails_detailSetVxToVy_134007751420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4711912 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4711912, term4711912.getClass(), "opcode", (short) -22391);
        setField(term4711912, term4711912.getClass(), "x", "PECfBejlfo");
        setField(term4711912, term4711912.getClass(), "y", "SDbDgydVpg");
        setField(term4711912, term4711912.getClass(), "nnn", "EEMaiNkiOH");
        setField(term4711912, term4711912.getClass(), "nn", "sFdmTylvqh");
        setField(term4711912, term4711912.getClass(), "n", "rgniLaOaiz");
        setField(term4711912, term4711912.getClass(), "iBefore", "fzQzzdIOMC");
        setField(term4711912, term4711912.getClass(), "i", "hLVDOhfCKX");
        setField(term4711912, term4711912.getClass(), "pc", "yXLTfzOgfX");
        setBooleanField(term4711912, term4711912.getClass(), "state", false);
        setBooleanField(term4711912, term4711912.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailSetVxToVy", argTypes, term4711912, args);
    }

};


