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

public class TypeInfo_getWildcard_517020471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44709;

    public TypeInfo_getWildcard_517020471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44713 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44713, term44713.getClass(), "wildcard", null);
        setField(term44713, term44713.getClass(), "generic", null);
        setField(term44713, term44713.getClass(), "qualified", null);
        setField(term44713, term44713.getClass(), "dimension", null);
        Object term44714 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44714, term44714.getClass(), "wildcard", null);
        setField(term44714, term44714.getClass(), "generic", null);
        setField(term44714, term44714.getClass(), "qualified", null);
        setField(term44714, term44714.getClass(), "dimension", null);
        Object term44715 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44715, term44715.getClass(), "wildcard", null);
        setField(term44715, term44715.getClass(), "generic", null);
        setField(term44715, term44715.getClass(), "qualified", null);
        setField(term44715, term44715.getClass(), "dimension", null);
        ArrayList term44711 = new ArrayList();
        ((ArrayList) term44711).add(term44713);
        ((ArrayList) term44711).add(term44714);
        ((ArrayList) term44711).add(term44714);
        ((ArrayList) term44711).add(term44713);
        ((ArrayList) term44711).add(term44715);
        Object term44720 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44720, term44720.getClass(), "wildcard", null);
        setField(term44720, term44720.getClass(), "generic", null);
        setField(term44720, term44720.getClass(), "qualified", null);
        setField(term44720, term44720.getClass(), "dimension", null);
        Object term44721 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44721, term44721.getClass(), "wildcard", null);
        setField(term44721, term44721.getClass(), "generic", null);
        setField(term44721, term44721.getClass(), "qualified", null);
        setField(term44721, term44721.getClass(), "dimension", null);
        Object term44722 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44722, term44722.getClass(), "wildcard", null);
        setField(term44722, term44722.getClass(), "generic", null);
        setField(term44722, term44722.getClass(), "qualified", null);
        setField(term44722, term44722.getClass(), "dimension", null);
        Object term44723 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44723, term44723.getClass(), "wildcard", null);
        setField(term44723, term44723.getClass(), "generic", null);
        setField(term44723, term44723.getClass(), "qualified", null);
        setField(term44723, term44723.getClass(), "dimension", null);
        ArrayList term44718 = new ArrayList();
        ((ArrayList) term44718).add(term44715);
        ((ArrayList) term44718).add(term44720);
        ((ArrayList) term44718).add(term44721);
        ((ArrayList) term44718).add(term44722);
        ((ArrayList) term44718).add(term44715);
        ((ArrayList) term44718).add(term44723);
        Object term44728 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44728, term44728.getClass(), "wildcard", null);
        setField(term44728, term44728.getClass(), "generic", null);
        setField(term44728, term44728.getClass(), "qualified", null);
        setField(term44728, term44728.getClass(), "dimension", null);
        ArrayList term44726 = new ArrayList();
        ((ArrayList) term44726).add(term44713);
        ((ArrayList) term44726).add(term44728);
        ((ArrayList) term44726).add(term44723);
        ((ArrayList) term44726).add(term44723);
        ((ArrayList) term44726).add(term44721);
        ((ArrayList) term44726).add(term44714);
        ((ArrayList) term44726).add(term44713);
        ((ArrayList) term44726).add(term44715);
        term44709 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term44710 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term44710, term44710.getClass(), "extendsBound", term44711);
        setField(term44710, term44710.getClass(), "superBound", term44718);
        setField(term44709, term44709.getClass(), "wildcard", term44710);
        setField(term44709, term44709.getClass(), "generic", term44726);
        setField(term44709, term44709.getClass(), "qualified", "ThyEfukIVr");
        setField(term44709, term44709.getClass(), "dimension", "LgPtDDNbQd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.TypeInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWildcard", argTypes, term44709, args);
    }

};


