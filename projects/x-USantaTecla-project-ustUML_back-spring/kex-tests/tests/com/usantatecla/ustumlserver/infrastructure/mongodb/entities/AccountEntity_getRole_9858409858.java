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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class AccountEntity_getRole_9858409858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64985;

    public AccountEntity_getRole_9858409858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65098 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term65097 = ((Class) term65098).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term65097).setAccessible(true);
        Object enum166 = ((Field) term65097).get((Object) null);
        ArrayList term65030 = new ArrayList();
        ((ArrayList) term65030).add((Object)null);
        ((ArrayList) term65030).add((Object)null);
        ((ArrayList) term65030).add((Object)null);
        ((ArrayList) term65030).add((Object)null);
        ((ArrayList) term65030).add((Object)null);
        ArrayList term65035 = new ArrayList();
        Object term65029 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term65029, term65029.getClass(), "memberEntities", term65030);
        setField(term65029, term65029.getClass(), "id", "");
        setField(term65029, term65029.getClass(), "name", "");
        setField(term65029, term65029.getClass(), "relationEntities", term65035);
        ArrayList term65039 = new ArrayList();
        ((ArrayList) term65039).add((Object)null);
        ((ArrayList) term65039).add((Object)null);
        ((ArrayList) term65039).add((Object)null);
        ((ArrayList) term65039).add((Object)null);
        ((ArrayList) term65039).add((Object)null);
        ((ArrayList) term65039).add((Object)null);
        ((ArrayList) term65039).add((Object)null);
        ((ArrayList) term65039).add((Object)null);
        ArrayList term65044 = new ArrayList();
        ((ArrayList) term65044).add((Object)null);
        ((ArrayList) term65044).add((Object)null);
        ((ArrayList) term65044).add((Object)null);
        Object term65038 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term65038, term65038.getClass(), "memberEntities", term65039);
        setField(term65038, term65038.getClass(), "id", "");
        setField(term65038, term65038.getClass(), "name", "");
        setField(term65038, term65038.getClass(), "relationEntities", term65044);
        ArrayList term65027 = new ArrayList();
        ((ArrayList) term65027).add(term65029);
        ((ArrayList) term65027).add(term65038);
        ArrayList term65073 = new ArrayList();
        ((ArrayList) term65073).add((Object)null);
        ((ArrayList) term65073).add((Object)null);
        ((ArrayList) term65073).add((Object)null);
        ((ArrayList) term65073).add((Object)null);
        ((ArrayList) term65073).add((Object)null);
        ((ArrayList) term65073).add((Object)null);
        term64985 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity"));
        setField(term64985, term64985.getClass(), "email", "LzwyLxKJpw");
        setField(term64985, term64985.getClass(), "password", "ZhWJlplAVK");
        setField(term64985, term64985.getClass(), "role", enum166);
        setField(term64985, term64985.getClass(), "projectEntities", term65027);
        setField(term64985, term64985.getClass(), "id", "MFIdGVLoDo");
        setField(term64985, term64985.getClass(), "name", "kbxgTcnXyU");
        setField(term64985, term64985.getClass(), "relationEntities", term65073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term64985, args);
    }

};


