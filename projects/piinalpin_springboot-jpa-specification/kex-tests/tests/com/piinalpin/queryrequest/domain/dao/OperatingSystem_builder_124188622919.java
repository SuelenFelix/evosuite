package com.piinalpin.queryrequest.domain.dao;

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
import static com.piinalpin.queryrequest.domain.dao.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OperatingSystem_builder_124188622919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2195;

    public OperatingSystem_builder_124188622919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2195 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        setField(term2195, term2195.getClass(), "id", null);
        setField(term2195, term2195.getClass(), "name", null);
        setField(term2195, term2195.getClass(), "version", null);
        setField(term2195, term2195.getClass(), "kernel", null);
        setField(term2195, term2195.getClass(), "releaseDate", null);
        setField(term2195, term2195.getClass(), "usages", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "builder", argTypes, term2195, args);
    }

};


