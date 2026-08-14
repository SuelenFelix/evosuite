package com.usantatecla.ustumlserver.domain.model;

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
import static com.usantatecla.ustumlserver.domain.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Account_canEqual_72801162620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55443;
     Object term55517;

    public Account_canEqual_72801162620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55539 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term55538 = ((Class) term55539).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term55538).setAccessible(true);
        Object enum131 = ((Field) term55538).get((Object) null);
        ArrayList term55485 = new ArrayList();
        ArrayList term55513 = new ArrayList();
        ((ArrayList) term55513).add((Object)null);
        term55443 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term55443, term55443.getClass(), "email", "KJkWSFFnmR");
        setField(term55443, term55443.getClass(), "password", "FBYRIDZvmW");
        setField(term55443, term55443.getClass(), "role", enum131);
        setField(term55443, term55443.getClass(), "projects", term55485);
        setField(term55443, term55443.getClass(), "id", "IyjLfrDZrV");
        setField(term55443, term55443.getClass(), "name", "BRMTHqqoRg");
        setField(term55443, term55443.getClass(), "relations", term55513);
        term55517 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term55517;
        callMethod(klass, "canEqual", argTypes, term55443, args);
    }

};


