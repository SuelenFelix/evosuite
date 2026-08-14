package com.loomcom.symon.machines;

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
import static com.loomcom.symon.machines.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SymonMachine_getMemorySize_122885788124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21895;

    public SymonMachine_getMemorySize_122885788124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21895 = newInstance(Class.forName("com.loomcom.symon.machines.SymonMachine"));
        setField(term21895, term21895.getClass(), "bus", null);
        setField(term21895, term21895.getClass(), "cpu", null);
        setField(term21895, term21895.getClass(), "acia", null);
        setField(term21895, term21895.getClass(), "pia", null);
        setField(term21895, term21895.getClass(), "crtc", null);
        setField(term21895, term21895.getClass(), "ram", null);
        setField(term21895, term21895.getClass(), "rom", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.machines.SymonMachine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemorySize", argTypes, term21895, args);
    }

};


