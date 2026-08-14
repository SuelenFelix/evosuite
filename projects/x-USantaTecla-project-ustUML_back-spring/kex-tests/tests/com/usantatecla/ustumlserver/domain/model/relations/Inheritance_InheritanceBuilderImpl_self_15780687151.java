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

public class Inheritance_InheritanceBuilderImpl_self_15780687151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term523;

    public Inheritance_InheritanceBuilderImpl_self_15780687151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term523 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.relations.Inheritance$InheritanceBuilderImpl"));
        setField(term523, term523.getClass(), "id", "eZFUvlxvGV");
        setField(term523, term523.getClass(), "target", null);
        setField(term523, term523.getClass(), "role", "BYqFIqCKAV");
        setField(term523, term523.getClass(), "targetRoute", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.relations.Inheritance$InheritanceBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term523, args);
    }

};


