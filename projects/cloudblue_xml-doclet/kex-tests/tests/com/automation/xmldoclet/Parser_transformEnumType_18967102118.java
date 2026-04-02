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

public class Parser_transformEnumType_18967102118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37549;

    public Parser_transformEnumType_18967102118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37553 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37553, term37553.getClass(), "comment", null);
        setField(term37553, term37553.getClass(), "tag", null);
        setField(term37553, term37553.getClass(), "annotation", null);
        setField(term37553, term37553.getClass(), "_enum", null);
        setField(term37553, term37553.getClass(), "_interface", null);
        setField(term37553, term37553.getClass(), "clazz", null);
        setField(term37553, term37553.getClass(), "name", null);
        Object term37554 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37554, term37554.getClass(), "comment", null);
        setField(term37554, term37554.getClass(), "tag", null);
        setField(term37554, term37554.getClass(), "annotation", null);
        setField(term37554, term37554.getClass(), "_enum", null);
        setField(term37554, term37554.getClass(), "_interface", null);
        setField(term37554, term37554.getClass(), "clazz", null);
        setField(term37554, term37554.getClass(), "name", null);
        Object term37555 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37555, term37555.getClass(), "comment", null);
        setField(term37555, term37555.getClass(), "tag", null);
        setField(term37555, term37555.getClass(), "annotation", null);
        setField(term37555, term37555.getClass(), "_enum", null);
        setField(term37555, term37555.getClass(), "_interface", null);
        setField(term37555, term37555.getClass(), "clazz", null);
        setField(term37555, term37555.getClass(), "name", null);
        ArrayList term37551 = new ArrayList();
        ((ArrayList) term37551).add(term37553);
        ((ArrayList) term37551).add(term37554);
        ((ArrayList) term37551).add(term37555);
        term37549 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37550 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37550, term37550.getClass(), "_package", term37551);
        setField(term37549, term37549.getClass(), "xmlRoot", term37550);
        setField(term37549, term37549.getClass(), "environment", null);
        setField(term37549, term37549.getClass(), "docTreesUtils", null);
        setField(term37549, term37549.getClass(), "elementUtils", null);
        setField(term37549, term37549.getClass(), "typeUtils", null);
        setField(term37549, term37549.getClass(), "objectType", null);
        setField(term37549, term37549.getClass(), "errorType", null);
        setField(term37549, term37549.getClass(), "exceptionType", null);
        setField(term37549, term37549.getClass(), "externalizableType", null);
        setField(term37549, term37549.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.TypeElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformEnumType", argTypes, term37549, args);
    }

};


