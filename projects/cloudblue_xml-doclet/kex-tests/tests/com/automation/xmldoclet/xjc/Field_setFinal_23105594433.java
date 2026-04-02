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

public class Field_setFinal_23105594433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59677;

    public Field_setFinal_23105594433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59677 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        setField(term59677, term59677.getClass(), "type", null);
        setField(term59677, term59677.getClass(), "comment", null);
        setField(term59677, term59677.getClass(), "tag", null);
        setField(term59677, term59677.getClass(), "constant", null);
        setField(term59677, term59677.getClass(), "annotation", null);
        setField(term59677, term59677.getClass(), "name", null);
        setField(term59677, term59677.getClass(), "qualified", null);
        setField(term59677, term59677.getClass(), "scope", null);
        setField(term59677, term59677.getClass(), "_volatile", null);
        setField(term59677, term59677.getClass(), "_transient", null);
        setField(term59677, term59677.getClass(), "_static", null);
        setField(term59677, term59677.getClass(), "_final", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFinal", argTypes, term59677, args);
    }

};


