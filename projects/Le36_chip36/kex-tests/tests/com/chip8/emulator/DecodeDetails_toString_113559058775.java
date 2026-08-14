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

public class DecodeDetails_toString_113559058775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4721970;

    public DecodeDetails_toString_113559058775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4721970 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4721970, term4721970.getClass(), "opcode", (short) 6043);
        setField(term4721970, term4721970.getClass(), "x", "aKwJiIZSjJ");
        setField(term4721970, term4721970.getClass(), "y", "lYbeaINKud");
        setField(term4721970, term4721970.getClass(), "nnn", "BrwuUkkatt");
        setField(term4721970, term4721970.getClass(), "nn", "NjmSJhbVEM");
        setField(term4721970, term4721970.getClass(), "n", "aftnGRjhKN");
        setField(term4721970, term4721970.getClass(), "iBefore", "TirWkyiCHh");
        setField(term4721970, term4721970.getClass(), "i", "lsQrIFMkgZ");
        setField(term4721970, term4721970.getClass(), "pc", "VgAyBhgBhq");
        setBooleanField(term4721970, term4721970.getClass(), "state", false);
        setBooleanField(term4721970, term4721970.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4721970, args);
    }

};


