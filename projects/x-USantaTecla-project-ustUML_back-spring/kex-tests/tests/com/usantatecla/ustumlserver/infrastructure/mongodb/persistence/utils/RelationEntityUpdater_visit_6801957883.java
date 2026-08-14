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

public class RelationEntityUpdater_visit_6801957883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68;

    public RelationEntityUpdater_visit_6801957883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.relations.Composition"));
        setField(term68, term68.getClass(), "id", "xxtlPwDYFs");
        setField(term68, term68.getClass(), "target", null);
        setField(term68, term68.getClass(), "role", "jJCZpVmanW");
        setField(term68, term68.getClass(), "targetRoute", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.RelationEntityUpdater");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.relations.Composition");
        Object[] args = new Object[1];
        args[0] = term68;
        callMethod(klass, "visit", argTypes, null, args);
    }

};


