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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class AccountPersistenceMongodb_create_10150905740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8229;

    public AccountPersistenceMongodb_create_10150905740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8324 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term8323 = ((Class) term8324).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term8323).setAccessible(true);
        Object enum15 = ((Field) term8323).get((Object) null);
        ArrayList term8271 = new ArrayList();
        ArrayList term8299 = new ArrayList();
        ((ArrayList) term8299).add((Object)null);
        ((ArrayList) term8299).add((Object)null);
        ((ArrayList) term8299).add((Object)null);
        ((ArrayList) term8299).add((Object)null);
        ((ArrayList) term8299).add((Object)null);
        ((ArrayList) term8299).add((Object)null);
        ((ArrayList) term8299).add((Object)null);
        ((ArrayList) term8299).add((Object)null);
        term8229 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term8229, term8229.getClass(), "email", "wfaXBpWAUH");
        setField(term8229, term8229.getClass(), "password", "VMeAzAHwZj");
        setField(term8229, term8229.getClass(), "role", enum15);
        setField(term8229, term8229.getClass(), "projects", term8271);
        setField(term8229, term8229.getClass(), "id", "PznxWXsZME");
        setField(term8229, term8229.getClass(), "name", "ZzIujlwVsw");
        setField(term8229, term8229.getClass(), "relations", term8299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.AccountPersistenceMongodb");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term8229;
        callMethod(klass, "create", argTypes, null, args);
    }

};


