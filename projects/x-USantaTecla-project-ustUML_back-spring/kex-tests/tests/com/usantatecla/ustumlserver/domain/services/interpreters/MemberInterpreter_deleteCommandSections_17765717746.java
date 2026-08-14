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

public class MemberInterpreter_deleteCommandSections_17765717746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18417;

    public MemberInterpreter_deleteCommandSections_17765717746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18513 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term18512 = ((Class) term18513).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term18512).setAccessible(true);
        Object enum43 = ((Field) term18512).get((Object) null);
        ArrayList term18460 = new ArrayList();
        ArrayList term18488 = new ArrayList();
        ((ArrayList) term18488).add((Object)null);
        ((ArrayList) term18488).add((Object)null);
        ((ArrayList) term18488).add((Object)null);
        term18417 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term18418 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term18417, term18417.getClass(), "memberPersistence", null);
        setField(term18418, term18418.getClass(), "email", "ZfBIVGBQOE");
        setField(term18418, term18418.getClass(), "password", "QSrDQfEsTR");
        setField(term18418, term18418.getClass(), "role", enum43);
        setField(term18418, term18418.getClass(), "projects", term18460);
        setField(term18418, term18418.getClass(), "id", "PsqusYmejD");
        setField(term18418, term18418.getClass(), "name", "NTWMiBEaDF");
        setField(term18418, term18418.getClass(), "relations", term18488);
        setField(term18417, term18417.getClass(), "account", term18418);
        setField(term18417, term18417.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "deleteCommandSections", argTypes, term18417, args);
    }

};


