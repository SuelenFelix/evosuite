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

public class Annotation_setScope_111168609011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44199;

    public Annotation_setScope_111168609011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44214 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44214, term44214.getClass(), "name", "");
        setField(term44214, term44214.getClass(), "text", "");
        Object term44217 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44217, term44217.getClass(), "name", "");
        setField(term44217, term44217.getClass(), "text", "");
        Object term44220 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44220, term44220.getClass(), "name", "");
        setField(term44220, term44220.getClass(), "text", "");
        Object term44223 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44223, term44223.getClass(), "name", "");
        setField(term44223, term44223.getClass(), "text", "");
        Object term44226 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44226, term44226.getClass(), "name", "");
        setField(term44226, term44226.getClass(), "text", "");
        Object term44229 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44229, term44229.getClass(), "name", "");
        setField(term44229, term44229.getClass(), "text", "");
        Object term44232 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44232, term44232.getClass(), "name", "");
        setField(term44232, term44232.getClass(), "text", "");
        Object term44235 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44235, term44235.getClass(), "name", "");
        setField(term44235, term44235.getClass(), "text", "");
        Object term44238 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44238, term44238.getClass(), "name", "");
        setField(term44238, term44238.getClass(), "text", "");
        ArrayList term44212 = new ArrayList();
        ((ArrayList) term44212).add(term44214);
        ((ArrayList) term44212).add(term44217);
        ((ArrayList) term44212).add(term44220);
        ((ArrayList) term44212).add(term44223);
        ((ArrayList) term44212).add(term44226);
        ((ArrayList) term44212).add(term44229);
        ((ArrayList) term44212).add(term44232);
        ((ArrayList) term44212).add(term44235);
        ((ArrayList) term44212).add(term44238);
        Object term44245 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term44246 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44246, term44246.getClass(), "wildcard", null);
        setField(term44246, term44246.getClass(), "generic", null);
        setField(term44246, term44246.getClass(), "qualified", null);
        setField(term44246, term44246.getClass(), "dimension", null);
        setField(term44245, term44245.getClass(), "type", term44246);
        setField(term44245, term44245.getClass(), "name", "");
        setField(term44245, term44245.getClass(), "qualified", "");
        setField(term44245, term44245.getClass(), "_default", "");
        Object term44250 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term44251 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44251, term44251.getClass(), "wildcard", null);
        setField(term44251, term44251.getClass(), "generic", null);
        setField(term44251, term44251.getClass(), "qualified", null);
        setField(term44251, term44251.getClass(), "dimension", null);
        setField(term44250, term44250.getClass(), "type", term44251);
        setField(term44250, term44250.getClass(), "name", "");
        setField(term44250, term44250.getClass(), "qualified", "");
        setField(term44250, term44250.getClass(), "_default", "");
        ArrayList term44243 = new ArrayList();
        ((ArrayList) term44243).add(term44245);
        ((ArrayList) term44243).add(term44250);
        ArrayList term44260 = new ArrayList();
        ((ArrayList) term44260).add((Object)null);
        ((ArrayList) term44260).add((Object)null);
        Object term44259 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term44259, term44259.getClass(), "argument", term44260);
        setField(term44259, term44259.getClass(), "name", "");
        setField(term44259, term44259.getClass(), "qualified", "");
        ArrayList term44266 = new ArrayList();
        ((ArrayList) term44266).add((Object)null);
        ((ArrayList) term44266).add((Object)null);
        ((ArrayList) term44266).add((Object)null);
        ((ArrayList) term44266).add((Object)null);
        ((ArrayList) term44266).add((Object)null);
        ((ArrayList) term44266).add((Object)null);
        ((ArrayList) term44266).add((Object)null);
        ((ArrayList) term44266).add((Object)null);
        Object term44265 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term44265, term44265.getClass(), "argument", term44266);
        setField(term44265, term44265.getClass(), "name", "");
        setField(term44265, term44265.getClass(), "qualified", "");
        ArrayList term44272 = new ArrayList();
        Object term44271 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term44271, term44271.getClass(), "argument", term44272);
        setField(term44271, term44271.getClass(), "name", "");
        setField(term44271, term44271.getClass(), "qualified", "");
        ArrayList term44278 = new ArrayList();
        ((ArrayList) term44278).add((Object)null);
        Object term44277 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term44277, term44277.getClass(), "argument", term44278);
        setField(term44277, term44277.getClass(), "name", "");
        setField(term44277, term44277.getClass(), "qualified", "");
        ArrayList term44284 = new ArrayList();
        ((ArrayList) term44284).add((Object)null);
        ((ArrayList) term44284).add((Object)null);
        ((ArrayList) term44284).add((Object)null);
        Object term44283 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term44283, term44283.getClass(), "argument", term44284);
        setField(term44283, term44283.getClass(), "name", "");
        setField(term44283, term44283.getClass(), "qualified", "");
        ArrayList term44290 = new ArrayList();
        ((ArrayList) term44290).add((Object)null);
        Object term44289 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term44289, term44289.getClass(), "argument", term44290);
        setField(term44289, term44289.getClass(), "name", "");
        setField(term44289, term44289.getClass(), "qualified", "");
        ArrayList term44257 = new ArrayList();
        ((ArrayList) term44257).add(term44259);
        ((ArrayList) term44257).add(term44265);
        ((ArrayList) term44257).add(term44271);
        ((ArrayList) term44257).add(term44277);
        ((ArrayList) term44257).add(term44283);
        ((ArrayList) term44257).add(term44289);
        Boolean term44333 = new Boolean(true);
        term44199 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Annotation"));
        setField(term44199, term44199.getClass(), "comment", "yZsqwFqByP");
        setField(term44199, term44199.getClass(), "tag", term44212);
        setField(term44199, term44199.getClass(), "element", term44243);
        setField(term44199, term44199.getClass(), "annotation", term44257);
        setField(term44199, term44199.getClass(), "name", "XfcYrYZZwC");
        setField(term44199, term44199.getClass(), "qualified", "LCcWpBPvRq");
        setField(term44199, term44199.getClass(), "scope", "kyQlrYjIrL");
        setField(term44199, term44199.getClass(), "included", term44333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Annotation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AdZzuSpKqG";
        callMethod(klass, "setScope", argTypes, term44199, args);
    }

};


