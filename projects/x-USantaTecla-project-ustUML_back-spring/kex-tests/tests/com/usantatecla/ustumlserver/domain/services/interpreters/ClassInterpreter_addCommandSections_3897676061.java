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

public class ClassInterpreter_addCommandSections_3897676061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3932;

    public ClassInterpreter_addCommandSections_3897676061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4028 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term4027 = ((Class) term4028).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term4027).setAccessible(true);
        Object enum10 = ((Field) term4027).get((Object) null);
        ArrayList term3975 = new ArrayList();
        ArrayList term4003 = new ArrayList();
        ((ArrayList) term4003).add((Object)null);
        ((ArrayList) term4003).add((Object)null);
        ((ArrayList) term4003).add((Object)null);
        ((ArrayList) term4003).add((Object)null);
        ((ArrayList) term4003).add((Object)null);
        ((ArrayList) term4003).add((Object)null);
        term3932 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.ClassInterpreter"));
        Object term3933 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term3932, term3932.getClass(), "memberPersistence", null);
        setField(term3933, term3933.getClass(), "email", "wSQxaModmm");
        setField(term3933, term3933.getClass(), "password", "UlajhuVLaP");
        setField(term3933, term3933.getClass(), "role", enum10);
        setField(term3933, term3933.getClass(), "projects", term3975);
        setField(term3933, term3933.getClass(), "id", "gGSMzuGICf");
        setField(term3933, term3933.getClass(), "name", "hxCBltsObl");
        setField(term3933, term3933.getClass(), "relations", term4003);
        setField(term3932, term3932.getClass(), "account", term3933);
        setField(term3932, term3932.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.ClassInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addCommandSections", argTypes, term3932, args);
    }

};


