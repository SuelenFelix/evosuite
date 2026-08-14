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

public class PackageEntity_PackageEntityBuilderImpl_build_7824188792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96800;

    public PackageEntity_PackageEntityBuilderImpl_build_7824188792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term96801 = new ArrayList();
        ((ArrayList) term96801).add((Object)null);
        ((ArrayList) term96801).add((Object)null);
        ((ArrayList) term96801).add((Object)null);
        ((ArrayList) term96801).add((Object)null);
        ((ArrayList) term96801).add((Object)null);
        ((ArrayList) term96801).add((Object)null);
        ((ArrayList) term96801).add((Object)null);
        ArrayList term96829 = new ArrayList();
        ((ArrayList) term96829).add((Object)null);
        ((ArrayList) term96829).add((Object)null);
        ((ArrayList) term96829).add((Object)null);
        term96800 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity$PackageEntityBuilderImpl"));
        setField(term96800, term96800.getClass(), "memberEntities", term96801);
        setField(term96800, term96800.getClass(), "id", "RlIgxHiNOB");
        setField(term96800, term96800.getClass(), "name", "kSpBCSqyfl");
        setField(term96800, term96800.getClass(), "relationEntities", term96829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity$PackageEntityBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term96800, args);
    }

};


