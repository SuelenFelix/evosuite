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

public class Method_setReturn_16570893246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54467;

    public Method_setReturn_16570893246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54467 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        setField(term54467, term54467.getClass(), "comment", null);
        setField(term54467, term54467.getClass(), "tag", null);
        setField(term54467, term54467.getClass(), "parameter", null);
        setField(term54467, term54467.getClass(), "_return", null);
        setField(term54467, term54467.getClass(), "exception", null);
        setField(term54467, term54467.getClass(), "annotation", null);
        setField(term54467, term54467.getClass(), "name", null);
        setField(term54467, term54467.getClass(), "signature", null);
        setField(term54467, term54467.getClass(), "qualified", null);
        setField(term54467, term54467.getClass(), "scope", null);
        setField(term54467, term54467.getClass(), "_abstract", null);
        setField(term54467, term54467.getClass(), "_final", null);
        setField(term54467, term54467.getClass(), "included", null);
        setField(term54467, term54467.getClass(), "_native", null);
        setField(term54467, term54467.getClass(), "_synchronized", null);
        setField(term54467, term54467.getClass(), "_static", null);
        setField(term54467, term54467.getClass(), "varArgs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.automation.xmldoclet.xjc.TypeInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setReturn", argTypes, term54467, args);
    }

};


