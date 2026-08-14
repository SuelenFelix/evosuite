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

public class InterfaceEntity_InterfaceEntityBuilderImpl_build_13058283562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54338;

    public InterfaceEntity_InterfaceEntityBuilderImpl_build_13058283562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54407 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term54406 = ((Class) term54407).getDeclaredField((String) "PROTECTED");
        ((Field) term54406).setAccessible(true);
        Object enum142 =  ((Field) term54406).get((Object) null);
        Class<? extends Object> term54756 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term54755 = ((Class) term54756).getDeclaredField((String) "PROTECTED");
        ((Field) term54755).setAccessible(true);
        Object enum143 =  ((Field) term54755).get((Object) null);
        Class<? extends Object> term55105 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term55104 = ((Class) term55105).getDeclaredField((String) "PROTECTED");
        ((Field) term55104).setAccessible(true);
        Object enum144 =  ((Field) term55104).get((Object) null);
        Class<? extends Object> term55454 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term55453 = ((Class) term55454).getDeclaredField((String) "STATIC");
        ((Field) term55453).setAccessible(true);
        Object enum145 =  ((Field) term55453).get((Object) null);
        ArrayList term54339 = new ArrayList();
        ((ArrayList) term54339).add(enum142);
        ((ArrayList) term54339).add(enum143);
        ((ArrayList) term54339).add(enum144);
        ((ArrayList) term54339).add(enum144);
        ((ArrayList) term54339).add(enum144);
        ((ArrayList) term54339).add(enum142);
        ((ArrayList) term54339).add(enum142);
        ((ArrayList) term54339).add(enum145);
        ArrayList term54361 = new ArrayList();
        ArrayList term54370 = new ArrayList();
        ((ArrayList) term54370).add((Object)null);
        ((ArrayList) term54370).add((Object)null);
        ((ArrayList) term54370).add((Object)null);
        ArrayList term54373 = new ArrayList();
        ((ArrayList) term54373).add((Object)null);
        ((ArrayList) term54373).add((Object)null);
        ((ArrayList) term54373).add((Object)null);
        ((ArrayList) term54373).add((Object)null);
        ((ArrayList) term54373).add((Object)null);
        Object term54367 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term54367, term54367.getClass(), "name", "");
        setField(term54367, term54367.getClass(), "type", "");
        setField(term54367, term54367.getClass(), "modifiers", term54370);
        setField(term54367, term54367.getClass(), "parametersEntities", term54373);
        ArrayList term54365 = new ArrayList();
        ((ArrayList) term54365).add(term54367);
        ArrayList term54402 = new ArrayList();
        ((ArrayList) term54402).add((Object)null);
        ((ArrayList) term54402).add((Object)null);
        ((ArrayList) term54402).add((Object)null);
        ((ArrayList) term54402).add((Object)null);
        term54338 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.InterfaceEntity$InterfaceEntityBuilderImpl"));
        setField(term54338, term54338.getClass(), "modifiers", term54339);
        setField(term54338, term54338.getClass(), "attributesEntities", term54361);
        setField(term54338, term54338.getClass(), "methodsEntities", term54365);
        setField(term54338, term54338.getClass(), "id", "douzkltmiI");
        setField(term54338, term54338.getClass(), "name", "MFKjhvLtpe");
        setField(term54338, term54338.getClass(), "relationEntities", term54402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.InterfaceEntity$InterfaceEntityBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term54338, args);
    }

};


