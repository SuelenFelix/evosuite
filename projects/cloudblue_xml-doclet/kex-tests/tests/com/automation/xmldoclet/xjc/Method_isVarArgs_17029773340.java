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

public class Method_isVarArgs_17029773340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51751;

    public Method_isVarArgs_17029773340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51766 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term51766, term51766.getClass(), "name", "");
        setField(term51766, term51766.getClass(), "text", "");
        Object term51769 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term51769, term51769.getClass(), "name", "");
        setField(term51769, term51769.getClass(), "text", "");
        Object term51772 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term51772, term51772.getClass(), "name", "");
        setField(term51772, term51772.getClass(), "text", "");
        Object term51775 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term51775, term51775.getClass(), "name", "");
        setField(term51775, term51775.getClass(), "text", "");
        ArrayList term51764 = new ArrayList();
        ((ArrayList) term51764).add(term51766);
        ((ArrayList) term51764).add(term51769);
        ((ArrayList) term51764).add(term51772);
        ((ArrayList) term51764).add(term51775);
        ArrayList term51784 = new ArrayList();
        ((ArrayList) term51784).add((Object)null);
        ((ArrayList) term51784).add((Object)null);
        ((ArrayList) term51784).add((Object)null);
        ((ArrayList) term51784).add((Object)null);
        ((ArrayList) term51784).add((Object)null);
        ((ArrayList) term51784).add((Object)null);
        ((ArrayList) term51784).add((Object)null);
        Object term51782 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term51783 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term51783, term51783.getClass(), "wildcard", null);
        setField(term51783, term51783.getClass(), "generic", null);
        setField(term51783, term51783.getClass(), "qualified", null);
        setField(term51783, term51783.getClass(), "dimension", null);
        setField(term51782, term51782.getClass(), "type", term51783);
        setField(term51782, term51782.getClass(), "annotation", term51784);
        setField(term51782, term51782.getClass(), "name", "");
        ArrayList term51790 = new ArrayList();
        ((ArrayList) term51790).add((Object)null);
        ((ArrayList) term51790).add((Object)null);
        ((ArrayList) term51790).add((Object)null);
        ((ArrayList) term51790).add((Object)null);
        ((ArrayList) term51790).add((Object)null);
        ((ArrayList) term51790).add((Object)null);
        ((ArrayList) term51790).add((Object)null);
        Object term51788 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term51789 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term51789, term51789.getClass(), "wildcard", null);
        setField(term51789, term51789.getClass(), "generic", null);
        setField(term51789, term51789.getClass(), "qualified", null);
        setField(term51789, term51789.getClass(), "dimension", null);
        setField(term51788, term51788.getClass(), "type", term51789);
        setField(term51788, term51788.getClass(), "annotation", term51790);
        setField(term51788, term51788.getClass(), "name", "");
        ArrayList term51780 = new ArrayList();
        ((ArrayList) term51780).add(term51782);
        ((ArrayList) term51780).add(term51788);
        ArrayList term51801 = new ArrayList();
        ((ArrayList) term51801).add((Object)null);
        ((ArrayList) term51801).add((Object)null);
        ((ArrayList) term51801).add((Object)null);
        ((ArrayList) term51801).add((Object)null);
        ((ArrayList) term51801).add((Object)null);
        ((ArrayList) term51801).add((Object)null);
        ((ArrayList) term51801).add((Object)null);
        ((ArrayList) term51801).add((Object)null);
        Object term51799 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term51800 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term51800, term51800.getClass(), "extendsBound", null);
        setField(term51800, term51800.getClass(), "superBound", null);
        setField(term51799, term51799.getClass(), "wildcard", term51800);
        setField(term51799, term51799.getClass(), "generic", term51801);
        setField(term51799, term51799.getClass(), "qualified", "");
        setField(term51799, term51799.getClass(), "dimension", "");
        Object term51806 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term51806, term51806.getClass(), "wildcard", null);
        setField(term51806, term51806.getClass(), "generic", null);
        setField(term51806, term51806.getClass(), "qualified", null);
        setField(term51806, term51806.getClass(), "dimension", null);
        Object term51807 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term51807, term51807.getClass(), "wildcard", null);
        setField(term51807, term51807.getClass(), "generic", null);
        setField(term51807, term51807.getClass(), "qualified", null);
        setField(term51807, term51807.getClass(), "dimension", null);
        Object term51808 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term51808, term51808.getClass(), "wildcard", null);
        setField(term51808, term51808.getClass(), "generic", null);
        setField(term51808, term51808.getClass(), "qualified", null);
        setField(term51808, term51808.getClass(), "dimension", null);
        ArrayList term51811 = new ArrayList();
        ((ArrayList) term51811).add((Object)null);
        ((ArrayList) term51811).add((Object)null);
        ((ArrayList) term51811).add((Object)null);
        ((ArrayList) term51811).add((Object)null);
        ((ArrayList) term51811).add((Object)null);
        Object term51809 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term51810 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term51810, term51810.getClass(), "extendsBound", null);
        setField(term51810, term51810.getClass(), "superBound", null);
        setField(term51809, term51809.getClass(), "wildcard", term51810);
        setField(term51809, term51809.getClass(), "generic", term51811);
        setField(term51809, term51809.getClass(), "qualified", "");
        setField(term51809, term51809.getClass(), "dimension", "");
        ArrayList term51797 = new ArrayList();
        ((ArrayList) term51797).add(term51799);
        ((ArrayList) term51797).add(term51806);
        ((ArrayList) term51797).add(term51807);
        ((ArrayList) term51797).add(term51808);
        ((ArrayList) term51797).add(term51806);
        ((ArrayList) term51797).add(term51809);
        Object term51820 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term51820, term51820.getClass(), "argument", null);
        setField(term51820, term51820.getClass(), "name", null);
        setField(term51820, term51820.getClass(), "qualified", null);
        ArrayList term51822 = new ArrayList();
        Object term51821 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term51821, term51821.getClass(), "argument", term51822);
        setField(term51821, term51821.getClass(), "name", "");
        setField(term51821, term51821.getClass(), "qualified", "");
        Object term51827 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term51827, term51827.getClass(), "argument", null);
        setField(term51827, term51827.getClass(), "name", null);
        setField(term51827, term51827.getClass(), "qualified", null);
        ArrayList term51818 = new ArrayList();
        ((ArrayList) term51818).add(term51820);
        ((ArrayList) term51818).add(term51821);
        ((ArrayList) term51818).add(term51827);
        Boolean term51878 = new Boolean(true);
        Boolean term51880 = new Boolean(false);
        Boolean term51882 = new Boolean(false);
        Boolean term51884 = new Boolean(false);
        Boolean term51886 = new Boolean(false);
        Boolean term51888 = new Boolean(false);
        Boolean term51890 = new Boolean(true);
        term51751 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        Object term51796 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term51751, term51751.getClass(), "comment", "gbJxsdEGXk");
        setField(term51751, term51751.getClass(), "tag", term51764);
        setField(term51751, term51751.getClass(), "parameter", term51780);
        setField(term51796, term51796.getClass(), "wildcard", null);
        setField(term51796, term51796.getClass(), "generic", null);
        setField(term51796, term51796.getClass(), "qualified", null);
        setField(term51796, term51796.getClass(), "dimension", null);
        setField(term51751, term51751.getClass(), "_return", term51796);
        setField(term51751, term51751.getClass(), "exception", term51797);
        setField(term51751, term51751.getClass(), "annotation", term51818);
        setField(term51751, term51751.getClass(), "name", "UePIzekzMl");
        setField(term51751, term51751.getClass(), "signature", "taXfbiZnRi");
        setField(term51751, term51751.getClass(), "qualified", "ZuNzYTJsuq");
        setField(term51751, term51751.getClass(), "scope", "dECMBOCgGi");
        setField(term51751, term51751.getClass(), "_abstract", term51878);
        setField(term51751, term51751.getClass(), "_final", term51880);
        setField(term51751, term51751.getClass(), "included", term51882);
        setField(term51751, term51751.getClass(), "_native", term51884);
        setField(term51751, term51751.getClass(), "_synchronized", term51886);
        setField(term51751, term51751.getClass(), "_static", term51888);
        setField(term51751, term51751.getClass(), "varArgs", term51890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isVarArgs", argTypes, term51751, args);
    }

};


