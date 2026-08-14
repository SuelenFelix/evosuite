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

public class Parser_transformFieldElement_43097825712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37579;

    public Parser_transformFieldElement_43097825712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37583 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37583, term37583.getClass(), "comment", null);
        setField(term37583, term37583.getClass(), "tag", null);
        setField(term37583, term37583.getClass(), "annotation", null);
        setField(term37583, term37583.getClass(), "_enum", null);
        setField(term37583, term37583.getClass(), "_interface", null);
        setField(term37583, term37583.getClass(), "clazz", null);
        setField(term37583, term37583.getClass(), "name", null);
        Object term37584 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37584, term37584.getClass(), "comment", null);
        setField(term37584, term37584.getClass(), "tag", null);
        setField(term37584, term37584.getClass(), "annotation", null);
        setField(term37584, term37584.getClass(), "_enum", null);
        setField(term37584, term37584.getClass(), "_interface", null);
        setField(term37584, term37584.getClass(), "clazz", null);
        setField(term37584, term37584.getClass(), "name", null);
        Object term37585 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37585, term37585.getClass(), "comment", null);
        setField(term37585, term37585.getClass(), "tag", null);
        setField(term37585, term37585.getClass(), "annotation", null);
        setField(term37585, term37585.getClass(), "_enum", null);
        setField(term37585, term37585.getClass(), "_interface", null);
        setField(term37585, term37585.getClass(), "clazz", null);
        setField(term37585, term37585.getClass(), "name", null);
        Object term37586 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37586, term37586.getClass(), "comment", null);
        setField(term37586, term37586.getClass(), "tag", null);
        setField(term37586, term37586.getClass(), "annotation", null);
        setField(term37586, term37586.getClass(), "_enum", null);
        setField(term37586, term37586.getClass(), "_interface", null);
        setField(term37586, term37586.getClass(), "clazz", null);
        setField(term37586, term37586.getClass(), "name", null);
        Object term37587 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37587, term37587.getClass(), "comment", null);
        setField(term37587, term37587.getClass(), "tag", null);
        setField(term37587, term37587.getClass(), "annotation", null);
        setField(term37587, term37587.getClass(), "_enum", null);
        setField(term37587, term37587.getClass(), "_interface", null);
        setField(term37587, term37587.getClass(), "clazz", null);
        setField(term37587, term37587.getClass(), "name", null);
        ArrayList term37581 = new ArrayList();
        ((ArrayList) term37581).add(term37583);
        ((ArrayList) term37581).add(term37584);
        ((ArrayList) term37581).add(term37585);
        ((ArrayList) term37581).add(term37586);
        ((ArrayList) term37581).add(term37587);
        term37579 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37580 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37580, term37580.getClass(), "_package", term37581);
        setField(term37579, term37579.getClass(), "xmlRoot", term37580);
        setField(term37579, term37579.getClass(), "environment", null);
        setField(term37579, term37579.getClass(), "docTreesUtils", null);
        setField(term37579, term37579.getClass(), "elementUtils", null);
        setField(term37579, term37579.getClass(), "typeUtils", null);
        setField(term37579, term37579.getClass(), "objectType", null);
        setField(term37579, term37579.getClass(), "errorType", null);
        setField(term37579, term37579.getClass(), "exceptionType", null);
        setField(term37579, term37579.getClass(), "externalizableType", null);
        setField(term37579, term37579.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.VariableElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformFieldElement", argTypes, term37579, args);
    }

};


