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

public class UseCaseEntity_toString_206220419610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1047;

    public UseCaseEntity_toString_206220419610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1072 = new ArrayList();
        ((ArrayList) term1072).add((Object)null);
        term1047 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram.UseCaseEntity"));
        setField(term1047, term1047.getClass(), "id", "gGSMzuGICf");
        setField(term1047, term1047.getClass(), "name", "hxCBltsObl");
        setField(term1047, term1047.getClass(), "relationEntities", term1072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram.UseCaseEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1047, args);
    }

};


