package org.mozilla.universalchardet.prober.contextanalysis;

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
import static org.mozilla.universalchardet.prober.contextanalysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class EUCJPContextAnalysis_getOrder_20410403032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;
     Object term53;
     Object term58;

    public EUCJPContextAnalysis_getOrder_20410403032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.EUCJPContextAnalysis"));
        int[] term39 = (int[]) newIntArray(6);
        Object term50 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.JapaneseContextAnalysis$Order"));
        setField(term38, term38.getClass(), "relSample", term39);
        setIntField(term38, term38.getClass(), "totalRel", -1922583790);
        setIntField(term38, term38.getClass(), "lastCharOrder", -1);
        setIntField(term38, term38.getClass(), "needToSkipCharNum", -616727354);
        setBooleanField(term38, term38.getClass(), "done", false);
        setIntField(term50, term50.getClass(), "order", -1);
        setIntField(term50, term50.getClass(), "charLength", 0);
        setField(term38, term38.getClass(), "tmpOrder", term50);
        term53 = (byte[]) newByteArray(4);
        setByteElement(term53, 0, (byte) -58);
        setByteElement(term53, 1, (byte) -29);
        setByteElement(term53, 2, (byte) -54);
        setByteElement(term53, 3, (byte) -10);
        term58 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.contextanalysis.EUCJPContextAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term53;
        args[1] = term58;
        callMethod(klass, "getOrder", argTypes, term38, args);
    }

};


