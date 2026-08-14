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

public class MemberInterpreter_delete_20448441614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17635;

    public MemberInterpreter_delete_20448441614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17731 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term17730 = ((Class) term17731).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term17730).setAccessible(true);
        Object enum41 = ((Field) term17730).get((Object) null);
        ArrayList term17678 = new ArrayList();
        ArrayList term17706 = new ArrayList();
        term17635 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term17636 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term17635, term17635.getClass(), "memberPersistence", null);
        setField(term17636, term17636.getClass(), "email", "wBGfLpNNiZ");
        setField(term17636, term17636.getClass(), "password", "yUGCjlqgJE");
        setField(term17636, term17636.getClass(), "role", enum41);
        setField(term17636, term17636.getClass(), "projects", term17678);
        setField(term17636, term17636.getClass(), "id", "PXdVZyoJyC");
        setField(term17636, term17636.getClass(), "name", "vLerpqavFM");
        setField(term17636, term17636.getClass(), "relations", term17706);
        setField(term17635, term17635.getClass(), "account", term17636);
        setField(term17635, term17635.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "delete", argTypes, term17635, args);
    }

};


