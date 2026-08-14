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

public class Vt100TerminalModel_print_39466133610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term822;

    public Vt100TerminalModel_print_39466133610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term822 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        Object term823 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        Object term826 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term827 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term828 = (byte[]) newByteArray(16);
        Object term847 = newInstance(Class.forName("com.loomcom.symon.jterminal.bell.NopBellStrategy"));
        Object[] term848 = (Object[]) newObjectArray(Array.newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"), 0).getClass(), 25);
        Object[] term849 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term850 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term851 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term852 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term853 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term854 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term855 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term856 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term857 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term858 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term859 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term860 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term861 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term862 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term863 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term864 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term865 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term866 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term867 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term868 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term869 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term870 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term871 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term872 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term873 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        setIntField(term823, term823.getClass(), "savedCursorRow", -1);
        setIntField(term823, term823.getClass(), "savedCursorColumn", -1);
        setField(term823, term823.getClass(), "this$0", term822);
        setField(term822, term822.getClass(), "listener", term823);
        setField(term827, term827.getClass(), "value", term828);
        setByteField(term827, term827.getClass(), "coder", (byte) 0);
        setIntField(term827, term827.getClass(), "count", 0);
        setField(term826, term826.getClass(), "buffer", term827);
        setField(term826, term826.getClass(), "listener", term823);
        setField(term822, term822.getClass(), "parser", term826);
        setField(term822, term822.getClass(), "bellStrategy", term847);
        setElement(term848, 0, term849);
        setElement(term848, 1, term850);
        setElement(term848, 2, term851);
        setElement(term848, 3, term852);
        setElement(term848, 4, term853);
        setElement(term848, 5, term854);
        setElement(term848, 6, term855);
        setElement(term848, 7, term856);
        setElement(term848, 8, term857);
        setElement(term848, 9, term858);
        setElement(term848, 10, term859);
        setElement(term848, 11, term860);
        setElement(term848, 12, term861);
        setElement(term848, 13, term862);
        setElement(term848, 14, term863);
        setElement(term848, 15, term864);
        setElement(term848, 16, term865);
        setElement(term848, 17, term866);
        setElement(term848, 18, term867);
        setElement(term848, 19, term868);
        setElement(term848, 20, term869);
        setElement(term848, 21, term870);
        setElement(term848, 22, term871);
        setElement(term848, 23, term872);
        setElement(term848, 24, term873);
        setField(term822, term822.getClass(), "cells", term848);
        setIntField(term822, term822.getClass(), "columns", 80);
        setIntField(term822, term822.getClass(), "rows", 25);
        setIntField(term822, term822.getClass(), "bufferSize", 25);
        setIntField(term822, term822.getClass(), "cursorRow", 1632125673);
        setIntField(term822, term822.getClass(), "cursorColumn", 454281060);
        setBooleanField(term822, term822.getClass(), "foregroundBold", false);
        setBooleanField(term822, term822.getClass(), "backgroundBold", true);
        setIntField(term822, term822.getClass(), "foregroundColor", 7);
        setIntField(term822, term822.getClass(), "backgroundColor", -1786399638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        callMethod(klass, "print", argTypes, term822, args);
    }

};


