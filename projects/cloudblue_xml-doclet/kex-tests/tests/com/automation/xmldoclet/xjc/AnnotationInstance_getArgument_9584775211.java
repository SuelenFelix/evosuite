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

public class AnnotationInstance_getArgument_9584775211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public AnnotationInstance_getArgument_9584775211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6 = new ArrayList();
        ((ArrayList) term6).add((Object)null);
        ((ArrayList) term6).add((Object)null);
        ArrayList term9 = new ArrayList();
        ((ArrayList) term9).add((Object)null);
        ((ArrayList) term9).add((Object)null);
        ((ArrayList) term9).add((Object)null);
        Boolean term13 = new Boolean(false);
        Boolean term15 = new Boolean(false);
        Object term4 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term5 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term5, term5.getClass(), "wildcard", null);
        setField(term5, term5.getClass(), "generic", null);
        setField(term5, term5.getClass(), "qualified", null);
        setField(term5, term5.getClass(), "dimension", null);
        setField(term4, term4.getClass(), "type", term5);
        setField(term4, term4.getClass(), "value", term6);
        setField(term4, term4.getClass(), "annotation", term9);
        setField(term4, term4.getClass(), "name", "");
        setField(term4, term4.getClass(), "primitive", term13);
        setField(term4, term4.getClass(), "array", term15);
        ArrayList term19 = new ArrayList();
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        ArrayList term22 = new ArrayList();
        ((ArrayList) term22).add((Object)null);
        ((ArrayList) term22).add((Object)null);
        ((ArrayList) term22).add((Object)null);
        Boolean term26 = new Boolean(false);
        Boolean term28 = new Boolean(true);
        Object term17 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term18 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term18, term18.getClass(), "wildcard", null);
        setField(term18, term18.getClass(), "generic", null);
        setField(term18, term18.getClass(), "qualified", null);
        setField(term18, term18.getClass(), "dimension", null);
        setField(term17, term17.getClass(), "type", term18);
        setField(term17, term17.getClass(), "value", term19);
        setField(term17, term17.getClass(), "annotation", term22);
        setField(term17, term17.getClass(), "name", "");
        setField(term17, term17.getClass(), "primitive", term26);
        setField(term17, term17.getClass(), "array", term28);
        ArrayList term32 = new ArrayList();
        ((ArrayList) term32).add((Object)null);
        ((ArrayList) term32).add((Object)null);
        ((ArrayList) term32).add((Object)null);
        ((ArrayList) term32).add((Object)null);
        ((ArrayList) term32).add((Object)null);
        ((ArrayList) term32).add((Object)null);
        ArrayList term35 = new ArrayList();
        ((ArrayList) term35).add((Object)null);
        ((ArrayList) term35).add((Object)null);
        ((ArrayList) term35).add((Object)null);
        ((ArrayList) term35).add((Object)null);
        ((ArrayList) term35).add((Object)null);
        Boolean term39 = new Boolean(false);
        Boolean term41 = new Boolean(false);
        Object term30 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term31 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term31, term31.getClass(), "wildcard", null);
        setField(term31, term31.getClass(), "generic", null);
        setField(term31, term31.getClass(), "qualified", null);
        setField(term31, term31.getClass(), "dimension", null);
        setField(term30, term30.getClass(), "type", term31);
        setField(term30, term30.getClass(), "value", term32);
        setField(term30, term30.getClass(), "annotation", term35);
        setField(term30, term30.getClass(), "name", "");
        setField(term30, term30.getClass(), "primitive", term39);
        setField(term30, term30.getClass(), "array", term41);
        ArrayList term45 = new ArrayList();
        ((ArrayList) term45).add((Object)null);
        ((ArrayList) term45).add((Object)null);
        ((ArrayList) term45).add((Object)null);
        ((ArrayList) term45).add((Object)null);
        ((ArrayList) term45).add((Object)null);
        ((ArrayList) term45).add((Object)null);
        ArrayList term48 = new ArrayList();
        ((ArrayList) term48).add((Object)null);
        ((ArrayList) term48).add((Object)null);
        Boolean term52 = new Boolean(true);
        Boolean term54 = new Boolean(true);
        Object term43 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term44 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44, term44.getClass(), "wildcard", null);
        setField(term44, term44.getClass(), "generic", null);
        setField(term44, term44.getClass(), "qualified", null);
        setField(term44, term44.getClass(), "dimension", null);
        setField(term43, term43.getClass(), "type", term44);
        setField(term43, term43.getClass(), "value", term45);
        setField(term43, term43.getClass(), "annotation", term48);
        setField(term43, term43.getClass(), "name", "");
        setField(term43, term43.getClass(), "primitive", term52);
        setField(term43, term43.getClass(), "array", term54);
        ArrayList term2 = new ArrayList();
        ((ArrayList) term2).add(term4);
        ((ArrayList) term2).add(term17);
        ((ArrayList) term2).add(term30);
        ((ArrayList) term2).add(term17);
        ((ArrayList) term2).add(term43);
        term1 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term1, term1.getClass(), "argument", term2);
        setField(term1, term1.getClass(), "name", "whBvTVIIlC");
        setField(term1, term1.getClass(), "qualified", "IgRJUzaCwW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArgument", argTypes, term1, args);
    }

};


