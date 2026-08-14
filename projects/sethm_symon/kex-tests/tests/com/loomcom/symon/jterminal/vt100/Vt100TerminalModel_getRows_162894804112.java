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

public class Vt100TerminalModel_getRows_162894804112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term998;

    public Vt100TerminalModel_getRows_162894804112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term998 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        Object term999 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        Object term1002 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term1003 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1004 = (byte[]) newByteArray(16);
        Object term1023 = newInstance(Class.forName("com.loomcom.symon.jterminal.bell.NopBellStrategy"));
        Object[] term1024 = (Object[]) newObjectArray(Array.newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"), 0).getClass(), 25);
        Object[] term1025 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1026 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1027 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1028 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1029 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1030 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1031 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1032 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1033 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1034 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1035 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1036 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1037 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1038 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1039 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1040 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1041 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1042 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1043 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1044 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1045 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1046 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1047 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1048 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1049 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        setIntField(term999, term999.getClass(), "savedCursorRow", -1);
        setIntField(term999, term999.getClass(), "savedCursorColumn", -1);
        setField(term999, term999.getClass(), "this$0", term998);
        setField(term998, term998.getClass(), "listener", term999);
        setField(term1003, term1003.getClass(), "value", term1004);
        setByteField(term1003, term1003.getClass(), "coder", (byte) 0);
        setIntField(term1003, term1003.getClass(), "count", 0);
        setField(term1002, term1002.getClass(), "buffer", term1003);
        setField(term1002, term1002.getClass(), "listener", term999);
        setField(term998, term998.getClass(), "parser", term1002);
        setField(term998, term998.getClass(), "bellStrategy", term1023);
        setElement(term1024, 0, term1025);
        setElement(term1024, 1, term1026);
        setElement(term1024, 2, term1027);
        setElement(term1024, 3, term1028);
        setElement(term1024, 4, term1029);
        setElement(term1024, 5, term1030);
        setElement(term1024, 6, term1031);
        setElement(term1024, 7, term1032);
        setElement(term1024, 8, term1033);
        setElement(term1024, 9, term1034);
        setElement(term1024, 10, term1035);
        setElement(term1024, 11, term1036);
        setElement(term1024, 12, term1037);
        setElement(term1024, 13, term1038);
        setElement(term1024, 14, term1039);
        setElement(term1024, 15, term1040);
        setElement(term1024, 16, term1041);
        setElement(term1024, 17, term1042);
        setElement(term1024, 18, term1043);
        setElement(term1024, 19, term1044);
        setElement(term1024, 20, term1045);
        setElement(term1024, 21, term1046);
        setElement(term1024, 22, term1047);
        setElement(term1024, 23, term1048);
        setElement(term1024, 24, term1049);
        setField(term998, term998.getClass(), "cells", term1024);
        setIntField(term998, term998.getClass(), "columns", 80);
        setIntField(term998, term998.getClass(), "rows", 25);
        setIntField(term998, term998.getClass(), "bufferSize", 25);
        setIntField(term998, term998.getClass(), "cursorRow", 493620644);
        setIntField(term998, term998.getClass(), "cursorColumn", 1328271830);
        setBooleanField(term998, term998.getClass(), "foregroundBold", true);
        setBooleanField(term998, term998.getClass(), "backgroundBold", true);
        setIntField(term998, term998.getClass(), "foregroundColor", 7);
        setIntField(term998, term998.getClass(), "backgroundColor", 1596070772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRows", argTypes, term998, args);
    }

};


