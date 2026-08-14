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

public class Field_isFinal_72069220636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61559;

    public Field_isFinal_72069220636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61559 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        setField(term61559, term61559.getClass(), "type", null);
        setField(term61559, term61559.getClass(), "comment", null);
        setField(term61559, term61559.getClass(), "tag", null);
        setField(term61559, term61559.getClass(), "constant", null);
        setField(term61559, term61559.getClass(), "annotation", null);
        setField(term61559, term61559.getClass(), "name", null);
        setField(term61559, term61559.getClass(), "qualified", null);
        setField(term61559, term61559.getClass(), "scope", null);
        setField(term61559, term61559.getClass(), "_volatile", null);
        setField(term61559, term61559.getClass(), "_transient", null);
        setField(term61559, term61559.getClass(), "_static", null);
        setField(term61559, term61559.getClass(), "_final", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFinal", argTypes, term61559, args);
    }

};


