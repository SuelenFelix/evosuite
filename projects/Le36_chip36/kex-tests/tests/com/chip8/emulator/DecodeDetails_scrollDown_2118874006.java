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

public class DecodeDetails_scrollDown_2118874006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4709380;

    public DecodeDetails_scrollDown_2118874006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4709380 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4709380, term4709380.getClass(), "opcode", (short) -26087);
        setField(term4709380, term4709380.getClass(), "x", "wboNBMhRjP");
        setField(term4709380, term4709380.getClass(), "y", "HZODpafOGe");
        setField(term4709380, term4709380.getClass(), "nnn", "dUTYEKtTfQ");
        setField(term4709380, term4709380.getClass(), "nn", "HUtbHklGel");
        setField(term4709380, term4709380.getClass(), "n", "QbfKDAwhSB");
        setField(term4709380, term4709380.getClass(), "iBefore", "ckTRHEIcCK");
        setField(term4709380, term4709380.getClass(), "i", "NYSBqIpNlD");
        setField(term4709380, term4709380.getClass(), "pc", "OWglDUWQYb");
        setBooleanField(term4709380, term4709380.getClass(), "state", false);
        setBooleanField(term4709380, term4709380.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "scrollDown", argTypes, term4709380, args);
    }

};


