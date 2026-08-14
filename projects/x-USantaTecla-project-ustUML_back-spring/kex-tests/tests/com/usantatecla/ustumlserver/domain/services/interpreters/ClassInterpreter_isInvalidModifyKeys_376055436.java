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

public class ClassInterpreter_isInvalidModifyKeys_376055436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5887;

    public ClassInterpreter_isInvalidModifyKeys_376055436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5983 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term5982 = ((Class) term5983).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term5982).setAccessible(true);
        Object enum15 = ((Field) term5982).get((Object) null);
        ArrayList term5930 = new ArrayList();
        ArrayList term5958 = new ArrayList();
        ((ArrayList) term5958).add((Object)null);
        term5887 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.ClassInterpreter"));
        Object term5888 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term5887, term5887.getClass(), "memberPersistence", null);
        setField(term5888, term5888.getClass(), "email", "ieCtQFdkii");
        setField(term5888, term5888.getClass(), "password", "dEnhdmILtU");
        setField(term5888, term5888.getClass(), "role", enum15);
        setField(term5888, term5888.getClass(), "projects", term5930);
        setField(term5888, term5888.getClass(), "id", "hoicvmsovO");
        setField(term5888, term5888.getClass(), "name", "eqJfYWRaEL");
        setField(term5888, term5888.getClass(), "relations", term5958);
        setField(term5887, term5887.getClass(), "account", term5888);
        setField(term5887, term5887.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.ClassInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isInvalidModifyKeys", argTypes, term5887, args);
    }

};


