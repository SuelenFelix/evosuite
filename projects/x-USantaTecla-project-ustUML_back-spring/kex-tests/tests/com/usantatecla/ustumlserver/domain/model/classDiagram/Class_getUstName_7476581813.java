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

public class Class_getUstName_7476581813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21958;

    public Class_getUstName_7476581813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22059 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term22058 = ((Class) term22059).getDeclaredField((String) "ABSTRACT");
        ((Field) term22058).setAccessible(true);
        Object enum55 =  ((Field) term22058).get((Object) null);
        Class<? extends Object> term22405 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term22404 = ((Class) term22405).getDeclaredField((String) "PACKAGE");
        ((Field) term22404).setAccessible(true);
        Object enum56 =  ((Field) term22404).get((Object) null);
        Class<? extends Object> term22748 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term22747 = ((Class) term22748).getDeclaredField((String) "PROTECTED");
        ((Field) term22747).setAccessible(true);
        Object enum57 =  ((Field) term22747).get((Object) null);
        Class<? extends Object> term23097 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term23096 = ((Class) term23097).getDeclaredField((String) "PACKAGE");
        ((Field) term23096).setAccessible(true);
        Object enum58 =  ((Field) term23096).get((Object) null);
        ArrayList term21959 = new ArrayList();
        ((ArrayList) term21959).add(enum55);
        ((ArrayList) term21959).add(enum56);
        ((ArrayList) term21959).add(enum57);
        ((ArrayList) term21959).add(enum58);
        ArrayList term21988 = new ArrayList();
        ((ArrayList) term21988).add((Object)null);
        ((ArrayList) term21988).add((Object)null);
        ((ArrayList) term21988).add((Object)null);
        ((ArrayList) term21988).add((Object)null);
        ((ArrayList) term21988).add((Object)null);
        ((ArrayList) term21988).add((Object)null);
        Object term21985 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term21985, term21985.getClass(), "name", "");
        setField(term21985, term21985.getClass(), "type", "");
        setField(term21985, term21985.getClass(), "modifiers", term21988);
        ArrayList term21994 = new ArrayList();
        Object term21991 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term21991, term21991.getClass(), "name", "");
        setField(term21991, term21991.getClass(), "type", "");
        setField(term21991, term21991.getClass(), "modifiers", term21994);
        ArrayList term21983 = new ArrayList();
        ((ArrayList) term21983).add(term21985);
        ((ArrayList) term21983).add(term21991);
        ArrayList term22002 = new ArrayList();
        ((ArrayList) term22002).add((Object)null);
        ((ArrayList) term22002).add((Object)null);
        ((ArrayList) term22002).add((Object)null);
        ((ArrayList) term22002).add((Object)null);
        ((ArrayList) term22002).add((Object)null);
        ((ArrayList) term22002).add((Object)null);
        ArrayList term22007 = new ArrayList();
        ((ArrayList) term22007).add((Object)null);
        ((ArrayList) term22007).add((Object)null);
        ((ArrayList) term22007).add((Object)null);
        ((ArrayList) term22007).add((Object)null);
        ((ArrayList) term22007).add((Object)null);
        ((ArrayList) term22007).add((Object)null);
        ((ArrayList) term22007).add((Object)null);
        ((ArrayList) term22007).add((Object)null);
        Object term22001 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term22001, term22001.getClass(), "parameters", term22002);
        setField(term22001, term22001.getClass(), "name", "");
        setField(term22001, term22001.getClass(), "type", "");
        setField(term22001, term22001.getClass(), "modifiers", term22007);
        ArrayList term22011 = new ArrayList();
        ((ArrayList) term22011).add((Object)null);
        ((ArrayList) term22011).add((Object)null);
        ((ArrayList) term22011).add((Object)null);
        ((ArrayList) term22011).add((Object)null);
        ((ArrayList) term22011).add((Object)null);
        ArrayList term22016 = new ArrayList();
        ((ArrayList) term22016).add((Object)null);
        ((ArrayList) term22016).add((Object)null);
        ((ArrayList) term22016).add((Object)null);
        ((ArrayList) term22016).add((Object)null);
        ((ArrayList) term22016).add((Object)null);
        Object term22010 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term22010, term22010.getClass(), "parameters", term22011);
        setField(term22010, term22010.getClass(), "name", "");
        setField(term22010, term22010.getClass(), "type", "");
        setField(term22010, term22010.getClass(), "modifiers", term22016);
        ArrayList term22020 = new ArrayList();
        ((ArrayList) term22020).add((Object)null);
        ((ArrayList) term22020).add((Object)null);
        ((ArrayList) term22020).add((Object)null);
        ((ArrayList) term22020).add((Object)null);
        ArrayList term22025 = new ArrayList();
        ((ArrayList) term22025).add((Object)null);
        ((ArrayList) term22025).add((Object)null);
        ((ArrayList) term22025).add((Object)null);
        ((ArrayList) term22025).add((Object)null);
        ((ArrayList) term22025).add((Object)null);
        ((ArrayList) term22025).add((Object)null);
        ((ArrayList) term22025).add((Object)null);
        ((ArrayList) term22025).add((Object)null);
        Object term22019 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term22019, term22019.getClass(), "parameters", term22020);
        setField(term22019, term22019.getClass(), "name", "");
        setField(term22019, term22019.getClass(), "type", "");
        setField(term22019, term22019.getClass(), "modifiers", term22025);
        ArrayList term21999 = new ArrayList();
        ((ArrayList) term21999).add(term22001);
        ((ArrayList) term21999).add(term22010);
        ((ArrayList) term21999).add(term22019);
        ArrayList term22054 = new ArrayList();
        ((ArrayList) term22054).add((Object)null);
        ((ArrayList) term22054).add((Object)null);
        ((ArrayList) term22054).add((Object)null);
        ((ArrayList) term22054).add((Object)null);
        ((ArrayList) term22054).add((Object)null);
        ((ArrayList) term22054).add((Object)null);
        ((ArrayList) term22054).add((Object)null);
        ((ArrayList) term22054).add((Object)null);
        ((ArrayList) term22054).add((Object)null);
        term21958 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term21958, term21958.getClass(), "modifiers", term21959);
        setField(term21958, term21958.getClass(), "attributes", term21983);
        setField(term21958, term21958.getClass(), "methods", term21999);
        setField(term21958, term21958.getClass(), "id", "LLegSTfqJt");
        setField(term21958, term21958.getClass(), "name", "XQfmqLbqHS");
        setField(term21958, term21958.getClass(), "relations", term22054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUstName", argTypes, term21958, args);
    }

};


