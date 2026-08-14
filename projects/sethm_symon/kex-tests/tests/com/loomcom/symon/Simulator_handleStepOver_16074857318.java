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

public class Simulator_handleStepOver_16074857318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23170;

    public Simulator_handleStepOver_16074857318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23170 = newInstance(Class.forName("com.loomcom.symon.Simulator"));
        setField(term23170, term23170.getClass(), "machine", null);
        setIntField(term23170, term23170.getClass(), "stepsSinceLastUpdate", 0);
        setIntField(term23170, term23170.getClass(), "stepsSinceLastCrtcRefresh", 0);
        setIntField(term23170, term23170.getClass(), "stepsPerClick", 0);
        setField(term23170, term23170.getClass(), "mainWindow", null);
        setField(term23170, term23170.getClass(), "traceLog", null);
        setField(term23170, term23170.getClass(), "memoryWindow", null);
        setField(term23170, term23170.getClass(), "videoWindow", null);
        setField(term23170, term23170.getClass(), "breakpointsWindow", null);
        setField(term23170, term23170.getClass(), "menuBar", null);
        setField(term23170, term23170.getClass(), "runLoop", null);
        setField(term23170, term23170.getClass(), "console", null);
        setField(term23170, term23170.getClass(), "statusPane", null);
        setField(term23170, term23170.getClass(), "runStopButton", null);
        setField(term23170, term23170.getClass(), "stepButton", null);
        setField(term23170, term23170.getClass(), "stepOverButton", null);
        setField(term23170, term23170.getClass(), "stepCountBox", null);
        setField(term23170, term23170.getClass(), "fileChooser", null);
        setField(term23170, term23170.getClass(), "preferences", null);
        setField(term23170, term23170.getClass(), "breakpoints", null);
        setField(term23170, term23170.getClass(), "commandMonitorObject", null);
        setField(term23170, term23170.getClass(), "command", null);
        setBooleanField(term23170, term23170.getClass(), "haltOnBreak", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleStepOver", argTypes, term23170, args);
    }

};


