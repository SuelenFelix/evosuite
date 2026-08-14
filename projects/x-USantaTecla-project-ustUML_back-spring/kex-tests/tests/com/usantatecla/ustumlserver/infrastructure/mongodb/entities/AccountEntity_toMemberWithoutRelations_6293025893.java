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

public class AccountEntity_toMemberWithoutRelations_6293025893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63752;

    public AccountEntity_toMemberWithoutRelations_6293025893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63865 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term63864 = ((Class) term63865).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term63864).setAccessible(true);
        Object enum163 = ((Field) term63864).get((Object) null);
        ArrayList term63797 = new ArrayList();
        ((ArrayList) term63797).add((Object)null);
        ((ArrayList) term63797).add((Object)null);
        ((ArrayList) term63797).add((Object)null);
        ((ArrayList) term63797).add((Object)null);
        ((ArrayList) term63797).add((Object)null);
        ((ArrayList) term63797).add((Object)null);
        ArrayList term63802 = new ArrayList();
        ((ArrayList) term63802).add((Object)null);
        ((ArrayList) term63802).add((Object)null);
        ((ArrayList) term63802).add((Object)null);
        ((ArrayList) term63802).add((Object)null);
        Object term63796 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term63796, term63796.getClass(), "memberEntities", term63797);
        setField(term63796, term63796.getClass(), "id", "");
        setField(term63796, term63796.getClass(), "name", "");
        setField(term63796, term63796.getClass(), "relationEntities", term63802);
        ArrayList term63806 = new ArrayList();
        ((ArrayList) term63806).add((Object)null);
        ((ArrayList) term63806).add((Object)null);
        ArrayList term63811 = new ArrayList();
        ((ArrayList) term63811).add((Object)null);
        ((ArrayList) term63811).add((Object)null);
        ((ArrayList) term63811).add((Object)null);
        ((ArrayList) term63811).add((Object)null);
        ((ArrayList) term63811).add((Object)null);
        ((ArrayList) term63811).add((Object)null);
        ((ArrayList) term63811).add((Object)null);
        ((ArrayList) term63811).add((Object)null);
        ((ArrayList) term63811).add((Object)null);
        Object term63805 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term63805, term63805.getClass(), "memberEntities", term63806);
        setField(term63805, term63805.getClass(), "id", "");
        setField(term63805, term63805.getClass(), "name", "");
        setField(term63805, term63805.getClass(), "relationEntities", term63811);
        ArrayList term63794 = new ArrayList();
        ((ArrayList) term63794).add(term63796);
        ((ArrayList) term63794).add(term63805);
        ArrayList term63840 = new ArrayList();
        ((ArrayList) term63840).add((Object)null);
        ((ArrayList) term63840).add((Object)null);
        ((ArrayList) term63840).add((Object)null);
        ((ArrayList) term63840).add((Object)null);
        ((ArrayList) term63840).add((Object)null);
        ((ArrayList) term63840).add((Object)null);
        term63752 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity"));
        setField(term63752, term63752.getClass(), "email", "VFYvUTgYFB");
        setField(term63752, term63752.getClass(), "password", "BrWqhEIUUj");
        setField(term63752, term63752.getClass(), "role", enum163);
        setField(term63752, term63752.getClass(), "projectEntities", term63794);
        setField(term63752, term63752.getClass(), "id", "ARnOWpgtAg");
        setField(term63752, term63752.getClass(), "name", "MRrYxZoJBW");
        setField(term63752, term63752.getClass(), "relationEntities", term63840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toMemberWithoutRelations", argTypes, term63752, args);
    }

};


