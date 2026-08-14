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

public class MethodParameter_getAnnotation_3530762014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37149;

    public MethodParameter_getAnnotation_3530762014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37152 = new ArrayList();
        ((ArrayList) term37152).add((Object)null);
        ((ArrayList) term37152).add((Object)null);
        ((ArrayList) term37152).add((Object)null);
        ArrayList term37156 = new ArrayList();
        ((ArrayList) term37156).add((Object)null);
        ((ArrayList) term37156).add((Object)null);
        ((ArrayList) term37156).add((Object)null);
        ((ArrayList) term37156).add((Object)null);
        ((ArrayList) term37156).add((Object)null);
        ((ArrayList) term37156).add((Object)null);
        ((ArrayList) term37156).add((Object)null);
        ArrayList term37160 = new ArrayList();
        ArrayList term37191 = new ArrayList();
        ((ArrayList) term37191).add((Object)null);
        ((ArrayList) term37191).add((Object)null);
        ((ArrayList) term37191).add((Object)null);
        ((ArrayList) term37191).add((Object)null);
        ((ArrayList) term37191).add((Object)null);
        ((ArrayList) term37191).add((Object)null);
        ((ArrayList) term37191).add((Object)null);
        ((ArrayList) term37191).add((Object)null);
        ((ArrayList) term37191).add((Object)null);
        Object term37190 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term37190, term37190.getClass(), "argument", term37191);
        setField(term37190, term37190.getClass(), "name", "");
        setField(term37190, term37190.getClass(), "qualified", "");
        ArrayList term37197 = new ArrayList();
        ((ArrayList) term37197).add((Object)null);
        ((ArrayList) term37197).add((Object)null);
        ((ArrayList) term37197).add((Object)null);
        ((ArrayList) term37197).add((Object)null);
        ((ArrayList) term37197).add((Object)null);
        ((ArrayList) term37197).add((Object)null);
        Object term37196 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term37196, term37196.getClass(), "argument", term37197);
        setField(term37196, term37196.getClass(), "name", "");
        setField(term37196, term37196.getClass(), "qualified", "");
        ArrayList term37188 = new ArrayList();
        ((ArrayList) term37188).add(term37190);
        ((ArrayList) term37188).add(term37196);
        term37149 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term37150 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term37151 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term37151, term37151.getClass(), "extendsBound", term37152);
        setField(term37151, term37151.getClass(), "superBound", term37156);
        setField(term37150, term37150.getClass(), "wildcard", term37151);
        setField(term37150, term37150.getClass(), "generic", term37160);
        setField(term37150, term37150.getClass(), "qualified", "OVuedhrXPK");
        setField(term37150, term37150.getClass(), "dimension", "eNLegmDnty");
        setField(term37149, term37149.getClass(), "type", term37150);
        setField(term37149, term37149.getClass(), "annotation", term37188);
        setField(term37149, term37149.getClass(), "name", "aINaTyGiau");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.MethodParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnnotation", argTypes, term37149, args);
    }

};


