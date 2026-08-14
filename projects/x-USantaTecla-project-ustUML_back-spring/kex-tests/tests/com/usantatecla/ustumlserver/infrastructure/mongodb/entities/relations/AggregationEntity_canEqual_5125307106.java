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

public class AggregationEntity_canEqual_5125307106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2928;
     Object term2965;

    public AggregationEntity_canEqual_5125307106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2928 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.relations.AggregationEntity"));
        setField(term2928, term2928.getClass(), "id", "SdCKLMIYnX");
        setField(term2928, term2928.getClass(), "target", null);
        setField(term2928, term2928.getClass(), "role", "OJJtVNPyKZ");
        setField(term2928, term2928.getClass(), "targetRoute", "AKNapTAfmD");
        term2965 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.relations.AggregationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2965;
        callMethod(klass, "canEqual", argTypes, term2928, args);
    }

};


