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

public class AnnotationElement_getDefault_6159150419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6923;

    public AnnotationElement_getDefault_6159150419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6926 = new ArrayList();
        ((ArrayList) term6926).add((Object)null);
        ((ArrayList) term6926).add((Object)null);
        ArrayList term6930 = new ArrayList();
        Object term6936 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6936, term6936.getClass(), "wildcard", null);
        setField(term6936, term6936.getClass(), "generic", null);
        setField(term6936, term6936.getClass(), "qualified", null);
        setField(term6936, term6936.getClass(), "dimension", null);
        Object term6937 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6937, term6937.getClass(), "wildcard", null);
        setField(term6937, term6937.getClass(), "generic", null);
        setField(term6937, term6937.getClass(), "qualified", null);
        setField(term6937, term6937.getClass(), "dimension", null);
        Object term6938 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6938, term6938.getClass(), "wildcard", null);
        setField(term6938, term6938.getClass(), "generic", null);
        setField(term6938, term6938.getClass(), "qualified", null);
        setField(term6938, term6938.getClass(), "dimension", null);
        Object term6939 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6939, term6939.getClass(), "wildcard", null);
        setField(term6939, term6939.getClass(), "generic", null);
        setField(term6939, term6939.getClass(), "qualified", null);
        setField(term6939, term6939.getClass(), "dimension", null);
        Object term6940 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6940, term6940.getClass(), "wildcard", null);
        setField(term6940, term6940.getClass(), "generic", null);
        setField(term6940, term6940.getClass(), "qualified", null);
        setField(term6940, term6940.getClass(), "dimension", null);
        Object term6941 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6941, term6941.getClass(), "wildcard", null);
        setField(term6941, term6941.getClass(), "generic", null);
        setField(term6941, term6941.getClass(), "qualified", null);
        setField(term6941, term6941.getClass(), "dimension", null);
        ArrayList term6934 = new ArrayList();
        ((ArrayList) term6934).add(term6936);
        ((ArrayList) term6934).add(term6937);
        ((ArrayList) term6934).add(term6938);
        ((ArrayList) term6934).add(term6939);
        ((ArrayList) term6934).add(term6940);
        ((ArrayList) term6934).add(term6938);
        ((ArrayList) term6934).add(term6941);
        ((ArrayList) term6934).add(term6936);
        term6923 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term6924 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term6925 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term6925, term6925.getClass(), "extendsBound", term6926);
        setField(term6925, term6925.getClass(), "superBound", term6930);
        setField(term6924, term6924.getClass(), "wildcard", term6925);
        setField(term6924, term6924.getClass(), "generic", term6934);
        setField(term6924, term6924.getClass(), "qualified", "KcKxvbBAHa");
        setField(term6924, term6924.getClass(), "dimension", "NbFVXCPmxn");
        setField(term6923, term6923.getClass(), "type", term6924);
        setField(term6923, term6923.getClass(), "name", "ovYlGvhKKO");
        setField(term6923, term6923.getClass(), "qualified", "JvoSiMCDAb");
        setField(term6923, term6923.getClass(), "_default", "JANJXHGMsv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefault", argTypes, term6923, args);
    }

};


