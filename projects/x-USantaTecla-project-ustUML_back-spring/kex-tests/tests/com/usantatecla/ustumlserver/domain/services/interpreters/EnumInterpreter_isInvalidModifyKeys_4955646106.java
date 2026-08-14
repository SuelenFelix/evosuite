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

public class EnumInterpreter_isInvalidModifyKeys_4955646106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2363;

    public EnumInterpreter_isInvalidModifyKeys_4955646106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2459 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term2458 = ((Class) term2459).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term2458).setAccessible(true);
        Object enum6 = ((Field) term2458).get((Object) null);
        ArrayList term2406 = new ArrayList();
        ArrayList term2434 = new ArrayList();
        ((ArrayList) term2434).add((Object)null);
        ((ArrayList) term2434).add((Object)null);
        term2363 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.EnumInterpreter"));
        Object term2364 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term2363, term2363.getClass(), "memberPersistence", null);
        setField(term2364, term2364.getClass(), "email", "BYqFIqCKAV");
        setField(term2364, term2364.getClass(), "password", "vrQLuWIDJX");
        setField(term2364, term2364.getClass(), "role", enum6);
        setField(term2364, term2364.getClass(), "projects", term2406);
        setField(term2364, term2364.getClass(), "id", "flxyYxBRtu");
        setField(term2364, term2364.getClass(), "name", "OclPbYPkcH");
        setField(term2364, term2364.getClass(), "relations", term2434);
        setField(term2363, term2363.getClass(), "account", term2364);
        setField(term2363, term2363.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.EnumInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isInvalidModifyKeys", argTypes, term2363, args);
    }

};


