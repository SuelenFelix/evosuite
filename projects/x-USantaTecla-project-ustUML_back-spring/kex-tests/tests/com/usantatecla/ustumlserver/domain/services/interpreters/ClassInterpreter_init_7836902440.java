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

public class ClassInterpreter_init_7836902440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3542;

    public ClassInterpreter_init_7836902440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3637 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term3636 = ((Class) term3637).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term3636).setAccessible(true);
        Object enum9 = ((Field) term3636).get((Object) null);
        ArrayList term3584 = new ArrayList();
        ArrayList term3612 = new ArrayList();
        ((ArrayList) term3612).add((Object)null);
        term3542 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term3542, term3542.getClass(), "email", "xrwlQZdwCp");
        setField(term3542, term3542.getClass(), "password", "IDCWpPLRkE");
        setField(term3542, term3542.getClass(), "role", enum9);
        setField(term3542, term3542.getClass(), "projects", term3584);
        setField(term3542, term3542.getClass(), "id", "nyiiPDVjAc");
        setField(term3542, term3542.getClass(), "name", "aKnKipADSo");
        setField(term3542, term3542.getClass(), "relations", term3612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.ClassInterpreter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        argTypes[1] = Class.forName("com.usantatecla.ustumlserver.domain.model.Member");
        Object[] args = new Object[2];
        args[0] = term3542;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


