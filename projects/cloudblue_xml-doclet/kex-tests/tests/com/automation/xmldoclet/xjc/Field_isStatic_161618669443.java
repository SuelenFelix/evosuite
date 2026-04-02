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

public class Field_isStatic_161618669443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59686;

    public Field_isStatic_161618669443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59686 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        setField(term59686, term59686.getClass(), "type", null);
        setField(term59686, term59686.getClass(), "comment", null);
        setField(term59686, term59686.getClass(), "tag", null);
        setField(term59686, term59686.getClass(), "constant", null);
        setField(term59686, term59686.getClass(), "annotation", null);
        setField(term59686, term59686.getClass(), "name", null);
        setField(term59686, term59686.getClass(), "qualified", null);
        setField(term59686, term59686.getClass(), "scope", null);
        setField(term59686, term59686.getClass(), "_volatile", null);
        setField(term59686, term59686.getClass(), "_transient", null);
        setField(term59686, term59686.getClass(), "_static", null);
        setField(term59686, term59686.getClass(), "_final", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStatic", argTypes, term59686, args);
    }

};


