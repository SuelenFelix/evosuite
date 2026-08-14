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

public class MemberInterpreter_open_84453134910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19981;

    public MemberInterpreter_open_84453134910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20077 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term20076 = ((Class) term20077).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term20076).setAccessible(true);
        Object enum47 = ((Field) term20076).get((Object) null);
        ArrayList term20024 = new ArrayList();
        ArrayList term20052 = new ArrayList();
        ((ArrayList) term20052).add((Object)null);
        ((ArrayList) term20052).add((Object)null);
        ((ArrayList) term20052).add((Object)null);
        ((ArrayList) term20052).add((Object)null);
        ((ArrayList) term20052).add((Object)null);
        ((ArrayList) term20052).add((Object)null);
        ((ArrayList) term20052).add((Object)null);
        ((ArrayList) term20052).add((Object)null);
        term19981 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term19982 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term19981, term19981.getClass(), "memberPersistence", null);
        setField(term19982, term19982.getClass(), "email", "BbNeQJpYPr");
        setField(term19982, term19982.getClass(), "password", "riMtzCoxNj");
        setField(term19982, term19982.getClass(), "role", enum47);
        setField(term19982, term19982.getClass(), "projects", term20024);
        setField(term19982, term19982.getClass(), "id", "YAXkVjQZcV");
        setField(term19982, term19982.getClass(), "name", "pumvwBWvpy");
        setField(term19982, term19982.getClass(), "relations", term20052);
        setField(term19981, term19981.getClass(), "account", term19982);
        setField(term19981, term19981.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "open", argTypes, term19981, args);
    }

};


