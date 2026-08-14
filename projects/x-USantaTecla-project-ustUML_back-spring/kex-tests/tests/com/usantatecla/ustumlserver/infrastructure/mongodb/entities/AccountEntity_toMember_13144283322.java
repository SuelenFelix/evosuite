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

public class AccountEntity_toMember_13144283322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63335;

    public AccountEntity_toMember_13144283322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63457 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term63456 = ((Class) term63457).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term63456).setAccessible(true);
        Object enum162 = ((Field) term63456).get((Object) null);
        ArrayList term63380 = new ArrayList();
        ((ArrayList) term63380).add((Object)null);
        ((ArrayList) term63380).add((Object)null);
        ((ArrayList) term63380).add((Object)null);
        ((ArrayList) term63380).add((Object)null);
        ((ArrayList) term63380).add((Object)null);
        ((ArrayList) term63380).add((Object)null);
        ((ArrayList) term63380).add((Object)null);
        ((ArrayList) term63380).add((Object)null);
        ((ArrayList) term63380).add((Object)null);
        ArrayList term63385 = new ArrayList();
        ((ArrayList) term63385).add((Object)null);
        ((ArrayList) term63385).add((Object)null);
        ((ArrayList) term63385).add((Object)null);
        ((ArrayList) term63385).add((Object)null);
        ((ArrayList) term63385).add((Object)null);
        Object term63379 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term63379, term63379.getClass(), "memberEntities", term63380);
        setField(term63379, term63379.getClass(), "id", "");
        setField(term63379, term63379.getClass(), "name", "");
        setField(term63379, term63379.getClass(), "relationEntities", term63385);
        ArrayList term63389 = new ArrayList();
        ((ArrayList) term63389).add((Object)null);
        ((ArrayList) term63389).add((Object)null);
        ((ArrayList) term63389).add((Object)null);
        ArrayList term63394 = new ArrayList();
        ((ArrayList) term63394).add((Object)null);
        ((ArrayList) term63394).add((Object)null);
        ((ArrayList) term63394).add((Object)null);
        ((ArrayList) term63394).add((Object)null);
        ((ArrayList) term63394).add((Object)null);
        ((ArrayList) term63394).add((Object)null);
        ((ArrayList) term63394).add((Object)null);
        ((ArrayList) term63394).add((Object)null);
        ((ArrayList) term63394).add((Object)null);
        Object term63388 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term63388, term63388.getClass(), "memberEntities", term63389);
        setField(term63388, term63388.getClass(), "id", "");
        setField(term63388, term63388.getClass(), "name", "");
        setField(term63388, term63388.getClass(), "relationEntities", term63394);
        ArrayList term63398 = new ArrayList();
        ((ArrayList) term63398).add((Object)null);
        ArrayList term63403 = new ArrayList();
        ((ArrayList) term63403).add((Object)null);
        ((ArrayList) term63403).add((Object)null);
        ((ArrayList) term63403).add((Object)null);
        ((ArrayList) term63403).add((Object)null);
        ((ArrayList) term63403).add((Object)null);
        ((ArrayList) term63403).add((Object)null);
        ((ArrayList) term63403).add((Object)null);
        ((ArrayList) term63403).add((Object)null);
        ((ArrayList) term63403).add((Object)null);
        Object term63397 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term63397, term63397.getClass(), "memberEntities", term63398);
        setField(term63397, term63397.getClass(), "id", "");
        setField(term63397, term63397.getClass(), "name", "");
        setField(term63397, term63397.getClass(), "relationEntities", term63403);
        ArrayList term63377 = new ArrayList();
        ((ArrayList) term63377).add(term63379);
        ((ArrayList) term63377).add(term63388);
        ((ArrayList) term63377).add(term63397);
        ArrayList term63432 = new ArrayList();
        ((ArrayList) term63432).add((Object)null);
        ((ArrayList) term63432).add((Object)null);
        ((ArrayList) term63432).add((Object)null);
        ((ArrayList) term63432).add((Object)null);
        term63335 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity"));
        setField(term63335, term63335.getClass(), "email", "MltgFGldop");
        setField(term63335, term63335.getClass(), "password", "JCWSoxnBJs");
        setField(term63335, term63335.getClass(), "role", enum162);
        setField(term63335, term63335.getClass(), "projectEntities", term63377);
        setField(term63335, term63335.getClass(), "id", "IyOhWYyaDV");
        setField(term63335, term63335.getClass(), "name", "omWrkCSFzy");
        setField(term63335, term63335.getClass(), "relationEntities", term63432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toMember", argTypes, term63335, args);
    }

};


