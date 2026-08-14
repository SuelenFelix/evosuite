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

public class Simulator_updateVisibleState_109727193912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25784;

    public Simulator_updateVisibleState_109727193912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25784 = newInstance(Class.forName("com.loomcom.symon.Simulator"));
        setField(term25784, term25784.getClass(), "machine", null);
        setIntField(term25784, term25784.getClass(), "stepsSinceLastUpdate", 0);
        setIntField(term25784, term25784.getClass(), "stepsSinceLastCrtcRefresh", 0);
        setIntField(term25784, term25784.getClass(), "stepsPerClick", 0);
        setField(term25784, term25784.getClass(), "mainWindow", null);
        setField(term25784, term25784.getClass(), "traceLog", null);
        setField(term25784, term25784.getClass(), "memoryWindow", null);
        setField(term25784, term25784.getClass(), "videoWindow", null);
        setField(term25784, term25784.getClass(), "breakpointsWindow", null);
        setField(term25784, term25784.getClass(), "menuBar", null);
        setField(term25784, term25784.getClass(), "runLoop", null);
        setField(term25784, term25784.getClass(), "console", null);
        setField(term25784, term25784.getClass(), "statusPane", null);
        setField(term25784, term25784.getClass(), "runStopButton", null);
        setField(term25784, term25784.getClass(), "stepButton", null);
        setField(term25784, term25784.getClass(), "stepOverButton", null);
        setField(term25784, term25784.getClass(), "stepCountBox", null);
        setField(term25784, term25784.getClass(), "fileChooser", null);
        setField(term25784, term25784.getClass(), "preferences", null);
        setField(term25784, term25784.getClass(), "breakpoints", null);
        setField(term25784, term25784.getClass(), "commandMonitorObject", null);
        setField(term25784, term25784.getClass(), "command", null);
        setBooleanField(term25784, term25784.getClass(), "haltOnBreak", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateVisibleState", argTypes, term25784, args);
    }

};


