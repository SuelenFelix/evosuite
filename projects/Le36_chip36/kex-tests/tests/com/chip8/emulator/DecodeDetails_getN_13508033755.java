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

public class DecodeDetails_getN_13508033755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4718186;

    public DecodeDetails_getN_13508033755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4718186 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4718186, term4718186.getClass(), "opcode", (short) 13229);
        setField(term4718186, term4718186.getClass(), "x", "vLrTnQTIPg");
        setField(term4718186, term4718186.getClass(), "y", "GsXvLZCFtf");
        setField(term4718186, term4718186.getClass(), "nnn", "JqSCTBGSUs");
        setField(term4718186, term4718186.getClass(), "nn", "bZrrPiMnsr");
        setField(term4718186, term4718186.getClass(), "n", "IeromvfDmz");
        setField(term4718186, term4718186.getClass(), "iBefore", "xJLHPTRSqe");
        setField(term4718186, term4718186.getClass(), "i", "OIFZYdbUZz");
        setField(term4718186, term4718186.getClass(), "pc", "FPablxseTr");
        setBooleanField(term4718186, term4718186.getClass(), "state", true);
        setBooleanField(term4718186, term4718186.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getN", argTypes, term4718186, args);
    }

};


