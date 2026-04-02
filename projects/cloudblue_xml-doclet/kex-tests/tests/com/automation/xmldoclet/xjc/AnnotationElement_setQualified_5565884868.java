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

public class AnnotationElement_setQualified_5565884868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6773;

    public AnnotationElement_setQualified_5565884868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6776 = new ArrayList();
        ((ArrayList) term6776).add((Object)null);
        ArrayList term6780 = new ArrayList();
        ((ArrayList) term6780).add((Object)null);
        ((ArrayList) term6780).add((Object)null);
        ((ArrayList) term6780).add((Object)null);
        ((ArrayList) term6780).add((Object)null);
        ((ArrayList) term6780).add((Object)null);
        ((ArrayList) term6780).add((Object)null);
        ((ArrayList) term6780).add((Object)null);
        Object term6786 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6786, term6786.getClass(), "wildcard", null);
        setField(term6786, term6786.getClass(), "generic", null);
        setField(term6786, term6786.getClass(), "qualified", null);
        setField(term6786, term6786.getClass(), "dimension", null);
        Object term6787 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6787, term6787.getClass(), "wildcard", null);
        setField(term6787, term6787.getClass(), "generic", null);
        setField(term6787, term6787.getClass(), "qualified", null);
        setField(term6787, term6787.getClass(), "dimension", null);
        Object term6788 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6788, term6788.getClass(), "wildcard", null);
        setField(term6788, term6788.getClass(), "generic", null);
        setField(term6788, term6788.getClass(), "qualified", null);
        setField(term6788, term6788.getClass(), "dimension", null);
        ArrayList term6784 = new ArrayList();
        ((ArrayList) term6784).add(term6786);
        ((ArrayList) term6784).add(term6787);
        ((ArrayList) term6784).add(term6788);
        term6773 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term6774 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term6775 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term6775, term6775.getClass(), "extendsBound", term6776);
        setField(term6775, term6775.getClass(), "superBound", term6780);
        setField(term6774, term6774.getClass(), "wildcard", term6775);
        setField(term6774, term6774.getClass(), "generic", term6784);
        setField(term6774, term6774.getClass(), "qualified", "PfWKdFFgbz");
        setField(term6774, term6774.getClass(), "dimension", "rgmFLfFmTW");
        setField(term6773, term6773.getClass(), "type", term6774);
        setField(term6773, term6773.getClass(), "name", "GHvFvelXFv");
        setField(term6773, term6773.getClass(), "qualified", "MIDoqNmCoh");
        setField(term6773, term6773.getClass(), "_default", "yrOIMfdQSI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PhtNZAacut";
        callMethod(klass, "setQualified", argTypes, term6773, args);
    }

};


