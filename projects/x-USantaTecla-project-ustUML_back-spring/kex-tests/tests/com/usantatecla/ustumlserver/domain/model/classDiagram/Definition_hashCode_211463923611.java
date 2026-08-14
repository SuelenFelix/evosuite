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

public class Definition_hashCode_211463923611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89269;

    public Definition_hashCode_211463923611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89342 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term89341 = ((Class) term89342).getDeclaredField((String) "STATIC");
        ((Field) term89341).setAccessible(true);
        Object enum227 =  ((Field) term89341).get((Object) null);
        Class<? extends Object> term89682 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term89681 = ((Class) term89682).getDeclaredField((String) "NULL");
        ((Field) term89681).setAccessible(true);
        Object enum228 =  ((Field) term89681).get((Object) null);
        Class<? extends Object> term90016 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term90015 = ((Class) term90016).getDeclaredField((String) "FINAL");
        ((Field) term90015).setAccessible(true);
        Object enum229 =  ((Field) term90015).get((Object) null);
        Class<? extends Object> term90353 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term90352 = ((Class) term90353).getDeclaredField((String) "STATIC");
        ((Field) term90352).setAccessible(true);
        Object enum230 =  ((Field) term90352).get((Object) null);
        Class<? extends Object> term90693 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term90692 = ((Class) term90693).getDeclaredField((String) "NULL");
        ((Field) term90692).setAccessible(true);
        Object enum231 =  ((Field) term90692).get((Object) null);
        ArrayList term89294 = new ArrayList();
        ((ArrayList) term89294).add(enum227);
        ((ArrayList) term89294).add(enum228);
        ((ArrayList) term89294).add(enum229);
        ((ArrayList) term89294).add(enum230);
        ((ArrayList) term89294).add(enum231);
        ((ArrayList) term89294).add(enum229);
        ((ArrayList) term89294).add(enum231);
        ((ArrayList) term89294).add(enum230);
        term89269 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition"));
        setField(term89269, term89269.getClass(), "name", "OQqBkSGDem");
        setField(term89269, term89269.getClass(), "type", "vZzZOvsIYn");
        setField(term89269, term89269.getClass(), "modifiers", term89294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term89269, args);
    }

};


