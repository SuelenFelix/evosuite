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
import java.lang.Object;

public class Vt100TerminalModel_Vt100Listener_init_11042383740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Vt100TerminalModel_Vt100Listener_init_11042383740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        Object term2 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        Object term5 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term6 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7 = (byte[]) newByteArray(16);
        Object term26 = newInstance(Class.forName("com.loomcom.symon.jterminal.bell.NopBellStrategy"));
        Object[] term27 = (Object[]) newObjectArray(Array.newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"), 0).getClass(), 25);
        Object[] term28 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term29 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term30 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term31 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term32 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term33 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term34 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term35 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term36 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term37 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term38 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term39 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term40 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term41 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term42 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term43 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term44 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term45 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term46 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term47 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term48 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term49 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term50 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term51 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term52 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        setIntField(term2, term2.getClass(), "savedCursorRow", -1);
        setIntField(term2, term2.getClass(), "savedCursorColumn", -1);
        setField(term2, term2.getClass(), "this$0", term1);
        setField(term1, term1.getClass(), "listener", term2);
        setField(term6, term6.getClass(), "value", term7);
        setByteField(term6, term6.getClass(), "coder", (byte) 0);
        setIntField(term6, term6.getClass(), "count", 0);
        setField(term5, term5.getClass(), "buffer", term6);
        setField(term5, term5.getClass(), "listener", term2);
        setField(term1, term1.getClass(), "parser", term5);
        setField(term1, term1.getClass(), "bellStrategy", term26);
        setElement(term27, 0, term28);
        setElement(term27, 1, term29);
        setElement(term27, 2, term30);
        setElement(term27, 3, term31);
        setElement(term27, 4, term32);
        setElement(term27, 5, term33);
        setElement(term27, 6, term34);
        setElement(term27, 7, term35);
        setElement(term27, 8, term36);
        setElement(term27, 9, term37);
        setElement(term27, 10, term38);
        setElement(term27, 11, term39);
        setElement(term27, 12, term40);
        setElement(term27, 13, term41);
        setElement(term27, 14, term42);
        setElement(term27, 15, term43);
        setElement(term27, 16, term44);
        setElement(term27, 17, term45);
        setElement(term27, 18, term46);
        setElement(term27, 19, term47);
        setElement(term27, 20, term48);
        setElement(term27, 21, term49);
        setElement(term27, 22, term50);
        setElement(term27, 23, term51);
        setElement(term27, 24, term52);
        setField(term1, term1.getClass(), "cells", term27);
        setIntField(term1, term1.getClass(), "columns", 80);
        setIntField(term1, term1.getClass(), "rows", 25);
        setIntField(term1, term1.getClass(), "bufferSize", 25);
        setIntField(term1, term1.getClass(), "cursorRow", 1162663216);
        setIntField(term1, term1.getClass(), "cursorColumn", 1484323161);
        setBooleanField(term1, term1.getClass(), "foregroundBold", false);
        setBooleanField(term1, term1.getClass(), "backgroundBold", false);
        setIntField(term1, term1.getClass(), "foregroundColor", 7);
        setIntField(term1, term1.getClass(), "backgroundColor", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


