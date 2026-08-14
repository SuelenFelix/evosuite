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

public class Account_accept_18401989146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50715;

    public Account_accept_18401989146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50810 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term50809 = ((Class) term50810).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term50809).setAccessible(true);
        Object enum119 = ((Field) term50809).get((Object) null);
        ArrayList term50757 = new ArrayList();
        ArrayList term50785 = new ArrayList();
        ((ArrayList) term50785).add((Object)null);
        ((ArrayList) term50785).add((Object)null);
        term50715 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term50715, term50715.getClass(), "email", "lokyclbLEz");
        setField(term50715, term50715.getClass(), "password", "hAPmQGaxkI");
        setField(term50715, term50715.getClass(), "role", enum119);
        setField(term50715, term50715.getClass(), "projects", term50757);
        setField(term50715, term50715.getClass(), "id", "ojrnLnJZjT");
        setField(term50715, term50715.getClass(), "name", "rtvXSMjOdJ");
        setField(term50715, term50715.getClass(), "relations", term50785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.MemberVisitor");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "accept", argTypes, term50715, args);
    }

};


