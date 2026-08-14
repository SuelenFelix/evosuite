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

public class InterfaceParser_init_15530981060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12468;

    public InterfaceParser_init_15530981060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12563 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term12562 = ((Class) term12563).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term12562).setAccessible(true);
        Object enum31 = ((Field) term12562).get((Object) null);
        ArrayList term12510 = new ArrayList();
        ArrayList term12538 = new ArrayList();
        ((ArrayList) term12538).add((Object)null);
        ((ArrayList) term12538).add((Object)null);
        ((ArrayList) term12538).add((Object)null);
        ((ArrayList) term12538).add((Object)null);
        ((ArrayList) term12538).add((Object)null);
        term12468 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term12468, term12468.getClass(), "email", "TXZAIPQJHt");
        setField(term12468, term12468.getClass(), "password", "DIbeDHICho");
        setField(term12468, term12468.getClass(), "role", enum31);
        setField(term12468, term12468.getClass(), "projects", term12510);
        setField(term12468, term12468.getClass(), "id", "dJGPlmSRnz");
        setField(term12468, term12468.getClass(), "name", "DPskuFUobI");
        setField(term12468, term12468.getClass(), "relations", term12538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.InterfaceParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term12468;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


