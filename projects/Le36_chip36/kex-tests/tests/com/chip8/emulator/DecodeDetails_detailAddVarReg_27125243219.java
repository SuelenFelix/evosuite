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

public class DecodeDetails_detailAddVarReg_27125243219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4711730;
     Object term4711830;

    public DecodeDetails_detailAddVarReg_27125243219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4711730 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4711730, term4711730.getClass(), "opcode", (short) 10604);
        setField(term4711730, term4711730.getClass(), "x", "tViQSKUCLE");
        setField(term4711730, term4711730.getClass(), "y", "QbaeHheqiP");
        setField(term4711730, term4711730.getClass(), "nnn", "gASHxChKwn");
        setField(term4711730, term4711730.getClass(), "nn", "iasolXlEEn");
        setField(term4711730, term4711730.getClass(), "n", "cAObIvLmLo");
        setField(term4711730, term4711730.getClass(), "iBefore", "xwiCqRSWSe");
        setField(term4711730, term4711730.getClass(), "i", "IbUFkzIgzq");
        setField(term4711730, term4711730.getClass(), "pc", "dTOUSTDdbw");
        setBooleanField(term4711730, term4711730.getClass(), "state", false);
        setBooleanField(term4711730, term4711730.getClass(), "resolutionMode", false);
        term4711830 = new Byte((byte) -67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = term4711830;
        callMethod(klass, "detailAddVarReg", argTypes, term4711730, args);
    }

};


