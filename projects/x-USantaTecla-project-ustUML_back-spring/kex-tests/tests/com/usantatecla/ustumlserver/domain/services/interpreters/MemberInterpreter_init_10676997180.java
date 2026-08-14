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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class MemberInterpreter_init_10676997180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16072;

    public MemberInterpreter_init_10676997180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16167 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term16166 = ((Class) term16167).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term16166).setAccessible(true);
        Object enum37 = ((Field) term16166).get((Object) null);
        ArrayList term16114 = new ArrayList();
        ArrayList term16142 = new ArrayList();
        term16072 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term16072, term16072.getClass(), "email", "FjOiNAfBOc");
        setField(term16072, term16072.getClass(), "password", "iCCsaLHohG");
        setField(term16072, term16072.getClass(), "role", enum37);
        setField(term16072, term16072.getClass(), "projects", term16114);
        setField(term16072, term16072.getClass(), "id", "NJhGgctbdj");
        setField(term16072, term16072.getClass(), "name", "MYWYUeLGOp");
        setField(term16072, term16072.getClass(), "relations", term16142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        argTypes[1] = Class.forName("com.usantatecla.ustumlserver.domain.model.Member");
        Object[] args = new Object[2];
        args[0] = term16072;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


