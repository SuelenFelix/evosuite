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
import java.lang.Object;
import java.lang.String;

public class Method_equals_12470157996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41645;
     Object term41712;

    public Method_equals_12470157996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41648 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term41648, term41648.getClass(), "name", "");
        setField(term41648, term41648.getClass(), "type", "");
        Object term41651 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term41651, term41651.getClass(), "name", "");
        setField(term41651, term41651.getClass(), "type", "");
        ArrayList term41646 = new ArrayList();
        ((ArrayList) term41646).add(term41648);
        ((ArrayList) term41646).add(term41651);
        Class<? extends Object> term41734 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term41733 = ((Class) term41734).getDeclaredField((String) "STATIC");
        ((Field) term41733).setAccessible(true);
        Object enum107 =  ((Field) term41733).get((Object) null);
        Class<? extends Object> term42074 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term42073 = ((Class) term42074).getDeclaredField((String) "PUBLIC");
        ((Field) term42073).setAccessible(true);
        Object enum108 =  ((Field) term42073).get((Object) null);
        Class<? extends Object> term42414 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term42413 = ((Class) term42414).getDeclaredField((String) "FINAL");
        ((Field) term42413).setAccessible(true);
        Object enum109 =  ((Field) term42413).get((Object) null);
        Class<? extends Object> term42751 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term42750 = ((Class) term42751).getDeclaredField((String) "PACKAGE");
        ((Field) term42750).setAccessible(true);
        Object enum110 =  ((Field) term42750).get((Object) null);
        Class<? extends Object> term43094 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term43093 = ((Class) term43094).getDeclaredField((String) "FINAL");
        ((Field) term43093).setAccessible(true);
        Object enum111 =  ((Field) term43093).get((Object) null);
        Class<? extends Object> term43431 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term43430 = ((Class) term43431).getDeclaredField((String) "PRIVATE");
        ((Field) term43430).setAccessible(true);
        Object enum112 =  ((Field) term43430).get((Object) null);
        ArrayList term41680 = new ArrayList();
        ((ArrayList) term41680).add(enum107);
        ((ArrayList) term41680).add(enum108);
        ((ArrayList) term41680).add(enum109);
        ((ArrayList) term41680).add(enum110);
        ((ArrayList) term41680).add(enum108);
        ((ArrayList) term41680).add(enum110);
        ((ArrayList) term41680).add(enum111);
        ((ArrayList) term41680).add(enum112);
        ((ArrayList) term41680).add(enum112);
        term41645 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term41645, term41645.getClass(), "parameters", term41646);
        setField(term41645, term41645.getClass(), "name", "cdZEcINJAM");
        setField(term41645, term41645.getClass(), "type", "qumYSwcWHz");
        setField(term41645, term41645.getClass(), "modifiers", term41680);
        term41712 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term41712;
        callMethod(klass, "equals", argTypes, term41645, args);
    }

};


