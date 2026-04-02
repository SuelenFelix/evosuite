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

public class Annotation_getElement_19635878174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43037;

    public Annotation_getElement_19635878174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43052 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43052, term43052.getClass(), "name", "");
        setField(term43052, term43052.getClass(), "text", "");
        Object term43055 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43055, term43055.getClass(), "name", "");
        setField(term43055, term43055.getClass(), "text", "");
        Object term43058 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43058, term43058.getClass(), "name", "");
        setField(term43058, term43058.getClass(), "text", "");
        Object term43061 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43061, term43061.getClass(), "name", "");
        setField(term43061, term43061.getClass(), "text", "");
        ArrayList term43050 = new ArrayList();
        ((ArrayList) term43050).add(term43052);
        ((ArrayList) term43050).add(term43055);
        ((ArrayList) term43050).add(term43058);
        ((ArrayList) term43050).add(term43061);
        Object term43068 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43069 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43069, term43069.getClass(), "wildcard", null);
        setField(term43069, term43069.getClass(), "generic", null);
        setField(term43069, term43069.getClass(), "qualified", null);
        setField(term43069, term43069.getClass(), "dimension", null);
        setField(term43068, term43068.getClass(), "type", term43069);
        setField(term43068, term43068.getClass(), "name", "");
        setField(term43068, term43068.getClass(), "qualified", "");
        setField(term43068, term43068.getClass(), "_default", "");
        Object term43073 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43074 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43074, term43074.getClass(), "wildcard", null);
        setField(term43074, term43074.getClass(), "generic", null);
        setField(term43074, term43074.getClass(), "qualified", null);
        setField(term43074, term43074.getClass(), "dimension", null);
        setField(term43073, term43073.getClass(), "type", term43074);
        setField(term43073, term43073.getClass(), "name", "");
        setField(term43073, term43073.getClass(), "qualified", "");
        setField(term43073, term43073.getClass(), "_default", "");
        ArrayList term43066 = new ArrayList();
        ((ArrayList) term43066).add(term43068);
        ((ArrayList) term43066).add(term43073);
        ArrayList term43083 = new ArrayList();
        ((ArrayList) term43083).add((Object)null);
        ((ArrayList) term43083).add((Object)null);
        ((ArrayList) term43083).add((Object)null);
        ((ArrayList) term43083).add((Object)null);
        ((ArrayList) term43083).add((Object)null);
        ((ArrayList) term43083).add((Object)null);
        ((ArrayList) term43083).add((Object)null);
        Object term43082 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43082, term43082.getClass(), "argument", term43083);
        setField(term43082, term43082.getClass(), "name", "");
        setField(term43082, term43082.getClass(), "qualified", "");
        ArrayList term43089 = new ArrayList();
        ((ArrayList) term43089).add((Object)null);
        ((ArrayList) term43089).add((Object)null);
        ((ArrayList) term43089).add((Object)null);
        ((ArrayList) term43089).add((Object)null);
        ((ArrayList) term43089).add((Object)null);
        Object term43088 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43088, term43088.getClass(), "argument", term43089);
        setField(term43088, term43088.getClass(), "name", "");
        setField(term43088, term43088.getClass(), "qualified", "");
        ArrayList term43095 = new ArrayList();
        ((ArrayList) term43095).add((Object)null);
        ((ArrayList) term43095).add((Object)null);
        ((ArrayList) term43095).add((Object)null);
        ((ArrayList) term43095).add((Object)null);
        ((ArrayList) term43095).add((Object)null);
        ((ArrayList) term43095).add((Object)null);
        ((ArrayList) term43095).add((Object)null);
        ((ArrayList) term43095).add((Object)null);
        Object term43094 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43094, term43094.getClass(), "argument", term43095);
        setField(term43094, term43094.getClass(), "name", "");
        setField(term43094, term43094.getClass(), "qualified", "");
        ArrayList term43101 = new ArrayList();
        ((ArrayList) term43101).add((Object)null);
        ((ArrayList) term43101).add((Object)null);
        ((ArrayList) term43101).add((Object)null);
        ((ArrayList) term43101).add((Object)null);
        Object term43100 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43100, term43100.getClass(), "argument", term43101);
        setField(term43100, term43100.getClass(), "name", "");
        setField(term43100, term43100.getClass(), "qualified", "");
        ArrayList term43107 = new ArrayList();
        ((ArrayList) term43107).add((Object)null);
        ((ArrayList) term43107).add((Object)null);
        ((ArrayList) term43107).add((Object)null);
        ((ArrayList) term43107).add((Object)null);
        ((ArrayList) term43107).add((Object)null);
        ((ArrayList) term43107).add((Object)null);
        ((ArrayList) term43107).add((Object)null);
        ((ArrayList) term43107).add((Object)null);
        Object term43106 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43106, term43106.getClass(), "argument", term43107);
        setField(term43106, term43106.getClass(), "name", "");
        setField(term43106, term43106.getClass(), "qualified", "");
        ArrayList term43080 = new ArrayList();
        ((ArrayList) term43080).add(term43082);
        ((ArrayList) term43080).add(term43088);
        ((ArrayList) term43080).add(term43094);
        ((ArrayList) term43080).add(term43100);
        ((ArrayList) term43080).add(term43106);
        ((ArrayList) term43080).add(term43100);
        ((ArrayList) term43080).add(term43088);
        ((ArrayList) term43080).add(term43094);
        Boolean term43150 = new Boolean(true);
        term43037 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Annotation"));
        setField(term43037, term43037.getClass(), "comment", "sNFXPgdzWf");
        setField(term43037, term43037.getClass(), "tag", term43050);
        setField(term43037, term43037.getClass(), "element", term43066);
        setField(term43037, term43037.getClass(), "annotation", term43080);
        setField(term43037, term43037.getClass(), "name", "DuNwSYpxhB");
        setField(term43037, term43037.getClass(), "qualified", "KQFxroueZG");
        setField(term43037, term43037.getClass(), "scope", "khzIgrsbYP");
        setField(term43037, term43037.getClass(), "included", term43150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Annotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getElement", argTypes, term43037, args);
    }

};


