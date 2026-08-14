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

public class EnumInterpreter_isInvalidDeleteKeys_4544564614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1581;

    public EnumInterpreter_isInvalidDeleteKeys_4544564614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1677 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term1676 = ((Class) term1677).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term1676).setAccessible(true);
        Object enum4 = ((Field) term1676).get((Object) null);
        ArrayList term1624 = new ArrayList();
        ArrayList term1652 = new ArrayList();
        ((ArrayList) term1652).add((Object)null);
        term1581 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.EnumInterpreter"));
        Object term1582 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term1581, term1581.getClass(), "memberPersistence", null);
        setField(term1582, term1582.getClass(), "email", "ZiaGIbnzTs");
        setField(term1582, term1582.getClass(), "password", "tbcdzjIfER");
        setField(term1582, term1582.getClass(), "role", enum4);
        setField(term1582, term1582.getClass(), "projects", term1624);
        setField(term1582, term1582.getClass(), "id", "HyxfbSQYBe");
        setField(term1582, term1582.getClass(), "name", "pCTimMblYc");
        setField(term1582, term1582.getClass(), "relations", term1652);
        setField(term1581, term1581.getClass(), "account", term1582);
        setField(term1581, term1581.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.EnumInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isInvalidDeleteKeys", argTypes, term1581, args);
    }

};


