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

public class AttributeEntity_AttributeEntityBuilder_name_5285384071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58721;

    public AttributeEntity_AttributeEntityBuilder_name_5285384071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term58786 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term58785 = ((Class) term58786).getDeclaredField((String) "STATIC");
        ((Field) term58785).setAccessible(true);
        Object enum150 =  ((Field) term58785).get((Object) null);
        ArrayList term58746 = new ArrayList();
        ((ArrayList) term58746).add(enum150);
        term58721 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity$AttributeEntityBuilder"));
        setField(term58721, term58721.getClass(), "name", "RldCZqgRbO");
        setField(term58721, term58721.getClass(), "type", "LOVugCAgJs");
        setField(term58721, term58721.getClass(), "modifiers", term58746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity$AttributeEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SNmHXwCiFY";
        callMethod(klass, "name", argTypes, term58721, args);
    }

};


