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

public class Vt100TerminalModel_getCell_72660118325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1447;
     Object term1457;
     Object term1459;

    public Vt100TerminalModel_getCell_72660118325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1447 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        setField(term1447, term1447.getClass(), "listener", null);
        setField(term1447, term1447.getClass(), "parser", null);
        setField(term1447, term1447.getClass(), "bellStrategy", null);
        setField(term1447, term1447.getClass(), "cells", null);
        setIntField(term1447, term1447.getClass(), "columns", 0);
        setIntField(term1447, term1447.getClass(), "rows", 0);
        setIntField(term1447, term1447.getClass(), "bufferSize", 0);
        setIntField(term1447, term1447.getClass(), "cursorRow", 0);
        setIntField(term1447, term1447.getClass(), "cursorColumn", 0);
        setBooleanField(term1447, term1447.getClass(), "foregroundBold", false);
        setBooleanField(term1447, term1447.getClass(), "backgroundBold", false);
        setIntField(term1447, term1447.getClass(), "foregroundColor", 0);
        setIntField(term1447, term1447.getClass(), "backgroundColor", 0);
        term1457 = new Integer(0);
        term1459 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1457;
        args[1] = term1459;
        callMethod(klass, "getCell", argTypes, term1447, args);
    }

};


