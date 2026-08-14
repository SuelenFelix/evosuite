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

public class Enum_toString_50498706013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75481;

    public Enum_toString_50498706013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term75482 = new ArrayList();
        ((ArrayList) term75482).add("TDQIAXaJru");
        ((ArrayList) term75482).add("frPMFqGmrE");
        ((ArrayList) term75482).add("DvfOYWcNBN");
        ((ArrayList) term75482).add("cvbvwpPlNk");
        ((ArrayList) term75482).add("uCdLbhvYeG");
        Class<? extends Object> term75676 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term75675 = ((Class) term75676).getDeclaredField((String) "PROTECTED");
        ((Field) term75675).setAccessible(true);
        Object enum192 =  ((Field) term75675).get((Object) null);
        Class<? extends Object> term76025 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term76024 = ((Class) term76025).getDeclaredField((String) "PACKAGE");
        ((Field) term76024).setAccessible(true);
        Object enum193 =  ((Field) term76024).get((Object) null);
        Class<? extends Object> term76368 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term76367 = ((Class) term76368).getDeclaredField((String) "STATIC");
        ((Field) term76367).setAccessible(true);
        Object enum194 =  ((Field) term76367).get((Object) null);
        ArrayList term75546 = new ArrayList();
        ((ArrayList) term75546).add(enum192);
        ((ArrayList) term75546).add(enum193);
        ((ArrayList) term75546).add(enum193);
        ((ArrayList) term75546).add(enum194);
        ArrayList term75570 = new ArrayList();
        ((ArrayList) term75570).add((Object)null);
        ((ArrayList) term75570).add((Object)null);
        ((ArrayList) term75570).add((Object)null);
        ((ArrayList) term75570).add((Object)null);
        ((ArrayList) term75570).add((Object)null);
        Object term75567 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term75567, term75567.getClass(), "name", "");
        setField(term75567, term75567.getClass(), "type", "");
        setField(term75567, term75567.getClass(), "modifiers", term75570);
        ArrayList term75565 = new ArrayList();
        ((ArrayList) term75565).add(term75567);
        ArrayList term75578 = new ArrayList();
        ((ArrayList) term75578).add((Object)null);
        ((ArrayList) term75578).add((Object)null);
        ((ArrayList) term75578).add((Object)null);
        ((ArrayList) term75578).add((Object)null);
        ((ArrayList) term75578).add((Object)null);
        ((ArrayList) term75578).add((Object)null);
        ((ArrayList) term75578).add((Object)null);
        ((ArrayList) term75578).add((Object)null);
        ArrayList term75583 = new ArrayList();
        ((ArrayList) term75583).add((Object)null);
        ((ArrayList) term75583).add((Object)null);
        Object term75577 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term75577, term75577.getClass(), "parameters", term75578);
        setField(term75577, term75577.getClass(), "name", "");
        setField(term75577, term75577.getClass(), "type", "");
        setField(term75577, term75577.getClass(), "modifiers", term75583);
        ArrayList term75587 = new ArrayList();
        ((ArrayList) term75587).add((Object)null);
        ((ArrayList) term75587).add((Object)null);
        ((ArrayList) term75587).add((Object)null);
        ((ArrayList) term75587).add((Object)null);
        ((ArrayList) term75587).add((Object)null);
        ((ArrayList) term75587).add((Object)null);
        ((ArrayList) term75587).add((Object)null);
        ArrayList term75592 = new ArrayList();
        ((ArrayList) term75592).add((Object)null);
        Object term75586 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term75586, term75586.getClass(), "parameters", term75587);
        setField(term75586, term75586.getClass(), "name", "");
        setField(term75586, term75586.getClass(), "type", "");
        setField(term75586, term75586.getClass(), "modifiers", term75592);
        ArrayList term75575 = new ArrayList();
        ((ArrayList) term75575).add(term75577);
        ((ArrayList) term75575).add(term75586);
        ArrayList term75621 = new ArrayList();
        ((ArrayList) term75621).add((Object)null);
        ((ArrayList) term75621).add((Object)null);
        ((ArrayList) term75621).add((Object)null);
        ((ArrayList) term75621).add((Object)null);
        ((ArrayList) term75621).add((Object)null);
        ((ArrayList) term75621).add((Object)null);
        ((ArrayList) term75621).add((Object)null);
        ((ArrayList) term75621).add((Object)null);
        ((ArrayList) term75621).add((Object)null);
        term75481 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum"));
        setField(term75481, term75481.getClass(), "objects", term75482);
        setField(term75481, term75481.getClass(), "modifiers", term75546);
        setField(term75481, term75481.getClass(), "attributes", term75565);
        setField(term75481, term75481.getClass(), "methods", term75575);
        setField(term75481, term75481.getClass(), "id", "zzeaToyLmI");
        setField(term75481, term75481.getClass(), "name", "sKYWhmRMLx");
        setField(term75481, term75481.getClass(), "relations", term75621);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term75481, args);
    }

};


