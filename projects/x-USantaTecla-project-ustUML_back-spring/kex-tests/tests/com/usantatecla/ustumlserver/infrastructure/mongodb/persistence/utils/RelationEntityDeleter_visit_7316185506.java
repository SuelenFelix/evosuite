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

public class RelationEntityDeleter_visit_7316185506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5956;

    public RelationEntityDeleter_visit_7316185506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5956 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.relations.Aggregation"));
        setField(term5956, term5956.getClass(), "id", "pXOkjyeIRb");
        setField(term5956, term5956.getClass(), "target", null);
        setField(term5956, term5956.getClass(), "role", "GgZWSjxjyE");
        setField(term5956, term5956.getClass(), "targetRoute", "EeBVbzjcCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.RelationEntityDeleter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.relations.Aggregation");
        Object[] args = new Object[1];
        args[0] = term5956;
        callMethod(klass, "visit", argTypes, null, args);
    }

};


