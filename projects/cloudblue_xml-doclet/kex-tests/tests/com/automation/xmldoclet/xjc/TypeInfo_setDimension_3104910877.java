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

public class TypeInfo_setDimension_3104910877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45157;

    public TypeInfo_setDimension_3104910877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45161 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45161, term45161.getClass(), "wildcard", null);
        setField(term45161, term45161.getClass(), "generic", null);
        setField(term45161, term45161.getClass(), "qualified", null);
        setField(term45161, term45161.getClass(), "dimension", null);
        Object term45162 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45162, term45162.getClass(), "wildcard", null);
        setField(term45162, term45162.getClass(), "generic", null);
        setField(term45162, term45162.getClass(), "qualified", null);
        setField(term45162, term45162.getClass(), "dimension", null);
        ArrayList term45159 = new ArrayList();
        ((ArrayList) term45159).add(term45161);
        ((ArrayList) term45159).add(term45162);
        Object term45167 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45167, term45167.getClass(), "wildcard", null);
        setField(term45167, term45167.getClass(), "generic", null);
        setField(term45167, term45167.getClass(), "qualified", null);
        setField(term45167, term45167.getClass(), "dimension", null);
        Object term45168 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45168, term45168.getClass(), "wildcard", null);
        setField(term45168, term45168.getClass(), "generic", null);
        setField(term45168, term45168.getClass(), "qualified", null);
        setField(term45168, term45168.getClass(), "dimension", null);
        Object term45169 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45169, term45169.getClass(), "wildcard", null);
        setField(term45169, term45169.getClass(), "generic", null);
        setField(term45169, term45169.getClass(), "qualified", null);
        setField(term45169, term45169.getClass(), "dimension", null);
        Object term45170 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45170, term45170.getClass(), "wildcard", null);
        setField(term45170, term45170.getClass(), "generic", null);
        setField(term45170, term45170.getClass(), "qualified", null);
        setField(term45170, term45170.getClass(), "dimension", null);
        Object term45171 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45171, term45171.getClass(), "wildcard", null);
        setField(term45171, term45171.getClass(), "generic", null);
        setField(term45171, term45171.getClass(), "qualified", null);
        setField(term45171, term45171.getClass(), "dimension", null);
        ArrayList term45165 = new ArrayList();
        ((ArrayList) term45165).add(term45161);
        ((ArrayList) term45165).add(term45167);
        ((ArrayList) term45165).add(term45168);
        ((ArrayList) term45165).add(term45161);
        ((ArrayList) term45165).add(term45169);
        ((ArrayList) term45165).add(term45170);
        ((ArrayList) term45165).add(term45171);
        Object term45176 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45176, term45176.getClass(), "wildcard", null);
        setField(term45176, term45176.getClass(), "generic", null);
        setField(term45176, term45176.getClass(), "qualified", null);
        setField(term45176, term45176.getClass(), "dimension", null);
        ArrayList term45174 = new ArrayList();
        ((ArrayList) term45174).add(term45161);
        ((ArrayList) term45174).add(term45170);
        ((ArrayList) term45174).add(term45176);
        term45157 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term45158 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term45158, term45158.getClass(), "extendsBound", term45159);
        setField(term45158, term45158.getClass(), "superBound", term45165);
        setField(term45157, term45157.getClass(), "wildcard", term45158);
        setField(term45157, term45157.getClass(), "generic", term45174);
        setField(term45157, term45157.getClass(), "qualified", "obKbDRrDoQ");
        setField(term45157, term45157.getClass(), "dimension", "yRcPYOqCMU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.TypeInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gjmHWuwnju";
        callMethod(klass, "setDimension", argTypes, term45157, args);
    }

};


