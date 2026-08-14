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
import java.util.LinkedList;
import java.lang.Object;

public class WithMembersMemberPersistenceMongodb_deleteMembers_18744722881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5755;
     Object term5756;

    public WithMembersMemberPersistenceMongodb_deleteMembers_18744722881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5755 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.WithMembersMemberPersistenceMongodb"));
        setField(term5755, term5755.getClass(), "memberEntityDeleter", null);
        setField(term5755, term5755.getClass(), "memberEntityUpdater", null);
        term5756 = new LinkedList();
        ((LinkedList) term5756).add((Object)null);
        ((LinkedList) term5756).add((Object)null);
        ((LinkedList) term5756).add((Object)null);
        ((LinkedList) term5756).add((Object)null);
        ((LinkedList) term5756).add((Object)null);
        ((LinkedList) term5756).add((Object)null);
        ((LinkedList) term5756).add((Object)null);
        ((LinkedList) term5756).add((Object)null);
        ((LinkedList) term5756).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.WithMembersMemberPersistenceMongodb");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.WithMembersMember");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5756;
        callMethod(klass, "deleteMembers", argTypes, term5755, args);
    }

};


