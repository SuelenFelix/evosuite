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

public class Wildcard_getSuperBound_715853452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7253;

    public Wildcard_getSuperBound_715853452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7258 = new ArrayList();
        ((ArrayList) term7258).add((Object)null);
        ((ArrayList) term7258).add((Object)null);
        Object term7256 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term7257 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term7257, term7257.getClass(), "extendsBound", null);
        setField(term7257, term7257.getClass(), "superBound", null);
        setField(term7256, term7256.getClass(), "wildcard", term7257);
        setField(term7256, term7256.getClass(), "generic", term7258);
        setField(term7256, term7256.getClass(), "qualified", "");
        setField(term7256, term7256.getClass(), "dimension", "");
        ArrayList term7265 = new ArrayList();
        Object term7263 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term7264 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term7264, term7264.getClass(), "extendsBound", null);
        setField(term7264, term7264.getClass(), "superBound", null);
        setField(term7263, term7263.getClass(), "wildcard", term7264);
        setField(term7263, term7263.getClass(), "generic", term7265);
        setField(term7263, term7263.getClass(), "qualified", "");
        setField(term7263, term7263.getClass(), "dimension", "");
        ArrayList term7272 = new ArrayList();
        ((ArrayList) term7272).add((Object)null);
        ((ArrayList) term7272).add((Object)null);
        ((ArrayList) term7272).add((Object)null);
        ((ArrayList) term7272).add((Object)null);
        ((ArrayList) term7272).add((Object)null);
        ((ArrayList) term7272).add((Object)null);
        Object term7270 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term7271 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term7271, term7271.getClass(), "extendsBound", null);
        setField(term7271, term7271.getClass(), "superBound", null);
        setField(term7270, term7270.getClass(), "wildcard", term7271);
        setField(term7270, term7270.getClass(), "generic", term7272);
        setField(term7270, term7270.getClass(), "qualified", "");
        setField(term7270, term7270.getClass(), "dimension", "");
        Object term7277 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term7277, term7277.getClass(), "wildcard", null);
        setField(term7277, term7277.getClass(), "generic", null);
        setField(term7277, term7277.getClass(), "qualified", null);
        setField(term7277, term7277.getClass(), "dimension", null);
        Object term7278 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term7278, term7278.getClass(), "wildcard", null);
        setField(term7278, term7278.getClass(), "generic", null);
        setField(term7278, term7278.getClass(), "qualified", null);
        setField(term7278, term7278.getClass(), "dimension", null);
        Object term7279 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term7279, term7279.getClass(), "wildcard", null);
        setField(term7279, term7279.getClass(), "generic", null);
        setField(term7279, term7279.getClass(), "qualified", null);
        setField(term7279, term7279.getClass(), "dimension", null);
        ArrayList term7282 = new ArrayList();
        ((ArrayList) term7282).add((Object)null);
        ((ArrayList) term7282).add((Object)null);
        ((ArrayList) term7282).add((Object)null);
        ((ArrayList) term7282).add((Object)null);
        ((ArrayList) term7282).add((Object)null);
        ((ArrayList) term7282).add((Object)null);
        ((ArrayList) term7282).add((Object)null);
        ((ArrayList) term7282).add((Object)null);
        Object term7280 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term7281 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term7281, term7281.getClass(), "extendsBound", null);
        setField(term7281, term7281.getClass(), "superBound", null);
        setField(term7280, term7280.getClass(), "wildcard", term7281);
        setField(term7280, term7280.getClass(), "generic", term7282);
        setField(term7280, term7280.getClass(), "qualified", "");
        setField(term7280, term7280.getClass(), "dimension", "");
        ArrayList term7289 = new ArrayList();
        ((ArrayList) term7289).add((Object)null);
        ((ArrayList) term7289).add((Object)null);
        ((ArrayList) term7289).add((Object)null);
        ((ArrayList) term7289).add((Object)null);
        ((ArrayList) term7289).add((Object)null);
        ((ArrayList) term7289).add((Object)null);
        ((ArrayList) term7289).add((Object)null);
        ((ArrayList) term7289).add((Object)null);
        Object term7287 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term7288 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term7288, term7288.getClass(), "extendsBound", null);
        setField(term7288, term7288.getClass(), "superBound", null);
        setField(term7287, term7287.getClass(), "wildcard", term7288);
        setField(term7287, term7287.getClass(), "generic", term7289);
        setField(term7287, term7287.getClass(), "qualified", "");
        setField(term7287, term7287.getClass(), "dimension", "");
        ArrayList term7254 = new ArrayList();
        ((ArrayList) term7254).add(term7256);
        ((ArrayList) term7254).add(term7263);
        ((ArrayList) term7254).add(term7270);
        ((ArrayList) term7254).add(term7277);
        ((ArrayList) term7254).add(term7278);
        ((ArrayList) term7254).add(term7256);
        ((ArrayList) term7254).add(term7279);
        ((ArrayList) term7254).add(term7280);
        ((ArrayList) term7254).add(term7287);
        ArrayList term7296 = new ArrayList();
        ((ArrayList) term7296).add(term7280);
        term7253 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term7253, term7253.getClass(), "extendsBound", term7254);
        setField(term7253, term7253.getClass(), "superBound", term7296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Wildcard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuperBound", argTypes, term7253, args);
    }

};


