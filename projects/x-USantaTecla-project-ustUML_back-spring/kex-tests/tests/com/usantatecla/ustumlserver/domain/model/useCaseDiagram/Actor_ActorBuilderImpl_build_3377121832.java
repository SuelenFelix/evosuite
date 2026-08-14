package com.usantatecla.ustumlserver.domain.model.useCaseDiagram;

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
import static com.usantatecla.ustumlserver.domain.model.useCaseDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Actor_ActorBuilderImpl_build_3377121832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term575;

    public Actor_ActorBuilderImpl_build_3377121832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term600 = new ArrayList();
        ((ArrayList) term600).add((Object)null);
        ((ArrayList) term600).add((Object)null);
        ((ArrayList) term600).add((Object)null);
        ((ArrayList) term600).add((Object)null);
        ((ArrayList) term600).add((Object)null);
        term575 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor$ActorBuilderImpl"));
        setField(term575, term575.getClass(), "id", "eZFUvlxvGV");
        setField(term575, term575.getClass(), "name", "BYqFIqCKAV");
        setField(term575, term575.getClass(), "relations", term600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor$ActorBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term575, args);
    }

};


