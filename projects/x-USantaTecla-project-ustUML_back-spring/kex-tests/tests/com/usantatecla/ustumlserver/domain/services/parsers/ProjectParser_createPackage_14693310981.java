package com.usantatecla.ustumlserver.domain.services.parsers;

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
import static com.usantatecla.ustumlserver.domain.services.parsers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class ProjectParser_createPackage_14693310981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25534;

    public ProjectParser_createPackage_14693310981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term25535 = new ArrayList();
        ((ArrayList) term25535).add((Object)null);
        ((ArrayList) term25535).add((Object)null);
        Class<? extends Object> term25646 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term25645 = ((Class) term25646).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term25645).setAccessible(true);
        Object enum66 = ((Field) term25645).get((Object) null);
        ArrayList term25581 = new ArrayList();
        ArrayList term25609 = new ArrayList();
        ((ArrayList) term25609).add((Object)null);
        ((ArrayList) term25609).add((Object)null);
        ((ArrayList) term25609).add((Object)null);
        ((ArrayList) term25609).add((Object)null);
        ((ArrayList) term25609).add((Object)null);
        ((ArrayList) term25609).add((Object)null);
        term25534 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.ProjectParser"));
        Object term25539 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term25534, term25534.getClass(), "members", term25535);
        setField(term25539, term25539.getClass(), "email", "JkgoRtImdE");
        setField(term25539, term25539.getClass(), "password", "qFGKIJjlmV");
        setField(term25539, term25539.getClass(), "role", enum66);
        setField(term25539, term25539.getClass(), "projects", term25581);
        setField(term25539, term25539.getClass(), "id", "IHqvyhMtuM");
        setField(term25539, term25539.getClass(), "name", "dAldIGYAXV");
        setField(term25539, term25539.getClass(), "relations", term25609);
        setField(term25534, term25534.getClass(), "account", term25539);
        setField(term25534, term25534.getClass(), "name", "mLwibAPEsa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.ProjectParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPackage", argTypes, term25534, args);
    }

};


