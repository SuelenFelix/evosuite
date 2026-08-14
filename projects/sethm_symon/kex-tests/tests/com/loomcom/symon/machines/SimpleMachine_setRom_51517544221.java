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

public class SimpleMachine_setRom_51517544221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27757;

    public SimpleMachine_setRom_51517544221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27757 = newInstance(Class.forName("com.loomcom.symon.machines.SimpleMachine"));
        setField(term27757, term27757.getClass(), "bus", null);
        setField(term27757, term27757.getClass(), "ram", null);
        setField(term27757, term27757.getClass(), "cpu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.machines.SimpleMachine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.devices.Memory");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRom", argTypes, term27757, args);
    }

};


