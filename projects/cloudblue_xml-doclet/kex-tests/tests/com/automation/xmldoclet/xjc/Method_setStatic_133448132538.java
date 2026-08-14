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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class Method_setStatic_133448132538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53851;
     Object term53974;

    public Method_setStatic_133448132538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term53864 = new ArrayList();
        ArrayList term53872 = new ArrayList();
        Object term53870 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term53871 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term53871, term53871.getClass(), "wildcard", null);
        setField(term53871, term53871.getClass(), "generic", null);
        setField(term53871, term53871.getClass(), "qualified", null);
        setField(term53871, term53871.getClass(), "dimension", null);
        setField(term53870, term53870.getClass(), "type", term53871);
        setField(term53870, term53870.getClass(), "annotation", term53872);
        setField(term53870, term53870.getClass(), "name", "");
        ArrayList term53878 = new ArrayList();
        ((ArrayList) term53878).add((Object)null);
        ((ArrayList) term53878).add((Object)null);
        ((ArrayList) term53878).add((Object)null);
        ((ArrayList) term53878).add((Object)null);
        ((ArrayList) term53878).add((Object)null);
        ((ArrayList) term53878).add((Object)null);
        ((ArrayList) term53878).add((Object)null);
        Object term53876 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term53877 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term53877, term53877.getClass(), "wildcard", null);
        setField(term53877, term53877.getClass(), "generic", null);
        setField(term53877, term53877.getClass(), "qualified", null);
        setField(term53877, term53877.getClass(), "dimension", null);
        setField(term53876, term53876.getClass(), "type", term53877);
        setField(term53876, term53876.getClass(), "annotation", term53878);
        setField(term53876, term53876.getClass(), "name", "");
        ArrayList term53883 = new ArrayList();
        ((ArrayList) term53883).add((Object)null);
        ((ArrayList) term53883).add((Object)null);
        ((ArrayList) term53883).add((Object)null);
        ((ArrayList) term53883).add((Object)null);
        ((ArrayList) term53883).add((Object)null);
        Object term53882 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        setField(term53882, term53882.getClass(), "type", term53871);
        setField(term53882, term53882.getClass(), "annotation", term53883);
        setField(term53882, term53882.getClass(), "name", "");
        ArrayList term53889 = new ArrayList();
        ((ArrayList) term53889).add((Object)null);
        ((ArrayList) term53889).add((Object)null);
        ((ArrayList) term53889).add((Object)null);
        Object term53887 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term53888 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term53888, term53888.getClass(), "wildcard", null);
        setField(term53888, term53888.getClass(), "generic", null);
        setField(term53888, term53888.getClass(), "qualified", null);
        setField(term53888, term53888.getClass(), "dimension", null);
        setField(term53887, term53887.getClass(), "type", term53888);
        setField(term53887, term53887.getClass(), "annotation", term53889);
        setField(term53887, term53887.getClass(), "name", "");
        ArrayList term53895 = new ArrayList();
        ((ArrayList) term53895).add((Object)null);
        ((ArrayList) term53895).add((Object)null);
        ((ArrayList) term53895).add((Object)null);
        ((ArrayList) term53895).add((Object)null);
        ((ArrayList) term53895).add((Object)null);
        Object term53893 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term53894 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term53894, term53894.getClass(), "wildcard", null);
        setField(term53894, term53894.getClass(), "generic", null);
        setField(term53894, term53894.getClass(), "qualified", null);
        setField(term53894, term53894.getClass(), "dimension", null);
        setField(term53893, term53893.getClass(), "type", term53894);
        setField(term53893, term53893.getClass(), "annotation", term53895);
        setField(term53893, term53893.getClass(), "name", "");
        ArrayList term53868 = new ArrayList();
        ((ArrayList) term53868).add(term53870);
        ((ArrayList) term53868).add(term53876);
        ((ArrayList) term53868).add(term53882);
        ((ArrayList) term53868).add(term53887);
        ((ArrayList) term53868).add(term53893);
        ArrayList term53901 = new ArrayList();
        ((ArrayList) term53901).add(term53894);
        ((ArrayList) term53901).add(term53877);
        Object term53907 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term53907, term53907.getClass(), "argument", null);
        setField(term53907, term53907.getClass(), "name", null);
        setField(term53907, term53907.getClass(), "qualified", null);
        Object term53908 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term53908, term53908.getClass(), "argument", null);
        setField(term53908, term53908.getClass(), "name", null);
        setField(term53908, term53908.getClass(), "qualified", null);
        Object term53909 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term53909, term53909.getClass(), "argument", null);
        setField(term53909, term53909.getClass(), "name", null);
        setField(term53909, term53909.getClass(), "qualified", null);
        ArrayList term53905 = new ArrayList();
        ((ArrayList) term53905).add(term53907);
        ((ArrayList) term53905).add(term53908);
        ((ArrayList) term53905).add(term53909);
        Boolean term53960 = new Boolean(true);
        Boolean term53962 = new Boolean(false);
        Boolean term53964 = new Boolean(false);
        Boolean term53966 = new Boolean(false);
        Boolean term53968 = new Boolean(true);
        Boolean term53970 = new Boolean(false);
        Boolean term53972 = new Boolean(false);
        term53851 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        setField(term53851, term53851.getClass(), "comment", "cJaullxevY");
        setField(term53851, term53851.getClass(), "tag", term53864);
        setField(term53851, term53851.getClass(), "parameter", term53868);
        setField(term53851, term53851.getClass(), "_return", term53877);
        setField(term53851, term53851.getClass(), "exception", term53901);
        setField(term53851, term53851.getClass(), "annotation", term53905);
        setField(term53851, term53851.getClass(), "name", "QcjCBoRkFw");
        setField(term53851, term53851.getClass(), "signature", "CqJonTytBM");
        setField(term53851, term53851.getClass(), "qualified", "EeDoOKwwqZ");
        setField(term53851, term53851.getClass(), "scope", "RECEOVgrgh");
        setField(term53851, term53851.getClass(), "_abstract", term53960);
        setField(term53851, term53851.getClass(), "_final", term53962);
        setField(term53851, term53851.getClass(), "included", term53964);
        setField(term53851, term53851.getClass(), "_native", term53966);
        setField(term53851, term53851.getClass(), "_synchronized", term53968);
        setField(term53851, term53851.getClass(), "_static", term53970);
        setField(term53851, term53851.getClass(), "varArgs", term53972);
        term53974 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term53974;
        callMethod(klass, "setStatic", argTypes, term53851, args);
    }

};


