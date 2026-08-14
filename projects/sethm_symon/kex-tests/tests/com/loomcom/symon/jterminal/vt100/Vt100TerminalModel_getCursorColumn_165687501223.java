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

public class Vt100TerminalModel_getCursorColumn_165687501223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1425;

    public Vt100TerminalModel_getCursorColumn_165687501223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1425 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        setField(term1425, term1425.getClass(), "listener", null);
        setField(term1425, term1425.getClass(), "parser", null);
        setField(term1425, term1425.getClass(), "bellStrategy", null);
        setField(term1425, term1425.getClass(), "cells", null);
        setIntField(term1425, term1425.getClass(), "columns", 0);
        setIntField(term1425, term1425.getClass(), "rows", 0);
        setIntField(term1425, term1425.getClass(), "bufferSize", 0);
        setIntField(term1425, term1425.getClass(), "cursorRow", 0);
        setIntField(term1425, term1425.getClass(), "cursorColumn", 0);
        setBooleanField(term1425, term1425.getClass(), "foregroundBold", false);
        setBooleanField(term1425, term1425.getClass(), "backgroundBold", false);
        setIntField(term1425, term1425.getClass(), "foregroundColor", 0);
        setIntField(term1425, term1425.getClass(), "backgroundColor", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCursorColumn", argTypes, term1425, args);
    }

};


