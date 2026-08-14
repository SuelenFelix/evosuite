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

public class Use_hashCode_32104390817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1178;

    public Use_hashCode_32104390817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1178 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.relations.Use"));
        setField(term1178, term1178.getClass(), "id", null);
        setField(term1178, term1178.getClass(), "target", null);
        setField(term1178, term1178.getClass(), "role", null);
        setField(term1178, term1178.getClass(), "targetRoute", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.relations.Use");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1178, args);
    }

};


