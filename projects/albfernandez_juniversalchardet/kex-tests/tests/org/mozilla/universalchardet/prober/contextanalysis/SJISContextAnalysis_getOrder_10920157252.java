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

public class SJISContextAnalysis_getOrder_10920157252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117;
     Object term132;
     Object term137;

    public SJISContextAnalysis_getOrder_10920157252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.SJISContextAnalysis"));
        int[] term118 = (int[]) newIntArray(6);
        Object term129 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.JapaneseContextAnalysis$Order"));
        setField(term117, term117.getClass(), "relSample", term118);
        setIntField(term117, term117.getClass(), "totalRel", -522618178);
        setIntField(term117, term117.getClass(), "lastCharOrder", -1);
        setIntField(term117, term117.getClass(), "needToSkipCharNum", 1134449235);
        setBooleanField(term117, term117.getClass(), "done", false);
        setIntField(term129, term129.getClass(), "order", -1);
        setIntField(term129, term129.getClass(), "charLength", 0);
        setField(term117, term117.getClass(), "tmpOrder", term129);
        term132 = (byte[]) newByteArray(4);
        setByteElement(term132, 0, (byte) 83);
        setByteElement(term132, 1, (byte) 74);
        setByteElement(term132, 2, (byte) -71);
        setByteElement(term132, 3, (byte) 49);
        term137 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.contextanalysis.SJISContextAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term132;
        args[1] = term137;
        callMethod(klass, "getOrder", argTypes, term117, args);
    }

};


