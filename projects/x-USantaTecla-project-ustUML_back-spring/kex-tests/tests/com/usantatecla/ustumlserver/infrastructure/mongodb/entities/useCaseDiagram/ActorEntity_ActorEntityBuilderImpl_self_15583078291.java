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

public class ActorEntity_ActorEntityBuilderImpl_self_15583078291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ActorEntity_ActorEntityBuilderImpl_self_15583078291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26 = new ArrayList();
        ((ArrayList) term26).add((Object)null);
        ((ArrayList) term26).add((Object)null);
        ((ArrayList) term26).add((Object)null);
        ((ArrayList) term26).add((Object)null);
        ((ArrayList) term26).add((Object)null);
        term1 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram.ActorEntity$ActorEntityBuilderImpl"));
        setField(term1, term1.getClass(), "id", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "name", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "relationEntities", term26);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram.ActorEntity$ActorEntityBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term1, args);
    }

};


