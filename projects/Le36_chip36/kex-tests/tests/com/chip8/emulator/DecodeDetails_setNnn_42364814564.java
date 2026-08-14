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

public class DecodeDetails_setNnn_42364814564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4719852;

    public DecodeDetails_setNnn_42364814564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4719852 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4719852, term4719852.getClass(), "opcode", (short) -14049);
        setField(term4719852, term4719852.getClass(), "x", "ElTdyUVQYi");
        setField(term4719852, term4719852.getClass(), "y", "KkgJnxXxVl");
        setField(term4719852, term4719852.getClass(), "nnn", "TGnzPlGFMb");
        setField(term4719852, term4719852.getClass(), "nn", "yEvLMSpdHy");
        setField(term4719852, term4719852.getClass(), "n", "qdErlZeTVv");
        setField(term4719852, term4719852.getClass(), "iBefore", "OCCDQbndDE");
        setField(term4719852, term4719852.getClass(), "i", "NMANMKfctU");
        setField(term4719852, term4719852.getClass(), "pc", "mQsaqUltLU");
        setBooleanField(term4719852, term4719852.getClass(), "state", true);
        setBooleanField(term4719852, term4719852.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jwENwZiGlR";
        callMethod(klass, "setNnn", argTypes, term4719852, args);
    }

};


