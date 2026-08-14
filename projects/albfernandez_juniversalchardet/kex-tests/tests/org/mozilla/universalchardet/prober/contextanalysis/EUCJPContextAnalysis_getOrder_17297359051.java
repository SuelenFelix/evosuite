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

public class EUCJPContextAnalysis_getOrder_17297359051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term16;
     Object term19;
     Object term25;

    public EUCJPContextAnalysis_getOrder_17297359051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.EUCJPContextAnalysis"));
        int[] term2 = (int[]) newIntArray(6);
        Object term13 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.JapaneseContextAnalysis$Order"));
        setField(term1, term1.getClass(), "relSample", term2);
        setIntField(term1, term1.getClass(), "totalRel", 568599855);
        setIntField(term1, term1.getClass(), "lastCharOrder", -1);
        setIntField(term1, term1.getClass(), "needToSkipCharNum", 1162663216);
        setBooleanField(term1, term1.getClass(), "done", false);
        setIntField(term13, term13.getClass(), "order", -1);
        setIntField(term13, term13.getClass(), "charLength", 0);
        setField(term1, term1.getClass(), "tmpOrder", term13);
        term16 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.JapaneseContextAnalysis$Order"));
        setIntField(term16, term16.getClass(), "order", -1);
        setIntField(term16, term16.getClass(), "charLength", 1484323161);
        term19 = (byte[]) newByteArray(5);
        setByteElement(term19, 0, (byte) 47);
        setByteElement(term19, 1, (byte) 48);
        setByteElement(term19, 2, (byte) 89);
        setByteElement(term19, 3, (byte) 75);
        setByteElement(term19, 4, (byte) 18);
        term25 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.contextanalysis.EUCJPContextAnalysis");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.mozilla.universalchardet.prober.contextanalysis.JapaneseContextAnalysis$Order");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term16;
        args[1] = term19;
        args[2] = term25;
        callMethod(klass, "getOrder", argTypes, term1, args);
    }

};


