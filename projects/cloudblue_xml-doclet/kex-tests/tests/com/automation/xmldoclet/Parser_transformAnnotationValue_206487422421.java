package com.automation.xmldoclet;

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
import static com.automation.xmldoclet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Parser_transformAnnotationValue_206487422421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37685;

    public Parser_transformAnnotationValue_206487422421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37689 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37689, term37689.getClass(), "comment", null);
        setField(term37689, term37689.getClass(), "tag", null);
        setField(term37689, term37689.getClass(), "annotation", null);
        setField(term37689, term37689.getClass(), "_enum", null);
        setField(term37689, term37689.getClass(), "_interface", null);
        setField(term37689, term37689.getClass(), "clazz", null);
        setField(term37689, term37689.getClass(), "name", null);
        Object term37690 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37690, term37690.getClass(), "comment", null);
        setField(term37690, term37690.getClass(), "tag", null);
        setField(term37690, term37690.getClass(), "annotation", null);
        setField(term37690, term37690.getClass(), "_enum", null);
        setField(term37690, term37690.getClass(), "_interface", null);
        setField(term37690, term37690.getClass(), "clazz", null);
        setField(term37690, term37690.getClass(), "name", null);
        Object term37691 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37691, term37691.getClass(), "comment", null);
        setField(term37691, term37691.getClass(), "tag", null);
        setField(term37691, term37691.getClass(), "annotation", null);
        setField(term37691, term37691.getClass(), "_enum", null);
        setField(term37691, term37691.getClass(), "_interface", null);
        setField(term37691, term37691.getClass(), "clazz", null);
        setField(term37691, term37691.getClass(), "name", null);
        Object term37692 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37692, term37692.getClass(), "comment", null);
        setField(term37692, term37692.getClass(), "tag", null);
        setField(term37692, term37692.getClass(), "annotation", null);
        setField(term37692, term37692.getClass(), "_enum", null);
        setField(term37692, term37692.getClass(), "_interface", null);
        setField(term37692, term37692.getClass(), "clazz", null);
        setField(term37692, term37692.getClass(), "name", null);
        Object term37693 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37693, term37693.getClass(), "comment", null);
        setField(term37693, term37693.getClass(), "tag", null);
        setField(term37693, term37693.getClass(), "annotation", null);
        setField(term37693, term37693.getClass(), "_enum", null);
        setField(term37693, term37693.getClass(), "_interface", null);
        setField(term37693, term37693.getClass(), "clazz", null);
        setField(term37693, term37693.getClass(), "name", null);
        Object term37694 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37694, term37694.getClass(), "comment", null);
        setField(term37694, term37694.getClass(), "tag", null);
        setField(term37694, term37694.getClass(), "annotation", null);
        setField(term37694, term37694.getClass(), "_enum", null);
        setField(term37694, term37694.getClass(), "_interface", null);
        setField(term37694, term37694.getClass(), "clazz", null);
        setField(term37694, term37694.getClass(), "name", null);
        ArrayList term37687 = new ArrayList();
        ((ArrayList) term37687).add(term37689);
        ((ArrayList) term37687).add(term37690);
        ((ArrayList) term37687).add(term37691);
        ((ArrayList) term37687).add(term37692);
        ((ArrayList) term37687).add(term37693);
        ((ArrayList) term37687).add(term37694);
        term37685 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37686 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37686, term37686.getClass(), "_package", term37687);
        setField(term37685, term37685.getClass(), "xmlRoot", term37686);
        setField(term37685, term37685.getClass(), "environment", null);
        setField(term37685, term37685.getClass(), "docTreesUtils", null);
        setField(term37685, term37685.getClass(), "elementUtils", null);
        setField(term37685, term37685.getClass(), "typeUtils", null);
        setField(term37685, term37685.getClass(), "objectType", null);
        setField(term37685, term37685.getClass(), "errorType", null);
        setField(term37685, term37685.getClass(), "exceptionType", null);
        setField(term37685, term37685.getClass(), "externalizableType", null);
        setField(term37685, term37685.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.lang.model.element.ExecutableElement");
        argTypes[1] = Class.forName("javax.lang.model.element.AnnotationValue");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "transformAnnotationValue", argTypes, term37685, args);
    }

};


