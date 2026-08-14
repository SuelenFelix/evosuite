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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class ProjectParser_init_10396771960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25144;

    public ProjectParser_init_10396771960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25239 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term25238 = ((Class) term25239).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term25238).setAccessible(true);
        Object enum65 = ((Field) term25238).get((Object) null);
        ArrayList term25186 = new ArrayList();
        ArrayList term25214 = new ArrayList();
        ((ArrayList) term25214).add((Object)null);
        ((ArrayList) term25214).add((Object)null);
        ((ArrayList) term25214).add((Object)null);
        ((ArrayList) term25214).add((Object)null);
        ((ArrayList) term25214).add((Object)null);
        term25144 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term25144, term25144.getClass(), "email", "aanyiAOJCl");
        setField(term25144, term25144.getClass(), "password", "VDokbsCuqq");
        setField(term25144, term25144.getClass(), "role", enum65);
        setField(term25144, term25144.getClass(), "projects", term25186);
        setField(term25144, term25144.getClass(), "id", "xClUIcPECX");
        setField(term25144, term25144.getClass(), "name", "avhRaGZaBF");
        setField(term25144, term25144.getClass(), "relations", term25214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.ProjectParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term25144;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


