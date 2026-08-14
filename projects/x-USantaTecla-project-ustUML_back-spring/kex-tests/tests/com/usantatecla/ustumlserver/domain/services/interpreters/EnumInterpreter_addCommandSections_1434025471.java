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

public class EnumInterpreter_addCommandSections_1434025471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408;

    public EnumInterpreter_addCommandSections_1434025471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term504 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term503 = ((Class) term504).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term503).setAccessible(true);
        Object enum1 = ((Field) term503).get((Object) null);
        ArrayList term451 = new ArrayList();
        ArrayList term479 = new ArrayList();
        ((ArrayList) term479).add((Object)null);
        ((ArrayList) term479).add((Object)null);
        ((ArrayList) term479).add((Object)null);
        ((ArrayList) term479).add((Object)null);
        term408 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.EnumInterpreter"));
        Object term409 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term408, term408.getClass(), "memberPersistence", null);
        setField(term409, term409.getClass(), "email", "jJCZpVmanW");
        setField(term409, term409.getClass(), "password", "EGtDIRbSSb");
        setField(term409, term409.getClass(), "role", enum1);
        setField(term409, term409.getClass(), "projects", term451);
        setField(term409, term409.getClass(), "id", "SzjVpOQTyS");
        setField(term409, term409.getClass(), "name", "MjGYSRKTNF");
        setField(term409, term409.getClass(), "relations", term479);
        setField(term408, term408.getClass(), "account", term409);
        setField(term408, term408.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.EnumInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addCommandSections", argTypes, term408, args);
    }

};


