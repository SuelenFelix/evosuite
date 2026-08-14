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

public class AccountEntity_equals_42198051014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67780;
     Object term67854;

    public AccountEntity_equals_42198051014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term67876 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term67875 = ((Class) term67876).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term67875).setAccessible(true);
        Object enum172 = ((Field) term67875).get((Object) null);
        ArrayList term67822 = new ArrayList();
        ArrayList term67850 = new ArrayList();
        ((ArrayList) term67850).add((Object)null);
        ((ArrayList) term67850).add((Object)null);
        ((ArrayList) term67850).add((Object)null);
        ((ArrayList) term67850).add((Object)null);
        ((ArrayList) term67850).add((Object)null);
        ((ArrayList) term67850).add((Object)null);
        term67780 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity"));
        setField(term67780, term67780.getClass(), "email", "PQLyoEKWSa");
        setField(term67780, term67780.getClass(), "password", "HOgkhttJZS");
        setField(term67780, term67780.getClass(), "role", enum172);
        setField(term67780, term67780.getClass(), "projectEntities", term67822);
        setField(term67780, term67780.getClass(), "id", "goqNSmXSSS");
        setField(term67780, term67780.getClass(), "name", "AkViBLdqXM");
        setField(term67780, term67780.getClass(), "relationEntities", term67850);
        term67854 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term67854;
        callMethod(klass, "equals", argTypes, term67780, args);
    }

};


