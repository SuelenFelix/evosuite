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

public class Vt100TerminalModel_getCursorRow_13641461364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312;

    public Vt100TerminalModel_getCursorRow_13641461364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        Object term313 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        Object term316 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term317 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term318 = (byte[]) newByteArray(16);
        Object term337 = newInstance(Class.forName("com.loomcom.symon.jterminal.bell.NopBellStrategy"));
        Object[] term338 = (Object[]) newObjectArray(Array.newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"), 0).getClass(), 25);
        Object[] term339 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term340 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term341 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term342 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term343 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term344 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term345 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term346 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term347 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term348 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term349 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term350 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term351 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term352 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term353 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term354 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term355 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term356 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term357 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term358 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term359 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term360 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term361 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term362 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term363 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        setIntField(term313, term313.getClass(), "savedCursorRow", -1);
        setIntField(term313, term313.getClass(), "savedCursorColumn", -1);
        setField(term313, term313.getClass(), "this$0", term312);
        setField(term312, term312.getClass(), "listener", term313);
        setField(term317, term317.getClass(), "value", term318);
        setByteField(term317, term317.getClass(), "coder", (byte) 0);
        setIntField(term317, term317.getClass(), "count", 0);
        setField(term316, term316.getClass(), "buffer", term317);
        setField(term316, term316.getClass(), "listener", term313);
        setField(term312, term312.getClass(), "parser", term316);
        setField(term312, term312.getClass(), "bellStrategy", term337);
        setElement(term338, 0, term339);
        setElement(term338, 1, term340);
        setElement(term338, 2, term341);
        setElement(term338, 3, term342);
        setElement(term338, 4, term343);
        setElement(term338, 5, term344);
        setElement(term338, 6, term345);
        setElement(term338, 7, term346);
        setElement(term338, 8, term347);
        setElement(term338, 9, term348);
        setElement(term338, 10, term349);
        setElement(term338, 11, term350);
        setElement(term338, 12, term351);
        setElement(term338, 13, term352);
        setElement(term338, 14, term353);
        setElement(term338, 15, term354);
        setElement(term338, 16, term355);
        setElement(term338, 17, term356);
        setElement(term338, 18, term357);
        setElement(term338, 19, term358);
        setElement(term338, 20, term359);
        setElement(term338, 21, term360);
        setElement(term338, 22, term361);
        setElement(term338, 23, term362);
        setElement(term338, 24, term363);
        setField(term312, term312.getClass(), "cells", term338);
        setIntField(term312, term312.getClass(), "columns", 80);
        setIntField(term312, term312.getClass(), "rows", 25);
        setIntField(term312, term312.getClass(), "bufferSize", 25);
        setIntField(term312, term312.getClass(), "cursorRow", 1622346318);
        setIntField(term312, term312.getClass(), "cursorColumn", 1048535127);
        setBooleanField(term312, term312.getClass(), "foregroundBold", false);
        setBooleanField(term312, term312.getClass(), "backgroundBold", true);
        setIntField(term312, term312.getClass(), "foregroundColor", 7);
        setIntField(term312, term312.getClass(), "backgroundColor", -655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCursorRow", argTypes, term312, args);
    }

};


