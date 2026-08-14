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

public class Definition_toString_16038795467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87721;

    public Definition_toString_16038795467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87779 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term87778 = ((Class) term87779).getDeclaredField((String) "PACKAGE");
        ((Field) term87778).setAccessible(true);
        Object enum223 =  ((Field) term87778).get((Object) null);
        Class<? extends Object> term88122 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term88121 = ((Class) term88122).getDeclaredField((String) "PUBLIC");
        ((Field) term88121).setAccessible(true);
        Object enum224 =  ((Field) term88121).get((Object) null);
        ArrayList term87746 = new ArrayList();
        ((ArrayList) term87746).add(enum223);
        ((ArrayList) term87746).add(enum224);
        term87721 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition"));
        setField(term87721, term87721.getClass(), "name", "ritBUyuuKt");
        setField(term87721, term87721.getClass(), "type", "YfziBBiPvL");
        setField(term87721, term87721.getClass(), "modifiers", term87746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term87721, args);
    }

};


