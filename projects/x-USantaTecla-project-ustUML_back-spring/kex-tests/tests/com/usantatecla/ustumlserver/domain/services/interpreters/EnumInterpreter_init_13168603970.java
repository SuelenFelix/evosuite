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

public class EnumInterpreter_init_13168603970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public EnumInterpreter_init_13168603970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term113 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term112 = ((Class) term113).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term112).setAccessible(true);
        Object enum0 = ((Field) term112).get((Object) null);
        ArrayList term43 = new ArrayList();
        ArrayList term71 = new ArrayList();
        ((ArrayList) term71).add((Object)null);
        ((ArrayList) term71).add((Object)null);
        ((ArrayList) term71).add((Object)null);
        ((ArrayList) term71).add((Object)null);
        ((ArrayList) term71).add((Object)null);
        term1 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term1, term1.getClass(), "email", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "password", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "role", enum0);
        setField(term1, term1.getClass(), "projects", term43);
        setField(term1, term1.getClass(), "id", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "name", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "relations", term71);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.EnumInterpreter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        argTypes[1] = Class.forName("com.usantatecla.ustumlserver.domain.model.Member");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


