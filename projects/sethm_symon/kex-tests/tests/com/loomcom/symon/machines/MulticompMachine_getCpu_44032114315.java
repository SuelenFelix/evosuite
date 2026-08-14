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

public class MulticompMachine_getCpu_44032114315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6549;

    public MulticompMachine_getCpu_44032114315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6549 = newInstance(Class.forName("com.loomcom.symon.machines.MulticompMachine"));
        setField(term6549, term6549.getClass(), "bus", null);
        setField(term6549, term6549.getClass(), "cpu", null);
        setField(term6549, term6549.getClass(), "acia", null);
        setField(term6549, term6549.getClass(), "ram", null);
        setField(term6549, term6549.getClass(), "rom", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.machines.MulticompMachine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCpu", argTypes, term6549, args);
    }

};


