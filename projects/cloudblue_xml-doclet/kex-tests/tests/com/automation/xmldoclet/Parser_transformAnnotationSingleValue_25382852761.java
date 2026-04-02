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

public class Parser_transformAnnotationSingleValue_25382852761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38419;

    public Parser_transformAnnotationSingleValue_25382852761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38419 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        setField(term38419, term38419.getClass(), "xmlRoot", null);
        setField(term38419, term38419.getClass(), "environment", null);
        setField(term38419, term38419.getClass(), "docTreesUtils", null);
        setField(term38419, term38419.getClass(), "elementUtils", null);
        setField(term38419, term38419.getClass(), "typeUtils", null);
        setField(term38419, term38419.getClass(), "objectType", null);
        setField(term38419, term38419.getClass(), "errorType", null);
        setField(term38419, term38419.getClass(), "exceptionType", null);
        setField(term38419, term38419.getClass(), "externalizableType", null);
        setField(term38419, term38419.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("javax.lang.model.type.TypeMirror");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "transformAnnotationSingleValue", argTypes, term38419, args);
    }

};


