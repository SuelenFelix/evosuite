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

public class Vt100TerminalModel_setCursorColumn_170156671824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1435;
     Object term1445;

    public Vt100TerminalModel_setCursorColumn_170156671824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1435 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        setField(term1435, term1435.getClass(), "listener", null);
        setField(term1435, term1435.getClass(), "parser", null);
        setField(term1435, term1435.getClass(), "bellStrategy", null);
        setField(term1435, term1435.getClass(), "cells", null);
        setIntField(term1435, term1435.getClass(), "columns", 0);
        setIntField(term1435, term1435.getClass(), "rows", 0);
        setIntField(term1435, term1435.getClass(), "bufferSize", 0);
        setIntField(term1435, term1435.getClass(), "cursorRow", 0);
        setIntField(term1435, term1435.getClass(), "cursorColumn", 0);
        setBooleanField(term1435, term1435.getClass(), "foregroundBold", false);
        setBooleanField(term1435, term1435.getClass(), "backgroundBold", false);
        setIntField(term1435, term1435.getClass(), "foregroundColor", 0);
        setIntField(term1435, term1435.getClass(), "backgroundColor", 0);
        term1445 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1445;
        callMethod(klass, "setCursorColumn", argTypes, term1435, args);
    }

};


