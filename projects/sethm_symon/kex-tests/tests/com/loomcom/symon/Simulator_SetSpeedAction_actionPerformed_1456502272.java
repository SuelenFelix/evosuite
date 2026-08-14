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

public class Simulator_SetSpeedAction_actionPerformed_1456502272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73565;

    public Simulator_SetSpeedAction_actionPerformed_1456502272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73565 = newInstance(Class.forName("com.loomcom.symon.Simulator$SetSpeedAction"));
        setIntField(term73565, term73565.getClass(), "speed", 0);
        setField(term73565, term73565.getClass(), "this$0", null);
        setBooleanField(term73565, term73565.getClass(), "enabled", false);
        setField(term73565, term73565.getClass(), "arrayTable", null);
        setField(term73565, term73565.getClass(), "changeSupport", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$SetSpeedAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "actionPerformed", argTypes, term73565, args);
    }

};


