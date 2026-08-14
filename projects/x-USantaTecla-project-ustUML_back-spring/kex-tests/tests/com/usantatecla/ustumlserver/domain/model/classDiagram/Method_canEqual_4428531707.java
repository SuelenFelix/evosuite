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

public class Method_canEqual_4428531707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43773;
     Object term43816;

    public Method_canEqual_4428531707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term43774 = new ArrayList();
        Class<? extends Object> term43838 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term43837 = ((Class) term43838).getDeclaredField((String) "ABSTRACT");
        ((Field) term43837).setAccessible(true);
        Object enum113 =  ((Field) term43837).get((Object) null);
        Class<? extends Object> term44184 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term44183 = ((Class) term44184).getDeclaredField((String) "PROTECTED");
        ((Field) term44183).setAccessible(true);
        Object enum114 =  ((Field) term44183).get((Object) null);
        ArrayList term43802 = new ArrayList();
        ((ArrayList) term43802).add(enum113);
        ((ArrayList) term43802).add(enum113);
        ((ArrayList) term43802).add(enum114);
        ((ArrayList) term43802).add(enum113);
        term43773 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term43773, term43773.getClass(), "parameters", term43774);
        setField(term43773, term43773.getClass(), "name", "raNzcEorkV");
        setField(term43773, term43773.getClass(), "type", "nEgozCeoUr");
        setField(term43773, term43773.getClass(), "modifiers", term43802);
        term43816 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term43816;
        callMethod(klass, "canEqual", argTypes, term43773, args);
    }

};


