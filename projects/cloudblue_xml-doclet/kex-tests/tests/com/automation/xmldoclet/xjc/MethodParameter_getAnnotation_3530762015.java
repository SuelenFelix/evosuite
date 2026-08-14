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

public class MethodParameter_getAnnotation_3530762015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39045;

    public MethodParameter_getAnnotation_3530762015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term39048 = new ArrayList();
        ArrayList term39052 = new ArrayList();
        ((ArrayList) term39052).add((Object)null);
        ((ArrayList) term39052).add((Object)null);
        Object term39058 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term39058, term39058.getClass(), "wildcard", null);
        setField(term39058, term39058.getClass(), "generic", null);
        setField(term39058, term39058.getClass(), "qualified", null);
        setField(term39058, term39058.getClass(), "dimension", null);
        Object term39059 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term39059, term39059.getClass(), "wildcard", null);
        setField(term39059, term39059.getClass(), "generic", null);
        setField(term39059, term39059.getClass(), "qualified", null);
        setField(term39059, term39059.getClass(), "dimension", null);
        Object term39060 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term39060, term39060.getClass(), "wildcard", null);
        setField(term39060, term39060.getClass(), "generic", null);
        setField(term39060, term39060.getClass(), "qualified", null);
        setField(term39060, term39060.getClass(), "dimension", null);
        Object term39061 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term39061, term39061.getClass(), "wildcard", null);
        setField(term39061, term39061.getClass(), "generic", null);
        setField(term39061, term39061.getClass(), "qualified", null);
        setField(term39061, term39061.getClass(), "dimension", null);
        Object term39062 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term39062, term39062.getClass(), "wildcard", null);
        setField(term39062, term39062.getClass(), "generic", null);
        setField(term39062, term39062.getClass(), "qualified", null);
        setField(term39062, term39062.getClass(), "dimension", null);
        Object term39063 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term39063, term39063.getClass(), "wildcard", null);
        setField(term39063, term39063.getClass(), "generic", null);
        setField(term39063, term39063.getClass(), "qualified", null);
        setField(term39063, term39063.getClass(), "dimension", null);
        Object term39064 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term39064, term39064.getClass(), "wildcard", null);
        setField(term39064, term39064.getClass(), "generic", null);
        setField(term39064, term39064.getClass(), "qualified", null);
        setField(term39064, term39064.getClass(), "dimension", null);
        ArrayList term39056 = new ArrayList();
        ((ArrayList) term39056).add(term39058);
        ((ArrayList) term39056).add(term39059);
        ((ArrayList) term39056).add(term39060);
        ((ArrayList) term39056).add(term39060);
        ((ArrayList) term39056).add(term39061);
        ((ArrayList) term39056).add(term39062);
        ((ArrayList) term39056).add(term39063);
        ((ArrayList) term39056).add(term39060);
        ((ArrayList) term39056).add(term39064);
        ArrayList term39094 = new ArrayList();
        ((ArrayList) term39094).add((Object)null);
        ((ArrayList) term39094).add((Object)null);
        ((ArrayList) term39094).add((Object)null);
        ((ArrayList) term39094).add((Object)null);
        ((ArrayList) term39094).add((Object)null);
        ((ArrayList) term39094).add((Object)null);
        ((ArrayList) term39094).add((Object)null);
        ((ArrayList) term39094).add((Object)null);
        ((ArrayList) term39094).add((Object)null);
        Object term39093 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term39093, term39093.getClass(), "argument", term39094);
        setField(term39093, term39093.getClass(), "name", "");
        setField(term39093, term39093.getClass(), "qualified", "");
        ArrayList term39100 = new ArrayList();
        ((ArrayList) term39100).add((Object)null);
        Object term39099 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term39099, term39099.getClass(), "argument", term39100);
        setField(term39099, term39099.getClass(), "name", "");
        setField(term39099, term39099.getClass(), "qualified", "");
        ArrayList term39106 = new ArrayList();
        ((ArrayList) term39106).add((Object)null);
        ((ArrayList) term39106).add((Object)null);
        ((ArrayList) term39106).add((Object)null);
        ((ArrayList) term39106).add((Object)null);
        ((ArrayList) term39106).add((Object)null);
        ((ArrayList) term39106).add((Object)null);
        ((ArrayList) term39106).add((Object)null);
        ((ArrayList) term39106).add((Object)null);
        ((ArrayList) term39106).add((Object)null);
        Object term39105 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term39105, term39105.getClass(), "argument", term39106);
        setField(term39105, term39105.getClass(), "name", "");
        setField(term39105, term39105.getClass(), "qualified", "");
        ArrayList term39112 = new ArrayList();
        ((ArrayList) term39112).add((Object)null);
        ((ArrayList) term39112).add((Object)null);
        ((ArrayList) term39112).add((Object)null);
        ((ArrayList) term39112).add((Object)null);
        ((ArrayList) term39112).add((Object)null);
        ((ArrayList) term39112).add((Object)null);
        ((ArrayList) term39112).add((Object)null);
        ((ArrayList) term39112).add((Object)null);
        Object term39111 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term39111, term39111.getClass(), "argument", term39112);
        setField(term39111, term39111.getClass(), "name", "");
        setField(term39111, term39111.getClass(), "qualified", "");
        ArrayList term39118 = new ArrayList();
        ((ArrayList) term39118).add((Object)null);
        ((ArrayList) term39118).add((Object)null);
        Object term39117 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term39117, term39117.getClass(), "argument", term39118);
        setField(term39117, term39117.getClass(), "name", "");
        setField(term39117, term39117.getClass(), "qualified", "");
        ArrayList term39091 = new ArrayList();
        ((ArrayList) term39091).add(term39093);
        ((ArrayList) term39091).add(term39099);
        ((ArrayList) term39091).add(term39105);
        ((ArrayList) term39091).add(term39111);
        ((ArrayList) term39091).add(term39117);
        term39045 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term39046 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term39047 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term39047, term39047.getClass(), "extendsBound", term39048);
        setField(term39047, term39047.getClass(), "superBound", term39052);
        setField(term39046, term39046.getClass(), "wildcard", term39047);
        setField(term39046, term39046.getClass(), "generic", term39056);
        setField(term39046, term39046.getClass(), "qualified", "DFpIVRzlTX");
        setField(term39046, term39046.getClass(), "dimension", "vPEZvMDbyx");
        setField(term39045, term39045.getClass(), "type", term39046);
        setField(term39045, term39045.getClass(), "annotation", term39091);
        setField(term39045, term39045.getClass(), "name", "sLppwBLFDN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.MethodParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnnotation", argTypes, term39045, args);
    }

};


