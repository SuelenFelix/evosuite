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

public class DecodeDetails_detailDrawDisplay_148745052231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4714044;

    public DecodeDetails_detailDrawDisplay_148745052231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4714044 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4714044, term4714044.getClass(), "opcode", (short) -31649);
        setField(term4714044, term4714044.getClass(), "x", "GmtlSgqKcI");
        setField(term4714044, term4714044.getClass(), "y", "ssSbvPoMjB");
        setField(term4714044, term4714044.getClass(), "nnn", "mhRVADhaKm");
        setField(term4714044, term4714044.getClass(), "nn", "rLldJrTAay");
        setField(term4714044, term4714044.getClass(), "n", "HvSKssbEES");
        setField(term4714044, term4714044.getClass(), "iBefore", "UjIAQAHhul");
        setField(term4714044, term4714044.getClass(), "i", "oWBXOvjPUT");
        setField(term4714044, term4714044.getClass(), "pc", "DcKqrrTdId");
        setBooleanField(term4714044, term4714044.getClass(), "state", false);
        setBooleanField(term4714044, term4714044.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailDrawDisplay", argTypes, term4714044, args);
    }

};


