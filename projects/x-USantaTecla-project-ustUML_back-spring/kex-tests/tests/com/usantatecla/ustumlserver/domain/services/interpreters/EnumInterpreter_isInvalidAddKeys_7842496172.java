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

public class EnumInterpreter_isInvalidAddKeys_7842496172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term799;

    public EnumInterpreter_isInvalidAddKeys_7842496172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term895 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term894 = ((Class) term895).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term894).setAccessible(true);
        Object enum2 = ((Field) term894).get((Object) null);
        ArrayList term842 = new ArrayList();
        ArrayList term870 = new ArrayList();
        ((ArrayList) term870).add((Object)null);
        ((ArrayList) term870).add((Object)null);
        ((ArrayList) term870).add((Object)null);
        term799 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.EnumInterpreter"));
        Object term800 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term799, term799.getClass(), "memberPersistence", null);
        setField(term800, term800.getClass(), "email", "hRNSzYYIrc");
        setField(term800, term800.getClass(), "password", "RMFIsYGgne");
        setField(term800, term800.getClass(), "role", enum2);
        setField(term800, term800.getClass(), "projects", term842);
        setField(term800, term800.getClass(), "id", "NRdvgJlhkX");
        setField(term800, term800.getClass(), "name", "uuaPigETmJ");
        setField(term800, term800.getClass(), "relations", term870);
        setField(term799, term799.getClass(), "account", term800);
        setField(term799, term799.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.EnumInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isInvalidAddKeys", argTypes, term799, args);
    }

};


