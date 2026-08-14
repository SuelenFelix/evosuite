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
import java.util.LinkedList;

public class Enum_setObjects_12876790912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73931;
     Object term74044;

    public Enum_setObjects_12876790912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term73932 = new ArrayList();
        Class<? extends Object> term74076 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term74075 = ((Class) term74076).getDeclaredField((String) "PROTECTED");
        ((Field) term74075).setAccessible(true);
        Object enum188 =  ((Field) term74075).get((Object) null);
        Class<? extends Object> term74425 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term74424 = ((Class) term74425).getDeclaredField((String) "FINAL");
        ((Field) term74424).setAccessible(true);
        Object enum189 =  ((Field) term74424).get((Object) null);
        Class<? extends Object> term74762 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term74761 = ((Class) term74762).getDeclaredField((String) "PUBLIC");
        ((Field) term74761).setAccessible(true);
        Object enum190 =  ((Field) term74761).get((Object) null);
        Class<? extends Object> term75102 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term75101 = ((Class) term75102).getDeclaredField((String) "PUBLIC");
        ((Field) term75101).setAccessible(true);
        Object enum191 =  ((Field) term75101).get((Object) null);
        ArrayList term73936 = new ArrayList();
        ((ArrayList) term73936).add(enum188);
        ((ArrayList) term73936).add(enum189);
        ((ArrayList) term73936).add(enum190);
        ((ArrayList) term73936).add(enum191);
        ((ArrayList) term73936).add(enum189);
        ArrayList term73965 = new ArrayList();
        ((ArrayList) term73965).add((Object)null);
        ((ArrayList) term73965).add((Object)null);
        ((ArrayList) term73965).add((Object)null);
        ((ArrayList) term73965).add((Object)null);
        ((ArrayList) term73965).add((Object)null);
        Object term73962 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term73962, term73962.getClass(), "name", "");
        setField(term73962, term73962.getClass(), "type", "");
        setField(term73962, term73962.getClass(), "modifiers", term73965);
        ArrayList term73971 = new ArrayList();
        ((ArrayList) term73971).add((Object)null);
        ((ArrayList) term73971).add((Object)null);
        ((ArrayList) term73971).add((Object)null);
        ((ArrayList) term73971).add((Object)null);
        Object term73968 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term73968, term73968.getClass(), "name", "");
        setField(term73968, term73968.getClass(), "type", "");
        setField(term73968, term73968.getClass(), "modifiers", term73971);
        ArrayList term73977 = new ArrayList();
        ((ArrayList) term73977).add((Object)null);
        ((ArrayList) term73977).add((Object)null);
        ((ArrayList) term73977).add((Object)null);
        ((ArrayList) term73977).add((Object)null);
        ((ArrayList) term73977).add((Object)null);
        ((ArrayList) term73977).add((Object)null);
        ((ArrayList) term73977).add((Object)null);
        Object term73974 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term73974, term73974.getClass(), "name", "");
        setField(term73974, term73974.getClass(), "type", "");
        setField(term73974, term73974.getClass(), "modifiers", term73977);
        ArrayList term73983 = new ArrayList();
        ((ArrayList) term73983).add((Object)null);
        ((ArrayList) term73983).add((Object)null);
        ((ArrayList) term73983).add((Object)null);
        ((ArrayList) term73983).add((Object)null);
        ((ArrayList) term73983).add((Object)null);
        ((ArrayList) term73983).add((Object)null);
        ((ArrayList) term73983).add((Object)null);
        Object term73980 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term73980, term73980.getClass(), "name", "");
        setField(term73980, term73980.getClass(), "type", "");
        setField(term73980, term73980.getClass(), "modifiers", term73983);
        ArrayList term73989 = new ArrayList();
        ((ArrayList) term73989).add((Object)null);
        ((ArrayList) term73989).add((Object)null);
        Object term73986 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term73986, term73986.getClass(), "name", "");
        setField(term73986, term73986.getClass(), "type", "");
        setField(term73986, term73986.getClass(), "modifiers", term73989);
        ArrayList term73995 = new ArrayList();
        ((ArrayList) term73995).add((Object)null);
        ((ArrayList) term73995).add((Object)null);
        ((ArrayList) term73995).add((Object)null);
        Object term73992 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term73992, term73992.getClass(), "name", "");
        setField(term73992, term73992.getClass(), "type", "");
        setField(term73992, term73992.getClass(), "modifiers", term73995);
        ArrayList term74001 = new ArrayList();
        ((ArrayList) term74001).add((Object)null);
        ((ArrayList) term74001).add((Object)null);
        ((ArrayList) term74001).add((Object)null);
        ((ArrayList) term74001).add((Object)null);
        ((ArrayList) term74001).add((Object)null);
        ((ArrayList) term74001).add((Object)null);
        ((ArrayList) term74001).add((Object)null);
        Object term73998 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term73998, term73998.getClass(), "name", "");
        setField(term73998, term73998.getClass(), "type", "");
        setField(term73998, term73998.getClass(), "modifiers", term74001);
        ArrayList term74007 = new ArrayList();
        ((ArrayList) term74007).add((Object)null);
        Object term74004 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term74004, term74004.getClass(), "name", "");
        setField(term74004, term74004.getClass(), "type", "");
        setField(term74004, term74004.getClass(), "modifiers", term74007);
        ArrayList term73960 = new ArrayList();
        ((ArrayList) term73960).add(term73962);
        ((ArrayList) term73960).add(term73968);
        ((ArrayList) term73960).add(term73974);
        ((ArrayList) term73960).add(term73980);
        ((ArrayList) term73960).add(term73986);
        ((ArrayList) term73960).add(term73992);
        ((ArrayList) term73960).add(term73998);
        ((ArrayList) term73960).add(term74004);
        ArrayList term74012 = new ArrayList();
        ArrayList term74040 = new ArrayList();
        ((ArrayList) term74040).add((Object)null);
        ((ArrayList) term74040).add((Object)null);
        term73931 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum"));
        setField(term73931, term73931.getClass(), "objects", term73932);
        setField(term73931, term73931.getClass(), "modifiers", term73936);
        setField(term73931, term73931.getClass(), "attributes", term73960);
        setField(term73931, term73931.getClass(), "methods", term74012);
        setField(term73931, term73931.getClass(), "id", "jevOVdQdpc");
        setField(term73931, term73931.getClass(), "name", "TLLVSGTNsz");
        setField(term73931, term73931.getClass(), "relations", term74040);
        term74044 = new LinkedList();
        ((LinkedList) term74044).add("mbBWfaHCrP");
        ((LinkedList) term74044).add("wFyiZloCxg");
        ((LinkedList) term74044).add("");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term74044;
        callMethod(klass, "setObjects", argTypes, term73931, args);
    }

};


