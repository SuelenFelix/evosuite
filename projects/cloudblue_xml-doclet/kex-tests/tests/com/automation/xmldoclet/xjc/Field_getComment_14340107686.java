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

public class Field_getComment_14340107686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57462;

    public Field_getComment_14340107686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57462 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        setField(term57462, term57462.getClass(), "type", null);
        setField(term57462, term57462.getClass(), "comment", null);
        setField(term57462, term57462.getClass(), "tag", null);
        setField(term57462, term57462.getClass(), "constant", null);
        setField(term57462, term57462.getClass(), "annotation", null);
        setField(term57462, term57462.getClass(), "name", null);
        setField(term57462, term57462.getClass(), "qualified", null);
        setField(term57462, term57462.getClass(), "scope", null);
        setField(term57462, term57462.getClass(), "_volatile", null);
        setField(term57462, term57462.getClass(), "_transient", null);
        setField(term57462, term57462.getClass(), "_static", null);
        setField(term57462, term57462.getClass(), "_final", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComment", argTypes, term57462, args);
    }

};


