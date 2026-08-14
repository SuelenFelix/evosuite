package com.usantatecla.ustumlserver.domain.services.parsers.relations;

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
import static com.usantatecla.ustumlserver.domain.services.parsers.relations.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class RelationParser_getModifiedRelation_2358618141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;
     Object term410;

    public RelationParser_getModifiedRelation_2358618141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.relations.RelationParser"));
        Class<? extends Object> term505 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term504 = ((Class) term505).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term504).setAccessible(true);
        Object enum1 = ((Field) term504).get((Object) null);
        ArrayList term452 = new ArrayList();
        ArrayList term480 = new ArrayList();
        ((ArrayList) term480).add((Object)null);
        ((ArrayList) term480).add((Object)null);
        ((ArrayList) term480).add((Object)null);
        ((ArrayList) term480).add((Object)null);
        term410 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term410, term410.getClass(), "email", "jJCZpVmanW");
        setField(term410, term410.getClass(), "password", "EGtDIRbSSb");
        setField(term410, term410.getClass(), "role", enum1);
        setField(term410, term410.getClass(), "projects", term452);
        setField(term410, term410.getClass(), "id", "SzjVpOQTyS");
        setField(term410, term410.getClass(), "name", "MjGYSRKTNF");
        setField(term410, term410.getClass(), "relations", term480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.relations.RelationParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        argTypes[1] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[2];
        args[0] = term410;
        args[1] = null;
        callMethod(klass, "getModifiedRelation", argTypes, term409, args);
    }

};


