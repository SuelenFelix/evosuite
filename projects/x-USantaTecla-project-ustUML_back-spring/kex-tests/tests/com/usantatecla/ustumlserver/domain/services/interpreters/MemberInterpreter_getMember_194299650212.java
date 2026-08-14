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

public class MemberInterpreter_getMember_194299650212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20763;

    public MemberInterpreter_getMember_194299650212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20859 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term20858 = ((Class) term20859).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term20858).setAccessible(true);
        Object enum49 = ((Field) term20858).get((Object) null);
        ArrayList term20806 = new ArrayList();
        ArrayList term20834 = new ArrayList();
        ((ArrayList) term20834).add((Object)null);
        ((ArrayList) term20834).add((Object)null);
        ((ArrayList) term20834).add((Object)null);
        ((ArrayList) term20834).add((Object)null);
        ((ArrayList) term20834).add((Object)null);
        ((ArrayList) term20834).add((Object)null);
        term20763 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term20764 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term20763, term20763.getClass(), "memberPersistence", null);
        setField(term20764, term20764.getClass(), "email", "PJcSNDruWd");
        setField(term20764, term20764.getClass(), "password", "VVNNlAePXF");
        setField(term20764, term20764.getClass(), "role", enum49);
        setField(term20764, term20764.getClass(), "projects", term20806);
        setField(term20764, term20764.getClass(), "id", "jnwVnmKAFv");
        setField(term20764, term20764.getClass(), "name", "TXyHhqeCjR");
        setField(term20764, term20764.getClass(), "relations", term20834);
        setField(term20763, term20763.getClass(), "account", term20764);
        setField(term20763, term20763.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMember", argTypes, term20763, args);
    }

};


