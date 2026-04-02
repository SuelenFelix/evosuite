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

public class AnnotationInstance_getQualified_12577576554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287;

    public AnnotationInstance_getQualified_12577576554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term292 = new ArrayList();
        ((ArrayList) term292).add((Object)null);
        ((ArrayList) term292).add((Object)null);
        ((ArrayList) term292).add((Object)null);
        ArrayList term295 = new ArrayList();
        Boolean term299 = new Boolean(false);
        Boolean term301 = new Boolean(false);
        Object term290 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term291 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term291, term291.getClass(), "wildcard", null);
        setField(term291, term291.getClass(), "generic", null);
        setField(term291, term291.getClass(), "qualified", null);
        setField(term291, term291.getClass(), "dimension", null);
        setField(term290, term290.getClass(), "type", term291);
        setField(term290, term290.getClass(), "value", term292);
        setField(term290, term290.getClass(), "annotation", term295);
        setField(term290, term290.getClass(), "name", "");
        setField(term290, term290.getClass(), "primitive", term299);
        setField(term290, term290.getClass(), "array", term301);
        ArrayList term305 = new ArrayList();
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ArrayList term308 = new ArrayList();
        ((ArrayList) term308).add((Object)null);
        ((ArrayList) term308).add((Object)null);
        ((ArrayList) term308).add((Object)null);
        ((ArrayList) term308).add((Object)null);
        ((ArrayList) term308).add((Object)null);
        ((ArrayList) term308).add((Object)null);
        Boolean term312 = new Boolean(false);
        Boolean term314 = new Boolean(true);
        Object term303 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term304 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term304, term304.getClass(), "wildcard", null);
        setField(term304, term304.getClass(), "generic", null);
        setField(term304, term304.getClass(), "qualified", null);
        setField(term304, term304.getClass(), "dimension", null);
        setField(term303, term303.getClass(), "type", term304);
        setField(term303, term303.getClass(), "value", term305);
        setField(term303, term303.getClass(), "annotation", term308);
        setField(term303, term303.getClass(), "name", "");
        setField(term303, term303.getClass(), "primitive", term312);
        setField(term303, term303.getClass(), "array", term314);
        ArrayList term317 = new ArrayList();
        ((ArrayList) term317).add((Object)null);
        ((ArrayList) term317).add((Object)null);
        ((ArrayList) term317).add((Object)null);
        ((ArrayList) term317).add((Object)null);
        ((ArrayList) term317).add((Object)null);
        ((ArrayList) term317).add((Object)null);
        ((ArrayList) term317).add((Object)null);
        ArrayList term320 = new ArrayList();
        ((ArrayList) term320).add((Object)null);
        ((ArrayList) term320).add((Object)null);
        ((ArrayList) term320).add((Object)null);
        ((ArrayList) term320).add((Object)null);
        ((ArrayList) term320).add((Object)null);
        Boolean term324 = new Boolean(true);
        Boolean term326 = new Boolean(false);
        Object term316 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        setField(term316, term316.getClass(), "type", term304);
        setField(term316, term316.getClass(), "value", term317);
        setField(term316, term316.getClass(), "annotation", term320);
        setField(term316, term316.getClass(), "name", "");
        setField(term316, term316.getClass(), "primitive", term324);
        setField(term316, term316.getClass(), "array", term326);
        ArrayList term330 = new ArrayList();
        ((ArrayList) term330).add((Object)null);
        ((ArrayList) term330).add((Object)null);
        ArrayList term333 = new ArrayList();
        ((ArrayList) term333).add((Object)null);
        ((ArrayList) term333).add((Object)null);
        ((ArrayList) term333).add((Object)null);
        ((ArrayList) term333).add((Object)null);
        ((ArrayList) term333).add((Object)null);
        ((ArrayList) term333).add((Object)null);
        Boolean term337 = new Boolean(false);
        Boolean term339 = new Boolean(false);
        Object term328 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term329 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term329, term329.getClass(), "wildcard", null);
        setField(term329, term329.getClass(), "generic", null);
        setField(term329, term329.getClass(), "qualified", null);
        setField(term329, term329.getClass(), "dimension", null);
        setField(term328, term328.getClass(), "type", term329);
        setField(term328, term328.getClass(), "value", term330);
        setField(term328, term328.getClass(), "annotation", term333);
        setField(term328, term328.getClass(), "name", "");
        setField(term328, term328.getClass(), "primitive", term337);
        setField(term328, term328.getClass(), "array", term339);
        ArrayList term343 = new ArrayList();
        ((ArrayList) term343).add((Object)null);
        ((ArrayList) term343).add((Object)null);
        ((ArrayList) term343).add((Object)null);
        ((ArrayList) term343).add((Object)null);
        ((ArrayList) term343).add((Object)null);
        ((ArrayList) term343).add((Object)null);
        ((ArrayList) term343).add((Object)null);
        ((ArrayList) term343).add((Object)null);
        ArrayList term346 = new ArrayList();
        ((ArrayList) term346).add((Object)null);
        ((ArrayList) term346).add((Object)null);
        ((ArrayList) term346).add((Object)null);
        ((ArrayList) term346).add((Object)null);
        ((ArrayList) term346).add((Object)null);
        Boolean term350 = new Boolean(false);
        Boolean term352 = new Boolean(false);
        Object term341 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term342 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term342, term342.getClass(), "wildcard", null);
        setField(term342, term342.getClass(), "generic", null);
        setField(term342, term342.getClass(), "qualified", null);
        setField(term342, term342.getClass(), "dimension", null);
        setField(term341, term341.getClass(), "type", term342);
        setField(term341, term341.getClass(), "value", term343);
        setField(term341, term341.getClass(), "annotation", term346);
        setField(term341, term341.getClass(), "name", "");
        setField(term341, term341.getClass(), "primitive", term350);
        setField(term341, term341.getClass(), "array", term352);
        ArrayList term288 = new ArrayList();
        ((ArrayList) term288).add(term290);
        ((ArrayList) term288).add(term303);
        ((ArrayList) term288).add(term316);
        ((ArrayList) term288).add(term328);
        ((ArrayList) term288).add(term341);
        term287 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term287, term287.getClass(), "argument", term288);
        setField(term287, term287.getClass(), "name", "zNdorvdUgu");
        setField(term287, term287.getClass(), "qualified", "oPxuZbkYio");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQualified", argTypes, term287, args);
    }

};


