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

public class AccountEntity_AccountEntityBuilderImpl_self_5216268591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14069;

    public AccountEntity_AccountEntityBuilderImpl_self_5216268591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14244 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term14243 = ((Class) term14244).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term14243).setAccessible(true);
        Object enum34 = ((Field) term14243).get((Object) null);
        ArrayList term14114 = new ArrayList();
        ((ArrayList) term14114).add((Object)null);
        ((ArrayList) term14114).add((Object)null);
        ArrayList term14119 = new ArrayList();
        ((ArrayList) term14119).add((Object)null);
        ((ArrayList) term14119).add((Object)null);
        Object term14113 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term14113, term14113.getClass(), "memberEntities", term14114);
        setField(term14113, term14113.getClass(), "id", "");
        setField(term14113, term14113.getClass(), "name", "");
        setField(term14113, term14113.getClass(), "relationEntities", term14119);
        ArrayList term14123 = new ArrayList();
        ((ArrayList) term14123).add((Object)null);
        ArrayList term14128 = new ArrayList();
        Object term14122 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term14122, term14122.getClass(), "memberEntities", term14123);
        setField(term14122, term14122.getClass(), "id", "");
        setField(term14122, term14122.getClass(), "name", "");
        setField(term14122, term14122.getClass(), "relationEntities", term14128);
        ArrayList term14132 = new ArrayList();
        ((ArrayList) term14132).add((Object)null);
        ((ArrayList) term14132).add((Object)null);
        ((ArrayList) term14132).add((Object)null);
        ((ArrayList) term14132).add((Object)null);
        ((ArrayList) term14132).add((Object)null);
        ((ArrayList) term14132).add((Object)null);
        ((ArrayList) term14132).add((Object)null);
        ((ArrayList) term14132).add((Object)null);
        ArrayList term14137 = new ArrayList();
        Object term14131 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term14131, term14131.getClass(), "memberEntities", term14132);
        setField(term14131, term14131.getClass(), "id", "");
        setField(term14131, term14131.getClass(), "name", "");
        setField(term14131, term14131.getClass(), "relationEntities", term14137);
        ArrayList term14141 = new ArrayList();
        ArrayList term14146 = new ArrayList();
        ((ArrayList) term14146).add((Object)null);
        Object term14140 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term14140, term14140.getClass(), "memberEntities", term14141);
        setField(term14140, term14140.getClass(), "id", "");
        setField(term14140, term14140.getClass(), "name", "");
        setField(term14140, term14140.getClass(), "relationEntities", term14146);
        ArrayList term14150 = new ArrayList();
        ((ArrayList) term14150).add((Object)null);
        ((ArrayList) term14150).add((Object)null);
        ((ArrayList) term14150).add((Object)null);
        ((ArrayList) term14150).add((Object)null);
        ((ArrayList) term14150).add((Object)null);
        ArrayList term14155 = new ArrayList();
        ((ArrayList) term14155).add((Object)null);
        ((ArrayList) term14155).add((Object)null);
        ((ArrayList) term14155).add((Object)null);
        ((ArrayList) term14155).add((Object)null);
        Object term14149 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term14149, term14149.getClass(), "memberEntities", term14150);
        setField(term14149, term14149.getClass(), "id", "");
        setField(term14149, term14149.getClass(), "name", "");
        setField(term14149, term14149.getClass(), "relationEntities", term14155);
        ArrayList term14159 = new ArrayList();
        ((ArrayList) term14159).add((Object)null);
        ((ArrayList) term14159).add((Object)null);
        ((ArrayList) term14159).add((Object)null);
        ((ArrayList) term14159).add((Object)null);
        ArrayList term14164 = new ArrayList();
        Object term14158 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term14158, term14158.getClass(), "memberEntities", term14159);
        setField(term14158, term14158.getClass(), "id", "");
        setField(term14158, term14158.getClass(), "name", "");
        setField(term14158, term14158.getClass(), "relationEntities", term14164);
        ArrayList term14168 = new ArrayList();
        ((ArrayList) term14168).add((Object)null);
        ((ArrayList) term14168).add((Object)null);
        ((ArrayList) term14168).add((Object)null);
        ((ArrayList) term14168).add((Object)null);
        ((ArrayList) term14168).add((Object)null);
        ((ArrayList) term14168).add((Object)null);
        ((ArrayList) term14168).add((Object)null);
        ArrayList term14173 = new ArrayList();
        ((ArrayList) term14173).add((Object)null);
        ((ArrayList) term14173).add((Object)null);
        Object term14167 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term14167, term14167.getClass(), "memberEntities", term14168);
        setField(term14167, term14167.getClass(), "id", "");
        setField(term14167, term14167.getClass(), "name", "");
        setField(term14167, term14167.getClass(), "relationEntities", term14173);
        ArrayList term14111 = new ArrayList();
        ((ArrayList) term14111).add(term14113);
        ((ArrayList) term14111).add(term14122);
        ((ArrayList) term14111).add(term14131);
        ((ArrayList) term14111).add(term14140);
        ((ArrayList) term14111).add(term14149);
        ((ArrayList) term14111).add(term14158);
        ((ArrayList) term14111).add(term14167);
        ArrayList term14202 = new ArrayList();
        ((ArrayList) term14202).add((Object)null);
        term14069 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity$AccountEntityBuilderImpl"));
        setField(term14069, term14069.getClass(), "email", "swZVeJAxjt");
        setField(term14069, term14069.getClass(), "password", "xOcJIiQQDu");
        setField(term14069, term14069.getClass(), "role", enum34);
        setField(term14069, term14069.getClass(), "projectEntities", term14111);
        setField(term14069, term14069.getClass(), "id", "xBsXSDjXYK");
        setField(term14069, term14069.getClass(), "name", "sEnIVFtZuQ");
        setField(term14069, term14069.getClass(), "relationEntities", term14202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity$AccountEntityBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term14069, args);
    }

};


