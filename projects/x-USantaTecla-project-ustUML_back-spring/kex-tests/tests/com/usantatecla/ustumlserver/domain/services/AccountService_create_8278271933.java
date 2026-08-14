package com.usantatecla.ustumlserver.domain.services;

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
import static com.usantatecla.ustumlserver.domain.services.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class AccountService_create_8278271933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41985;
     Object term42012;

    public AccountService_create_8278271933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41985 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.AccountService"));
        Object term41986 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.TokenManager"));
        setField(term41985, term41985.getClass(), "accountPersistence", null);
        setField(term41986, term41986.getClass(), "secret", "MFtfkBMyOD");
        setField(term41986, term41986.getClass(), "issuer", "rdiIyXfRtL");
        setIntField(term41986, term41986.getClass(), "expire", 1725571209);
        setField(term41985, term41985.getClass(), "tokenManager", term41986);
        Class<? extends Object> term42127 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term42126 = ((Class) term42127).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term42126).setAccessible(true);
        Object enum96 = ((Field) term42126).get((Object) null);
        ArrayList term42054 = new ArrayList();
        ArrayList term42082 = new ArrayList();
        ((ArrayList) term42082).add((Object)null);
        ((ArrayList) term42082).add((Object)null);
        ((ArrayList) term42082).add((Object)null);
        ((ArrayList) term42082).add((Object)null);
        ((ArrayList) term42082).add((Object)null);
        ((ArrayList) term42082).add((Object)null);
        ((ArrayList) term42082).add((Object)null);
        term42012 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term42012, term42012.getClass(), "email", "douzkltmiI");
        setField(term42012, term42012.getClass(), "password", "MFKjhvLtpe");
        setField(term42012, term42012.getClass(), "role", enum96);
        setField(term42012, term42012.getClass(), "projects", term42054);
        setField(term42012, term42012.getClass(), "id", "xpbLKEsput");
        setField(term42012, term42012.getClass(), "name", "urlyLwPBVn");
        setField(term42012, term42012.getClass(), "relations", term42082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.AccountService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term42012;
        callMethod(klass, "create", argTypes, term41985, args);
    }

};


