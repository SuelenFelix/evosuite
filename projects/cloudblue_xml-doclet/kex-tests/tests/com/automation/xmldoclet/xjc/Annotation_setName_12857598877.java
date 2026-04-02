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

public class Annotation_setName_12857598877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43497;

    public Annotation_setName_12857598877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43512 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43512, term43512.getClass(), "name", "");
        setField(term43512, term43512.getClass(), "text", "");
        Object term43515 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43515, term43515.getClass(), "name", "");
        setField(term43515, term43515.getClass(), "text", "");
        Object term43518 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43518, term43518.getClass(), "name", "");
        setField(term43518, term43518.getClass(), "text", "");
        Object term43521 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43521, term43521.getClass(), "name", "");
        setField(term43521, term43521.getClass(), "text", "");
        Object term43524 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43524, term43524.getClass(), "name", "");
        setField(term43524, term43524.getClass(), "text", "");
        ArrayList term43510 = new ArrayList();
        ((ArrayList) term43510).add(term43512);
        ((ArrayList) term43510).add(term43515);
        ((ArrayList) term43510).add(term43518);
        ((ArrayList) term43510).add(term43521);
        ((ArrayList) term43510).add(term43524);
        ArrayList term43529 = new ArrayList();
        ArrayList term43536 = new ArrayList();
        ((ArrayList) term43536).add((Object)null);
        ((ArrayList) term43536).add((Object)null);
        Object term43535 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43535, term43535.getClass(), "argument", term43536);
        setField(term43535, term43535.getClass(), "name", "");
        setField(term43535, term43535.getClass(), "qualified", "");
        ArrayList term43533 = new ArrayList();
        ((ArrayList) term43533).add(term43535);
        Boolean term43579 = new Boolean(false);
        term43497 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Annotation"));
        setField(term43497, term43497.getClass(), "comment", "IXUvAShcqh");
        setField(term43497, term43497.getClass(), "tag", term43510);
        setField(term43497, term43497.getClass(), "element", term43529);
        setField(term43497, term43497.getClass(), "annotation", term43533);
        setField(term43497, term43497.getClass(), "name", "GJTIEUjzFR");
        setField(term43497, term43497.getClass(), "qualified", "zidLOFSOCN");
        setField(term43497, term43497.getClass(), "scope", "pFkFCenoUG");
        setField(term43497, term43497.getClass(), "included", term43579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Annotation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JCCuWSuQvj";
        callMethod(klass, "setName", argTypes, term43497, args);
    }

};


