package com.usantatecla.ustumlserver.infrastructure.mongodb.entities;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class PackageEntity_toMemberWithoutRelations_14078396066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103361;

    public PackageEntity_toMemberWithoutRelations_14078396066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103362 = new ArrayList();
        ((ArrayList) term103362).add((Object)null);
        ((ArrayList) term103362).add((Object)null);
        ArrayList term103390 = new ArrayList();
        ((ArrayList) term103390).add((Object)null);
        ((ArrayList) term103390).add((Object)null);
        ((ArrayList) term103390).add((Object)null);
        ((ArrayList) term103390).add((Object)null);
        ((ArrayList) term103390).add((Object)null);
        ((ArrayList) term103390).add((Object)null);
        ((ArrayList) term103390).add((Object)null);
        ((ArrayList) term103390).add((Object)null);
        ((ArrayList) term103390).add((Object)null);
        term103361 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity"));
        setField(term103361, term103361.getClass(), "memberEntities", term103362);
        setField(term103361, term103361.getClass(), "id", "PTEWoxLNqQ");
        setField(term103361, term103361.getClass(), "name", "XiAUBffMZP");
        setField(term103361, term103361.getClass(), "relationEntities", term103390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toMemberWithoutRelations", argTypes, term103361, args);
    }

};


