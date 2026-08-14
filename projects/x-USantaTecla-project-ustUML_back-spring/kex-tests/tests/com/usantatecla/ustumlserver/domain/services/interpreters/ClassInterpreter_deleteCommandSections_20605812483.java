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

public class ClassInterpreter_deleteCommandSections_20605812483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4714;

    public ClassInterpreter_deleteCommandSections_20605812483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4810 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term4809 = ((Class) term4810).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term4809).setAccessible(true);
        Object enum12 = ((Field) term4809).get((Object) null);
        ArrayList term4757 = new ArrayList();
        ArrayList term4785 = new ArrayList();
        ((ArrayList) term4785).add((Object)null);
        ((ArrayList) term4785).add((Object)null);
        ((ArrayList) term4785).add((Object)null);
        ((ArrayList) term4785).add((Object)null);
        ((ArrayList) term4785).add((Object)null);
        term4714 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.ClassInterpreter"));
        Object term4715 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term4714, term4714.getClass(), "memberPersistence", null);
        setField(term4715, term4715.getClass(), "email", "xLbjWUgOIL");
        setField(term4715, term4715.getClass(), "password", "jDtqGUpnZN");
        setField(term4715, term4715.getClass(), "role", enum12);
        setField(term4715, term4715.getClass(), "projects", term4757);
        setField(term4715, term4715.getClass(), "id", "nGKItKLYNC");
        setField(term4715, term4715.getClass(), "name", "UiUYnPrcCi");
        setField(term4715, term4715.getClass(), "relations", term4785);
        setField(term4714, term4714.getClass(), "account", term4715);
        setField(term4714, term4714.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.ClassInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "deleteCommandSections", argTypes, term4714, args);
    }

};


