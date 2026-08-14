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

public class Vt100TerminalModel_getDefaultBackgroundColor_190543368732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1525;

    public Vt100TerminalModel_getDefaultBackgroundColor_190543368732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1525 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        setField(term1525, term1525.getClass(), "listener", null);
        setField(term1525, term1525.getClass(), "parser", null);
        setField(term1525, term1525.getClass(), "bellStrategy", null);
        setField(term1525, term1525.getClass(), "cells", null);
        setIntField(term1525, term1525.getClass(), "columns", 0);
        setIntField(term1525, term1525.getClass(), "rows", 0);
        setIntField(term1525, term1525.getClass(), "bufferSize", 0);
        setIntField(term1525, term1525.getClass(), "cursorRow", 0);
        setIntField(term1525, term1525.getClass(), "cursorColumn", 0);
        setBooleanField(term1525, term1525.getClass(), "foregroundBold", false);
        setBooleanField(term1525, term1525.getClass(), "backgroundBold", false);
        setIntField(term1525, term1525.getClass(), "foregroundColor", 0);
        setIntField(term1525, term1525.getClass(), "backgroundColor", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultBackgroundColor", argTypes, term1525, args);
    }

};


