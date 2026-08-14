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

public class Simulator_step_19641468499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23690;

    public Simulator_step_19641468499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23690 = newInstance(Class.forName("com.loomcom.symon.Simulator"));
        setField(term23690, term23690.getClass(), "machine", null);
        setIntField(term23690, term23690.getClass(), "stepsSinceLastUpdate", 0);
        setIntField(term23690, term23690.getClass(), "stepsSinceLastCrtcRefresh", 0);
        setIntField(term23690, term23690.getClass(), "stepsPerClick", 0);
        setField(term23690, term23690.getClass(), "mainWindow", null);
        setField(term23690, term23690.getClass(), "traceLog", null);
        setField(term23690, term23690.getClass(), "memoryWindow", null);
        setField(term23690, term23690.getClass(), "videoWindow", null);
        setField(term23690, term23690.getClass(), "breakpointsWindow", null);
        setField(term23690, term23690.getClass(), "menuBar", null);
        setField(term23690, term23690.getClass(), "runLoop", null);
        setField(term23690, term23690.getClass(), "console", null);
        setField(term23690, term23690.getClass(), "statusPane", null);
        setField(term23690, term23690.getClass(), "runStopButton", null);
        setField(term23690, term23690.getClass(), "stepButton", null);
        setField(term23690, term23690.getClass(), "stepOverButton", null);
        setField(term23690, term23690.getClass(), "stepCountBox", null);
        setField(term23690, term23690.getClass(), "fileChooser", null);
        setField(term23690, term23690.getClass(), "preferences", null);
        setField(term23690, term23690.getClass(), "breakpoints", null);
        setField(term23690, term23690.getClass(), "commandMonitorObject", null);
        setField(term23690, term23690.getClass(), "command", null);
        setBooleanField(term23690, term23690.getClass(), "haltOnBreak", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "step", argTypes, term23690, args);
    }

};


