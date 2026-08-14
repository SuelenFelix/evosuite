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

public class ActorEntity_toActor_1656960984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397;

    public ActorEntity_toActor_1656960984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term422 = new ArrayList();
        ((ArrayList) term422).add((Object)null);
        ((ArrayList) term422).add((Object)null);
        ((ArrayList) term422).add((Object)null);
        ((ArrayList) term422).add((Object)null);
        ((ArrayList) term422).add((Object)null);
        ((ArrayList) term422).add((Object)null);
        ((ArrayList) term422).add((Object)null);
        term397 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram.ActorEntity"));
        setField(term397, term397.getClass(), "id", "ZiaGIbnzTs");
        setField(term397, term397.getClass(), "name", "tbcdzjIfER");
        setField(term397, term397.getClass(), "relationEntities", term422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram.ActorEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toActor", argTypes, term397, args);
    }

};


