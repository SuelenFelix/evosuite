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

public class EnumInterpreter_deleteCommandSections_15274110953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1190;

    public EnumInterpreter_deleteCommandSections_15274110953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1286 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term1285 = ((Class) term1286).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term1285).setAccessible(true);
        Object enum3 = ((Field) term1285).get((Object) null);
        ArrayList term1233 = new ArrayList();
        ArrayList term1261 = new ArrayList();
        ((ArrayList) term1261).add((Object)null);
        ((ArrayList) term1261).add((Object)null);
        ((ArrayList) term1261).add((Object)null);
        ((ArrayList) term1261).add((Object)null);
        term1190 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.EnumInterpreter"));
        Object term1191 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term1190, term1190.getClass(), "memberPersistence", null);
        setField(term1191, term1191.getClass(), "email", "MxlszYVzRf");
        setField(term1191, term1191.getClass(), "password", "LQFpaHEwXR");
        setField(term1191, term1191.getClass(), "role", enum3);
        setField(term1191, term1191.getClass(), "projects", term1233);
        setField(term1191, term1191.getClass(), "id", "oVcInYnLWB");
        setField(term1191, term1191.getClass(), "name", "aJlieCFVtF");
        setField(term1191, term1191.getClass(), "relations", term1261);
        setField(term1190, term1190.getClass(), "account", term1191);
        setField(term1190, term1190.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.EnumInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "deleteCommandSections", argTypes, term1190, args);
    }

};


