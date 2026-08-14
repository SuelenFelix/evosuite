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

public class DecodeDetails_detailSetVarReg_106011597718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4711550;

    public DecodeDetails_detailSetVarReg_106011597718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4711550 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4711550, term4711550.getClass(), "opcode", (short) 22697);
        setField(term4711550, term4711550.getClass(), "x", "qsjXSwKloH");
        setField(term4711550, term4711550.getClass(), "y", "DDZHUPglvb");
        setField(term4711550, term4711550.getClass(), "nnn", "rWoaXvNyVg");
        setField(term4711550, term4711550.getClass(), "nn", "FLzaBCFjGv");
        setField(term4711550, term4711550.getClass(), "n", "OLYhTSqTqJ");
        setField(term4711550, term4711550.getClass(), "iBefore", "AIHoadcpQz");
        setField(term4711550, term4711550.getClass(), "i", "fWMsLtuOEV");
        setField(term4711550, term4711550.getClass(), "pc", "fvgZQBalnd");
        setBooleanField(term4711550, term4711550.getClass(), "state", true);
        setBooleanField(term4711550, term4711550.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailSetVarReg", argTypes, term4711550, args);
    }

};


