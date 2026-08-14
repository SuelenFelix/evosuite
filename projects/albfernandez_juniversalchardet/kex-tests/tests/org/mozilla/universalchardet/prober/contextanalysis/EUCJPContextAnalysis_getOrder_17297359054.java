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
import java.lang.Integer;

public class EUCJPContextAnalysis_getOrder_17297359054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70;
     Object term75;

    public EUCJPContextAnalysis_getOrder_17297359054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.EUCJPContextAnalysis"));
        setField(term70, term70.getClass(), "relSample", null);
        setIntField(term70, term70.getClass(), "totalRel", 0);
        setIntField(term70, term70.getClass(), "lastCharOrder", 0);
        setIntField(term70, term70.getClass(), "needToSkipCharNum", 0);
        setBooleanField(term70, term70.getClass(), "done", false);
        setField(term70, term70.getClass(), "tmpOrder", null);
        term75 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.contextanalysis.EUCJPContextAnalysis");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.mozilla.universalchardet.prober.contextanalysis.JapaneseContextAnalysis$Order");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term75;
        callMethod(klass, "getOrder", argTypes, term70, args);
    }

};


