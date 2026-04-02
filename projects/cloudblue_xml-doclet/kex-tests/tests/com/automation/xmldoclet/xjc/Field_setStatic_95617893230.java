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

public class Field_setStatic_95617893230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59025;
     Object term59185;

    public Field_setStatic_95617893230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term59028 = new ArrayList();
        ((ArrayList) term59028).add((Object)null);
        ((ArrayList) term59028).add((Object)null);
        ((ArrayList) term59028).add((Object)null);
        ((ArrayList) term59028).add((Object)null);
        ((ArrayList) term59028).add((Object)null);
        ((ArrayList) term59028).add((Object)null);
        ((ArrayList) term59028).add((Object)null);
        ((ArrayList) term59028).add((Object)null);
        ((ArrayList) term59028).add((Object)null);
        ArrayList term59032 = new ArrayList();
        ((ArrayList) term59032).add((Object)null);
        ((ArrayList) term59032).add((Object)null);
        ((ArrayList) term59032).add((Object)null);
        ((ArrayList) term59032).add((Object)null);
        ArrayList term59036 = new ArrayList();
        Object term59078 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term59078, term59078.getClass(), "name", "");
        setField(term59078, term59078.getClass(), "text", "");
        Object term59081 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term59081, term59081.getClass(), "name", "");
        setField(term59081, term59081.getClass(), "text", "");
        Object term59084 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term59084, term59084.getClass(), "name", "");
        setField(term59084, term59084.getClass(), "text", "");
        ArrayList term59076 = new ArrayList();
        ((ArrayList) term59076).add(term59078);
        ((ArrayList) term59076).add(term59081);
        ((ArrayList) term59076).add(term59084);
        ArrayList term59104 = new ArrayList();
        ((ArrayList) term59104).add((Object)null);
        ((ArrayList) term59104).add((Object)null);
        ((ArrayList) term59104).add((Object)null);
        ((ArrayList) term59104).add((Object)null);
        ((ArrayList) term59104).add((Object)null);
        Object term59103 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term59103, term59103.getClass(), "argument", term59104);
        setField(term59103, term59103.getClass(), "name", "");
        setField(term59103, term59103.getClass(), "qualified", "");
        ArrayList term59110 = new ArrayList();
        ((ArrayList) term59110).add((Object)null);
        ((ArrayList) term59110).add((Object)null);
        ((ArrayList) term59110).add((Object)null);
        ((ArrayList) term59110).add((Object)null);
        ((ArrayList) term59110).add((Object)null);
        Object term59109 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term59109, term59109.getClass(), "argument", term59110);
        setField(term59109, term59109.getClass(), "name", "");
        setField(term59109, term59109.getClass(), "qualified", "");
        ArrayList term59116 = new ArrayList();
        ((ArrayList) term59116).add((Object)null);
        ((ArrayList) term59116).add((Object)null);
        ((ArrayList) term59116).add((Object)null);
        Object term59115 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term59115, term59115.getClass(), "argument", term59116);
        setField(term59115, term59115.getClass(), "name", "");
        setField(term59115, term59115.getClass(), "qualified", "");
        ArrayList term59122 = new ArrayList();
        ((ArrayList) term59122).add((Object)null);
        ((ArrayList) term59122).add((Object)null);
        ((ArrayList) term59122).add((Object)null);
        ((ArrayList) term59122).add((Object)null);
        ((ArrayList) term59122).add((Object)null);
        ((ArrayList) term59122).add((Object)null);
        ((ArrayList) term59122).add((Object)null);
        ((ArrayList) term59122).add((Object)null);
        Object term59121 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term59121, term59121.getClass(), "argument", term59122);
        setField(term59121, term59121.getClass(), "name", "");
        setField(term59121, term59121.getClass(), "qualified", "");
        ArrayList term59128 = new ArrayList();
        ((ArrayList) term59128).add((Object)null);
        ((ArrayList) term59128).add((Object)null);
        ((ArrayList) term59128).add((Object)null);
        ((ArrayList) term59128).add((Object)null);
        ((ArrayList) term59128).add((Object)null);
        ((ArrayList) term59128).add((Object)null);
        ((ArrayList) term59128).add((Object)null);
        ((ArrayList) term59128).add((Object)null);
        ((ArrayList) term59128).add((Object)null);
        Object term59127 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term59127, term59127.getClass(), "argument", term59128);
        setField(term59127, term59127.getClass(), "name", "");
        setField(term59127, term59127.getClass(), "qualified", "");
        ArrayList term59134 = new ArrayList();
        ((ArrayList) term59134).add((Object)null);
        ((ArrayList) term59134).add((Object)null);
        ((ArrayList) term59134).add((Object)null);
        Object term59133 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term59133, term59133.getClass(), "argument", term59134);
        setField(term59133, term59133.getClass(), "name", "");
        setField(term59133, term59133.getClass(), "qualified", "");
        ArrayList term59101 = new ArrayList();
        ((ArrayList) term59101).add(term59103);
        ((ArrayList) term59101).add(term59109);
        ((ArrayList) term59101).add(term59115);
        ((ArrayList) term59101).add(term59121);
        ((ArrayList) term59101).add(term59127);
        ((ArrayList) term59101).add(term59133);
        ((ArrayList) term59101).add(term59103);
        Boolean term59177 = new Boolean(false);
        Boolean term59179 = new Boolean(true);
        Boolean term59181 = new Boolean(false);
        Boolean term59183 = new Boolean(true);
        term59025 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        Object term59026 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term59027 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term59027, term59027.getClass(), "extendsBound", term59028);
        setField(term59027, term59027.getClass(), "superBound", term59032);
        setField(term59026, term59026.getClass(), "wildcard", term59027);
        setField(term59026, term59026.getClass(), "generic", term59036);
        setField(term59026, term59026.getClass(), "qualified", "jZFUzqYLEX");
        setField(term59026, term59026.getClass(), "dimension", "QYkQkfbOmf");
        setField(term59025, term59025.getClass(), "type", term59026);
        setField(term59025, term59025.getClass(), "comment", "eYSjzLwEcz");
        setField(term59025, term59025.getClass(), "tag", term59076);
        setField(term59025, term59025.getClass(), "constant", "BjzqnjmCyV");
        setField(term59025, term59025.getClass(), "annotation", term59101);
        setField(term59025, term59025.getClass(), "name", "rZoSntxivz");
        setField(term59025, term59025.getClass(), "qualified", "AhYLLqQdXg");
        setField(term59025, term59025.getClass(), "scope", "VMUHPdPxQW");
        setField(term59025, term59025.getClass(), "_volatile", term59177);
        setField(term59025, term59025.getClass(), "_transient", term59179);
        setField(term59025, term59025.getClass(), "_static", term59181);
        setField(term59025, term59025.getClass(), "_final", term59183);
        term59185 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term59185;
        callMethod(klass, "setStatic", argTypes, term59025, args);
    }

};


