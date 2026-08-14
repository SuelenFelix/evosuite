package com.usantatecla.ustumlserver.domain.model.classDiagram;

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
import static com.usantatecla.ustumlserver.domain.model.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class Definition_canEqual_92747875610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88511;
     Object term88550;

    public Definition_canEqual_92747875610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88572 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term88571 = ((Class) term88572).getDeclaredField((String) "PROTECTED");
        ((Field) term88571).setAccessible(true);
        Object enum225 =  ((Field) term88571).get((Object) null);
        Class<? extends Object> term88921 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term88920 = ((Class) term88921).getDeclaredField((String) "PROTECTED");
        ((Field) term88920).setAccessible(true);
        Object enum226 =  ((Field) term88920).get((Object) null);
        ArrayList term88536 = new ArrayList();
        ((ArrayList) term88536).add(enum225);
        ((ArrayList) term88536).add(enum226);
        term88511 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition"));
        setField(term88511, term88511.getClass(), "name", "KHPDZjrXQp");
        setField(term88511, term88511.getClass(), "type", "fpyUFzdCwQ");
        setField(term88511, term88511.getClass(), "modifiers", term88536);
        term88550 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term88550;
        callMethod(klass, "canEqual", argTypes, term88511, args);
    }

};


