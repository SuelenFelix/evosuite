package com.loomcom.symon;

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
import static com.loomcom.symon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Simulator_SimulatorMenu_4_windowClosing_2141438501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79147;

    public Simulator_SimulatorMenu_4_windowClosing_2141438501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79147 = newInstance(Class.forName("com.loomcom.symon.Simulator$SimulatorMenu$4"));
        setField(term79147, term79147.getClass(), "val$showBreakpoints", null);
        setField(term79147, term79147.getClass(), "this$1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$SimulatorMenu$4");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.WindowEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "windowClosing", argTypes, term79147, args);
    }

};


