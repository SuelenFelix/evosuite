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

public class Simulator_handleStop_15674349115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20546;

    public Simulator_handleStop_15674349115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20546 = newInstance(Class.forName("com.loomcom.symon.Simulator"));
        setField(term20546, term20546.getClass(), "machine", null);
        setIntField(term20546, term20546.getClass(), "stepsSinceLastUpdate", 0);
        setIntField(term20546, term20546.getClass(), "stepsSinceLastCrtcRefresh", 0);
        setIntField(term20546, term20546.getClass(), "stepsPerClick", 0);
        setField(term20546, term20546.getClass(), "mainWindow", null);
        setField(term20546, term20546.getClass(), "traceLog", null);
        setField(term20546, term20546.getClass(), "memoryWindow", null);
        setField(term20546, term20546.getClass(), "videoWindow", null);
        setField(term20546, term20546.getClass(), "breakpointsWindow", null);
        setField(term20546, term20546.getClass(), "menuBar", null);
        setField(term20546, term20546.getClass(), "runLoop", null);
        setField(term20546, term20546.getClass(), "console", null);
        setField(term20546, term20546.getClass(), "statusPane", null);
        setField(term20546, term20546.getClass(), "runStopButton", null);
        setField(term20546, term20546.getClass(), "stepButton", null);
        setField(term20546, term20546.getClass(), "stepOverButton", null);
        setField(term20546, term20546.getClass(), "stepCountBox", null);
        setField(term20546, term20546.getClass(), "fileChooser", null);
        setField(term20546, term20546.getClass(), "preferences", null);
        setField(term20546, term20546.getClass(), "breakpoints", null);
        setField(term20546, term20546.getClass(), "commandMonitorObject", null);
        setField(term20546, term20546.getClass(), "command", null);
        setBooleanField(term20546, term20546.getClass(), "haltOnBreak", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleStop", argTypes, term20546, args);
    }

};


