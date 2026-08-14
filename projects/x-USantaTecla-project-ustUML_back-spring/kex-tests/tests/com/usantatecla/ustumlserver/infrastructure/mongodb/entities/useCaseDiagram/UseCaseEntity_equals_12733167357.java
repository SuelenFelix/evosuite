package com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class UseCaseEntity_equals_12733167357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term898;
     Object term927;

    public UseCaseEntity_equals_12733167357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term923 = new ArrayList();
        ((ArrayList) term923).add((Object)null);
        ((ArrayList) term923).add((Object)null);
        ((ArrayList) term923).add((Object)null);
        ((ArrayList) term923).add((Object)null);
        ((ArrayList) term923).add((Object)null);
        ((ArrayList) term923).add((Object)null);
        ((ArrayList) term923).add((Object)null);
        ((ArrayList) term923).add((Object)null);
        term898 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram.UseCaseEntity"));
        setField(term898, term898.getClass(), "id", "xrwlQZdwCp");
        setField(term898, term898.getClass(), "name", "IDCWpPLRkE");
        setField(term898, term898.getClass(), "relationEntities", term923);
        term927 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram.UseCaseEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term927;
        callMethod(klass, "equals", argTypes, term898, args);
    }

};


