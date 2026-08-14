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

public class Vt100TerminalModel_getBufferSize_42185377713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1075;

    public Vt100TerminalModel_getBufferSize_42185377713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1075 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        Object term1076 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        Object term1079 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term1080 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1081 = (byte[]) newByteArray(16);
        Object term1100 = newInstance(Class.forName("com.loomcom.symon.jterminal.bell.NopBellStrategy"));
        Object[] term1101 = (Object[]) newObjectArray(Array.newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"), 0).getClass(), 25);
        Object[] term1102 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1103 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1104 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1105 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1106 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1107 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1108 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1109 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1110 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1111 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1112 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1113 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1114 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1115 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1116 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1117 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1118 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1119 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1120 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1121 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1122 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1123 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1124 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1125 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1126 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        setIntField(term1076, term1076.getClass(), "savedCursorRow", -1);
        setIntField(term1076, term1076.getClass(), "savedCursorColumn", -1);
        setField(term1076, term1076.getClass(), "this$0", term1075);
        setField(term1075, term1075.getClass(), "listener", term1076);
        setField(term1080, term1080.getClass(), "value", term1081);
        setByteField(term1080, term1080.getClass(), "coder", (byte) 0);
        setIntField(term1080, term1080.getClass(), "count", 0);
        setField(term1079, term1079.getClass(), "buffer", term1080);
        setField(term1079, term1079.getClass(), "listener", term1076);
        setField(term1075, term1075.getClass(), "parser", term1079);
        setField(term1075, term1075.getClass(), "bellStrategy", term1100);
        setElement(term1101, 0, term1102);
        setElement(term1101, 1, term1103);
        setElement(term1101, 2, term1104);
        setElement(term1101, 3, term1105);
        setElement(term1101, 4, term1106);
        setElement(term1101, 5, term1107);
        setElement(term1101, 6, term1108);
        setElement(term1101, 7, term1109);
        setElement(term1101, 8, term1110);
        setElement(term1101, 9, term1111);
        setElement(term1101, 10, term1112);
        setElement(term1101, 11, term1113);
        setElement(term1101, 12, term1114);
        setElement(term1101, 13, term1115);
        setElement(term1101, 14, term1116);
        setElement(term1101, 15, term1117);
        setElement(term1101, 16, term1118);
        setElement(term1101, 17, term1119);
        setElement(term1101, 18, term1120);
        setElement(term1101, 19, term1121);
        setElement(term1101, 20, term1122);
        setElement(term1101, 21, term1123);
        setElement(term1101, 22, term1124);
        setElement(term1101, 23, term1125);
        setElement(term1101, 24, term1126);
        setField(term1075, term1075.getClass(), "cells", term1101);
        setIntField(term1075, term1075.getClass(), "columns", 80);
        setIntField(term1075, term1075.getClass(), "rows", 25);
        setIntField(term1075, term1075.getClass(), "bufferSize", 25);
        setIntField(term1075, term1075.getClass(), "cursorRow", -1371869594);
        setIntField(term1075, term1075.getClass(), "cursorColumn", -2095575670);
        setBooleanField(term1075, term1075.getClass(), "foregroundBold", true);
        setBooleanField(term1075, term1075.getClass(), "backgroundBold", true);
        setIntField(term1075, term1075.getClass(), "foregroundColor", 7);
        setIntField(term1075, term1075.getClass(), "backgroundColor", 1225272962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBufferSize", argTypes, term1075, args);
    }

};


