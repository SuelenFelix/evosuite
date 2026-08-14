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

public class MemberInterpreter_modify_8149122067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18808;

    public MemberInterpreter_modify_8149122067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18904 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term18903 = ((Class) term18904).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term18903).setAccessible(true);
        Object enum44 = ((Field) term18903).get((Object) null);
        ArrayList term18851 = new ArrayList();
        ArrayList term18879 = new ArrayList();
        ((ArrayList) term18879).add((Object)null);
        ((ArrayList) term18879).add((Object)null);
        ((ArrayList) term18879).add((Object)null);
        ((ArrayList) term18879).add((Object)null);
        term18808 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term18809 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term18808, term18808.getClass(), "memberPersistence", null);
        setField(term18809, term18809.getClass(), "email", "SPBstwKFVr");
        setField(term18809, term18809.getClass(), "password", "WxYUTuqmIq");
        setField(term18809, term18809.getClass(), "role", enum44);
        setField(term18809, term18809.getClass(), "projects", term18851);
        setField(term18809, term18809.getClass(), "id", "OeQLvhVERT");
        setField(term18809, term18809.getClass(), "name", "IlvgFINwIa");
        setField(term18809, term18809.getClass(), "relations", term18879);
        setField(term18808, term18808.getClass(), "account", term18809);
        setField(term18808, term18808.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "modify", argTypes, term18808, args);
    }

};


