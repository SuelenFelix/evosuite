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

public class Vt100TerminalModel_print_39466133627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1475;

    public Vt100TerminalModel_print_39466133627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1475 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        setField(term1475, term1475.getClass(), "listener", null);
        setField(term1475, term1475.getClass(), "parser", null);
        setField(term1475, term1475.getClass(), "bellStrategy", null);
        setField(term1475, term1475.getClass(), "cells", null);
        setIntField(term1475, term1475.getClass(), "columns", 0);
        setIntField(term1475, term1475.getClass(), "rows", 0);
        setIntField(term1475, term1475.getClass(), "bufferSize", 0);
        setIntField(term1475, term1475.getClass(), "cursorRow", 0);
        setIntField(term1475, term1475.getClass(), "cursorColumn", 0);
        setBooleanField(term1475, term1475.getClass(), "foregroundBold", false);
        setBooleanField(term1475, term1475.getClass(), "backgroundBold", false);
        setIntField(term1475, term1475.getClass(), "foregroundColor", 0);
        setIntField(term1475, term1475.getClass(), "backgroundColor", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "print", argTypes, term1475, args);
    }

};


