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

public class Simulator_createAndShowUi_3352922572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18668;

    public Simulator_createAndShowUi_3352922572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18668 = newInstance(Class.forName("com.loomcom.symon.Simulator"));
        setField(term18668, term18668.getClass(), "machine", null);
        setIntField(term18668, term18668.getClass(), "stepsSinceLastUpdate", 0);
        setIntField(term18668, term18668.getClass(), "stepsSinceLastCrtcRefresh", 0);
        setIntField(term18668, term18668.getClass(), "stepsPerClick", 0);
        setField(term18668, term18668.getClass(), "mainWindow", null);
        setField(term18668, term18668.getClass(), "traceLog", null);
        setField(term18668, term18668.getClass(), "memoryWindow", null);
        setField(term18668, term18668.getClass(), "videoWindow", null);
        setField(term18668, term18668.getClass(), "breakpointsWindow", null);
        setField(term18668, term18668.getClass(), "menuBar", null);
        setField(term18668, term18668.getClass(), "runLoop", null);
        setField(term18668, term18668.getClass(), "console", null);
        setField(term18668, term18668.getClass(), "statusPane", null);
        setField(term18668, term18668.getClass(), "runStopButton", null);
        setField(term18668, term18668.getClass(), "stepButton", null);
        setField(term18668, term18668.getClass(), "stepOverButton", null);
        setField(term18668, term18668.getClass(), "stepCountBox", null);
        setField(term18668, term18668.getClass(), "fileChooser", null);
        setField(term18668, term18668.getClass(), "preferences", null);
        setField(term18668, term18668.getClass(), "breakpoints", null);
        setField(term18668, term18668.getClass(), "commandMonitorObject", null);
        setField(term18668, term18668.getClass(), "command", null);
        setBooleanField(term18668, term18668.getClass(), "haltOnBreak", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createAndShowUi", argTypes, term18668, args);
    }

};


