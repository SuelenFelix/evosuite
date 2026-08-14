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
import java.lang.Integer;

public class Simulator_loadProgram_126480429310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24316;
     Object term24321;

    public Simulator_loadProgram_126480429310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24316 = newInstance(Class.forName("com.loomcom.symon.Simulator"));
        setField(term24316, term24316.getClass(), "machine", null);
        setIntField(term24316, term24316.getClass(), "stepsSinceLastUpdate", 0);
        setIntField(term24316, term24316.getClass(), "stepsSinceLastCrtcRefresh", 0);
        setIntField(term24316, term24316.getClass(), "stepsPerClick", 0);
        setField(term24316, term24316.getClass(), "mainWindow", null);
        setField(term24316, term24316.getClass(), "traceLog", null);
        setField(term24316, term24316.getClass(), "memoryWindow", null);
        setField(term24316, term24316.getClass(), "videoWindow", null);
        setField(term24316, term24316.getClass(), "breakpointsWindow", null);
        setField(term24316, term24316.getClass(), "menuBar", null);
        setField(term24316, term24316.getClass(), "runLoop", null);
        setField(term24316, term24316.getClass(), "console", null);
        setField(term24316, term24316.getClass(), "statusPane", null);
        setField(term24316, term24316.getClass(), "runStopButton", null);
        setField(term24316, term24316.getClass(), "stepButton", null);
        setField(term24316, term24316.getClass(), "stepOverButton", null);
        setField(term24316, term24316.getClass(), "stepCountBox", null);
        setField(term24316, term24316.getClass(), "fileChooser", null);
        setField(term24316, term24316.getClass(), "preferences", null);
        setField(term24316, term24316.getClass(), "breakpoints", null);
        setField(term24316, term24316.getClass(), "commandMonitorObject", null);
        setField(term24316, term24316.getClass(), "command", null);
        setBooleanField(term24316, term24316.getClass(), "haltOnBreak", false);
        term24321 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term24321;
        callMethod(klass, "loadProgram", argTypes, term24316, args);
    }

};


