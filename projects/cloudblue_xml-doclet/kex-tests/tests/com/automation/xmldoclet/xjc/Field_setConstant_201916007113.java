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
import java.lang.Boolean;

public class Field_setConstant_201916007113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58159;

    public Field_setConstant_201916007113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term58162 = new ArrayList();
        ((ArrayList) term58162).add((Object)null);
        ((ArrayList) term58162).add((Object)null);
        ((ArrayList) term58162).add((Object)null);
        ((ArrayList) term58162).add((Object)null);
        ((ArrayList) term58162).add((Object)null);
        ArrayList term58166 = new ArrayList();
        ((ArrayList) term58166).add((Object)null);
        ((ArrayList) term58166).add((Object)null);
        ((ArrayList) term58166).add((Object)null);
        ((ArrayList) term58166).add((Object)null);
        ((ArrayList) term58166).add((Object)null);
        ((ArrayList) term58166).add((Object)null);
        ((ArrayList) term58166).add((Object)null);
        Object term58172 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term58172, term58172.getClass(), "wildcard", null);
        setField(term58172, term58172.getClass(), "generic", null);
        setField(term58172, term58172.getClass(), "qualified", null);
        setField(term58172, term58172.getClass(), "dimension", null);
        Object term58173 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term58173, term58173.getClass(), "wildcard", null);
        setField(term58173, term58173.getClass(), "generic", null);
        setField(term58173, term58173.getClass(), "qualified", null);
        setField(term58173, term58173.getClass(), "dimension", null);
        Object term58174 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term58174, term58174.getClass(), "wildcard", null);
        setField(term58174, term58174.getClass(), "generic", null);
        setField(term58174, term58174.getClass(), "qualified", null);
        setField(term58174, term58174.getClass(), "dimension", null);
        Object term58175 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term58175, term58175.getClass(), "wildcard", null);
        setField(term58175, term58175.getClass(), "generic", null);
        setField(term58175, term58175.getClass(), "qualified", null);
        setField(term58175, term58175.getClass(), "dimension", null);
        ArrayList term58170 = new ArrayList();
        ((ArrayList) term58170).add(term58172);
        ((ArrayList) term58170).add(term58173);
        ((ArrayList) term58170).add(term58174);
        ((ArrayList) term58170).add(term58175);
        Object term58216 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term58216, term58216.getClass(), "name", "");
        setField(term58216, term58216.getClass(), "text", "");
        Object term58219 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term58219, term58219.getClass(), "name", "");
        setField(term58219, term58219.getClass(), "text", "");
        Object term58222 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term58222, term58222.getClass(), "name", "");
        setField(term58222, term58222.getClass(), "text", "");
        ArrayList term58214 = new ArrayList();
        ((ArrayList) term58214).add(term58216);
        ((ArrayList) term58214).add(term58219);
        ((ArrayList) term58214).add(term58222);
        ArrayList term58239 = new ArrayList();
        Boolean term58279 = new Boolean(false);
        Boolean term58281 = new Boolean(true);
        Boolean term58283 = new Boolean(true);
        Boolean term58285 = new Boolean(false);
        term58159 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        Object term58160 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term58161 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term58161, term58161.getClass(), "extendsBound", term58162);
        setField(term58161, term58161.getClass(), "superBound", term58166);
        setField(term58160, term58160.getClass(), "wildcard", term58161);
        setField(term58160, term58160.getClass(), "generic", term58170);
        setField(term58160, term58160.getClass(), "qualified", "DgoHAJiqzO");
        setField(term58160, term58160.getClass(), "dimension", "OSfebKeFlT");
        setField(term58159, term58159.getClass(), "type", term58160);
        setField(term58159, term58159.getClass(), "comment", "MVEgAXBuuY");
        setField(term58159, term58159.getClass(), "tag", term58214);
        setField(term58159, term58159.getClass(), "constant", "hgSrOgDkQk");
        setField(term58159, term58159.getClass(), "annotation", term58239);
        setField(term58159, term58159.getClass(), "name", "pCUdHHMDob");
        setField(term58159, term58159.getClass(), "qualified", "qTTHBVzNob");
        setField(term58159, term58159.getClass(), "scope", "BQrpYxrVbZ");
        setField(term58159, term58159.getClass(), "_volatile", term58279);
        setField(term58159, term58159.getClass(), "_transient", term58281);
        setField(term58159, term58159.getClass(), "_static", term58283);
        setField(term58159, term58159.getClass(), "_final", term58285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WppPRVuSIL";
        callMethod(klass, "setConstant", argTypes, term58159, args);
    }

};


