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

public class AnnotationElement_getQualified_7193459267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6646;

    public AnnotationElement_getQualified_7193459267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6649 = new ArrayList();
        ArrayList term6653 = new ArrayList();
        ((ArrayList) term6653).add((Object)null);
        ((ArrayList) term6653).add((Object)null);
        ((ArrayList) term6653).add((Object)null);
        ((ArrayList) term6653).add((Object)null);
        ((ArrayList) term6653).add((Object)null);
        ((ArrayList) term6653).add((Object)null);
        Object term6659 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6659, term6659.getClass(), "wildcard", null);
        setField(term6659, term6659.getClass(), "generic", null);
        setField(term6659, term6659.getClass(), "qualified", null);
        setField(term6659, term6659.getClass(), "dimension", null);
        Object term6660 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6660, term6660.getClass(), "wildcard", null);
        setField(term6660, term6660.getClass(), "generic", null);
        setField(term6660, term6660.getClass(), "qualified", null);
        setField(term6660, term6660.getClass(), "dimension", null);
        ArrayList term6657 = new ArrayList();
        ((ArrayList) term6657).add(term6659);
        ((ArrayList) term6657).add(term6660);
        term6646 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term6647 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term6648 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term6648, term6648.getClass(), "extendsBound", term6649);
        setField(term6648, term6648.getClass(), "superBound", term6653);
        setField(term6647, term6647.getClass(), "wildcard", term6648);
        setField(term6647, term6647.getClass(), "generic", term6657);
        setField(term6647, term6647.getClass(), "qualified", "UHxidCtatV");
        setField(term6647, term6647.getClass(), "dimension", "LRzADDSjVT");
        setField(term6646, term6646.getClass(), "type", term6647);
        setField(term6646, term6646.getClass(), "name", "lpFCMaAYxj");
        setField(term6646, term6646.getClass(), "qualified", "fzHVMNSLii");
        setField(term6646, term6646.getClass(), "_default", "TxymnVINZF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQualified", argTypes, term6646, args);
    }

};


