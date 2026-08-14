package com.usantatecla.ustumlserver.domain.services.parsers.relations;

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
import static com.usantatecla.ustumlserver.domain.services.parsers.relations.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class RelationType_create_41136656912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum7;

    public RelationType_create_41136656912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3092 = Class.forName((String) "com.usantatecla.ustumlserver.domain.services.parsers.relations.RelationType");
        Field term3091 = ((Class) term3092).getDeclaredField((String) "NULL");
        ((Field) term3091).setAccessible(true);
        enum7 = ((Field) term3091).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.relations.RelationType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Member");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "create", argTypes, enum7, args);
    }

};


