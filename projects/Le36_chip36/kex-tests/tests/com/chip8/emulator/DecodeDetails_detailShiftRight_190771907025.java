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
import java.lang.Byte;

public class DecodeDetails_detailShiftRight_190771907025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4712960;
     Object term4713060;

    public DecodeDetails_detailShiftRight_190771907025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4712960 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4712960, term4712960.getClass(), "opcode", (short) 893);
        setField(term4712960, term4712960.getClass(), "x", "JqbKrmVEMy");
        setField(term4712960, term4712960.getClass(), "y", "VygCEWaefB");
        setField(term4712960, term4712960.getClass(), "nnn", "PqhYfEyDDA");
        setField(term4712960, term4712960.getClass(), "nn", "fSLHLeuNoa");
        setField(term4712960, term4712960.getClass(), "n", "IwgPFurObw");
        setField(term4712960, term4712960.getClass(), "iBefore", "WLaHlrYQyz");
        setField(term4712960, term4712960.getClass(), "i", "CaeIUTuUFo");
        setField(term4712960, term4712960.getClass(), "pc", "rzoDGjHkzG");
        setBooleanField(term4712960, term4712960.getClass(), "state", false);
        setBooleanField(term4712960, term4712960.getClass(), "resolutionMode", true);
        term4713060 = new Byte((byte) 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = term4713060;
        callMethod(klass, "detailShiftRight", argTypes, term4712960, args);
    }

};


