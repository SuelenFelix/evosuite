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

public class Enum_modifyObject_2956125682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62874;

    public Enum_modifyObject_2956125682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term62875 = new ArrayList();
        Class<? extends Object> term63021 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term63020 = ((Class) term63021).getDeclaredField((String) "PROTECTED");
        ((Field) term63020).setAccessible(true);
        Object enum162 =  ((Field) term63020).get((Object) null);
        Class<? extends Object> term63370 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term63369 = ((Class) term63370).getDeclaredField((String) "FINAL");
        ((Field) term63369).setAccessible(true);
        Object enum163 =  ((Field) term63369).get((Object) null);
        Class<? extends Object> term63707 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term63706 = ((Class) term63707).getDeclaredField((String) "PRIVATE");
        ((Field) term63706).setAccessible(true);
        Object enum164 =  ((Field) term63706).get((Object) null);
        Class<? extends Object> term64050 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term64049 = ((Class) term64050).getDeclaredField((String) "PROTECTED");
        ((Field) term64049).setAccessible(true);
        Object enum165 =  ((Field) term64049).get((Object) null);
        Class<? extends Object> term64399 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term64398 = ((Class) term64399).getDeclaredField((String) "STATIC");
        ((Field) term64398).setAccessible(true);
        Object enum166 =  ((Field) term64398).get((Object) null);
        ArrayList term62879 = new ArrayList();
        ((ArrayList) term62879).add(enum162);
        ((ArrayList) term62879).add(enum163);
        ((ArrayList) term62879).add(enum164);
        ((ArrayList) term62879).add(enum165);
        ((ArrayList) term62879).add(enum165);
        ((ArrayList) term62879).add(enum166);
        ((ArrayList) term62879).add(enum163);
        ArrayList term62911 = new ArrayList();
        ((ArrayList) term62911).add((Object)null);
        ((ArrayList) term62911).add((Object)null);
        Object term62908 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term62908, term62908.getClass(), "name", "");
        setField(term62908, term62908.getClass(), "type", "");
        setField(term62908, term62908.getClass(), "modifiers", term62911);
        ArrayList term62917 = new ArrayList();
        ((ArrayList) term62917).add((Object)null);
        ((ArrayList) term62917).add((Object)null);
        ((ArrayList) term62917).add((Object)null);
        ((ArrayList) term62917).add((Object)null);
        ((ArrayList) term62917).add((Object)null);
        ((ArrayList) term62917).add((Object)null);
        ((ArrayList) term62917).add((Object)null);
        ((ArrayList) term62917).add((Object)null);
        ((ArrayList) term62917).add((Object)null);
        Object term62914 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term62914, term62914.getClass(), "name", "");
        setField(term62914, term62914.getClass(), "type", "");
        setField(term62914, term62914.getClass(), "modifiers", term62917);
        ArrayList term62923 = new ArrayList();
        ((ArrayList) term62923).add((Object)null);
        ((ArrayList) term62923).add((Object)null);
        Object term62920 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term62920, term62920.getClass(), "name", "");
        setField(term62920, term62920.getClass(), "type", "");
        setField(term62920, term62920.getClass(), "modifiers", term62923);
        ArrayList term62929 = new ArrayList();
        ((ArrayList) term62929).add((Object)null);
        ((ArrayList) term62929).add((Object)null);
        ((ArrayList) term62929).add((Object)null);
        ((ArrayList) term62929).add((Object)null);
        Object term62926 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term62926, term62926.getClass(), "name", "");
        setField(term62926, term62926.getClass(), "type", "");
        setField(term62926, term62926.getClass(), "modifiers", term62929);
        ArrayList term62935 = new ArrayList();
        ((ArrayList) term62935).add((Object)null);
        ((ArrayList) term62935).add((Object)null);
        ((ArrayList) term62935).add((Object)null);
        ((ArrayList) term62935).add((Object)null);
        ((ArrayList) term62935).add((Object)null);
        ((ArrayList) term62935).add((Object)null);
        ((ArrayList) term62935).add((Object)null);
        ((ArrayList) term62935).add((Object)null);
        Object term62932 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term62932, term62932.getClass(), "name", "");
        setField(term62932, term62932.getClass(), "type", "");
        setField(term62932, term62932.getClass(), "modifiers", term62935);
        ArrayList term62941 = new ArrayList();
        ((ArrayList) term62941).add((Object)null);
        ((ArrayList) term62941).add((Object)null);
        ((ArrayList) term62941).add((Object)null);
        ((ArrayList) term62941).add((Object)null);
        ((ArrayList) term62941).add((Object)null);
        ((ArrayList) term62941).add((Object)null);
        ((ArrayList) term62941).add((Object)null);
        ((ArrayList) term62941).add((Object)null);
        Object term62938 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term62938, term62938.getClass(), "name", "");
        setField(term62938, term62938.getClass(), "type", "");
        setField(term62938, term62938.getClass(), "modifiers", term62941);
        ArrayList term62947 = new ArrayList();
        ((ArrayList) term62947).add((Object)null);
        ((ArrayList) term62947).add((Object)null);
        ((ArrayList) term62947).add((Object)null);
        ((ArrayList) term62947).add((Object)null);
        ((ArrayList) term62947).add((Object)null);
        ((ArrayList) term62947).add((Object)null);
        ((ArrayList) term62947).add((Object)null);
        ((ArrayList) term62947).add((Object)null);
        ((ArrayList) term62947).add((Object)null);
        Object term62944 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term62944, term62944.getClass(), "name", "");
        setField(term62944, term62944.getClass(), "type", "");
        setField(term62944, term62944.getClass(), "modifiers", term62947);
        ArrayList term62953 = new ArrayList();
        ((ArrayList) term62953).add((Object)null);
        ((ArrayList) term62953).add((Object)null);
        ((ArrayList) term62953).add((Object)null);
        Object term62950 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term62950, term62950.getClass(), "name", "");
        setField(term62950, term62950.getClass(), "type", "");
        setField(term62950, term62950.getClass(), "modifiers", term62953);
        ArrayList term62959 = new ArrayList();
        ((ArrayList) term62959).add((Object)null);
        ((ArrayList) term62959).add((Object)null);
        Object term62956 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term62956, term62956.getClass(), "name", "");
        setField(term62956, term62956.getClass(), "type", "");
        setField(term62956, term62956.getClass(), "modifiers", term62959);
        ArrayList term62906 = new ArrayList();
        ((ArrayList) term62906).add(term62908);
        ((ArrayList) term62906).add(term62914);
        ((ArrayList) term62906).add(term62920);
        ((ArrayList) term62906).add(term62926);
        ((ArrayList) term62906).add(term62932);
        ((ArrayList) term62906).add(term62938);
        ((ArrayList) term62906).add(term62944);
        ((ArrayList) term62906).add(term62950);
        ((ArrayList) term62906).add(term62956);
        ArrayList term62964 = new ArrayList();
        ArrayList term62992 = new ArrayList();
        ((ArrayList) term62992).add((Object)null);
        term62874 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum"));
        setField(term62874, term62874.getClass(), "objects", term62875);
        setField(term62874, term62874.getClass(), "modifiers", term62879);
        setField(term62874, term62874.getClass(), "attributes", term62906);
        setField(term62874, term62874.getClass(), "methods", term62964);
        setField(term62874, term62874.getClass(), "id", "NUUjAyqOva");
        setField(term62874, term62874.getClass(), "name", "EoAMIIUdDX");
        setField(term62874, term62874.getClass(), "relations", term62992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "OATNwRncsv";
        args[1] = "rACmzcmIPm";
        callMethod(klass, "modifyObject", argTypes, term62874, args);
    }

};


