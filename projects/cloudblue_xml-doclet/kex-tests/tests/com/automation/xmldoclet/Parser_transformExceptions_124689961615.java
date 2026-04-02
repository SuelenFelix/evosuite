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

public class Parser_transformExceptions_124689961615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37614;

    public Parser_transformExceptions_124689961615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37618 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37618, term37618.getClass(), "comment", null);
        setField(term37618, term37618.getClass(), "tag", null);
        setField(term37618, term37618.getClass(), "annotation", null);
        setField(term37618, term37618.getClass(), "_enum", null);
        setField(term37618, term37618.getClass(), "_interface", null);
        setField(term37618, term37618.getClass(), "clazz", null);
        setField(term37618, term37618.getClass(), "name", null);
        Object term37619 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37619, term37619.getClass(), "comment", null);
        setField(term37619, term37619.getClass(), "tag", null);
        setField(term37619, term37619.getClass(), "annotation", null);
        setField(term37619, term37619.getClass(), "_enum", null);
        setField(term37619, term37619.getClass(), "_interface", null);
        setField(term37619, term37619.getClass(), "clazz", null);
        setField(term37619, term37619.getClass(), "name", null);
        Object term37620 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37620, term37620.getClass(), "comment", null);
        setField(term37620, term37620.getClass(), "tag", null);
        setField(term37620, term37620.getClass(), "annotation", null);
        setField(term37620, term37620.getClass(), "_enum", null);
        setField(term37620, term37620.getClass(), "_interface", null);
        setField(term37620, term37620.getClass(), "clazz", null);
        setField(term37620, term37620.getClass(), "name", null);
        ArrayList term37616 = new ArrayList();
        ((ArrayList) term37616).add(term37618);
        ((ArrayList) term37616).add(term37619);
        ((ArrayList) term37616).add(term37620);
        term37614 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37615 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37615, term37615.getClass(), "_package", term37616);
        setField(term37614, term37614.getClass(), "xmlRoot", term37615);
        setField(term37614, term37614.getClass(), "environment", null);
        setField(term37614, term37614.getClass(), "docTreesUtils", null);
        setField(term37614, term37614.getClass(), "elementUtils", null);
        setField(term37614, term37614.getClass(), "typeUtils", null);
        setField(term37614, term37614.getClass(), "objectType", null);
        setField(term37614, term37614.getClass(), "errorType", null);
        setField(term37614, term37614.getClass(), "exceptionType", null);
        setField(term37614, term37614.getClass(), "externalizableType", null);
        setField(term37614, term37614.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.ExecutableElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformExceptions", argTypes, term37614, args);
    }

};


