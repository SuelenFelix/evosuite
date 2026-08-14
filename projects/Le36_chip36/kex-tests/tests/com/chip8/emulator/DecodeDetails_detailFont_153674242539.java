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

public class DecodeDetails_detailFont_153674242539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4715484;

    public DecodeDetails_detailFont_153674242539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4715484 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4715484, term4715484.getClass(), "opcode", (short) 7018);
        setField(term4715484, term4715484.getClass(), "x", "XosDTAzIAT");
        setField(term4715484, term4715484.getClass(), "y", "lcCEhCpiZM");
        setField(term4715484, term4715484.getClass(), "nnn", "OPJlqMJxdq");
        setField(term4715484, term4715484.getClass(), "nn", "COhzwXcfds");
        setField(term4715484, term4715484.getClass(), "n", "anncJTnzrg");
        setField(term4715484, term4715484.getClass(), "iBefore", "GMylOocLnB");
        setField(term4715484, term4715484.getClass(), "i", "spOehuHwSl");
        setField(term4715484, term4715484.getClass(), "pc", "cyobgydTWP");
        setBooleanField(term4715484, term4715484.getClass(), "state", true);
        setBooleanField(term4715484, term4715484.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailFont", argTypes, term4715484, args);
    }

};


