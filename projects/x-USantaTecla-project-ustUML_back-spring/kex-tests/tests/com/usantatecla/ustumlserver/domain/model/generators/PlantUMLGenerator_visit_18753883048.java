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
import java.util.ArrayList;
import java.lang.Object;

public class PlantUMLGenerator_visit_18753883048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9478;
     Object term9480;

    public PlantUMLGenerator_visit_18753883048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9478 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator"));
        setField(term9478, term9478.getClass(), "withMembersMember", null);
        setField(term9478, term9478.getClass(), "origin", null);
        setIntField(term9478, term9478.getClass(), "depthLevel", -2038273078);
        ArrayList term9505 = new ArrayList();
        ((ArrayList) term9505).add((Object)null);
        ((ArrayList) term9505).add((Object)null);
        ((ArrayList) term9505).add((Object)null);
        ((ArrayList) term9505).add((Object)null);
        ((ArrayList) term9505).add((Object)null);
        ((ArrayList) term9505).add((Object)null);
        ((ArrayList) term9505).add((Object)null);
        ((ArrayList) term9505).add((Object)null);
        ((ArrayList) term9505).add((Object)null);
        term9480 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase"));
        setField(term9480, term9480.getClass(), "id", "gUvcueTURF");
        setField(term9480, term9480.getClass(), "name", "EwQBhZjCIT");
        setField(term9480, term9480.getClass(), "relations", term9505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase");
        Object[] args = new Object[1];
        args[0] = term9480;
        callMethod(klass, "visit", argTypes, term9478, args);
    }

};


