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

public class SJISContextAnalysis_getOrder_5678246371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;
     Object term99;
     Object term102;
     Object term106;

    public SJISContextAnalysis_getOrder_5678246371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.SJISContextAnalysis"));
        int[] term85 = (int[]) newIntArray(6);
        Object term96 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.JapaneseContextAnalysis$Order"));
        setField(term84, term84.getClass(), "relSample", term85);
        setIntField(term84, term84.getClass(), "totalRel", -2038273078);
        setIntField(term84, term84.getClass(), "lastCharOrder", -1);
        setIntField(term84, term84.getClass(), "needToSkipCharNum", 1227103734);
        setBooleanField(term84, term84.getClass(), "done", false);
        setIntField(term96, term96.getClass(), "order", -1);
        setIntField(term96, term96.getClass(), "charLength", 0);
        setField(term84, term84.getClass(), "tmpOrder", term96);
        term99 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.JapaneseContextAnalysis$Order"));
        setIntField(term99, term99.getClass(), "order", -1);
        setIntField(term99, term99.getClass(), "charLength", -1339778481);
        term102 = (byte[]) newByteArray(3);
        setByteElement(term102, 0, (byte) 79);
        setByteElement(term102, 1, (byte) -119);
        setByteElement(term102, 2, (byte) -66);
        term106 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.contextanalysis.SJISContextAnalysis");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.mozilla.universalchardet.prober.contextanalysis.JapaneseContextAnalysis$Order");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term99;
        args[1] = term102;
        args[2] = term106;
        callMethod(klass, "getOrder", argTypes, term84, args);
    }

};


