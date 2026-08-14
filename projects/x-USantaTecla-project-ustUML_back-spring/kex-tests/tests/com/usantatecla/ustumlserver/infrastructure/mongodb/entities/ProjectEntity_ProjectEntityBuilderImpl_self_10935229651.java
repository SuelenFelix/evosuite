package com.usantatecla.ustumlserver.infrastructure.mongodb.entities;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ProjectEntity_ProjectEntityBuilderImpl_self_10935229651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71329;

    public ProjectEntity_ProjectEntityBuilderImpl_self_10935229651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term71330 = new ArrayList();
        ((ArrayList) term71330).add((Object)null);
        ArrayList term71358 = new ArrayList();
        term71329 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity$ProjectEntityBuilderImpl"));
        setField(term71329, term71329.getClass(), "memberEntities", term71330);
        setField(term71329, term71329.getClass(), "id", "nwKkzNpzyC");
        setField(term71329, term71329.getClass(), "name", "CwrsdYnHpH");
        setField(term71329, term71329.getClass(), "relationEntities", term71358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity$ProjectEntityBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term71329, args);
    }

};


