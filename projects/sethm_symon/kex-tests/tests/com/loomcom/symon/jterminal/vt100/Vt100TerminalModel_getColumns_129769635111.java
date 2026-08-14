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

public class Vt100TerminalModel_getColumns_129769635111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term921;

    public Vt100TerminalModel_getColumns_129769635111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term921 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        Object term922 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        Object term925 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term926 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term927 = (byte[]) newByteArray(16);
        Object term946 = newInstance(Class.forName("com.loomcom.symon.jterminal.bell.NopBellStrategy"));
        Object[] term947 = (Object[]) newObjectArray(Array.newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"), 0).getClass(), 25);
        Object[] term948 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term949 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term950 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term951 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term952 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term953 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term954 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term955 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term956 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term957 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term958 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term959 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term960 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term961 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term962 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term963 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term964 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term965 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term966 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term967 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term968 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term969 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term970 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term971 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term972 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        setIntField(term922, term922.getClass(), "savedCursorRow", -1);
        setIntField(term922, term922.getClass(), "savedCursorColumn", -1);
        setField(term922, term922.getClass(), "this$0", term921);
        setField(term921, term921.getClass(), "listener", term922);
        setField(term926, term926.getClass(), "value", term927);
        setByteField(term926, term926.getClass(), "coder", (byte) 0);
        setIntField(term926, term926.getClass(), "count", 0);
        setField(term925, term925.getClass(), "buffer", term926);
        setField(term925, term925.getClass(), "listener", term922);
        setField(term921, term921.getClass(), "parser", term925);
        setField(term921, term921.getClass(), "bellStrategy", term946);
        setElement(term947, 0, term948);
        setElement(term947, 1, term949);
        setElement(term947, 2, term950);
        setElement(term947, 3, term951);
        setElement(term947, 4, term952);
        setElement(term947, 5, term953);
        setElement(term947, 6, term954);
        setElement(term947, 7, term955);
        setElement(term947, 8, term956);
        setElement(term947, 9, term957);
        setElement(term947, 10, term958);
        setElement(term947, 11, term959);
        setElement(term947, 12, term960);
        setElement(term947, 13, term961);
        setElement(term947, 14, term962);
        setElement(term947, 15, term963);
        setElement(term947, 16, term964);
        setElement(term947, 17, term965);
        setElement(term947, 18, term966);
        setElement(term947, 19, term967);
        setElement(term947, 20, term968);
        setElement(term947, 21, term969);
        setElement(term947, 22, term970);
        setElement(term947, 23, term971);
        setElement(term947, 24, term972);
        setField(term921, term921.getClass(), "cells", term947);
        setIntField(term921, term921.getClass(), "columns", 80);
        setIntField(term921, term921.getClass(), "rows", 25);
        setIntField(term921, term921.getClass(), "bufferSize", 25);
        setIntField(term921, term921.getClass(), "cursorRow", -1048298087);
        setIntField(term921, term921.getClass(), "cursorColumn", 292681826);
        setBooleanField(term921, term921.getClass(), "foregroundBold", true);
        setBooleanField(term921, term921.getClass(), "backgroundBold", false);
        setIntField(term921, term921.getClass(), "foregroundColor", 7);
        setIntField(term921, term921.getClass(), "backgroundColor", 458147407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColumns", argTypes, term921, args);
    }

};


