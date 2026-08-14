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

public class Account_add_11628254901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48668;
     Object term48742;

    public Account_add_11628254901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48796 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term48795 = ((Class) term48796).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term48795).setAccessible(true);
        Object enum114 = ((Field) term48795).get((Object) null);
        ArrayList term48710 = new ArrayList();
        ArrayList term48738 = new ArrayList();
        ((ArrayList) term48738).add((Object)null);
        term48668 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term48668, term48668.getClass(), "email", "CGeclMyIOP");
        setField(term48668, term48668.getClass(), "password", "yyWOYvIBsp");
        setField(term48668, term48668.getClass(), "role", enum114);
        setField(term48668, term48668.getClass(), "projects", term48710);
        setField(term48668, term48668.getClass(), "id", "mmpgARMYFV");
        setField(term48668, term48668.getClass(), "name", "NUqhsZprdZ");
        setField(term48668, term48668.getClass(), "relations", term48738);
        ArrayList term48743 = new ArrayList();
        ArrayList term48771 = new ArrayList();
        ((ArrayList) term48771).add((Object)null);
        ((ArrayList) term48771).add((Object)null);
        ((ArrayList) term48771).add((Object)null);
        ((ArrayList) term48771).add((Object)null);
        ((ArrayList) term48771).add((Object)null);
        ((ArrayList) term48771).add((Object)null);
        ((ArrayList) term48771).add((Object)null);
        ((ArrayList) term48771).add((Object)null);
        ((ArrayList) term48771).add((Object)null);
        term48742 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term48742, term48742.getClass(), "members", term48743);
        setField(term48742, term48742.getClass(), "id", "jkzgCqWJrA");
        setField(term48742, term48742.getClass(), "name", "rawiXxuyRn");
        setField(term48742, term48742.getClass(), "relations", term48771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Project");
        Object[] args = new Object[1];
        args[0] = term48742;
        callMethod(klass, "add", argTypes, term48668, args);
    }

};


