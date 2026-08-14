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

public class AccountEntity_setRole_21781171712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66760;
     Object enum170;

    public AccountEntity_setRole_21781171712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term66900 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term66899 = ((Class) term66900).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term66899).setAccessible(true);
        enum170 = ((Field) term66899).get((Object) null);
        ArrayList term66805 = new ArrayList();
        ((ArrayList) term66805).add((Object)null);
        ((ArrayList) term66805).add((Object)null);
        ((ArrayList) term66805).add((Object)null);
        ((ArrayList) term66805).add((Object)null);
        ArrayList term66810 = new ArrayList();
        ((ArrayList) term66810).add((Object)null);
        ((ArrayList) term66810).add((Object)null);
        ((ArrayList) term66810).add((Object)null);
        ((ArrayList) term66810).add((Object)null);
        ((ArrayList) term66810).add((Object)null);
        ((ArrayList) term66810).add((Object)null);
        ((ArrayList) term66810).add((Object)null);
        Object term66804 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term66804, term66804.getClass(), "memberEntities", term66805);
        setField(term66804, term66804.getClass(), "id", "");
        setField(term66804, term66804.getClass(), "name", "");
        setField(term66804, term66804.getClass(), "relationEntities", term66810);
        ArrayList term66814 = new ArrayList();
        ((ArrayList) term66814).add((Object)null);
        ((ArrayList) term66814).add((Object)null);
        ((ArrayList) term66814).add((Object)null);
        ((ArrayList) term66814).add((Object)null);
        ((ArrayList) term66814).add((Object)null);
        ((ArrayList) term66814).add((Object)null);
        ArrayList term66819 = new ArrayList();
        ((ArrayList) term66819).add((Object)null);
        ((ArrayList) term66819).add((Object)null);
        ((ArrayList) term66819).add((Object)null);
        Object term66813 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term66813, term66813.getClass(), "memberEntities", term66814);
        setField(term66813, term66813.getClass(), "id", "");
        setField(term66813, term66813.getClass(), "name", "");
        setField(term66813, term66813.getClass(), "relationEntities", term66819);
        ArrayList term66823 = new ArrayList();
        ((ArrayList) term66823).add((Object)null);
        ((ArrayList) term66823).add((Object)null);
        ArrayList term66828 = new ArrayList();
        ((ArrayList) term66828).add((Object)null);
        ((ArrayList) term66828).add((Object)null);
        ((ArrayList) term66828).add((Object)null);
        ((ArrayList) term66828).add((Object)null);
        Object term66822 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term66822, term66822.getClass(), "memberEntities", term66823);
        setField(term66822, term66822.getClass(), "id", "");
        setField(term66822, term66822.getClass(), "name", "");
        setField(term66822, term66822.getClass(), "relationEntities", term66828);
        ArrayList term66832 = new ArrayList();
        ((ArrayList) term66832).add((Object)null);
        ((ArrayList) term66832).add((Object)null);
        ((ArrayList) term66832).add((Object)null);
        ((ArrayList) term66832).add((Object)null);
        ((ArrayList) term66832).add((Object)null);
        ArrayList term66837 = new ArrayList();
        ((ArrayList) term66837).add((Object)null);
        ((ArrayList) term66837).add((Object)null);
        ((ArrayList) term66837).add((Object)null);
        ((ArrayList) term66837).add((Object)null);
        Object term66831 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term66831, term66831.getClass(), "memberEntities", term66832);
        setField(term66831, term66831.getClass(), "id", "");
        setField(term66831, term66831.getClass(), "name", "");
        setField(term66831, term66831.getClass(), "relationEntities", term66837);
        ArrayList term66841 = new ArrayList();
        ((ArrayList) term66841).add((Object)null);
        ((ArrayList) term66841).add((Object)null);
        ArrayList term66846 = new ArrayList();
        ((ArrayList) term66846).add((Object)null);
        ((ArrayList) term66846).add((Object)null);
        ((ArrayList) term66846).add((Object)null);
        ((ArrayList) term66846).add((Object)null);
        ((ArrayList) term66846).add((Object)null);
        ((ArrayList) term66846).add((Object)null);
        Object term66840 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term66840, term66840.getClass(), "memberEntities", term66841);
        setField(term66840, term66840.getClass(), "id", "");
        setField(term66840, term66840.getClass(), "name", "");
        setField(term66840, term66840.getClass(), "relationEntities", term66846);
        ArrayList term66802 = new ArrayList();
        ((ArrayList) term66802).add(term66804);
        ((ArrayList) term66802).add(term66813);
        ((ArrayList) term66802).add(term66822);
        ((ArrayList) term66802).add(term66831);
        ((ArrayList) term66802).add(term66840);
        ArrayList term66875 = new ArrayList();
        ((ArrayList) term66875).add((Object)null);
        ((ArrayList) term66875).add((Object)null);
        ((ArrayList) term66875).add((Object)null);
        ((ArrayList) term66875).add((Object)null);
        ((ArrayList) term66875).add((Object)null);
        ((ArrayList) term66875).add((Object)null);
        ((ArrayList) term66875).add((Object)null);
        ((ArrayList) term66875).add((Object)null);
        ((ArrayList) term66875).add((Object)null);
        term66760 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity"));
        setField(term66760, term66760.getClass(), "email", "GlxnEJvYeC");
        setField(term66760, term66760.getClass(), "password", "SLdOGaqmNv");
        setField(term66760, term66760.getClass(), "role", enum170);
        setField(term66760, term66760.getClass(), "projectEntities", term66802);
        setField(term66760, term66760.getClass(), "id", "FiALSqneIg");
        setField(term66760, term66760.getClass(), "name", "lGVACSQceQ");
        setField(term66760, term66760.getClass(), "relationEntities", term66875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Role");
        Object[] args = new Object[1];
        args[0] = enum170;
        callMethod(klass, "setRole", argTypes, term66760, args);
    }

};


