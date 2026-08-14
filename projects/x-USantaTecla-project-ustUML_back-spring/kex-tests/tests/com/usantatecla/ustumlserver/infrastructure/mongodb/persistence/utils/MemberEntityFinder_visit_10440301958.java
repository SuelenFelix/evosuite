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

public class MemberEntityFinder_visit_10440301958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5648;

    public MemberEntityFinder_visit_10440301958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5673 = new ArrayList();
        ((ArrayList) term5673).add((Object)null);
        ((ArrayList) term5673).add((Object)null);
        ((ArrayList) term5673).add((Object)null);
        ((ArrayList) term5673).add((Object)null);
        ((ArrayList) term5673).add((Object)null);
        ((ArrayList) term5673).add((Object)null);
        term5648 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor"));
        setField(term5648, term5648.getClass(), "id", "OJJtVNPyKZ");
        setField(term5648, term5648.getClass(), "name", "AKNapTAfmD");
        setField(term5648, term5648.getClass(), "relations", term5673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.MemberEntityFinder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor");
        Object[] args = new Object[1];
        args[0] = term5648;
        callMethod(klass, "visit", argTypes, null, args);
    }

};


