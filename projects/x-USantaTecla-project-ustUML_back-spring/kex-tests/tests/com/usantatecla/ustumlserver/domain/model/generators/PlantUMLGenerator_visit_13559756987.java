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

public class PlantUMLGenerator_visit_13559756987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9427;
     Object term9429;

    public PlantUMLGenerator_visit_13559756987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9427 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator"));
        setField(term9427, term9427.getClass(), "withMembersMember", null);
        setField(term9427, term9427.getClass(), "origin", null);
        setIntField(term9427, term9427.getClass(), "depthLevel", -1955890973);
        ArrayList term9454 = new ArrayList();
        ((ArrayList) term9454).add((Object)null);
        ((ArrayList) term9454).add((Object)null);
        ((ArrayList) term9454).add((Object)null);
        ((ArrayList) term9454).add((Object)null);
        ((ArrayList) term9454).add((Object)null);
        term9429 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor"));
        setField(term9429, term9429.getClass(), "id", "AHbZyFOmlo");
        setField(term9429, term9429.getClass(), "name", "TwfWVQGiIj");
        setField(term9429, term9429.getClass(), "relations", term9454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor");
        Object[] args = new Object[1];
        args[0] = term9429;
        callMethod(klass, "visit", argTypes, term9427, args);
    }

};


