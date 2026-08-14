package com.usantatecla.ustumlserver.domain.services.interpreters;

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
import static com.usantatecla.ustumlserver.domain.services.interpreters.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class MemberInterpreter_isInvalidDeleteKeys_7036171405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18026;

    public MemberInterpreter_isInvalidDeleteKeys_7036171405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18122 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term18121 = ((Class) term18122).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term18121).setAccessible(true);
        Object enum42 = ((Field) term18121).get((Object) null);
        ArrayList term18069 = new ArrayList();
        ArrayList term18097 = new ArrayList();
        ((ArrayList) term18097).add((Object)null);
        ((ArrayList) term18097).add((Object)null);
        ((ArrayList) term18097).add((Object)null);
        ((ArrayList) term18097).add((Object)null);
        ((ArrayList) term18097).add((Object)null);
        ((ArrayList) term18097).add((Object)null);
        term18026 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term18027 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term18026, term18026.getClass(), "memberPersistence", null);
        setField(term18027, term18027.getClass(), "email", "qnvxzwuGKX");
        setField(term18027, term18027.getClass(), "password", "EdPAvpluZg");
        setField(term18027, term18027.getClass(), "role", enum42);
        setField(term18027, term18027.getClass(), "projects", term18069);
        setField(term18027, term18027.getClass(), "id", "DzHVBMqWtE");
        setField(term18027, term18027.getClass(), "name", "THZSpzBRYP");
        setField(term18027, term18027.getClass(), "relations", term18097);
        setField(term18026, term18026.getClass(), "account", term18027);
        setField(term18026, term18026.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isInvalidDeleteKeys", argTypes, term18026, args);
    }

};


