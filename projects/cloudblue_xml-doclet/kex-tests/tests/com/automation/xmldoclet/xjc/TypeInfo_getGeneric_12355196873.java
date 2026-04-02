package com.automation.xmldoclet.xjc;

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
import static com.automation.xmldoclet.xjc.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class TypeInfo_getGeneric_12355196873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44866;

    public TypeInfo_getGeneric_12355196873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44870 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44870, term44870.getClass(), "wildcard", null);
        setField(term44870, term44870.getClass(), "generic", null);
        setField(term44870, term44870.getClass(), "qualified", null);
        setField(term44870, term44870.getClass(), "dimension", null);
        ArrayList term44868 = new ArrayList();
        ((ArrayList) term44868).add(term44870);
        Object term44875 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44875, term44875.getClass(), "wildcard", null);
        setField(term44875, term44875.getClass(), "generic", null);
        setField(term44875, term44875.getClass(), "qualified", null);
        setField(term44875, term44875.getClass(), "dimension", null);
        ArrayList term44873 = new ArrayList();
        ((ArrayList) term44873).add(term44875);
        Object term44880 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44880, term44880.getClass(), "wildcard", null);
        setField(term44880, term44880.getClass(), "generic", null);
        setField(term44880, term44880.getClass(), "qualified", null);
        setField(term44880, term44880.getClass(), "dimension", null);
        ArrayList term44883 = new ArrayList();
        ((ArrayList) term44883).add((Object)null);
        ((ArrayList) term44883).add((Object)null);
        ((ArrayList) term44883).add((Object)null);
        ((ArrayList) term44883).add((Object)null);
        ((ArrayList) term44883).add((Object)null);
        ((ArrayList) term44883).add((Object)null);
        Object term44881 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term44882 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term44882, term44882.getClass(), "extendsBound", null);
        setField(term44882, term44882.getClass(), "superBound", null);
        setField(term44881, term44881.getClass(), "wildcard", term44882);
        setField(term44881, term44881.getClass(), "generic", term44883);
        setField(term44881, term44881.getClass(), "qualified", "");
        setField(term44881, term44881.getClass(), "dimension", "");
        ArrayList term44878 = new ArrayList();
        ((ArrayList) term44878).add(term44875);
        ((ArrayList) term44878).add(term44880);
        ((ArrayList) term44878).add(term44866);
        ((ArrayList) term44878).add(term44866);
        ((ArrayList) term44878).add(term44881);
        ((ArrayList) term44878).add(term44870);
        term44866 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term44867 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term44867, term44867.getClass(), "extendsBound", term44868);
        setField(term44867, term44867.getClass(), "superBound", term44873);
        setField(term44866, term44866.getClass(), "wildcard", term44867);
        setField(term44866, term44866.getClass(), "generic", term44878);
        setField(term44866, term44866.getClass(), "qualified", "ieJjpBWVBK");
        setField(term44866, term44866.getClass(), "dimension", "OVXeukyAgt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.TypeInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneric", argTypes, term44866, args);
    }

};


