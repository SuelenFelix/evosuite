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

public class AccountEntity_AccountEntityBuilderImpl_build_7740509322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14539;

    public AccountEntity_AccountEntityBuilderImpl_build_7740509322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14688 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term14687 = ((Class) term14688).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term14687).setAccessible(true);
        Object enum35 = ((Field) term14687).get((Object) null);
        ArrayList term14584 = new ArrayList();
        ((ArrayList) term14584).add((Object)null);
        ArrayList term14589 = new ArrayList();
        ((ArrayList) term14589).add((Object)null);
        ((ArrayList) term14589).add((Object)null);
        ((ArrayList) term14589).add((Object)null);
        ((ArrayList) term14589).add((Object)null);
        ((ArrayList) term14589).add((Object)null);
        ((ArrayList) term14589).add((Object)null);
        ((ArrayList) term14589).add((Object)null);
        Object term14583 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term14583, term14583.getClass(), "memberEntities", term14584);
        setField(term14583, term14583.getClass(), "id", "");
        setField(term14583, term14583.getClass(), "name", "");
        setField(term14583, term14583.getClass(), "relationEntities", term14589);
        ArrayList term14593 = new ArrayList();
        ((ArrayList) term14593).add((Object)null);
        ((ArrayList) term14593).add((Object)null);
        ((ArrayList) term14593).add((Object)null);
        ((ArrayList) term14593).add((Object)null);
        ((ArrayList) term14593).add((Object)null);
        ((ArrayList) term14593).add((Object)null);
        ((ArrayList) term14593).add((Object)null);
        ArrayList term14598 = new ArrayList();
        ((ArrayList) term14598).add((Object)null);
        Object term14592 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term14592, term14592.getClass(), "memberEntities", term14593);
        setField(term14592, term14592.getClass(), "id", "");
        setField(term14592, term14592.getClass(), "name", "");
        setField(term14592, term14592.getClass(), "relationEntities", term14598);
        ArrayList term14602 = new ArrayList();
        ((ArrayList) term14602).add((Object)null);
        ((ArrayList) term14602).add((Object)null);
        ((ArrayList) term14602).add((Object)null);
        ((ArrayList) term14602).add((Object)null);
        ((ArrayList) term14602).add((Object)null);
        ArrayList term14607 = new ArrayList();
        ((ArrayList) term14607).add((Object)null);
        Object term14601 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term14601, term14601.getClass(), "memberEntities", term14602);
        setField(term14601, term14601.getClass(), "id", "");
        setField(term14601, term14601.getClass(), "name", "");
        setField(term14601, term14601.getClass(), "relationEntities", term14607);
        ArrayList term14611 = new ArrayList();
        ((ArrayList) term14611).add((Object)null);
        ((ArrayList) term14611).add((Object)null);
        ((ArrayList) term14611).add((Object)null);
        ((ArrayList) term14611).add((Object)null);
        ((ArrayList) term14611).add((Object)null);
        ((ArrayList) term14611).add((Object)null);
        ((ArrayList) term14611).add((Object)null);
        ((ArrayList) term14611).add((Object)null);
        ((ArrayList) term14611).add((Object)null);
        ArrayList term14616 = new ArrayList();
        Object term14610 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term14610, term14610.getClass(), "memberEntities", term14611);
        setField(term14610, term14610.getClass(), "id", "");
        setField(term14610, term14610.getClass(), "name", "");
        setField(term14610, term14610.getClass(), "relationEntities", term14616);
        ArrayList term14620 = new ArrayList();
        ((ArrayList) term14620).add((Object)null);
        ((ArrayList) term14620).add((Object)null);
        ((ArrayList) term14620).add((Object)null);
        ((ArrayList) term14620).add((Object)null);
        ArrayList term14625 = new ArrayList();
        Object term14619 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term14619, term14619.getClass(), "memberEntities", term14620);
        setField(term14619, term14619.getClass(), "id", "");
        setField(term14619, term14619.getClass(), "name", "");
        setField(term14619, term14619.getClass(), "relationEntities", term14625);
        ArrayList term14629 = new ArrayList();
        ((ArrayList) term14629).add((Object)null);
        ((ArrayList) term14629).add((Object)null);
        ((ArrayList) term14629).add((Object)null);
        ((ArrayList) term14629).add((Object)null);
        ((ArrayList) term14629).add((Object)null);
        ((ArrayList) term14629).add((Object)null);
        ((ArrayList) term14629).add((Object)null);
        ArrayList term14634 = new ArrayList();
        ((ArrayList) term14634).add((Object)null);
        ((ArrayList) term14634).add((Object)null);
        ((ArrayList) term14634).add((Object)null);
        ((ArrayList) term14634).add((Object)null);
        Object term14628 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term14628, term14628.getClass(), "memberEntities", term14629);
        setField(term14628, term14628.getClass(), "id", "");
        setField(term14628, term14628.getClass(), "name", "");
        setField(term14628, term14628.getClass(), "relationEntities", term14634);
        ArrayList term14581 = new ArrayList();
        ((ArrayList) term14581).add(term14583);
        ((ArrayList) term14581).add(term14592);
        ((ArrayList) term14581).add(term14601);
        ((ArrayList) term14581).add(term14610);
        ((ArrayList) term14581).add(term14619);
        ((ArrayList) term14581).add(term14628);
        ArrayList term14663 = new ArrayList();
        ((ArrayList) term14663).add((Object)null);
        ((ArrayList) term14663).add((Object)null);
        ((ArrayList) term14663).add((Object)null);
        ((ArrayList) term14663).add((Object)null);
        ((ArrayList) term14663).add((Object)null);
        ((ArrayList) term14663).add((Object)null);
        ((ArrayList) term14663).add((Object)null);
        ((ArrayList) term14663).add((Object)null);
        term14539 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity$AccountEntityBuilderImpl"));
        setField(term14539, term14539.getClass(), "email", "ZVecLZMLHF");
        setField(term14539, term14539.getClass(), "password", "fztQhjqwdP");
        setField(term14539, term14539.getClass(), "role", enum35);
        setField(term14539, term14539.getClass(), "projectEntities", term14581);
        setField(term14539, term14539.getClass(), "id", "WzMEhMXkKx");
        setField(term14539, term14539.getClass(), "name", "XOiDvlDhdc");
        setField(term14539, term14539.getClass(), "relationEntities", term14663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity$AccountEntityBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term14539, args);
    }

};


