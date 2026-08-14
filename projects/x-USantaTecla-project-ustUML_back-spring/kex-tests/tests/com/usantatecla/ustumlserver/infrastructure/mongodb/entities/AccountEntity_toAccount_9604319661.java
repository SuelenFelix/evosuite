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

public class AccountEntity_toAccount_9604319661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62909;

    public AccountEntity_toAccount_9604319661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63040 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term63039 = ((Class) term63040).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term63039).setAccessible(true);
        Object enum161 = ((Field) term63039).get((Object) null);
        ArrayList term62954 = new ArrayList();
        ((ArrayList) term62954).add((Object)null);
        ((ArrayList) term62954).add((Object)null);
        ((ArrayList) term62954).add((Object)null);
        ArrayList term62959 = new ArrayList();
        ((ArrayList) term62959).add((Object)null);
        ((ArrayList) term62959).add((Object)null);
        ((ArrayList) term62959).add((Object)null);
        ((ArrayList) term62959).add((Object)null);
        Object term62953 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term62953, term62953.getClass(), "memberEntities", term62954);
        setField(term62953, term62953.getClass(), "id", "");
        setField(term62953, term62953.getClass(), "name", "");
        setField(term62953, term62953.getClass(), "relationEntities", term62959);
        ArrayList term62963 = new ArrayList();
        ArrayList term62968 = new ArrayList();
        ((ArrayList) term62968).add((Object)null);
        ((ArrayList) term62968).add((Object)null);
        Object term62962 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term62962, term62962.getClass(), "memberEntities", term62963);
        setField(term62962, term62962.getClass(), "id", "");
        setField(term62962, term62962.getClass(), "name", "");
        setField(term62962, term62962.getClass(), "relationEntities", term62968);
        ArrayList term62972 = new ArrayList();
        ArrayList term62977 = new ArrayList();
        ((ArrayList) term62977).add((Object)null);
        ((ArrayList) term62977).add((Object)null);
        ((ArrayList) term62977).add((Object)null);
        ((ArrayList) term62977).add((Object)null);
        Object term62971 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term62971, term62971.getClass(), "memberEntities", term62972);
        setField(term62971, term62971.getClass(), "id", "");
        setField(term62971, term62971.getClass(), "name", "");
        setField(term62971, term62971.getClass(), "relationEntities", term62977);
        ArrayList term62981 = new ArrayList();
        ((ArrayList) term62981).add((Object)null);
        ((ArrayList) term62981).add((Object)null);
        ((ArrayList) term62981).add((Object)null);
        ((ArrayList) term62981).add((Object)null);
        ((ArrayList) term62981).add((Object)null);
        ((ArrayList) term62981).add((Object)null);
        ((ArrayList) term62981).add((Object)null);
        ArrayList term62986 = new ArrayList();
        ((ArrayList) term62986).add((Object)null);
        ((ArrayList) term62986).add((Object)null);
        ((ArrayList) term62986).add((Object)null);
        Object term62980 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term62980, term62980.getClass(), "memberEntities", term62981);
        setField(term62980, term62980.getClass(), "id", "");
        setField(term62980, term62980.getClass(), "name", "");
        setField(term62980, term62980.getClass(), "relationEntities", term62986);
        ArrayList term62951 = new ArrayList();
        ((ArrayList) term62951).add(term62953);
        ((ArrayList) term62951).add(term62962);
        ((ArrayList) term62951).add(term62971);
        ((ArrayList) term62951).add(term62980);
        ArrayList term63015 = new ArrayList();
        ((ArrayList) term63015).add((Object)null);
        ((ArrayList) term63015).add((Object)null);
        term62909 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity"));
        setField(term62909, term62909.getClass(), "email", "iQRfDlaoYD");
        setField(term62909, term62909.getClass(), "password", "kpcyrjDQzN");
        setField(term62909, term62909.getClass(), "role", enum161);
        setField(term62909, term62909.getClass(), "projectEntities", term62951);
        setField(term62909, term62909.getClass(), "id", "LnNRVsjmxw");
        setField(term62909, term62909.getClass(), "name", "PlOnDkNrvX");
        setField(term62909, term62909.getClass(), "relationEntities", term63015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toAccount", argTypes, term62909, args);
    }

};


