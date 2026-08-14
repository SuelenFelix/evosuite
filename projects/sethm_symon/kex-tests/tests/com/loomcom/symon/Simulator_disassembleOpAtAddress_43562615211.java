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

public class Simulator_disassembleOpAtAddress_43562615211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25209;
     Object term25214;

    public Simulator_disassembleOpAtAddress_43562615211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25209 = newInstance(Class.forName("com.loomcom.symon.Simulator"));
        setField(term25209, term25209.getClass(), "machine", null);
        setIntField(term25209, term25209.getClass(), "stepsSinceLastUpdate", 0);
        setIntField(term25209, term25209.getClass(), "stepsSinceLastCrtcRefresh", 0);
        setIntField(term25209, term25209.getClass(), "stepsPerClick", 0);
        setField(term25209, term25209.getClass(), "mainWindow", null);
        setField(term25209, term25209.getClass(), "traceLog", null);
        setField(term25209, term25209.getClass(), "memoryWindow", null);
        setField(term25209, term25209.getClass(), "videoWindow", null);
        setField(term25209, term25209.getClass(), "breakpointsWindow", null);
        setField(term25209, term25209.getClass(), "menuBar", null);
        setField(term25209, term25209.getClass(), "runLoop", null);
        setField(term25209, term25209.getClass(), "console", null);
        setField(term25209, term25209.getClass(), "statusPane", null);
        setField(term25209, term25209.getClass(), "runStopButton", null);
        setField(term25209, term25209.getClass(), "stepButton", null);
        setField(term25209, term25209.getClass(), "stepOverButton", null);
        setField(term25209, term25209.getClass(), "stepCountBox", null);
        setField(term25209, term25209.getClass(), "fileChooser", null);
        setField(term25209, term25209.getClass(), "preferences", null);
        setField(term25209, term25209.getClass(), "breakpoints", null);
        setField(term25209, term25209.getClass(), "commandMonitorObject", null);
        setField(term25209, term25209.getClass(), "command", null);
        setBooleanField(term25209, term25209.getClass(), "haltOnBreak", false);
        term25214 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25214;
        callMethod(klass, "disassembleOpAtAddress", argTypes, term25209, args);
    }

};


