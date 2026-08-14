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

public class PackageInterpreter_init_20102952500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2760;

    public PackageInterpreter_init_20102952500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2855 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term2854 = ((Class) term2855).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term2854).setAccessible(true);
        Object enum7 = ((Field) term2854).get((Object) null);
        ArrayList term2802 = new ArrayList();
        ArrayList term2830 = new ArrayList();
        ((ArrayList) term2830).add((Object)null);
        ((ArrayList) term2830).add((Object)null);
        ((ArrayList) term2830).add((Object)null);
        ((ArrayList) term2830).add((Object)null);
        ((ArrayList) term2830).add((Object)null);
        ((ArrayList) term2830).add((Object)null);
        term2760 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term2760, term2760.getClass(), "email", "IoAlmYsBwc");
        setField(term2760, term2760.getClass(), "password", "TEParAifyi");
        setField(term2760, term2760.getClass(), "role", enum7);
        setField(term2760, term2760.getClass(), "projects", term2802);
        setField(term2760, term2760.getClass(), "id", "OWDIEULEFu");
        setField(term2760, term2760.getClass(), "name", "dWRymuLBtr");
        setField(term2760, term2760.getClass(), "relations", term2830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.PackageInterpreter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        argTypes[1] = Class.forName("com.usantatecla.ustumlserver.domain.model.Member");
        Object[] args = new Object[2];
        args[0] = term2760;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


