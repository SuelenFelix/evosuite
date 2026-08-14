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

public class AccountEntity_getPassword_21330600107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64595;

    public AccountEntity_getPassword_21330600107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64690 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term64689 = ((Class) term64690).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term64689).setAccessible(true);
        Object enum165 = ((Field) term64689).get((Object) null);
        ArrayList term64637 = new ArrayList();
        ArrayList term64665 = new ArrayList();
        ((ArrayList) term64665).add((Object)null);
        ((ArrayList) term64665).add((Object)null);
        ((ArrayList) term64665).add((Object)null);
        ((ArrayList) term64665).add((Object)null);
        ((ArrayList) term64665).add((Object)null);
        ((ArrayList) term64665).add((Object)null);
        ((ArrayList) term64665).add((Object)null);
        ((ArrayList) term64665).add((Object)null);
        term64595 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity"));
        setField(term64595, term64595.getClass(), "email", "mIRMQIxHUD");
        setField(term64595, term64595.getClass(), "password", "FbBMtntDbw");
        setField(term64595, term64595.getClass(), "role", enum165);
        setField(term64595, term64595.getClass(), "projectEntities", term64637);
        setField(term64595, term64595.getClass(), "id", "zRnpRGaHlI");
        setField(term64595, term64595.getClass(), "name", "dVHfxjbMRK");
        setField(term64595, term64595.getClass(), "relationEntities", term64665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term64595, args);
    }

};


