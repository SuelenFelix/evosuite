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

public class Class_getModifiers_11553687817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24909;

    public Class_getModifiers_11553687817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25051 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term25050 = ((Class) term25051).getDeclaredField((String) "STATIC");
        ((Field) term25050).setAccessible(true);
        Object enum63 =  ((Field) term25050).get((Object) null);
        Class<? extends Object> term25391 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term25390 = ((Class) term25391).getDeclaredField((String) "PRIVATE");
        ((Field) term25390).setAccessible(true);
        Object enum64 =  ((Field) term25390).get((Object) null);
        Class<? extends Object> term25734 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term25733 = ((Class) term25734).getDeclaredField((String) "PROTECTED");
        ((Field) term25733).setAccessible(true);
        Object enum65 =  ((Field) term25733).get((Object) null);
        Class<? extends Object> term26083 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term26082 = ((Class) term26083).getDeclaredField((String) "PROTECTED");
        ((Field) term26082).setAccessible(true);
        Object enum66 =  ((Field) term26082).get((Object) null);
        Class<? extends Object> term26432 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term26431 = ((Class) term26432).getDeclaredField((String) "PROTECTED");
        ((Field) term26431).setAccessible(true);
        Object enum67 =  ((Field) term26431).get((Object) null);
        Class<? extends Object> term26781 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term26780 = ((Class) term26781).getDeclaredField((String) "FINAL");
        ((Field) term26780).setAccessible(true);
        Object enum68 =  ((Field) term26780).get((Object) null);
        ArrayList term24910 = new ArrayList();
        ((ArrayList) term24910).add(enum63);
        ((ArrayList) term24910).add(enum64);
        ((ArrayList) term24910).add(enum65);
        ((ArrayList) term24910).add(enum64);
        ((ArrayList) term24910).add(enum66);
        ((ArrayList) term24910).add(enum67);
        ((ArrayList) term24910).add(enum68);
        ((ArrayList) term24910).add(enum65);
        ((ArrayList) term24910).add(enum67);
        ArrayList term24947 = new ArrayList();
        ((ArrayList) term24947).add((Object)null);
        ((ArrayList) term24947).add((Object)null);
        ((ArrayList) term24947).add((Object)null);
        ((ArrayList) term24947).add((Object)null);
        ((ArrayList) term24947).add((Object)null);
        ((ArrayList) term24947).add((Object)null);
        ((ArrayList) term24947).add((Object)null);
        ((ArrayList) term24947).add((Object)null);
        Object term24944 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term24944, term24944.getClass(), "name", "");
        setField(term24944, term24944.getClass(), "type", "");
        setField(term24944, term24944.getClass(), "modifiers", term24947);
        ArrayList term24953 = new ArrayList();
        Object term24950 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term24950, term24950.getClass(), "name", "");
        setField(term24950, term24950.getClass(), "type", "");
        setField(term24950, term24950.getClass(), "modifiers", term24953);
        ArrayList term24959 = new ArrayList();
        ((ArrayList) term24959).add((Object)null);
        ((ArrayList) term24959).add((Object)null);
        Object term24956 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term24956, term24956.getClass(), "name", "");
        setField(term24956, term24956.getClass(), "type", "");
        setField(term24956, term24956.getClass(), "modifiers", term24959);
        ArrayList term24965 = new ArrayList();
        ((ArrayList) term24965).add((Object)null);
        Object term24962 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term24962, term24962.getClass(), "name", "");
        setField(term24962, term24962.getClass(), "type", "");
        setField(term24962, term24962.getClass(), "modifiers", term24965);
        ArrayList term24971 = new ArrayList();
        ((ArrayList) term24971).add((Object)null);
        ((ArrayList) term24971).add((Object)null);
        ((ArrayList) term24971).add((Object)null);
        ((ArrayList) term24971).add((Object)null);
        Object term24968 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term24968, term24968.getClass(), "name", "");
        setField(term24968, term24968.getClass(), "type", "");
        setField(term24968, term24968.getClass(), "modifiers", term24971);
        ArrayList term24977 = new ArrayList();
        ((ArrayList) term24977).add((Object)null);
        ((ArrayList) term24977).add((Object)null);
        Object term24974 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term24974, term24974.getClass(), "name", "");
        setField(term24974, term24974.getClass(), "type", "");
        setField(term24974, term24974.getClass(), "modifiers", term24977);
        ArrayList term24983 = new ArrayList();
        Object term24980 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term24980, term24980.getClass(), "name", "");
        setField(term24980, term24980.getClass(), "type", "");
        setField(term24980, term24980.getClass(), "modifiers", term24983);
        ArrayList term24989 = new ArrayList();
        ((ArrayList) term24989).add((Object)null);
        ((ArrayList) term24989).add((Object)null);
        ((ArrayList) term24989).add((Object)null);
        ((ArrayList) term24989).add((Object)null);
        ((ArrayList) term24989).add((Object)null);
        Object term24986 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term24986, term24986.getClass(), "name", "");
        setField(term24986, term24986.getClass(), "type", "");
        setField(term24986, term24986.getClass(), "modifiers", term24989);
        ArrayList term24995 = new ArrayList();
        ((ArrayList) term24995).add((Object)null);
        ((ArrayList) term24995).add((Object)null);
        ((ArrayList) term24995).add((Object)null);
        ((ArrayList) term24995).add((Object)null);
        ((ArrayList) term24995).add((Object)null);
        ((ArrayList) term24995).add((Object)null);
        Object term24992 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term24992, term24992.getClass(), "name", "");
        setField(term24992, term24992.getClass(), "type", "");
        setField(term24992, term24992.getClass(), "modifiers", term24995);
        ArrayList term24942 = new ArrayList();
        ((ArrayList) term24942).add(term24944);
        ((ArrayList) term24942).add(term24950);
        ((ArrayList) term24942).add(term24956);
        ((ArrayList) term24942).add(term24962);
        ((ArrayList) term24942).add(term24968);
        ((ArrayList) term24942).add(term24974);
        ((ArrayList) term24942).add(term24980);
        ((ArrayList) term24942).add(term24986);
        ((ArrayList) term24942).add(term24992);
        ArrayList term25003 = new ArrayList();
        ((ArrayList) term25003).add((Object)null);
        ArrayList term25008 = new ArrayList();
        Object term25002 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term25002, term25002.getClass(), "parameters", term25003);
        setField(term25002, term25002.getClass(), "name", "");
        setField(term25002, term25002.getClass(), "type", "");
        setField(term25002, term25002.getClass(), "modifiers", term25008);
        ArrayList term25012 = new ArrayList();
        ((ArrayList) term25012).add((Object)null);
        ((ArrayList) term25012).add((Object)null);
        ((ArrayList) term25012).add((Object)null);
        ((ArrayList) term25012).add((Object)null);
        ((ArrayList) term25012).add((Object)null);
        ((ArrayList) term25012).add((Object)null);
        ((ArrayList) term25012).add((Object)null);
        ((ArrayList) term25012).add((Object)null);
        ArrayList term25017 = new ArrayList();
        ((ArrayList) term25017).add((Object)null);
        ((ArrayList) term25017).add((Object)null);
        ((ArrayList) term25017).add((Object)null);
        ((ArrayList) term25017).add((Object)null);
        Object term25011 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term25011, term25011.getClass(), "parameters", term25012);
        setField(term25011, term25011.getClass(), "name", "");
        setField(term25011, term25011.getClass(), "type", "");
        setField(term25011, term25011.getClass(), "modifiers", term25017);
        ArrayList term25000 = new ArrayList();
        ((ArrayList) term25000).add(term25002);
        ((ArrayList) term25000).add(term25011);
        ArrayList term25046 = new ArrayList();
        ((ArrayList) term25046).add((Object)null);
        ((ArrayList) term25046).add((Object)null);
        ((ArrayList) term25046).add((Object)null);
        term24909 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term24909, term24909.getClass(), "modifiers", term24910);
        setField(term24909, term24909.getClass(), "attributes", term24942);
        setField(term24909, term24909.getClass(), "methods", term25000);
        setField(term24909, term24909.getClass(), "id", "xweqkPdyJH");
        setField(term24909, term24909.getClass(), "name", "kwteHWzwcc");
        setField(term24909, term24909.getClass(), "relations", term25046);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModifiers", argTypes, term24909, args);
    }

};


