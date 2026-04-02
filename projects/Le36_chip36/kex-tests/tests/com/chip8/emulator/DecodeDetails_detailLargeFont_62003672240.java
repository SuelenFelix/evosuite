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

public class DecodeDetails_detailLargeFont_62003672240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4715664;

    public DecodeDetails_detailLargeFont_62003672240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4715664 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4715664, term4715664.getClass(), "opcode", (short) -32536);
        setField(term4715664, term4715664.getClass(), "x", "moHYQFfLnp");
        setField(term4715664, term4715664.getClass(), "y", "BrPqlvIbEQ");
        setField(term4715664, term4715664.getClass(), "nnn", "JDTrhGRsDT");
        setField(term4715664, term4715664.getClass(), "nn", "vHxsVQImjS");
        setField(term4715664, term4715664.getClass(), "n", "jkVaRrZHQX");
        setField(term4715664, term4715664.getClass(), "iBefore", "gSFFUuJipG");
        setField(term4715664, term4715664.getClass(), "i", "bQWfIFvxkQ");
        setField(term4715664, term4715664.getClass(), "pc", "aDoBLXfFQI");
        setBooleanField(term4715664, term4715664.getClass(), "state", false);
        setBooleanField(term4715664, term4715664.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailLargeFont", argTypes, term4715664, args);
    }

};


