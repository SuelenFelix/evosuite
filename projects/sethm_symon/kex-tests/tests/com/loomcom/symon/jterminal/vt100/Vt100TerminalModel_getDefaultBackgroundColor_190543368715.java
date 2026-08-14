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

public class Vt100TerminalModel_getDefaultBackgroundColor_190543368715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1229;

    public Vt100TerminalModel_getDefaultBackgroundColor_190543368715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1229 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        Object term1230 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        Object term1233 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term1234 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1235 = (byte[]) newByteArray(16);
        Object term1254 = newInstance(Class.forName("com.loomcom.symon.jterminal.bell.NopBellStrategy"));
        Object[] term1255 = (Object[]) newObjectArray(Array.newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"), 0).getClass(), 25);
        Object[] term1256 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1257 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1258 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1259 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1260 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1261 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1262 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1263 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1264 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1265 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1266 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1267 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1268 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1269 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1270 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1271 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1272 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1273 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1274 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1275 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1276 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1277 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1278 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1279 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1280 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        setIntField(term1230, term1230.getClass(), "savedCursorRow", -1);
        setIntField(term1230, term1230.getClass(), "savedCursorColumn", -1);
        setField(term1230, term1230.getClass(), "this$0", term1229);
        setField(term1229, term1229.getClass(), "listener", term1230);
        setField(term1234, term1234.getClass(), "value", term1235);
        setByteField(term1234, term1234.getClass(), "coder", (byte) 0);
        setIntField(term1234, term1234.getClass(), "count", 0);
        setField(term1233, term1233.getClass(), "buffer", term1234);
        setField(term1233, term1233.getClass(), "listener", term1230);
        setField(term1229, term1229.getClass(), "parser", term1233);
        setField(term1229, term1229.getClass(), "bellStrategy", term1254);
        setElement(term1255, 0, term1256);
        setElement(term1255, 1, term1257);
        setElement(term1255, 2, term1258);
        setElement(term1255, 3, term1259);
        setElement(term1255, 4, term1260);
        setElement(term1255, 5, term1261);
        setElement(term1255, 6, term1262);
        setElement(term1255, 7, term1263);
        setElement(term1255, 8, term1264);
        setElement(term1255, 9, term1265);
        setElement(term1255, 10, term1266);
        setElement(term1255, 11, term1267);
        setElement(term1255, 12, term1268);
        setElement(term1255, 13, term1269);
        setElement(term1255, 14, term1270);
        setElement(term1255, 15, term1271);
        setElement(term1255, 16, term1272);
        setElement(term1255, 17, term1273);
        setElement(term1255, 18, term1274);
        setElement(term1255, 19, term1275);
        setElement(term1255, 20, term1276);
        setElement(term1255, 21, term1277);
        setElement(term1255, 22, term1278);
        setElement(term1255, 23, term1279);
        setElement(term1255, 24, term1280);
        setField(term1229, term1229.getClass(), "cells", term1255);
        setIntField(term1229, term1229.getClass(), "columns", 80);
        setIntField(term1229, term1229.getClass(), "rows", 25);
        setIntField(term1229, term1229.getClass(), "bufferSize", 25);
        setIntField(term1229, term1229.getClass(), "cursorRow", 287287233);
        setIntField(term1229, term1229.getClass(), "cursorColumn", 962840079);
        setBooleanField(term1229, term1229.getClass(), "foregroundBold", true);
        setBooleanField(term1229, term1229.getClass(), "backgroundBold", false);
        setIntField(term1229, term1229.getClass(), "foregroundColor", 7);
        setIntField(term1229, term1229.getClass(), "backgroundColor", 1540719661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultBackgroundColor", argTypes, term1229, args);
    }

};


