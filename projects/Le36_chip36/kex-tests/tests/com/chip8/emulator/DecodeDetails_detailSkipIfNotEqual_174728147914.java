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

public class DecodeDetails_detailSkipIfNotEqual_174728147914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4710830;

    public DecodeDetails_detailSkipIfNotEqual_174728147914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4710830 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4710830, term4710830.getClass(), "opcode", (short) 17818);
        setField(term4710830, term4710830.getClass(), "x", "gDGZwlpOZx");
        setField(term4710830, term4710830.getClass(), "y", "gkDpxkHPDg");
        setField(term4710830, term4710830.getClass(), "nnn", "pADwkrWiMW");
        setField(term4710830, term4710830.getClass(), "nn", "FDORDJuAXQ");
        setField(term4710830, term4710830.getClass(), "n", "yjqoDeLBLg");
        setField(term4710830, term4710830.getClass(), "iBefore", "DCepDqVwas");
        setField(term4710830, term4710830.getClass(), "i", "wKIBUlfNCx");
        setField(term4710830, term4710830.getClass(), "pc", "iGfMUWRvod");
        setBooleanField(term4710830, term4710830.getClass(), "state", true);
        setBooleanField(term4710830, term4710830.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailSkipIfNotEqual", argTypes, term4710830, args);
    }

};


