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

public class Method_isNative_111548685032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52759;

    public Method_isNative_111548685032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term52774 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term52774, term52774.getClass(), "name", "");
        setField(term52774, term52774.getClass(), "text", "");
        ArrayList term52772 = new ArrayList();
        ((ArrayList) term52772).add(term52774);
        ArrayList term52783 = new ArrayList();
        ((ArrayList) term52783).add((Object)null);
        ((ArrayList) term52783).add((Object)null);
        ((ArrayList) term52783).add((Object)null);
        ((ArrayList) term52783).add((Object)null);
        Object term52781 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term52782 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term52782, term52782.getClass(), "wildcard", null);
        setField(term52782, term52782.getClass(), "generic", null);
        setField(term52782, term52782.getClass(), "qualified", null);
        setField(term52782, term52782.getClass(), "dimension", null);
        setField(term52781, term52781.getClass(), "type", term52782);
        setField(term52781, term52781.getClass(), "annotation", term52783);
        setField(term52781, term52781.getClass(), "name", "");
        ArrayList term52779 = new ArrayList();
        ((ArrayList) term52779).add(term52781);
        Object term52792 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term52792, term52792.getClass(), "wildcard", null);
        setField(term52792, term52792.getClass(), "generic", null);
        setField(term52792, term52792.getClass(), "qualified", null);
        setField(term52792, term52792.getClass(), "dimension", null);
        Object term52793 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term52793, term52793.getClass(), "wildcard", null);
        setField(term52793, term52793.getClass(), "generic", null);
        setField(term52793, term52793.getClass(), "qualified", null);
        setField(term52793, term52793.getClass(), "dimension", null);
        ArrayList term52796 = new ArrayList();
        ((ArrayList) term52796).add((Object)null);
        ((ArrayList) term52796).add((Object)null);
        ((ArrayList) term52796).add((Object)null);
        Object term52794 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term52795 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term52795, term52795.getClass(), "extendsBound", null);
        setField(term52795, term52795.getClass(), "superBound", null);
        setField(term52794, term52794.getClass(), "wildcard", term52795);
        setField(term52794, term52794.getClass(), "generic", term52796);
        setField(term52794, term52794.getClass(), "qualified", "");
        setField(term52794, term52794.getClass(), "dimension", "");
        Object term52801 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term52801, term52801.getClass(), "wildcard", null);
        setField(term52801, term52801.getClass(), "generic", null);
        setField(term52801, term52801.getClass(), "qualified", null);
        setField(term52801, term52801.getClass(), "dimension", null);
        Object term52802 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term52802, term52802.getClass(), "wildcard", null);
        setField(term52802, term52802.getClass(), "generic", null);
        setField(term52802, term52802.getClass(), "qualified", null);
        setField(term52802, term52802.getClass(), "dimension", null);
        ArrayList term52805 = new ArrayList();
        ((ArrayList) term52805).add((Object)null);
        ((ArrayList) term52805).add((Object)null);
        ((ArrayList) term52805).add((Object)null);
        ((ArrayList) term52805).add((Object)null);
        ((ArrayList) term52805).add((Object)null);
        ((ArrayList) term52805).add((Object)null);
        Object term52803 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term52804 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term52804, term52804.getClass(), "extendsBound", null);
        setField(term52804, term52804.getClass(), "superBound", null);
        setField(term52803, term52803.getClass(), "wildcard", term52804);
        setField(term52803, term52803.getClass(), "generic", term52805);
        setField(term52803, term52803.getClass(), "qualified", "");
        setField(term52803, term52803.getClass(), "dimension", "");
        ArrayList term52790 = new ArrayList();
        ((ArrayList) term52790).add(term52792);
        ((ArrayList) term52790).add(term52793);
        ((ArrayList) term52790).add(term52794);
        ((ArrayList) term52790).add(term52792);
        ((ArrayList) term52790).add(term52801);
        ((ArrayList) term52790).add(term52802);
        ((ArrayList) term52790).add(term52792);
        ((ArrayList) term52790).add(term52803);
        Object term52814 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term52814, term52814.getClass(), "argument", null);
        setField(term52814, term52814.getClass(), "name", null);
        setField(term52814, term52814.getClass(), "qualified", null);
        ArrayList term52816 = new ArrayList();
        Object term52815 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term52815, term52815.getClass(), "argument", term52816);
        setField(term52815, term52815.getClass(), "name", "");
        setField(term52815, term52815.getClass(), "qualified", "");
        Object term52821 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term52821, term52821.getClass(), "argument", null);
        setField(term52821, term52821.getClass(), "name", null);
        setField(term52821, term52821.getClass(), "qualified", null);
        Object term52822 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term52822, term52822.getClass(), "argument", null);
        setField(term52822, term52822.getClass(), "name", null);
        setField(term52822, term52822.getClass(), "qualified", null);
        ArrayList term52812 = new ArrayList();
        ((ArrayList) term52812).add(term52814);
        ((ArrayList) term52812).add(term52815);
        ((ArrayList) term52812).add(term52821);
        ((ArrayList) term52812).add(term52822);
        ((ArrayList) term52812).add(term52821);
        ((ArrayList) term52812).add(term52822);
        ((ArrayList) term52812).add(term52821);
        Boolean term52873 = new Boolean(true);
        Boolean term52875 = new Boolean(true);
        Boolean term52877 = new Boolean(false);
        Boolean term52879 = new Boolean(false);
        Boolean term52881 = new Boolean(false);
        Boolean term52883 = new Boolean(true);
        Boolean term52885 = new Boolean(true);
        term52759 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        Object term52789 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term52759, term52759.getClass(), "comment", "OeUxVwZtCi");
        setField(term52759, term52759.getClass(), "tag", term52772);
        setField(term52759, term52759.getClass(), "parameter", term52779);
        setField(term52789, term52789.getClass(), "wildcard", null);
        setField(term52789, term52789.getClass(), "generic", null);
        setField(term52789, term52789.getClass(), "qualified", null);
        setField(term52789, term52789.getClass(), "dimension", null);
        setField(term52759, term52759.getClass(), "_return", term52789);
        setField(term52759, term52759.getClass(), "exception", term52790);
        setField(term52759, term52759.getClass(), "annotation", term52812);
        setField(term52759, term52759.getClass(), "name", "WrGuxiasRO");
        setField(term52759, term52759.getClass(), "signature", "BGFpUCsDfy");
        setField(term52759, term52759.getClass(), "qualified", "uSVZwFrQMK");
        setField(term52759, term52759.getClass(), "scope", "CDZQoviKux");
        setField(term52759, term52759.getClass(), "_abstract", term52873);
        setField(term52759, term52759.getClass(), "_final", term52875);
        setField(term52759, term52759.getClass(), "included", term52877);
        setField(term52759, term52759.getClass(), "_native", term52879);
        setField(term52759, term52759.getClass(), "_synchronized", term52881);
        setField(term52759, term52759.getClass(), "_static", term52883);
        setField(term52759, term52759.getClass(), "varArgs", term52885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNative", argTypes, term52759, args);
    }

};


