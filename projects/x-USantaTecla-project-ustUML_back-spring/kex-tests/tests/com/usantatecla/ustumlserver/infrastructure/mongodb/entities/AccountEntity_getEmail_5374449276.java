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

public class AccountEntity_getEmail_5374449276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64160;

    public AccountEntity_getEmail_5374449276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64300 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term64299 = ((Class) term64300).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term64299).setAccessible(true);
        Object enum164 = ((Field) term64299).get((Object) null);
        ArrayList term64205 = new ArrayList();
        ((ArrayList) term64205).add((Object)null);
        ((ArrayList) term64205).add((Object)null);
        ((ArrayList) term64205).add((Object)null);
        ((ArrayList) term64205).add((Object)null);
        ((ArrayList) term64205).add((Object)null);
        ((ArrayList) term64205).add((Object)null);
        ((ArrayList) term64205).add((Object)null);
        ((ArrayList) term64205).add((Object)null);
        ((ArrayList) term64205).add((Object)null);
        ArrayList term64210 = new ArrayList();
        ((ArrayList) term64210).add((Object)null);
        ((ArrayList) term64210).add((Object)null);
        ((ArrayList) term64210).add((Object)null);
        ((ArrayList) term64210).add((Object)null);
        ((ArrayList) term64210).add((Object)null);
        Object term64204 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term64204, term64204.getClass(), "memberEntities", term64205);
        setField(term64204, term64204.getClass(), "id", "");
        setField(term64204, term64204.getClass(), "name", "");
        setField(term64204, term64204.getClass(), "relationEntities", term64210);
        ArrayList term64214 = new ArrayList();
        ((ArrayList) term64214).add((Object)null);
        ((ArrayList) term64214).add((Object)null);
        ((ArrayList) term64214).add((Object)null);
        ((ArrayList) term64214).add((Object)null);
        ((ArrayList) term64214).add((Object)null);
        ((ArrayList) term64214).add((Object)null);
        ((ArrayList) term64214).add((Object)null);
        ArrayList term64219 = new ArrayList();
        ((ArrayList) term64219).add((Object)null);
        ((ArrayList) term64219).add((Object)null);
        ((ArrayList) term64219).add((Object)null);
        Object term64213 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term64213, term64213.getClass(), "memberEntities", term64214);
        setField(term64213, term64213.getClass(), "id", "");
        setField(term64213, term64213.getClass(), "name", "");
        setField(term64213, term64213.getClass(), "relationEntities", term64219);
        ArrayList term64223 = new ArrayList();
        ((ArrayList) term64223).add((Object)null);
        ((ArrayList) term64223).add((Object)null);
        ((ArrayList) term64223).add((Object)null);
        ((ArrayList) term64223).add((Object)null);
        ((ArrayList) term64223).add((Object)null);
        ((ArrayList) term64223).add((Object)null);
        ArrayList term64228 = new ArrayList();
        ((ArrayList) term64228).add((Object)null);
        Object term64222 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term64222, term64222.getClass(), "memberEntities", term64223);
        setField(term64222, term64222.getClass(), "id", "");
        setField(term64222, term64222.getClass(), "name", "");
        setField(term64222, term64222.getClass(), "relationEntities", term64228);
        ArrayList term64232 = new ArrayList();
        ((ArrayList) term64232).add((Object)null);
        ((ArrayList) term64232).add((Object)null);
        ((ArrayList) term64232).add((Object)null);
        ((ArrayList) term64232).add((Object)null);
        ((ArrayList) term64232).add((Object)null);
        ((ArrayList) term64232).add((Object)null);
        ((ArrayList) term64232).add((Object)null);
        ((ArrayList) term64232).add((Object)null);
        ArrayList term64237 = new ArrayList();
        ((ArrayList) term64237).add((Object)null);
        ((ArrayList) term64237).add((Object)null);
        ((ArrayList) term64237).add((Object)null);
        ((ArrayList) term64237).add((Object)null);
        ((ArrayList) term64237).add((Object)null);
        ((ArrayList) term64237).add((Object)null);
        ((ArrayList) term64237).add((Object)null);
        ((ArrayList) term64237).add((Object)null);
        ((ArrayList) term64237).add((Object)null);
        Object term64231 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term64231, term64231.getClass(), "memberEntities", term64232);
        setField(term64231, term64231.getClass(), "id", "");
        setField(term64231, term64231.getClass(), "name", "");
        setField(term64231, term64231.getClass(), "relationEntities", term64237);
        ArrayList term64241 = new ArrayList();
        ArrayList term64246 = new ArrayList();
        ((ArrayList) term64246).add((Object)null);
        ((ArrayList) term64246).add((Object)null);
        ((ArrayList) term64246).add((Object)null);
        Object term64240 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term64240, term64240.getClass(), "memberEntities", term64241);
        setField(term64240, term64240.getClass(), "id", "");
        setField(term64240, term64240.getClass(), "name", "");
        setField(term64240, term64240.getClass(), "relationEntities", term64246);
        ArrayList term64202 = new ArrayList();
        ((ArrayList) term64202).add(term64204);
        ((ArrayList) term64202).add(term64213);
        ((ArrayList) term64202).add(term64222);
        ((ArrayList) term64202).add(term64231);
        ((ArrayList) term64202).add(term64240);
        ArrayList term64275 = new ArrayList();
        ((ArrayList) term64275).add((Object)null);
        ((ArrayList) term64275).add((Object)null);
        ((ArrayList) term64275).add((Object)null);
        ((ArrayList) term64275).add((Object)null);
        ((ArrayList) term64275).add((Object)null);
        ((ArrayList) term64275).add((Object)null);
        ((ArrayList) term64275).add((Object)null);
        term64160 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity"));
        setField(term64160, term64160.getClass(), "email", "fheZXFNQZh");
        setField(term64160, term64160.getClass(), "password", "YxHVWlebna");
        setField(term64160, term64160.getClass(), "role", enum164);
        setField(term64160, term64160.getClass(), "projectEntities", term64202);
        setField(term64160, term64160.getClass(), "id", "dUHylIprea");
        setField(term64160, term64160.getClass(), "name", "FKDqHRpMcc");
        setField(term64160, term64160.getClass(), "relationEntities", term64275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term64160, args);
    }

};


