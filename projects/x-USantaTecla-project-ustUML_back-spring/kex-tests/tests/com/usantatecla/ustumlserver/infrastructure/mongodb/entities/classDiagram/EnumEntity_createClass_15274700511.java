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

public class EnumEntity_createClass_15274700511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67257;

    public EnumEntity_createClass_15274700511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term67258 = new ArrayList();
        ((ArrayList) term67258).add("gQgTBlRIvX");
        ((ArrayList) term67258).add("ulKaKnANzj");
        ((ArrayList) term67258).add("ABwhdjjeJi");
        ((ArrayList) term67258).add("KKEcpYXNZV");
        ((ArrayList) term67258).add("shLHFznysy");
        Class<? extends Object> term67476 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term67475 = ((Class) term67476).getDeclaredField((String) "PROTECTED");
        ((Field) term67475).setAccessible(true);
        Object enum173 =  ((Field) term67475).get((Object) null);
        Class<? extends Object> term67825 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term67824 = ((Class) term67825).getDeclaredField((String) "PACKAGE");
        ((Field) term67824).setAccessible(true);
        Object enum174 =  ((Field) term67824).get((Object) null);
        Class<? extends Object> term68168 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term68167 = ((Class) term68168).getDeclaredField((String) "PRIVATE");
        ((Field) term68167).setAccessible(true);
        Object enum175 =  ((Field) term68167).get((Object) null);
        Class<? extends Object> term68511 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term68510 = ((Class) term68511).getDeclaredField((String) "PRIVATE");
        ((Field) term68510).setAccessible(true);
        Object enum176 =  ((Field) term68510).get((Object) null);
        Class<? extends Object> term68854 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term68853 = ((Class) term68854).getDeclaredField((String) "PACKAGE");
        ((Field) term68853).setAccessible(true);
        Object enum177 =  ((Field) term68853).get((Object) null);
        Class<? extends Object> term69197 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term69196 = ((Class) term69197).getDeclaredField((String) "PUBLIC");
        ((Field) term69196).setAccessible(true);
        Object enum178 =  ((Field) term69196).get((Object) null);
        ArrayList term67322 = new ArrayList();
        ((ArrayList) term67322).add(enum173);
        ((ArrayList) term67322).add(enum174);
        ((ArrayList) term67322).add(enum175);
        ((ArrayList) term67322).add(enum176);
        ((ArrayList) term67322).add(enum177);
        ((ArrayList) term67322).add(enum178);
        ((ArrayList) term67322).add(enum173);
        ArrayList term67361 = new ArrayList();
        ((ArrayList) term67361).add((Object)null);
        ((ArrayList) term67361).add((Object)null);
        Object term67358 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term67358, term67358.getClass(), "name", "");
        setField(term67358, term67358.getClass(), "type", "");
        setField(term67358, term67358.getClass(), "modifiers", term67361);
        ArrayList term67367 = new ArrayList();
        ((ArrayList) term67367).add((Object)null);
        ((ArrayList) term67367).add((Object)null);
        ((ArrayList) term67367).add((Object)null);
        Object term67364 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term67364, term67364.getClass(), "name", "");
        setField(term67364, term67364.getClass(), "type", "");
        setField(term67364, term67364.getClass(), "modifiers", term67367);
        ArrayList term67373 = new ArrayList();
        ((ArrayList) term67373).add((Object)null);
        ((ArrayList) term67373).add((Object)null);
        ((ArrayList) term67373).add((Object)null);
        ((ArrayList) term67373).add((Object)null);
        ((ArrayList) term67373).add((Object)null);
        ((ArrayList) term67373).add((Object)null);
        ((ArrayList) term67373).add((Object)null);
        Object term67370 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term67370, term67370.getClass(), "name", "");
        setField(term67370, term67370.getClass(), "type", "");
        setField(term67370, term67370.getClass(), "modifiers", term67373);
        ArrayList term67379 = new ArrayList();
        ((ArrayList) term67379).add((Object)null);
        ((ArrayList) term67379).add((Object)null);
        ((ArrayList) term67379).add((Object)null);
        ((ArrayList) term67379).add((Object)null);
        Object term67376 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term67376, term67376.getClass(), "name", "");
        setField(term67376, term67376.getClass(), "type", "");
        setField(term67376, term67376.getClass(), "modifiers", term67379);
        ArrayList term67356 = new ArrayList();
        ((ArrayList) term67356).add(term67358);
        ((ArrayList) term67356).add(term67364);
        ((ArrayList) term67356).add(term67370);
        ((ArrayList) term67356).add(term67376);
        ArrayList term67389 = new ArrayList();
        ((ArrayList) term67389).add((Object)null);
        ((ArrayList) term67389).add((Object)null);
        ((ArrayList) term67389).add((Object)null);
        ((ArrayList) term67389).add((Object)null);
        ((ArrayList) term67389).add((Object)null);
        ((ArrayList) term67389).add((Object)null);
        ((ArrayList) term67389).add((Object)null);
        ((ArrayList) term67389).add((Object)null);
        ((ArrayList) term67389).add((Object)null);
        ArrayList term67392 = new ArrayList();
        ((ArrayList) term67392).add((Object)null);
        ((ArrayList) term67392).add((Object)null);
        ((ArrayList) term67392).add((Object)null);
        ((ArrayList) term67392).add((Object)null);
        ((ArrayList) term67392).add((Object)null);
        ((ArrayList) term67392).add((Object)null);
        Object term67386 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term67386, term67386.getClass(), "name", "");
        setField(term67386, term67386.getClass(), "type", "");
        setField(term67386, term67386.getClass(), "modifiers", term67389);
        setField(term67386, term67386.getClass(), "parametersEntities", term67392);
        ArrayList term67384 = new ArrayList();
        ((ArrayList) term67384).add(term67386);
        ArrayList term67421 = new ArrayList();
        ((ArrayList) term67421).add((Object)null);
        ((ArrayList) term67421).add((Object)null);
        ((ArrayList) term67421).add((Object)null);
        ((ArrayList) term67421).add((Object)null);
        ((ArrayList) term67421).add((Object)null);
        ((ArrayList) term67421).add((Object)null);
        term67257 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.EnumEntity"));
        setField(term67257, term67257.getClass(), "objects", term67258);
        setField(term67257, term67257.getClass(), "modifiers", term67322);
        setField(term67257, term67257.getClass(), "attributesEntities", term67356);
        setField(term67257, term67257.getClass(), "methodsEntities", term67384);
        setField(term67257, term67257.getClass(), "id", "UMMXkhuqzw");
        setField(term67257, term67257.getClass(), "name", "KyGXZcXJwq");
        setField(term67257, term67257.getClass(), "relationEntities", term67421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.EnumEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createClass", argTypes, term67257, args);
    }

};


