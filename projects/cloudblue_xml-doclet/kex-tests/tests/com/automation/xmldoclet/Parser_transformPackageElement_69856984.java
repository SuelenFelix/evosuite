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

public class Parser_transformPackageElement_69856984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37502;

    public Parser_transformPackageElement_69856984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37506 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37506, term37506.getClass(), "comment", null);
        setField(term37506, term37506.getClass(), "tag", null);
        setField(term37506, term37506.getClass(), "annotation", null);
        setField(term37506, term37506.getClass(), "_enum", null);
        setField(term37506, term37506.getClass(), "_interface", null);
        setField(term37506, term37506.getClass(), "clazz", null);
        setField(term37506, term37506.getClass(), "name", null);
        Object term37507 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37507, term37507.getClass(), "comment", null);
        setField(term37507, term37507.getClass(), "tag", null);
        setField(term37507, term37507.getClass(), "annotation", null);
        setField(term37507, term37507.getClass(), "_enum", null);
        setField(term37507, term37507.getClass(), "_interface", null);
        setField(term37507, term37507.getClass(), "clazz", null);
        setField(term37507, term37507.getClass(), "name", null);
        Object term37508 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37508, term37508.getClass(), "comment", null);
        setField(term37508, term37508.getClass(), "tag", null);
        setField(term37508, term37508.getClass(), "annotation", null);
        setField(term37508, term37508.getClass(), "_enum", null);
        setField(term37508, term37508.getClass(), "_interface", null);
        setField(term37508, term37508.getClass(), "clazz", null);
        setField(term37508, term37508.getClass(), "name", null);
        Object term37509 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37509, term37509.getClass(), "comment", null);
        setField(term37509, term37509.getClass(), "tag", null);
        setField(term37509, term37509.getClass(), "annotation", null);
        setField(term37509, term37509.getClass(), "_enum", null);
        setField(term37509, term37509.getClass(), "_interface", null);
        setField(term37509, term37509.getClass(), "clazz", null);
        setField(term37509, term37509.getClass(), "name", null);
        Object term37510 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37510, term37510.getClass(), "comment", null);
        setField(term37510, term37510.getClass(), "tag", null);
        setField(term37510, term37510.getClass(), "annotation", null);
        setField(term37510, term37510.getClass(), "_enum", null);
        setField(term37510, term37510.getClass(), "_interface", null);
        setField(term37510, term37510.getClass(), "clazz", null);
        setField(term37510, term37510.getClass(), "name", null);
        Object term37511 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37511, term37511.getClass(), "comment", null);
        setField(term37511, term37511.getClass(), "tag", null);
        setField(term37511, term37511.getClass(), "annotation", null);
        setField(term37511, term37511.getClass(), "_enum", null);
        setField(term37511, term37511.getClass(), "_interface", null);
        setField(term37511, term37511.getClass(), "clazz", null);
        setField(term37511, term37511.getClass(), "name", null);
        ArrayList term37504 = new ArrayList();
        ((ArrayList) term37504).add(term37506);
        ((ArrayList) term37504).add(term37507);
        ((ArrayList) term37504).add(term37508);
        ((ArrayList) term37504).add(term37509);
        ((ArrayList) term37504).add(term37510);
        ((ArrayList) term37504).add(term37511);
        term37502 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37503 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37503, term37503.getClass(), "_package", term37504);
        setField(term37502, term37502.getClass(), "xmlRoot", term37503);
        setField(term37502, term37502.getClass(), "environment", null);
        setField(term37502, term37502.getClass(), "docTreesUtils", null);
        setField(term37502, term37502.getClass(), "elementUtils", null);
        setField(term37502, term37502.getClass(), "typeUtils", null);
        setField(term37502, term37502.getClass(), "objectType", null);
        setField(term37502, term37502.getClass(), "errorType", null);
        setField(term37502, term37502.getClass(), "exceptionType", null);
        setField(term37502, term37502.getClass(), "externalizableType", null);
        setField(term37502, term37502.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.PackageElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformPackageElement", argTypes, term37502, args);
    }

};


