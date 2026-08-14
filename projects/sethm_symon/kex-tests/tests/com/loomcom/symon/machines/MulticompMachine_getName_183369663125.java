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

public class MulticompMachine_getName_183369663125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6559;

    public MulticompMachine_getName_183369663125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6559 = newInstance(Class.forName("com.loomcom.symon.machines.MulticompMachine"));
        setField(term6559, term6559.getClass(), "bus", null);
        setField(term6559, term6559.getClass(), "cpu", null);
        setField(term6559, term6559.getClass(), "acia", null);
        setField(term6559, term6559.getClass(), "ram", null);
        setField(term6559, term6559.getClass(), "rom", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.machines.MulticompMachine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term6559, args);
    }

};


