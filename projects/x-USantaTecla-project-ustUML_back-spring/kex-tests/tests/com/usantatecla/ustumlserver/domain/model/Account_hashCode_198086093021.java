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

public class Account_hashCode_198086093021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55834;

    public Account_hashCode_198086093021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55929 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term55928 = ((Class) term55929).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term55928).setAccessible(true);
        Object enum132 = ((Field) term55928).get((Object) null);
        ArrayList term55876 = new ArrayList();
        ArrayList term55904 = new ArrayList();
        ((ArrayList) term55904).add((Object)null);
        ((ArrayList) term55904).add((Object)null);
        ((ArrayList) term55904).add((Object)null);
        ((ArrayList) term55904).add((Object)null);
        ((ArrayList) term55904).add((Object)null);
        ((ArrayList) term55904).add((Object)null);
        term55834 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term55834, term55834.getClass(), "email", "nOElYZBeyU");
        setField(term55834, term55834.getClass(), "password", "eUXPtGmoNg");
        setField(term55834, term55834.getClass(), "role", enum132);
        setField(term55834, term55834.getClass(), "projects", term55876);
        setField(term55834, term55834.getClass(), "id", "ZjqXyUmAJY");
        setField(term55834, term55834.getClass(), "name", "pjEERkBbYo");
        setField(term55834, term55834.getClass(), "relations", term55904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term55834, args);
    }

};


