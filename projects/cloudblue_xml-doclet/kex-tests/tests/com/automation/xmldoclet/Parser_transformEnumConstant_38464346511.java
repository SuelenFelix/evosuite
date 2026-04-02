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

public class Parser_transformEnumConstant_38464346511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37570;

    public Parser_transformEnumConstant_38464346511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37574 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37574, term37574.getClass(), "comment", null);
        setField(term37574, term37574.getClass(), "tag", null);
        setField(term37574, term37574.getClass(), "annotation", null);
        setField(term37574, term37574.getClass(), "_enum", null);
        setField(term37574, term37574.getClass(), "_interface", null);
        setField(term37574, term37574.getClass(), "clazz", null);
        setField(term37574, term37574.getClass(), "name", null);
        Object term37575 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37575, term37575.getClass(), "comment", null);
        setField(term37575, term37575.getClass(), "tag", null);
        setField(term37575, term37575.getClass(), "annotation", null);
        setField(term37575, term37575.getClass(), "_enum", null);
        setField(term37575, term37575.getClass(), "_interface", null);
        setField(term37575, term37575.getClass(), "clazz", null);
        setField(term37575, term37575.getClass(), "name", null);
        Object term37576 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37576, term37576.getClass(), "comment", null);
        setField(term37576, term37576.getClass(), "tag", null);
        setField(term37576, term37576.getClass(), "annotation", null);
        setField(term37576, term37576.getClass(), "_enum", null);
        setField(term37576, term37576.getClass(), "_interface", null);
        setField(term37576, term37576.getClass(), "clazz", null);
        setField(term37576, term37576.getClass(), "name", null);
        ArrayList term37572 = new ArrayList();
        ((ArrayList) term37572).add(term37574);
        ((ArrayList) term37572).add(term37575);
        ((ArrayList) term37572).add(term37576);
        term37570 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37571 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37571, term37571.getClass(), "_package", term37572);
        setField(term37570, term37570.getClass(), "xmlRoot", term37571);
        setField(term37570, term37570.getClass(), "environment", null);
        setField(term37570, term37570.getClass(), "docTreesUtils", null);
        setField(term37570, term37570.getClass(), "elementUtils", null);
        setField(term37570, term37570.getClass(), "typeUtils", null);
        setField(term37570, term37570.getClass(), "objectType", null);
        setField(term37570, term37570.getClass(), "errorType", null);
        setField(term37570, term37570.getClass(), "exceptionType", null);
        setField(term37570, term37570.getClass(), "externalizableType", null);
        setField(term37570, term37570.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.VariableElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformEnumConstant", argTypes, term37570, args);
    }

};


