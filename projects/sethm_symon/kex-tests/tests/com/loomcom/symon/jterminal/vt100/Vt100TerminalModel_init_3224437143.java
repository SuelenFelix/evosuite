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

public class Vt100TerminalModel_init_3224437143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235;

    public Vt100TerminalModel_init_3224437143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        Object term236 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        Object term239 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term240 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term241 = (byte[]) newByteArray(16);
        Object term260 = newInstance(Class.forName("com.loomcom.symon.jterminal.bell.NopBellStrategy"));
        Object[] term261 = (Object[]) newObjectArray(Array.newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"), 0).getClass(), 25);
        Object[] term262 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term263 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term264 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term265 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term266 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term267 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term268 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term269 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term270 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term271 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term272 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term273 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term274 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term275 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term276 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term277 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term278 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term279 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term280 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term281 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term282 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term283 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term284 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term285 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term286 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        setIntField(term236, term236.getClass(), "savedCursorRow", -1);
        setIntField(term236, term236.getClass(), "savedCursorColumn", -1);
        setField(term236, term236.getClass(), "this$0", term235);
        setField(term235, term235.getClass(), "listener", term236);
        setField(term240, term240.getClass(), "value", term241);
        setByteField(term240, term240.getClass(), "coder", (byte) 0);
        setIntField(term240, term240.getClass(), "count", 0);
        setField(term239, term239.getClass(), "buffer", term240);
        setField(term239, term239.getClass(), "listener", term236);
        setField(term235, term235.getClass(), "parser", term239);
        setField(term235, term235.getClass(), "bellStrategy", term260);
        setElement(term261, 0, term262);
        setElement(term261, 1, term263);
        setElement(term261, 2, term264);
        setElement(term261, 3, term265);
        setElement(term261, 4, term266);
        setElement(term261, 5, term267);
        setElement(term261, 6, term268);
        setElement(term261, 7, term269);
        setElement(term261, 8, term270);
        setElement(term261, 9, term271);
        setElement(term261, 10, term272);
        setElement(term261, 11, term273);
        setElement(term261, 12, term274);
        setElement(term261, 13, term275);
        setElement(term261, 14, term276);
        setElement(term261, 15, term277);
        setElement(term261, 16, term278);
        setElement(term261, 17, term279);
        setElement(term261, 18, term280);
        setElement(term261, 19, term281);
        setElement(term261, 20, term282);
        setElement(term261, 21, term283);
        setElement(term261, 22, term284);
        setElement(term261, 23, term285);
        setElement(term261, 24, term286);
        setField(term235, term235.getClass(), "cells", term261);
        setIntField(term235, term235.getClass(), "columns", 80);
        setIntField(term235, term235.getClass(), "rows", 25);
        setIntField(term235, term235.getClass(), "bufferSize", 25);
        setIntField(term235, term235.getClass(), "cursorRow", 1585847225);
        setIntField(term235, term235.getClass(), "cursorColumn", 597278769);
        setBooleanField(term235, term235.getClass(), "foregroundBold", true);
        setBooleanField(term235, term235.getClass(), "backgroundBold", true);
        setIntField(term235, term235.getClass(), "foregroundColor", 7);
        setIntField(term235, term235.getClass(), "backgroundColor", -1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term235, args);
    }

};


