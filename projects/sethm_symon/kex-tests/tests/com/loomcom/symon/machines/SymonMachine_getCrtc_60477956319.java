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

public class SymonMachine_getCrtc_60477956319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21890;

    public SymonMachine_getCrtc_60477956319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21890 = newInstance(Class.forName("com.loomcom.symon.machines.SymonMachine"));
        setField(term21890, term21890.getClass(), "bus", null);
        setField(term21890, term21890.getClass(), "cpu", null);
        setField(term21890, term21890.getClass(), "acia", null);
        setField(term21890, term21890.getClass(), "pia", null);
        setField(term21890, term21890.getClass(), "crtc", null);
        setField(term21890, term21890.getClass(), "ram", null);
        setField(term21890, term21890.getClass(), "rom", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.machines.SymonMachine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCrtc", argTypes, term21890, args);
    }

};


