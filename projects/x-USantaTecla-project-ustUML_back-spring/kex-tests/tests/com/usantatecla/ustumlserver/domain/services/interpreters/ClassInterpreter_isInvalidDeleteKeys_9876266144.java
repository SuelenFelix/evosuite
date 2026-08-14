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

public class ClassInterpreter_isInvalidDeleteKeys_9876266144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5105;

    public ClassInterpreter_isInvalidDeleteKeys_9876266144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5201 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term5200 = ((Class) term5201).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term5200).setAccessible(true);
        Object enum13 = ((Field) term5200).get((Object) null);
        ArrayList term5148 = new ArrayList();
        ArrayList term5176 = new ArrayList();
        ((ArrayList) term5176).add((Object)null);
        ((ArrayList) term5176).add((Object)null);
        term5105 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.ClassInterpreter"));
        Object term5106 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term5105, term5105.getClass(), "memberPersistence", null);
        setField(term5106, term5106.getClass(), "email", "UoYtihxVaS");
        setField(term5106, term5106.getClass(), "password", "JDswTTCZHV");
        setField(term5106, term5106.getClass(), "role", enum13);
        setField(term5106, term5106.getClass(), "projects", term5148);
        setField(term5106, term5106.getClass(), "id", "onpbIeEKoi");
        setField(term5106, term5106.getClass(), "name", "YRHGsAkhxb");
        setField(term5106, term5106.getClass(), "relations", term5176);
        setField(term5105, term5105.getClass(), "account", term5106);
        setField(term5105, term5105.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.ClassInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isInvalidDeleteKeys", argTypes, term5105, args);
    }

};


