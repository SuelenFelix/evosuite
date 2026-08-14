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

public class Account_accept_17230454055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50325;

    public Account_accept_17230454055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50420 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term50419 = ((Class) term50420).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term50419).setAccessible(true);
        Object enum118 = ((Field) term50419).get((Object) null);
        ArrayList term50367 = new ArrayList();
        ArrayList term50395 = new ArrayList();
        ((ArrayList) term50395).add((Object)null);
        ((ArrayList) term50395).add((Object)null);
        ((ArrayList) term50395).add((Object)null);
        ((ArrayList) term50395).add((Object)null);
        term50325 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term50325, term50325.getClass(), "email", "DyUuIDzZPG");
        setField(term50325, term50325.getClass(), "password", "EGQLusEtRN");
        setField(term50325, term50325.getClass(), "role", enum118);
        setField(term50325, term50325.getClass(), "projects", term50367);
        setField(term50325, term50325.getClass(), "id", "GwGUMPdvZq");
        setField(term50325, term50325.getClass(), "name", "iXRAYcFyfS");
        setField(term50325, term50325.getClass(), "relations", term50395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.Generator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "accept", argTypes, term50325, args);
    }

};


