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

public class Method_toString_20885051324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39851;

    public Method_toString_20885051324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term39854 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term39854, term39854.getClass(), "name", "");
        setField(term39854, term39854.getClass(), "type", "");
        Object term39857 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term39857, term39857.getClass(), "name", "");
        setField(term39857, term39857.getClass(), "type", "");
        Object term39860 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term39860, term39860.getClass(), "name", "");
        setField(term39860, term39860.getClass(), "type", "");
        Object term39863 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term39863, term39863.getClass(), "name", "");
        setField(term39863, term39863.getClass(), "type", "");
        Object term39866 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term39866, term39866.getClass(), "name", "");
        setField(term39866, term39866.getClass(), "type", "");
        Object term39869 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term39869, term39869.getClass(), "name", "");
        setField(term39869, term39869.getClass(), "type", "");
        Object term39872 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term39872, term39872.getClass(), "name", "");
        setField(term39872, term39872.getClass(), "type", "");
        ArrayList term39852 = new ArrayList();
        ((ArrayList) term39852).add(term39854);
        ((ArrayList) term39852).add(term39857);
        ((ArrayList) term39852).add(term39860);
        ((ArrayList) term39852).add(term39863);
        ((ArrayList) term39852).add(term39866);
        ((ArrayList) term39852).add(term39869);
        ((ArrayList) term39852).add(term39872);
        Class<? extends Object> term39949 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term39948 = ((Class) term39949).getDeclaredField((String) "PUBLIC");
        ((Field) term39948).setAccessible(true);
        Object enum102 =  ((Field) term39948).get((Object) null);
        Class<? extends Object> term40289 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term40288 = ((Class) term40289).getDeclaredField((String) "PRIVATE");
        ((Field) term40288).setAccessible(true);
        Object enum103 =  ((Field) term40288).get((Object) null);
        Class<? extends Object> term40632 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term40631 = ((Class) term40632).getDeclaredField((String) "FINAL");
        ((Field) term40631).setAccessible(true);
        Object enum104 =  ((Field) term40631).get((Object) null);
        Class<? extends Object> term40969 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term40968 = ((Class) term40969).getDeclaredField((String) "PRIVATE");
        ((Field) term40968).setAccessible(true);
        Object enum105 =  ((Field) term40968).get((Object) null);
        Class<? extends Object> term41312 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term41311 = ((Class) term41312).getDeclaredField((String) "NULL");
        ((Field) term41311).setAccessible(true);
        Object enum106 =  ((Field) term41311).get((Object) null);
        ArrayList term39901 = new ArrayList();
        ((ArrayList) term39901).add(enum102);
        ((ArrayList) term39901).add(enum103);
        ((ArrayList) term39901).add(enum104);
        ((ArrayList) term39901).add(enum105);
        ((ArrayList) term39901).add(enum102);
        ((ArrayList) term39901).add(enum106);
        term39851 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term39851, term39851.getClass(), "parameters", term39852);
        setField(term39851, term39851.getClass(), "name", "hysThIPoEJ");
        setField(term39851, term39851.getClass(), "type", "dfZepHfGwh");
        setField(term39851, term39851.getClass(), "modifiers", term39901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term39851, args);
    }

};


