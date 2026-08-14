package com.usantatecla.ustumlserver.domain.model;

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
import static com.usantatecla.ustumlserver.domain.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Account_AccountBuilderImpl_build_5683748675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73980;

    public Account_AccountBuilderImpl_build_5683748675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73980 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account$AccountBuilderImpl"));
        setField(term73980, term73980.getClass(), "email", null);
        setField(term73980, term73980.getClass(), "password", null);
        setField(term73980, term73980.getClass(), "role", null);
        setField(term73980, term73980.getClass(), "projects", null);
        setField(term73980, term73980.getClass(), "id", null);
        setField(term73980, term73980.getClass(), "name", null);
        setField(term73980, term73980.getClass(), "relations", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account$AccountBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term73980, args);
    }

};


