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
import java.lang.Boolean;

public class Simulator_handleReset_2362211186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21437;
     Object term21442;

    public Simulator_handleReset_2362211186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21437 = newInstance(Class.forName("com.loomcom.symon.Simulator"));
        setField(term21437, term21437.getClass(), "machine", null);
        setIntField(term21437, term21437.getClass(), "stepsSinceLastUpdate", 0);
        setIntField(term21437, term21437.getClass(), "stepsSinceLastCrtcRefresh", 0);
        setIntField(term21437, term21437.getClass(), "stepsPerClick", 0);
        setField(term21437, term21437.getClass(), "mainWindow", null);
        setField(term21437, term21437.getClass(), "traceLog", null);
        setField(term21437, term21437.getClass(), "memoryWindow", null);
        setField(term21437, term21437.getClass(), "videoWindow", null);
        setField(term21437, term21437.getClass(), "breakpointsWindow", null);
        setField(term21437, term21437.getClass(), "menuBar", null);
        setField(term21437, term21437.getClass(), "runLoop", null);
        setField(term21437, term21437.getClass(), "console", null);
        setField(term21437, term21437.getClass(), "statusPane", null);
        setField(term21437, term21437.getClass(), "runStopButton", null);
        setField(term21437, term21437.getClass(), "stepButton", null);
        setField(term21437, term21437.getClass(), "stepOverButton", null);
        setField(term21437, term21437.getClass(), "stepCountBox", null);
        setField(term21437, term21437.getClass(), "fileChooser", null);
        setField(term21437, term21437.getClass(), "preferences", null);
        setField(term21437, term21437.getClass(), "breakpoints", null);
        setField(term21437, term21437.getClass(), "commandMonitorObject", null);
        setField(term21437, term21437.getClass(), "command", null);
        setBooleanField(term21437, term21437.getClass(), "haltOnBreak", false);
        term21442 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term21442;
        callMethod(klass, "handleReset", argTypes, term21437, args);
    }

};


