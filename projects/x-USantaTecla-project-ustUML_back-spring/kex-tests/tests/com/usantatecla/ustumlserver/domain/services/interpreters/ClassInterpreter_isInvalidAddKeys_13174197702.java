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

public class ClassInterpreter_isInvalidAddKeys_13174197702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4323;

    public ClassInterpreter_isInvalidAddKeys_13174197702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4419 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term4418 = ((Class) term4419).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term4418).setAccessible(true);
        Object enum11 = ((Field) term4418).get((Object) null);
        ArrayList term4366 = new ArrayList();
        ArrayList term4394 = new ArrayList();
        ((ArrayList) term4394).add((Object)null);
        ((ArrayList) term4394).add((Object)null);
        ((ArrayList) term4394).add((Object)null);
        ((ArrayList) term4394).add((Object)null);
        ((ArrayList) term4394).add((Object)null);
        term4323 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.ClassInterpreter"));
        Object term4324 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term4323, term4323.getClass(), "memberPersistence", null);
        setField(term4324, term4324.getClass(), "email", "BndsHwAFMv");
        setField(term4324, term4324.getClass(), "password", "GzFkzHGYFt");
        setField(term4324, term4324.getClass(), "role", enum11);
        setField(term4324, term4324.getClass(), "projects", term4366);
        setField(term4324, term4324.getClass(), "id", "tShwQLRGNe");
        setField(term4324, term4324.getClass(), "name", "LvtrsXUliU");
        setField(term4324, term4324.getClass(), "relations", term4394);
        setField(term4323, term4323.getClass(), "account", term4324);
        setField(term4323, term4323.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.ClassInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isInvalidAddKeys", argTypes, term4323, args);
    }

};


