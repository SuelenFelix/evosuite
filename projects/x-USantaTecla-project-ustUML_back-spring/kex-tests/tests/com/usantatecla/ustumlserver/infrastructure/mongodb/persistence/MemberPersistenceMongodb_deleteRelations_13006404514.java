package com.usantatecla.ustumlserver.infrastructure.mongodb.persistence;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MemberPersistenceMongodb_deleteRelations_13006404514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8770;

    public MemberPersistenceMongodb_deleteRelations_13006404514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8770 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.MemberPersistenceMongodb"));
        setField(term8770, term8770.getClass(), "relationEntityDeleter", null);
        setField(term8770, term8770.getClass(), "memberEntityUpdater", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.MemberPersistenceMongodb");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Member");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "deleteRelations", argTypes, term8770, args);
    }

};


