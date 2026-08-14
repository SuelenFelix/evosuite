package com.usantatecla.ustumlserver.domain.model.generators;

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
import static com.usantatecla.ustumlserver.domain.model.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PlantUMLGenerator_visit_135597569821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11419;

    public PlantUMLGenerator_visit_135597569821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11419 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator"));
        setField(term11419, term11419.getClass(), "withMembersMember", null);
        setField(term11419, term11419.getClass(), "origin", null);
        setIntField(term11419, term11419.getClass(), "depthLevel", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "visit", argTypes, term11419, args);
    }

};


