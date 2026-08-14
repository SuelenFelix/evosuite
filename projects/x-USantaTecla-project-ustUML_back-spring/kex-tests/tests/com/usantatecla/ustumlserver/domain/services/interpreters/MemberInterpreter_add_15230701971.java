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

public class MemberInterpreter_add_15230701971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16462;

    public MemberInterpreter_add_15230701971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16558 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term16557 = ((Class) term16558).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term16557).setAccessible(true);
        Object enum38 = ((Field) term16557).get((Object) null);
        ArrayList term16505 = new ArrayList();
        ArrayList term16533 = new ArrayList();
        ((ArrayList) term16533).add((Object)null);
        ((ArrayList) term16533).add((Object)null);
        ((ArrayList) term16533).add((Object)null);
        ((ArrayList) term16533).add((Object)null);
        ((ArrayList) term16533).add((Object)null);
        term16462 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term16463 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term16462, term16462.getClass(), "memberPersistence", null);
        setField(term16463, term16463.getClass(), "email", "tsTGdgQYUL");
        setField(term16463, term16463.getClass(), "password", "TtGbVmKcnX");
        setField(term16463, term16463.getClass(), "role", enum38);
        setField(term16463, term16463.getClass(), "projects", term16505);
        setField(term16463, term16463.getClass(), "id", "GJVkUrCVdD");
        setField(term16463, term16463.getClass(), "name", "zNdorvdUgu");
        setField(term16463, term16463.getClass(), "relations", term16533);
        setField(term16462, term16462.getClass(), "account", term16463);
        setField(term16462, term16462.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term16462, args);
    }

};


