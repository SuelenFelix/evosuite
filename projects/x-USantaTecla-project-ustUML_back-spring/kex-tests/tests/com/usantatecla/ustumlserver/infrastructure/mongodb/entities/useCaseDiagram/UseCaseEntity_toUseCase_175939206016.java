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

public class UseCaseEntity_toUseCase_175939206016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1099;

    public UseCaseEntity_toUseCase_175939206016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1099 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram.UseCaseEntity"));
        setField(term1099, term1099.getClass(), "id", null);
        setField(term1099, term1099.getClass(), "name", null);
        setField(term1099, term1099.getClass(), "relationEntities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram.UseCaseEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toUseCase", argTypes, term1099, args);
    }

};


