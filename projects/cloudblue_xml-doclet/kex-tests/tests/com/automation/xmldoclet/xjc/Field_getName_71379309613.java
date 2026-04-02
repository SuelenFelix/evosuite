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

public class Field_getName_71379309613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56471;

    public Field_getName_71379309613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term56474 = new ArrayList();
        ((ArrayList) term56474).add((Object)null);
        ((ArrayList) term56474).add((Object)null);
        ((ArrayList) term56474).add((Object)null);
        ((ArrayList) term56474).add((Object)null);
        ((ArrayList) term56474).add((Object)null);
        ((ArrayList) term56474).add((Object)null);
        ((ArrayList) term56474).add((Object)null);
        ArrayList term56478 = new ArrayList();
        ((ArrayList) term56478).add((Object)null);
        ((ArrayList) term56478).add((Object)null);
        ((ArrayList) term56478).add((Object)null);
        ((ArrayList) term56478).add((Object)null);
        ((ArrayList) term56478).add((Object)null);
        ((ArrayList) term56478).add((Object)null);
        ((ArrayList) term56478).add((Object)null);
        Object term56484 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term56484, term56484.getClass(), "wildcard", null);
        setField(term56484, term56484.getClass(), "generic", null);
        setField(term56484, term56484.getClass(), "qualified", null);
        setField(term56484, term56484.getClass(), "dimension", null);
        Object term56485 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term56485, term56485.getClass(), "wildcard", null);
        setField(term56485, term56485.getClass(), "generic", null);
        setField(term56485, term56485.getClass(), "qualified", null);
        setField(term56485, term56485.getClass(), "dimension", null);
        Object term56486 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term56486, term56486.getClass(), "wildcard", null);
        setField(term56486, term56486.getClass(), "generic", null);
        setField(term56486, term56486.getClass(), "qualified", null);
        setField(term56486, term56486.getClass(), "dimension", null);
        ArrayList term56482 = new ArrayList();
        ((ArrayList) term56482).add(term56484);
        ((ArrayList) term56482).add(term56485);
        ((ArrayList) term56482).add(term56484);
        ((ArrayList) term56482).add(term56486);
        ((ArrayList) term56482).add(term56486);
        Object term56527 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term56527, term56527.getClass(), "name", "");
        setField(term56527, term56527.getClass(), "text", "");
        Object term56530 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term56530, term56530.getClass(), "name", "");
        setField(term56530, term56530.getClass(), "text", "");
        Object term56533 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term56533, term56533.getClass(), "name", "");
        setField(term56533, term56533.getClass(), "text", "");
        Object term56536 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term56536, term56536.getClass(), "name", "");
        setField(term56536, term56536.getClass(), "text", "");
        Object term56539 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term56539, term56539.getClass(), "name", "");
        setField(term56539, term56539.getClass(), "text", "");
        Object term56542 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term56542, term56542.getClass(), "name", "");
        setField(term56542, term56542.getClass(), "text", "");
        Object term56545 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term56545, term56545.getClass(), "name", "");
        setField(term56545, term56545.getClass(), "text", "");
        ArrayList term56525 = new ArrayList();
        ((ArrayList) term56525).add(term56527);
        ((ArrayList) term56525).add(term56530);
        ((ArrayList) term56525).add(term56533);
        ((ArrayList) term56525).add(term56536);
        ((ArrayList) term56525).add(term56539);
        ((ArrayList) term56525).add(term56542);
        ((ArrayList) term56525).add(term56545);
        ArrayList term56562 = new ArrayList();
        Boolean term56602 = new Boolean(false);
        Boolean term56604 = new Boolean(true);
        Boolean term56606 = new Boolean(false);
        Boolean term56608 = new Boolean(false);
        term56471 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        Object term56472 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term56473 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term56473, term56473.getClass(), "extendsBound", term56474);
        setField(term56473, term56473.getClass(), "superBound", term56478);
        setField(term56472, term56472.getClass(), "wildcard", term56473);
        setField(term56472, term56472.getClass(), "generic", term56482);
        setField(term56472, term56472.getClass(), "qualified", "WlOAHMxcpP");
        setField(term56472, term56472.getClass(), "dimension", "mXSWbPPmpH");
        setField(term56471, term56471.getClass(), "type", term56472);
        setField(term56471, term56471.getClass(), "comment", "wzNZQPeXcW");
        setField(term56471, term56471.getClass(), "tag", term56525);
        setField(term56471, term56471.getClass(), "constant", "NfLFcCeRUc");
        setField(term56471, term56471.getClass(), "annotation", term56562);
        setField(term56471, term56471.getClass(), "name", "TNlaXiVYsL");
        setField(term56471, term56471.getClass(), "qualified", "uJeKTIpIyX");
        setField(term56471, term56471.getClass(), "scope", "cBaNlSrvBf");
        setField(term56471, term56471.getClass(), "_volatile", term56602);
        setField(term56471, term56471.getClass(), "_transient", term56604);
        setField(term56471, term56471.getClass(), "_static", term56606);
        setField(term56471, term56471.getClass(), "_final", term56608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term56471, args);
    }

};


