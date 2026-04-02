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

public class Field_getName_71379309639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59682;

    public Field_getName_71379309639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59682 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        setField(term59682, term59682.getClass(), "type", null);
        setField(term59682, term59682.getClass(), "comment", null);
        setField(term59682, term59682.getClass(), "tag", null);
        setField(term59682, term59682.getClass(), "constant", null);
        setField(term59682, term59682.getClass(), "annotation", null);
        setField(term59682, term59682.getClass(), "name", null);
        setField(term59682, term59682.getClass(), "qualified", null);
        setField(term59682, term59682.getClass(), "scope", null);
        setField(term59682, term59682.getClass(), "_volatile", null);
        setField(term59682, term59682.getClass(), "_transient", null);
        setField(term59682, term59682.getClass(), "_static", null);
        setField(term59682, term59682.getClass(), "_final", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term59682, args);
    }

};


