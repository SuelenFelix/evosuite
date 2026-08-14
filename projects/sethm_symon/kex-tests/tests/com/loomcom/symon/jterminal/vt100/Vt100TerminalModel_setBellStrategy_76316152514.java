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

public class Vt100TerminalModel_setBellStrategy_76316152514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152;

    public Vt100TerminalModel_setBellStrategy_76316152514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1152 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        Object term1153 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        Object term1156 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term1157 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1158 = (byte[]) newByteArray(16);
        Object term1177 = newInstance(Class.forName("com.loomcom.symon.jterminal.bell.NopBellStrategy"));
        Object[] term1178 = (Object[]) newObjectArray(Array.newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"), 0).getClass(), 25);
        Object[] term1179 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1180 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1181 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1182 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1183 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1184 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1185 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1186 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1187 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1188 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1189 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1190 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1191 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1192 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1193 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1194 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1195 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1196 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1197 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1198 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1199 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1200 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1201 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1202 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term1203 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        setIntField(term1153, term1153.getClass(), "savedCursorRow", -1);
        setIntField(term1153, term1153.getClass(), "savedCursorColumn", -1);
        setField(term1153, term1153.getClass(), "this$0", term1152);
        setField(term1152, term1152.getClass(), "listener", term1153);
        setField(term1157, term1157.getClass(), "value", term1158);
        setByteField(term1157, term1157.getClass(), "coder", (byte) 0);
        setIntField(term1157, term1157.getClass(), "count", 0);
        setField(term1156, term1156.getClass(), "buffer", term1157);
        setField(term1156, term1156.getClass(), "listener", term1153);
        setField(term1152, term1152.getClass(), "parser", term1156);
        setField(term1152, term1152.getClass(), "bellStrategy", term1177);
        setElement(term1178, 0, term1179);
        setElement(term1178, 1, term1180);
        setElement(term1178, 2, term1181);
        setElement(term1178, 3, term1182);
        setElement(term1178, 4, term1183);
        setElement(term1178, 5, term1184);
        setElement(term1178, 6, term1185);
        setElement(term1178, 7, term1186);
        setElement(term1178, 8, term1187);
        setElement(term1178, 9, term1188);
        setElement(term1178, 10, term1189);
        setElement(term1178, 11, term1190);
        setElement(term1178, 12, term1191);
        setElement(term1178, 13, term1192);
        setElement(term1178, 14, term1193);
        setElement(term1178, 15, term1194);
        setElement(term1178, 16, term1195);
        setElement(term1178, 17, term1196);
        setElement(term1178, 18, term1197);
        setElement(term1178, 19, term1198);
        setElement(term1178, 20, term1199);
        setElement(term1178, 21, term1200);
        setElement(term1178, 22, term1201);
        setElement(term1178, 23, term1202);
        setElement(term1178, 24, term1203);
        setField(term1152, term1152.getClass(), "cells", term1178);
        setIntField(term1152, term1152.getClass(), "columns", 80);
        setIntField(term1152, term1152.getClass(), "rows", 25);
        setIntField(term1152, term1152.getClass(), "bufferSize", 25);
        setIntField(term1152, term1152.getClass(), "cursorRow", -1588772968);
        setIntField(term1152, term1152.getClass(), "cursorColumn", -93135961);
        setBooleanField(term1152, term1152.getClass(), "foregroundBold", false);
        setBooleanField(term1152, term1152.getClass(), "backgroundBold", false);
        setIntField(term1152, term1152.getClass(), "foregroundColor", 7);
        setIntField(term1152, term1152.getClass(), "backgroundColor", -112921587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.jterminal.bell.BellStrategy");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBellStrategy", argTypes, term1152, args);
    }

};


