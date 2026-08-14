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

public class MemberInterpreter_isInvalidAddKeys_10334102962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16853;

    public MemberInterpreter_isInvalidAddKeys_10334102962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16949 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term16948 = ((Class) term16949).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term16948).setAccessible(true);
        Object enum39 = ((Field) term16948).get((Object) null);
        ArrayList term16896 = new ArrayList();
        ArrayList term16924 = new ArrayList();
        ((ArrayList) term16924).add((Object)null);
        ((ArrayList) term16924).add((Object)null);
        ((ArrayList) term16924).add((Object)null);
        ((ArrayList) term16924).add((Object)null);
        term16853 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term16854 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term16853, term16853.getClass(), "memberPersistence", null);
        setField(term16854, term16854.getClass(), "email", "oPxuZbkYio");
        setField(term16854, term16854.getClass(), "password", "vKitydDVnM");
        setField(term16854, term16854.getClass(), "role", enum39);
        setField(term16854, term16854.getClass(), "projects", term16896);
        setField(term16854, term16854.getClass(), "id", "urCiQnUFBM");
        setField(term16854, term16854.getClass(), "name", "EKjQdtKxAM");
        setField(term16854, term16854.getClass(), "relations", term16924);
        setField(term16853, term16853.getClass(), "account", term16854);
        setField(term16853, term16853.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isInvalidAddKeys", argTypes, term16853, args);
    }

};


