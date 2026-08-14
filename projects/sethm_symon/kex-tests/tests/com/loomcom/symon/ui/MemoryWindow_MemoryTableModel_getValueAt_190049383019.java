package com.loomcom.symon.ui;

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
import static com.loomcom.symon.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class MemoryWindow_MemoryTableModel_getValueAt_190049383019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63327;
     Object term63329;
     Object term63331;

    public MemoryWindow_MemoryTableModel_getValueAt_190049383019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63327 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel"));
        setField(term63327, term63327.getClass(), "bus", null);
        setIntField(term63327, term63327.getClass(), "pageNumber", 0);
        setField(term63327, term63327.getClass(), "listenerList", null);
        term63329 = new Integer(0);
        term63331 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term63329;
        args[1] = term63331;
        callMethod(klass, "getValueAt", argTypes, term63327, args);
    }

};


