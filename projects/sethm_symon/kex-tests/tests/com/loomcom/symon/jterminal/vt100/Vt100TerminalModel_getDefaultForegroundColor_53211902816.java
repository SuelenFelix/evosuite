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

public class Vt100TerminalModel_getDefaultForegroundColor_53211902816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1306;

    public Vt100TerminalModel_getDefaultForegroundColor_53211902816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1306 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        Object term1307 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        Object term1310 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term1311 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1312 = (byte[]) newByteArray(16);
        Object term1331 = newInstance(Class.forName("com.loomcom.symon.jterminal.bell.NopBellStrategy"));
        Object[] term1332 = (Object[]) newObjectArray(Array.newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"), 0).getClass(), 25);
        Object[] term1333 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1334 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1335 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1336 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1337 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1338 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1339 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1340 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1341 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1342 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1343 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1344 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1345 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1346 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1347 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1348 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1349 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1350 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1351 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1352 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1353 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1354 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1355 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1356 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1357 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        setIntField(term1307, term1307.getClass(), "savedCursorRow", -1);
        setIntField(term1307, term1307.getClass(), "savedCursorColumn", -1);
        setField(term1307, term1307.getClass(), "this$0", term1306);
        setField(term1306, term1306.getClass(), "listener", term1307);
        setField(term1311, term1311.getClass(), "value", term1312);
        setByteField(term1311, term1311.getClass(), "coder", (byte) 0);
        setIntField(term1311, term1311.getClass(), "count", 0);
        setField(term1310, term1310.getClass(), "buffer", term1311);
        setField(term1310, term1310.getClass(), "listener", term1307);
        setField(term1306, term1306.getClass(), "parser", term1310);
        setField(term1306, term1306.getClass(), "bellStrategy", term1331);
        setElement(term1332, 0, term1333);
        setElement(term1332, 1, term1334);
        setElement(term1332, 2, term1335);
        setElement(term1332, 3, term1336);
        setElement(term1332, 4, term1337);
        setElement(term1332, 5, term1338);
        setElement(term1332, 6, term1339);
        setElement(term1332, 7, term1340);
        setElement(term1332, 8, term1341);
        setElement(term1332, 9, term1342);
        setElement(term1332, 10, term1343);
        setElement(term1332, 11, term1344);
        setElement(term1332, 12, term1345);
        setElement(term1332, 13, term1346);
        setElement(term1332, 14, term1347);
        setElement(term1332, 15, term1348);
        setElement(term1332, 16, term1349);
        setElement(term1332, 17, term1350);
        setElement(term1332, 18, term1351);
        setElement(term1332, 19, term1352);
        setElement(term1332, 20, term1353);
        setElement(term1332, 21, term1354);
        setElement(term1332, 22, term1355);
        setElement(term1332, 23, term1356);
        setElement(term1332, 24, term1357);
        setField(term1306, term1306.getClass(), "cells", term1332);
        setIntField(term1306, term1306.getClass(), "columns", 80);
        setIntField(term1306, term1306.getClass(), "rows", 25);
        setIntField(term1306, term1306.getClass(), "bufferSize", 25);
        setIntField(term1306, term1306.getClass(), "cursorRow", 335112684);
        setIntField(term1306, term1306.getClass(), "cursorColumn", 1551099402);
        setBooleanField(term1306, term1306.getClass(), "foregroundBold", false);
        setBooleanField(term1306, term1306.getClass(), "backgroundBold", false);
        setIntField(term1306, term1306.getClass(), "foregroundColor", 7);
        setIntField(term1306, term1306.getClass(), "backgroundColor", -2027534003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultForegroundColor", argTypes, term1306, args);
    }

};


