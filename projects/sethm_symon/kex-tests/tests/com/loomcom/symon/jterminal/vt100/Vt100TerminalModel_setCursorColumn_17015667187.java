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
import java.lang.Integer;

public class Vt100TerminalModel_setCursorColumn_17015667187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545;
     Object term606;

    public Vt100TerminalModel_setCursorColumn_17015667187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        Object term546 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        Object term549 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term550 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term551 = (byte[]) newByteArray(16);
        Object term570 = newInstance(Class.forName("com.loomcom.symon.jterminal.bell.NopBellStrategy"));
        Object[] term571 = (Object[]) newObjectArray(Array.newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"), 0).getClass(), 25);
        Object[] term572 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term573 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term574 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term575 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term576 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term577 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term578 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term579 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term580 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term581 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term582 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term583 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term584 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term585 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term586 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term587 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term588 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term589 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term590 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term591 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term592 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term593 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term594 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term595 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term596 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        setIntField(term546, term546.getClass(), "savedCursorRow", -1);
        setIntField(term546, term546.getClass(), "savedCursorColumn", -1);
        setField(term546, term546.getClass(), "this$0", term545);
        setField(term545, term545.getClass(), "listener", term546);
        setField(term550, term550.getClass(), "value", term551);
        setByteField(term550, term550.getClass(), "coder", (byte) 0);
        setIntField(term550, term550.getClass(), "count", 0);
        setField(term549, term549.getClass(), "buffer", term550);
        setField(term549, term549.getClass(), "listener", term546);
        setField(term545, term545.getClass(), "parser", term549);
        setField(term545, term545.getClass(), "bellStrategy", term570);
        setElement(term571, 0, term572);
        setElement(term571, 1, term573);
        setElement(term571, 2, term574);
        setElement(term571, 3, term575);
        setElement(term571, 4, term576);
        setElement(term571, 5, term577);
        setElement(term571, 6, term578);
        setElement(term571, 7, term579);
        setElement(term571, 8, term580);
        setElement(term571, 9, term581);
        setElement(term571, 10, term582);
        setElement(term571, 11, term583);
        setElement(term571, 12, term584);
        setElement(term571, 13, term585);
        setElement(term571, 14, term586);
        setElement(term571, 15, term587);
        setElement(term571, 16, term588);
        setElement(term571, 17, term589);
        setElement(term571, 18, term590);
        setElement(term571, 19, term591);
        setElement(term571, 20, term592);
        setElement(term571, 21, term593);
        setElement(term571, 22, term594);
        setElement(term571, 23, term595);
        setElement(term571, 24, term596);
        setField(term545, term545.getClass(), "cells", term571);
        setIntField(term545, term545.getClass(), "columns", 80);
        setIntField(term545, term545.getClass(), "rows", 25);
        setIntField(term545, term545.getClass(), "bufferSize", 25);
        setIntField(term545, term545.getClass(), "cursorRow", -1179120542);
        setIntField(term545, term545.getClass(), "cursorColumn", -73683645);
        setBooleanField(term545, term545.getClass(), "foregroundBold", true);
        setBooleanField(term545, term545.getClass(), "backgroundBold", true);
        setIntField(term545, term545.getClass(), "foregroundColor", 7);
        setIntField(term545, term545.getClass(), "backgroundColor", -226514366);
        term606 = new Integer(1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term606;
        callMethod(klass, "setCursorColumn", argTypes, term545, args);
    }

};


