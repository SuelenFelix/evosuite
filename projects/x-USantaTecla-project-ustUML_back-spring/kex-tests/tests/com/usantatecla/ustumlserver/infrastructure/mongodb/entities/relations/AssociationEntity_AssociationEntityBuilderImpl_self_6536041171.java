package com.usantatecla.ustumlserver.infrastructure.mongodb.entities.relations;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.entities.relations.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AssociationEntity_AssociationEntityBuilderImpl_self_6536041171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1093;

    public AssociationEntity_AssociationEntityBuilderImpl_self_6536041171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1093 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.relations.AssociationEntity$AssociationEntityBuilderImpl"));
        setField(term1093, term1093.getClass(), "id", "xLbjWUgOIL");
        setField(term1093, term1093.getClass(), "target", null);
        setField(term1093, term1093.getClass(), "role", "jDtqGUpnZN");
        setField(term1093, term1093.getClass(), "targetRoute", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.relations.AssociationEntity$AssociationEntityBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term1093, args);
    }

};


