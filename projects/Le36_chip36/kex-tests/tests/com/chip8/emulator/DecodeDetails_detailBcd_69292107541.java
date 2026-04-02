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

public class DecodeDetails_detailBcd_69292107541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4715844;
     Object term4715944;

    public DecodeDetails_detailBcd_69292107541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4715844 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4715844, term4715844.getClass(), "opcode", (short) 30208);
        setField(term4715844, term4715844.getClass(), "x", "HTimNhSNVi");
        setField(term4715844, term4715844.getClass(), "y", "IWJWbrHcqm");
        setField(term4715844, term4715844.getClass(), "nnn", "ucTcadpUdW");
        setField(term4715844, term4715844.getClass(), "nn", "AscVKZhCwm");
        setField(term4715844, term4715844.getClass(), "n", "HCvSsQWjLn");
        setField(term4715844, term4715844.getClass(), "iBefore", "FTuOcSieav");
        setField(term4715844, term4715844.getClass(), "i", "qSnwPXRuzC");
        setField(term4715844, term4715844.getClass(), "pc", "gqhqalMaKC");
        setBooleanField(term4715844, term4715844.getClass(), "state", true);
        setBooleanField(term4715844, term4715844.getClass(), "resolutionMode", true);
        term4715944 = new Integer(808203320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4715944;
        callMethod(klass, "detailBcd", argTypes, term4715844, args);
    }

};


