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

public class Simulator_handleStep_15671389237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22330;
     Object term22335;

    public Simulator_handleStep_15671389237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22330 = newInstance(Class.forName("com.loomcom.symon.Simulator"));
        setField(term22330, term22330.getClass(), "machine", null);
        setIntField(term22330, term22330.getClass(), "stepsSinceLastUpdate", 0);
        setIntField(term22330, term22330.getClass(), "stepsSinceLastCrtcRefresh", 0);
        setIntField(term22330, term22330.getClass(), "stepsPerClick", 0);
        setField(term22330, term22330.getClass(), "mainWindow", null);
        setField(term22330, term22330.getClass(), "traceLog", null);
        setField(term22330, term22330.getClass(), "memoryWindow", null);
        setField(term22330, term22330.getClass(), "videoWindow", null);
        setField(term22330, term22330.getClass(), "breakpointsWindow", null);
        setField(term22330, term22330.getClass(), "menuBar", null);
        setField(term22330, term22330.getClass(), "runLoop", null);
        setField(term22330, term22330.getClass(), "console", null);
        setField(term22330, term22330.getClass(), "statusPane", null);
        setField(term22330, term22330.getClass(), "runStopButton", null);
        setField(term22330, term22330.getClass(), "stepButton", null);
        setField(term22330, term22330.getClass(), "stepOverButton", null);
        setField(term22330, term22330.getClass(), "stepCountBox", null);
        setField(term22330, term22330.getClass(), "fileChooser", null);
        setField(term22330, term22330.getClass(), "preferences", null);
        setField(term22330, term22330.getClass(), "breakpoints", null);
        setField(term22330, term22330.getClass(), "commandMonitorObject", null);
        setField(term22330, term22330.getClass(), "command", null);
        setBooleanField(term22330, term22330.getClass(), "haltOnBreak", false);
        term22335 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22335;
        callMethod(klass, "handleStep", argTypes, term22330, args);
    }

};


