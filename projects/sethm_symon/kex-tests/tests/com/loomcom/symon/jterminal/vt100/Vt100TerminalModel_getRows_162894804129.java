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

public class Vt100TerminalModel_getRows_162894804129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1495;

    public Vt100TerminalModel_getRows_162894804129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1495 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        setField(term1495, term1495.getClass(), "listener", null);
        setField(term1495, term1495.getClass(), "parser", null);
        setField(term1495, term1495.getClass(), "bellStrategy", null);
        setField(term1495, term1495.getClass(), "cells", null);
        setIntField(term1495, term1495.getClass(), "columns", 0);
        setIntField(term1495, term1495.getClass(), "rows", 0);
        setIntField(term1495, term1495.getClass(), "bufferSize", 0);
        setIntField(term1495, term1495.getClass(), "cursorRow", 0);
        setIntField(term1495, term1495.getClass(), "cursorColumn", 0);
        setBooleanField(term1495, term1495.getClass(), "foregroundBold", false);
        setBooleanField(term1495, term1495.getClass(), "backgroundBold", false);
        setIntField(term1495, term1495.getClass(), "foregroundColor", 0);
        setIntField(term1495, term1495.getClass(), "backgroundColor", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRows", argTypes, term1495, args);
    }

};


