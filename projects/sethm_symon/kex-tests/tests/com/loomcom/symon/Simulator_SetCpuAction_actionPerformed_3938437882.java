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

public class Simulator_SetCpuAction_actionPerformed_3938437882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97301;

    public Simulator_SetCpuAction_actionPerformed_3938437882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97301 = newInstance(Class.forName("com.loomcom.symon.Simulator$SetCpuAction"));
        setField(term97301, term97301.getClass(), "behavior", null);
        setField(term97301, term97301.getClass(), "this$0", null);
        setBooleanField(term97301, term97301.getClass(), "enabled", false);
        setField(term97301, term97301.getClass(), "arrayTable", null);
        setField(term97301, term97301.getClass(), "changeSupport", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$SetCpuAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "actionPerformed", argTypes, term97301, args);
    }

};


