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

public class AttributeEntity_toString_180388880012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13933;

    public AttributeEntity_toString_180388880012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13993 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term13992 = ((Class) term13993).getDeclaredField((String) "STATIC");
        ((Field) term13992).setAccessible(true);
        Object enum37 =  ((Field) term13992).get((Object) null);
        Class<? extends Object> term14333 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term14332 = ((Class) term14333).getDeclaredField((String) "NULL");
        ((Field) term14332).setAccessible(true);
        Object enum38 =  ((Field) term14332).get((Object) null);
        ArrayList term13958 = new ArrayList();
        ((ArrayList) term13958).add(enum37);
        ((ArrayList) term13958).add(enum38);
        term13933 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term13933, term13933.getClass(), "name", "xrwlQZdwCp");
        setField(term13933, term13933.getClass(), "type", "IDCWpPLRkE");
        setField(term13933, term13933.getClass(), "modifiers", term13958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13933, args);
    }

};


