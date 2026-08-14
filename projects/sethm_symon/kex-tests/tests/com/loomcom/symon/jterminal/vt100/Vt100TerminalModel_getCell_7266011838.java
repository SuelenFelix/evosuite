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

public class Vt100TerminalModel_getCell_7266011838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624;
     Object term685;
     Object term687;

    public Vt100TerminalModel_getCell_7266011838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term624 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        Object term625 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        Object term628 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term629 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term630 = (byte[]) newByteArray(16);
        Object term649 = newInstance(Class.forName("com.loomcom.symon.jterminal.bell.NopBellStrategy"));
        Object[] term650 = (Object[]) newObjectArray(Array.newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"), 0).getClass(), 25);
        Object[] term651 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term652 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term653 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term654 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term655 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term656 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term657 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term658 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term659 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term660 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term661 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term662 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term663 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term664 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term665 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term666 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term667 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term668 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term669 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term670 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term671 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term672 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term673 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term674 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term675 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        setIntField(term625, term625.getClass(), "savedCursorRow", -1);
        setIntField(term625, term625.getClass(), "savedCursorColumn", -1);
        setField(term625, term625.getClass(), "this$0", term624);
        setField(term624, term624.getClass(), "listener", term625);
        setField(term629, term629.getClass(), "value", term630);
        setByteField(term629, term629.getClass(), "coder", (byte) 0);
        setIntField(term629, term629.getClass(), "count", 0);
        setField(term628, term628.getClass(), "buffer", term629);
        setField(term628, term628.getClass(), "listener", term625);
        setField(term624, term624.getClass(), "parser", term628);
        setField(term624, term624.getClass(), "bellStrategy", term649);
        setElement(term650, 0, term651);
        setElement(term650, 1, term652);
        setElement(term650, 2, term653);
        setElement(term650, 3, term654);
        setElement(term650, 4, term655);
        setElement(term650, 5, term656);
        setElement(term650, 6, term657);
        setElement(term650, 7, term658);
        setElement(term650, 8, term659);
        setElement(term650, 9, term660);
        setElement(term650, 10, term661);
        setElement(term650, 11, term662);
        setElement(term650, 12, term663);
        setElement(term650, 13, term664);
        setElement(term650, 14, term665);
        setElement(term650, 15, term666);
        setElement(term650, 16, term667);
        setElement(term650, 17, term668);
        setElement(term650, 18, term669);
        setElement(term650, 19, term670);
        setElement(term650, 20, term671);
        setElement(term650, 21, term672);
        setElement(term650, 22, term673);
        setElement(term650, 23, term674);
        setElement(term650, 24, term675);
        setField(term624, term624.getClass(), "cells", term650);
        setIntField(term624, term624.getClass(), "columns", 80);
        setIntField(term624, term624.getClass(), "rows", 25);
        setIntField(term624, term624.getClass(), "bufferSize", 25);
        setIntField(term624, term624.getClass(), "cursorRow", -1530420153);
        setIntField(term624, term624.getClass(), "cursorColumn", -469968304);
        setBooleanField(term624, term624.getClass(), "foregroundBold", false);
        setBooleanField(term624, term624.getClass(), "backgroundBold", false);
        setIntField(term624, term624.getClass(), "foregroundColor", 7);
        setIntField(term624, term624.getClass(), "backgroundColor", -1145578966);
        term685 = new Integer(679763016);
        term687 = new Integer(1962444399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term685;
        args[1] = term687;
        callMethod(klass, "getCell", argTypes, term624, args);
    }

};


