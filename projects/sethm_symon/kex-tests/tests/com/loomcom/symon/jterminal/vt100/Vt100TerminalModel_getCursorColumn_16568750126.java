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

public class Vt100TerminalModel_getCursorColumn_16568750126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468;

    public Vt100TerminalModel_getCursorColumn_16568750126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term468 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        Object term469 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        Object term472 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term473 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term474 = (byte[]) newByteArray(16);
        Object term493 = newInstance(Class.forName("com.loomcom.symon.jterminal.bell.NopBellStrategy"));
        Object[] term494 = (Object[]) newObjectArray(Array.newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"), 0).getClass(), 25);
        Object[] term495 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term496 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term497 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term498 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term499 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term500 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term501 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term502 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term503 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term504 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term505 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term506 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term507 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term508 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term509 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term510 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term511 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term512 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term513 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term514 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term515 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term516 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term517 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term518 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term519 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        setIntField(term469, term469.getClass(), "savedCursorRow", -1);
        setIntField(term469, term469.getClass(), "savedCursorColumn", -1);
        setField(term469, term469.getClass(), "this$0", term468);
        setField(term468, term468.getClass(), "listener", term469);
        setField(term473, term473.getClass(), "value", term474);
        setByteField(term473, term473.getClass(), "coder", (byte) 0);
        setIntField(term473, term473.getClass(), "count", 0);
        setField(term472, term472.getClass(), "buffer", term473);
        setField(term472, term472.getClass(), "listener", term469);
        setField(term468, term468.getClass(), "parser", term472);
        setField(term468, term468.getClass(), "bellStrategy", term493);
        setElement(term494, 0, term495);
        setElement(term494, 1, term496);
        setElement(term494, 2, term497);
        setElement(term494, 3, term498);
        setElement(term494, 4, term499);
        setElement(term494, 5, term500);
        setElement(term494, 6, term501);
        setElement(term494, 7, term502);
        setElement(term494, 8, term503);
        setElement(term494, 9, term504);
        setElement(term494, 10, term505);
        setElement(term494, 11, term506);
        setElement(term494, 12, term507);
        setElement(term494, 13, term508);
        setElement(term494, 14, term509);
        setElement(term494, 15, term510);
        setElement(term494, 16, term511);
        setElement(term494, 17, term512);
        setElement(term494, 18, term513);
        setElement(term494, 19, term514);
        setElement(term494, 20, term515);
        setElement(term494, 21, term516);
        setElement(term494, 22, term517);
        setElement(term494, 23, term518);
        setElement(term494, 24, term519);
        setField(term468, term468.getClass(), "cells", term494);
        setIntField(term468, term468.getClass(), "columns", 80);
        setIntField(term468, term468.getClass(), "rows", 25);
        setIntField(term468, term468.getClass(), "bufferSize", 25);
        setIntField(term468, term468.getClass(), "cursorRow", 865208305);
        setIntField(term468, term468.getClass(), "cursorColumn", -1275173084);
        setBooleanField(term468, term468.getClass(), "foregroundBold", false);
        setBooleanField(term468, term468.getClass(), "backgroundBold", false);
        setIntField(term468, term468.getClass(), "foregroundColor", 7);
        setIntField(term468, term468.getClass(), "backgroundColor", -244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCursorColumn", argTypes, term468, args);
    }

};


