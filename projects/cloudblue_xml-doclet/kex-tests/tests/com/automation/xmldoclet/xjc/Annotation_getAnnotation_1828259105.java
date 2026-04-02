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

public class Annotation_getAnnotation_1828259105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43192;

    public Annotation_getAnnotation_1828259105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term43205 = new ArrayList();
        Object term43211 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43212 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43212, term43212.getClass(), "wildcard", null);
        setField(term43212, term43212.getClass(), "generic", null);
        setField(term43212, term43212.getClass(), "qualified", null);
        setField(term43212, term43212.getClass(), "dimension", null);
        setField(term43211, term43211.getClass(), "type", term43212);
        setField(term43211, term43211.getClass(), "name", "");
        setField(term43211, term43211.getClass(), "qualified", "");
        setField(term43211, term43211.getClass(), "_default", "");
        Object term43216 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43217 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43217, term43217.getClass(), "wildcard", null);
        setField(term43217, term43217.getClass(), "generic", null);
        setField(term43217, term43217.getClass(), "qualified", null);
        setField(term43217, term43217.getClass(), "dimension", null);
        setField(term43216, term43216.getClass(), "type", term43217);
        setField(term43216, term43216.getClass(), "name", "");
        setField(term43216, term43216.getClass(), "qualified", "");
        setField(term43216, term43216.getClass(), "_default", "");
        Object term43221 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        setField(term43221, term43221.getClass(), "type", term43217);
        setField(term43221, term43221.getClass(), "name", "");
        setField(term43221, term43221.getClass(), "qualified", "");
        setField(term43221, term43221.getClass(), "_default", "");
        ArrayList term43209 = new ArrayList();
        ((ArrayList) term43209).add(term43211);
        ((ArrayList) term43209).add(term43216);
        ((ArrayList) term43209).add(term43221);
        ArrayList term43227 = new ArrayList();
        Boolean term43267 = new Boolean(true);
        term43192 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Annotation"));
        setField(term43192, term43192.getClass(), "comment", "FGsHUaWeMa");
        setField(term43192, term43192.getClass(), "tag", term43205);
        setField(term43192, term43192.getClass(), "element", term43209);
        setField(term43192, term43192.getClass(), "annotation", term43227);
        setField(term43192, term43192.getClass(), "name", "BalfNKaaFd");
        setField(term43192, term43192.getClass(), "qualified", "lcxFxgYYXC");
        setField(term43192, term43192.getClass(), "scope", "SIKiPgOhIF");
        setField(term43192, term43192.getClass(), "included", term43267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Annotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnnotation", argTypes, term43192, args);
    }

};


