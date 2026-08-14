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

public class MemberInterpreter_import_109855957611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20372;

    public MemberInterpreter_import_109855957611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20468 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term20467 = ((Class) term20468).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term20467).setAccessible(true);
        Object enum48 = ((Field) term20467).get((Object) null);
        ArrayList term20415 = new ArrayList();
        ArrayList term20443 = new ArrayList();
        ((ArrayList) term20443).add((Object)null);
        ((ArrayList) term20443).add((Object)null);
        ((ArrayList) term20443).add((Object)null);
        ((ArrayList) term20443).add((Object)null);
        ((ArrayList) term20443).add((Object)null);
        term20372 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term20373 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term20372, term20372.getClass(), "memberPersistence", null);
        setField(term20373, term20373.getClass(), "email", "HwLHeGLyhe");
        setField(term20373, term20373.getClass(), "password", "RDnkgWkcbz");
        setField(term20373, term20373.getClass(), "role", enum48);
        setField(term20373, term20373.getClass(), "projects", term20415);
        setField(term20373, term20373.getClass(), "id", "IBpaxltauX");
        setField(term20373, term20373.getClass(), "name", "hePqROaplw");
        setField(term20373, term20373.getClass(), "relations", term20443);
        setField(term20372, term20372.getClass(), "account", term20373);
        setField(term20372, term20372.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "_import", argTypes, term20372, args);
    }

};


