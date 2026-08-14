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

public class PackageEntity_PackageEntityBuilderImpl_self_1986474671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96747;

    public PackageEntity_PackageEntityBuilderImpl_self_1986474671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term96748 = new ArrayList();
        ((ArrayList) term96748).add((Object)null);
        ((ArrayList) term96748).add((Object)null);
        ((ArrayList) term96748).add((Object)null);
        ((ArrayList) term96748).add((Object)null);
        ((ArrayList) term96748).add((Object)null);
        ((ArrayList) term96748).add((Object)null);
        ArrayList term96776 = new ArrayList();
        ((ArrayList) term96776).add((Object)null);
        term96747 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity$PackageEntityBuilderImpl"));
        setField(term96747, term96747.getClass(), "memberEntities", term96748);
        setField(term96747, term96747.getClass(), "id", "pBnfJsGPNO");
        setField(term96747, term96747.getClass(), "name", "hzaRTeUQpV");
        setField(term96747, term96747.getClass(), "relationEntities", term96776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity$PackageEntityBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term96747, args);
    }

};


