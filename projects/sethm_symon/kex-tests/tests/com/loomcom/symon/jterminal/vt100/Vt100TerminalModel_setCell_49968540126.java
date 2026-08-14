package com.loomcom.symon.jterminal.vt100;

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
import static com.loomcom.symon.jterminal.vt100.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Vt100TerminalModel_setCell_49968540126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1461;
     Object term1471;
     Object term1473;

    public Vt100TerminalModel_setCell_49968540126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1461 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        setField(term1461, term1461.getClass(), "listener", null);
        setField(term1461, term1461.getClass(), "parser", null);
        setField(term1461, term1461.getClass(), "bellStrategy", null);
        setField(term1461, term1461.getClass(), "cells", null);
        setIntField(term1461, term1461.getClass(), "columns", 0);
        setIntField(term1461, term1461.getClass(), "rows", 0);
        setIntField(term1461, term1461.getClass(), "bufferSize", 0);
        setIntField(term1461, term1461.getClass(), "cursorRow", 0);
        setIntField(term1461, term1461.getClass(), "cursorColumn", 0);
        setBooleanField(term1461, term1461.getClass(), "foregroundBold", false);
        setBooleanField(term1461, term1461.getClass(), "backgroundBold", false);
        setIntField(term1461, term1461.getClass(), "foregroundColor", 0);
        setIntField(term1461, term1461.getClass(), "backgroundColor", 0);
        term1471 = new Integer(0);
        term1473 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.loomcom.symon.jterminal.TerminalCell");
        Object[] args = new Object[3];
        args[0] = term1471;
        args[1] = term1473;
        args[2] = null;
        callMethod(klass, "setCell", argTypes, term1461, args);
    }

};


