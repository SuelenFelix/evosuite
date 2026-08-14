package com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class MemberEntityFinder_visit_21076334899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5697;

    public MemberEntityFinder_visit_21076334899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5722 = new ArrayList();
        ((ArrayList) term5722).add((Object)null);
        ((ArrayList) term5722).add((Object)null);
        ((ArrayList) term5722).add((Object)null);
        ((ArrayList) term5722).add((Object)null);
        ((ArrayList) term5722).add((Object)null);
        ((ArrayList) term5722).add((Object)null);
        ((ArrayList) term5722).add((Object)null);
        term5697 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase"));
        setField(term5697, term5697.getClass(), "id", "xJgPlLxpgC");
        setField(term5697, term5697.getClass(), "name", "EYtfuJaxiM");
        setField(term5697, term5697.getClass(), "relations", term5722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.MemberEntityFinder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase");
        Object[] args = new Object[1];
        args[0] = term5697;
        callMethod(klass, "visit", argTypes, null, args);
    }

};


