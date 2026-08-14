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

public class TypeInfo_setQualified_6238849235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45006;

    public TypeInfo_setQualified_6238849235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45010 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45010, term45010.getClass(), "wildcard", null);
        setField(term45010, term45010.getClass(), "generic", null);
        setField(term45010, term45010.getClass(), "qualified", null);
        setField(term45010, term45010.getClass(), "dimension", null);
        Object term45011 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45011, term45011.getClass(), "wildcard", null);
        setField(term45011, term45011.getClass(), "generic", null);
        setField(term45011, term45011.getClass(), "qualified", null);
        setField(term45011, term45011.getClass(), "dimension", null);
        Object term45012 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45012, term45012.getClass(), "wildcard", null);
        setField(term45012, term45012.getClass(), "generic", null);
        setField(term45012, term45012.getClass(), "qualified", null);
        setField(term45012, term45012.getClass(), "dimension", null);
        ArrayList term45008 = new ArrayList();
        ((ArrayList) term45008).add(term45010);
        ((ArrayList) term45008).add(term45011);
        ((ArrayList) term45008).add(term45010);
        ((ArrayList) term45008).add(term45012);
        ArrayList term45015 = new ArrayList();
        Object term45021 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45021, term45021.getClass(), "wildcard", null);
        setField(term45021, term45021.getClass(), "generic", null);
        setField(term45021, term45021.getClass(), "qualified", null);
        setField(term45021, term45021.getClass(), "dimension", null);
        ArrayList term45024 = new ArrayList();
        ((ArrayList) term45024).add((Object)null);
        ((ArrayList) term45024).add((Object)null);
        ((ArrayList) term45024).add((Object)null);
        Object term45022 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term45023 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term45023, term45023.getClass(), "extendsBound", null);
        setField(term45023, term45023.getClass(), "superBound", null);
        setField(term45022, term45022.getClass(), "wildcard", term45023);
        setField(term45022, term45022.getClass(), "generic", term45024);
        setField(term45022, term45022.getClass(), "qualified", "");
        setField(term45022, term45022.getClass(), "dimension", "");
        ArrayList term45019 = new ArrayList();
        ((ArrayList) term45019).add(term45010);
        ((ArrayList) term45019).add(term45021);
        ((ArrayList) term45019).add(term45022);
        term45006 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term45007 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term45007, term45007.getClass(), "extendsBound", term45008);
        setField(term45007, term45007.getClass(), "superBound", term45015);
        setField(term45006, term45006.getClass(), "wildcard", term45007);
        setField(term45006, term45006.getClass(), "generic", term45019);
        setField(term45006, term45006.getClass(), "qualified", "XfIHmskDgl");
        setField(term45006, term45006.getClass(), "dimension", "akmBQSzyqF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.TypeInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MNYRAuwhSL";
        callMethod(klass, "setQualified", argTypes, term45006, args);
    }

};


