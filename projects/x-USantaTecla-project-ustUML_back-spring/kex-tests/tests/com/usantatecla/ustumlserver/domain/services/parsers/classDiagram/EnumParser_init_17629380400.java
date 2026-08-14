package com.usantatecla.ustumlserver.domain.services.parsers.classDiagram;

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
import static com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class EnumParser_init_17629380400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public EnumParser_init_17629380400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term137 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term136 = ((Class) term137).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term136).setAccessible(true);
        Object enum0 = ((Field) term136).get((Object) null);
        ArrayList term67 = new ArrayList();
        ArrayList term95 = new ArrayList();
        ((ArrayList) term95).add((Object)null);
        ((ArrayList) term95).add((Object)null);
        ((ArrayList) term95).add((Object)null);
        ((ArrayList) term95).add((Object)null);
        ((ArrayList) term95).add((Object)null);
        term25 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term25, term25.getClass(), "email", "sjlJAEtRrb");
        setField(term25, term25.getClass(), "password", "MuLcgQHgqz");
        setField(term25, term25.getClass(), "role", enum0);
        setField(term25, term25.getClass(), "projects", term67);
        setField(term25, term25.getClass(), "id", "xxtlPwDYFs");
        setField(term25, term25.getClass(), "name", "jJCZpVmanW");
        setField(term25, term25.getClass(), "relations", term95);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.EnumParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term25;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


