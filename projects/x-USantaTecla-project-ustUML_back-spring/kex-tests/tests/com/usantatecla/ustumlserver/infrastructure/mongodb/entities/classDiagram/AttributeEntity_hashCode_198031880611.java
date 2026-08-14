package com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class AttributeEntity_hashCode_198031880611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11813;

    public AttributeEntity_hashCode_198031880611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11891 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term11890 = ((Class) term11891).getDeclaredField((String) "PUBLIC");
        ((Field) term11890).setAccessible(true);
        Object enum31 =  ((Field) term11890).get((Object) null);
        Class<? extends Object> term12231 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term12230 = ((Class) term12231).getDeclaredField((String) "PRIVATE");
        ((Field) term12230).setAccessible(true);
        Object enum32 =  ((Field) term12230).get((Object) null);
        Class<? extends Object> term12574 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term12573 = ((Class) term12574).getDeclaredField((String) "PRIVATE");
        ((Field) term12573).setAccessible(true);
        Object enum33 =  ((Field) term12573).get((Object) null);
        Class<? extends Object> term12917 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term12916 = ((Class) term12917).getDeclaredField((String) "PUBLIC");
        ((Field) term12916).setAccessible(true);
        Object enum34 =  ((Field) term12916).get((Object) null);
        Class<? extends Object> term13257 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term13256 = ((Class) term13257).getDeclaredField((String) "STATIC");
        ((Field) term13256).setAccessible(true);
        Object enum35 =  ((Field) term13256).get((Object) null);
        Class<? extends Object> term13597 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term13596 = ((Class) term13597).getDeclaredField((String) "FINAL");
        ((Field) term13596).setAccessible(true);
        Object enum36 =  ((Field) term13596).get((Object) null);
        ArrayList term11838 = new ArrayList();
        ((ArrayList) term11838).add(enum31);
        ((ArrayList) term11838).add(enum32);
        ((ArrayList) term11838).add(enum33);
        ((ArrayList) term11838).add(enum34);
        ((ArrayList) term11838).add(enum35);
        ((ArrayList) term11838).add(enum36);
        ((ArrayList) term11838).add(enum32);
        term11813 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term11813, term11813.getClass(), "name", "kuTXqwMtDB");
        setField(term11813, term11813.getClass(), "type", "Ghbwtircqb");
        setField(term11813, term11813.getClass(), "modifiers", term11838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term11813, args);
    }

};


