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

public class MemberInterpreter_addCommandSections_1057581323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17244;

    public MemberInterpreter_addCommandSections_1057581323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17340 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term17339 = ((Class) term17340).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term17339).setAccessible(true);
        Object enum40 = ((Field) term17339).get((Object) null);
        ArrayList term17287 = new ArrayList();
        ArrayList term17315 = new ArrayList();
        ((ArrayList) term17315).add((Object)null);
        term17244 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term17245 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term17244, term17244.getClass(), "memberPersistence", null);
        setField(term17245, term17245.getClass(), "email", "TXZAIPQJHt");
        setField(term17245, term17245.getClass(), "password", "DIbeDHICho");
        setField(term17245, term17245.getClass(), "role", enum40);
        setField(term17245, term17245.getClass(), "projects", term17287);
        setField(term17245, term17245.getClass(), "id", "dJGPlmSRnz");
        setField(term17245, term17245.getClass(), "name", "DPskuFUobI");
        setField(term17245, term17245.getClass(), "relations", term17315);
        setField(term17244, term17244.getClass(), "account", term17245);
        setField(term17244, term17244.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addCommandSections", argTypes, term17244, args);
    }

};


