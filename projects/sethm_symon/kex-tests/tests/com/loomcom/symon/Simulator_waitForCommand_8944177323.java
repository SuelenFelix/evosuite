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

public class Simulator_waitForCommand_8944177323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19400;

    public Simulator_waitForCommand_8944177323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19400 = newInstance(Class.forName("com.loomcom.symon.Simulator"));
        setField(term19400, term19400.getClass(), "machine", null);
        setIntField(term19400, term19400.getClass(), "stepsSinceLastUpdate", 0);
        setIntField(term19400, term19400.getClass(), "stepsSinceLastCrtcRefresh", 0);
        setIntField(term19400, term19400.getClass(), "stepsPerClick", 0);
        setField(term19400, term19400.getClass(), "mainWindow", null);
        setField(term19400, term19400.getClass(), "traceLog", null);
        setField(term19400, term19400.getClass(), "memoryWindow", null);
        setField(term19400, term19400.getClass(), "videoWindow", null);
        setField(term19400, term19400.getClass(), "breakpointsWindow", null);
        setField(term19400, term19400.getClass(), "menuBar", null);
        setField(term19400, term19400.getClass(), "runLoop", null);
        setField(term19400, term19400.getClass(), "console", null);
        setField(term19400, term19400.getClass(), "statusPane", null);
        setField(term19400, term19400.getClass(), "runStopButton", null);
        setField(term19400, term19400.getClass(), "stepButton", null);
        setField(term19400, term19400.getClass(), "stepOverButton", null);
        setField(term19400, term19400.getClass(), "stepCountBox", null);
        setField(term19400, term19400.getClass(), "fileChooser", null);
        setField(term19400, term19400.getClass(), "preferences", null);
        setField(term19400, term19400.getClass(), "breakpoints", null);
        setField(term19400, term19400.getClass(), "commandMonitorObject", null);
        setField(term19400, term19400.getClass(), "command", null);
        setBooleanField(term19400, term19400.getClass(), "haltOnBreak", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "waitForCommand", argTypes, term19400, args);
    }

};


