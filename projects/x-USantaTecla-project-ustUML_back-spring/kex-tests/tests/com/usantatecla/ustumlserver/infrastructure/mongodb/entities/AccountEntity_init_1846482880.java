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

public class AccountEntity_init_1846482880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62519;

    public AccountEntity_init_1846482880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62614 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term62613 = ((Class) term62614).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term62613).setAccessible(true);
        Object enum160 = ((Field) term62613).get((Object) null);
        ArrayList term62561 = new ArrayList();
        ArrayList term62589 = new ArrayList();
        ((ArrayList) term62589).add((Object)null);
        ((ArrayList) term62589).add((Object)null);
        ((ArrayList) term62589).add((Object)null);
        term62519 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term62519, term62519.getClass(), "email", "WmTogHwGLE");
        setField(term62519, term62519.getClass(), "password", "qYOIXsGycY");
        setField(term62519, term62519.getClass(), "role", enum160);
        setField(term62519, term62519.getClass(), "projects", term62561);
        setField(term62519, term62519.getClass(), "id", "sJNXNshRLe");
        setField(term62519, term62519.getClass(), "name", "AYnbmgRCKr");
        setField(term62519, term62519.getClass(), "relations", term62589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term62519;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


