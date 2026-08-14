package com.usantatecla.ustumlserver.domain.model.generators;

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
import static com.usantatecla.ustumlserver.domain.model.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PlantUMLGenerator_visit_5329005851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4582;
     Object term4584;

    public PlantUMLGenerator_visit_5329005851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4582 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator"));
        setField(term4582, term4582.getClass(), "withMembersMember", null);
        setField(term4582, term4582.getClass(), "origin", null);
        setIntField(term4582, term4582.getClass(), "depthLevel", 568599855);
        Class<? extends Object> term4679 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term4678 = ((Class) term4679).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term4678).setAccessible(true);
        Object enum11 = ((Field) term4678).get((Object) null);
        ArrayList term4626 = new ArrayList();
        ArrayList term4654 = new ArrayList();
        ((ArrayList) term4654).add((Object)null);
        ((ArrayList) term4654).add((Object)null);
        ((ArrayList) term4654).add((Object)null);
        ((ArrayList) term4654).add((Object)null);
        ((ArrayList) term4654).add((Object)null);
        term4584 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term4584, term4584.getClass(), "email", "dEnhdmILtU");
        setField(term4584, term4584.getClass(), "password", "hoicvmsovO");
        setField(term4584, term4584.getClass(), "role", enum11);
        setField(term4584, term4584.getClass(), "projects", term4626);
        setField(term4584, term4584.getClass(), "id", "eqJfYWRaEL");
        setField(term4584, term4584.getClass(), "name", "fhkbdRViHi");
        setField(term4584, term4584.getClass(), "relations", term4654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term4584;
        callMethod(klass, "visit", argTypes, term4582, args);
    }

};


