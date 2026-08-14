package com.usantatecla.ustumlserver.domain.model.relations;

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
import static com.usantatecla.ustumlserver.domain.model.relations.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Use_UseBuilderImpl_build_18441038575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2765;

    public Use_UseBuilderImpl_build_18441038575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2765 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.relations.Use$UseBuilderImpl"));
        setField(term2765, term2765.getClass(), "id", null);
        setField(term2765, term2765.getClass(), "target", null);
        setField(term2765, term2765.getClass(), "role", null);
        setField(term2765, term2765.getClass(), "targetRoute", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.relations.Use$UseBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2765, args);
    }

};


