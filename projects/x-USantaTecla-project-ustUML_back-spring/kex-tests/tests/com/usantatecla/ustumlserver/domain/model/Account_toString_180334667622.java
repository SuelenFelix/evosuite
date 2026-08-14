package com.usantatecla.ustumlserver.domain.model;

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
import static com.usantatecla.ustumlserver.domain.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Account_toString_180334667622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56224;

    public Account_toString_180334667622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term56319 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term56318 = ((Class) term56319).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term56318).setAccessible(true);
        Object enum133 = ((Field) term56318).get((Object) null);
        ArrayList term56266 = new ArrayList();
        ArrayList term56294 = new ArrayList();
        ((ArrayList) term56294).add((Object)null);
        ((ArrayList) term56294).add((Object)null);
        ((ArrayList) term56294).add((Object)null);
        ((ArrayList) term56294).add((Object)null);
        ((ArrayList) term56294).add((Object)null);
        ((ArrayList) term56294).add((Object)null);
        ((ArrayList) term56294).add((Object)null);
        ((ArrayList) term56294).add((Object)null);
        term56224 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term56224, term56224.getClass(), "email", "FQPqmjhWog");
        setField(term56224, term56224.getClass(), "password", "sYtJsiIiSX");
        setField(term56224, term56224.getClass(), "role", enum133);
        setField(term56224, term56224.getClass(), "projects", term56266);
        setField(term56224, term56224.getClass(), "id", "KgfsAwTFFn");
        setField(term56224, term56224.getClass(), "name", "hFnFlgThhp");
        setField(term56224, term56224.getClass(), "relations", term56294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term56224, args);
    }

};


