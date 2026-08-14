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

public class MemberInterpreter_modifyCommandSections_9243629259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19590;

    public MemberInterpreter_modifyCommandSections_9243629259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19686 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term19685 = ((Class) term19686).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term19685).setAccessible(true);
        Object enum46 = ((Field) term19685).get((Object) null);
        ArrayList term19633 = new ArrayList();
        ArrayList term19661 = new ArrayList();
        ((ArrayList) term19661).add((Object)null);
        ((ArrayList) term19661).add((Object)null);
        ((ArrayList) term19661).add((Object)null);
        ((ArrayList) term19661).add((Object)null);
        ((ArrayList) term19661).add((Object)null);
        ((ArrayList) term19661).add((Object)null);
        ((ArrayList) term19661).add((Object)null);
        ((ArrayList) term19661).add((Object)null);
        term19590 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term19591 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term19590, term19590.getClass(), "memberPersistence", null);
        setField(term19591, term19591.getClass(), "email", "wdoqITnaAP");
        setField(term19591, term19591.getClass(), "password", "rIPMBcrNqB");
        setField(term19591, term19591.getClass(), "role", enum46);
        setField(term19591, term19591.getClass(), "projects", term19633);
        setField(term19591, term19591.getClass(), "id", "UDaboHZHhz");
        setField(term19591, term19591.getClass(), "name", "nRvKihUSPj");
        setField(term19591, term19591.getClass(), "relations", term19661);
        setField(term19590, term19590.getClass(), "account", term19591);
        setField(term19590, term19590.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "modifyCommandSections", argTypes, term19590, args);
    }

};


