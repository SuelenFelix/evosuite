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

public class Vt100TerminalModel_setCursorRow_11627122105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389;
     Object term450;

    public Vt100TerminalModel_setCursorRow_11627122105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term389 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        Object term390 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        Object term393 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term394 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term395 = (byte[]) newByteArray(16);
        Object term414 = newInstance(Class.forName("com.loomcom.symon.jterminal.bell.NopBellStrategy"));
        Object[] term415 = (Object[]) newObjectArray(Array.newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"), 0).getClass(), 25);
        Object[] term416 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term417 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term418 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term419 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term420 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term421 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term422 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term423 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term424 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term425 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term426 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term427 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term428 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term429 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term430 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term431 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term432 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term433 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term434 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term435 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term436 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term437 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term438 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term439 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term440 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        setIntField(term390, term390.getClass(), "savedCursorRow", -1);
        setIntField(term390, term390.getClass(), "savedCursorColumn", -1);
        setField(term390, term390.getClass(), "this$0", term389);
        setField(term389, term389.getClass(), "listener", term390);
        setField(term394, term394.getClass(), "value", term395);
        setByteField(term394, term394.getClass(), "coder", (byte) 0);
        setIntField(term394, term394.getClass(), "count", 0);
        setField(term393, term393.getClass(), "buffer", term394);
        setField(term393, term393.getClass(), "listener", term390);
        setField(term389, term389.getClass(), "parser", term393);
        setField(term389, term389.getClass(), "bellStrategy", term414);
        setElement(term415, 0, term416);
        setElement(term415, 1, term417);
        setElement(term415, 2, term418);
        setElement(term415, 3, term419);
        setElement(term415, 4, term420);
        setElement(term415, 5, term421);
        setElement(term415, 6, term422);
        setElement(term415, 7, term423);
        setElement(term415, 8, term424);
        setElement(term415, 9, term425);
        setElement(term415, 10, term426);
        setElement(term415, 11, term427);
        setElement(term415, 12, term428);
        setElement(term415, 13, term429);
        setElement(term415, 14, term430);
        setElement(term415, 15, term431);
        setElement(term415, 16, term432);
        setElement(term415, 17, term433);
        setElement(term415, 18, term434);
        setElement(term415, 19, term435);
        setElement(term415, 20, term436);
        setElement(term415, 21, term437);
        setElement(term415, 22, term438);
        setElement(term415, 23, term439);
        setElement(term415, 24, term440);
        setField(term389, term389.getClass(), "cells", term415);
        setIntField(term389, term389.getClass(), "columns", 80);
        setIntField(term389, term389.getClass(), "rows", 25);
        setIntField(term389, term389.getClass(), "bufferSize", 25);
        setIntField(term389, term389.getClass(), "cursorRow", -2068769794);
        setIntField(term389, term389.getClass(), "cursorColumn", -117576464);
        setBooleanField(term389, term389.getClass(), "foregroundBold", false);
        setBooleanField(term389, term389.getClass(), "backgroundBold", false);
        setIntField(term389, term389.getClass(), "foregroundColor", 7);
        setIntField(term389, term389.getClass(), "backgroundColor", -1007160944);
        term450 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term450;
        callMethod(klass, "setCursorRow", argTypes, term389, args);
    }

};


