package com.usantatecla.ustumlserver.domain.model.generators;

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
import static com.usantatecla.ustumlserver.domain.model.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class PlantUMLGenerator_getClassMembers_13255848285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6695;
     Object term6697;

    public PlantUMLGenerator_getClassMembers_13255848285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6695 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator"));
        setField(term6695, term6695.getClass(), "withMembersMember", null);
        setField(term6695, term6695.getClass(), "origin", null);
        setIntField(term6695, term6695.getClass(), "depthLevel", -1922583790);
        Class<? extends Object> term6813 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term6812 = ((Class) term6813).getDeclaredField((String) "FINAL");
        ((Field) term6812).setAccessible(true);
        Object enum16 =  ((Field) term6812).get((Object) null);
        Class<? extends Object> term7150 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term7149 = ((Class) term7150).getDeclaredField((String) "STATIC");
        ((Field) term7149).setAccessible(true);
        Object enum17 =  ((Field) term7149).get((Object) null);
        Class<? extends Object> term7490 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term7489 = ((Class) term7490).getDeclaredField((String) "PUBLIC");
        ((Field) term7489).setAccessible(true);
        Object enum18 =  ((Field) term7489).get((Object) null);
        Class<? extends Object> term7830 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term7829 = ((Class) term7830).getDeclaredField((String) "FINAL");
        ((Field) term7829).setAccessible(true);
        Object enum19 =  ((Field) term7829).get((Object) null);
        ArrayList term6698 = new ArrayList();
        ((ArrayList) term6698).add(enum16);
        ((ArrayList) term6698).add(enum17);
        ((ArrayList) term6698).add(enum18);
        ((ArrayList) term6698).add(enum19);
        ArrayList term6727 = new ArrayList();
        ((ArrayList) term6727).add((Object)null);
        ((ArrayList) term6727).add((Object)null);
        ((ArrayList) term6727).add((Object)null);
        ((ArrayList) term6727).add((Object)null);
        ((ArrayList) term6727).add((Object)null);
        ((ArrayList) term6727).add((Object)null);
        ((ArrayList) term6727).add((Object)null);
        Object term6724 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term6724, term6724.getClass(), "name", "");
        setField(term6724, term6724.getClass(), "type", "");
        setField(term6724, term6724.getClass(), "modifiers", term6727);
        ArrayList term6733 = new ArrayList();
        Object term6730 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term6730, term6730.getClass(), "name", "");
        setField(term6730, term6730.getClass(), "type", "");
        setField(term6730, term6730.getClass(), "modifiers", term6733);
        ArrayList term6739 = new ArrayList();
        ((ArrayList) term6739).add((Object)null);
        ((ArrayList) term6739).add((Object)null);
        ((ArrayList) term6739).add((Object)null);
        ((ArrayList) term6739).add((Object)null);
        ((ArrayList) term6739).add((Object)null);
        ((ArrayList) term6739).add((Object)null);
        ((ArrayList) term6739).add((Object)null);
        ((ArrayList) term6739).add((Object)null);
        ((ArrayList) term6739).add((Object)null);
        Object term6736 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term6736, term6736.getClass(), "name", "");
        setField(term6736, term6736.getClass(), "type", "");
        setField(term6736, term6736.getClass(), "modifiers", term6739);
        ArrayList term6745 = new ArrayList();
        ((ArrayList) term6745).add((Object)null);
        ((ArrayList) term6745).add((Object)null);
        ((ArrayList) term6745).add((Object)null);
        ((ArrayList) term6745).add((Object)null);
        ((ArrayList) term6745).add((Object)null);
        ((ArrayList) term6745).add((Object)null);
        Object term6742 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term6742, term6742.getClass(), "name", "");
        setField(term6742, term6742.getClass(), "type", "");
        setField(term6742, term6742.getClass(), "modifiers", term6745);
        ArrayList term6751 = new ArrayList();
        ((ArrayList) term6751).add((Object)null);
        ((ArrayList) term6751).add((Object)null);
        ((ArrayList) term6751).add((Object)null);
        ((ArrayList) term6751).add((Object)null);
        ((ArrayList) term6751).add((Object)null);
        ((ArrayList) term6751).add((Object)null);
        ((ArrayList) term6751).add((Object)null);
        ((ArrayList) term6751).add((Object)null);
        Object term6748 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term6748, term6748.getClass(), "name", "");
        setField(term6748, term6748.getClass(), "type", "");
        setField(term6748, term6748.getClass(), "modifiers", term6751);
        ArrayList term6757 = new ArrayList();
        ((ArrayList) term6757).add((Object)null);
        ((ArrayList) term6757).add((Object)null);
        ((ArrayList) term6757).add((Object)null);
        ((ArrayList) term6757).add((Object)null);
        ((ArrayList) term6757).add((Object)null);
        ((ArrayList) term6757).add((Object)null);
        Object term6754 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term6754, term6754.getClass(), "name", "");
        setField(term6754, term6754.getClass(), "type", "");
        setField(term6754, term6754.getClass(), "modifiers", term6757);
        ArrayList term6722 = new ArrayList();
        ((ArrayList) term6722).add(term6724);
        ((ArrayList) term6722).add(term6730);
        ((ArrayList) term6722).add(term6736);
        ((ArrayList) term6722).add(term6742);
        ((ArrayList) term6722).add(term6748);
        ((ArrayList) term6722).add(term6754);
        ArrayList term6765 = new ArrayList();
        ((ArrayList) term6765).add((Object)null);
        ArrayList term6770 = new ArrayList();
        ((ArrayList) term6770).add((Object)null);
        ((ArrayList) term6770).add((Object)null);
        ((ArrayList) term6770).add((Object)null);
        ((ArrayList) term6770).add((Object)null);
        ((ArrayList) term6770).add((Object)null);
        Object term6764 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term6764, term6764.getClass(), "parameters", term6765);
        setField(term6764, term6764.getClass(), "name", "");
        setField(term6764, term6764.getClass(), "type", "");
        setField(term6764, term6764.getClass(), "modifiers", term6770);
        ArrayList term6774 = new ArrayList();
        ((ArrayList) term6774).add((Object)null);
        ((ArrayList) term6774).add((Object)null);
        ((ArrayList) term6774).add((Object)null);
        ArrayList term6779 = new ArrayList();
        ((ArrayList) term6779).add((Object)null);
        ((ArrayList) term6779).add((Object)null);
        ((ArrayList) term6779).add((Object)null);
        ((ArrayList) term6779).add((Object)null);
        ((ArrayList) term6779).add((Object)null);
        ((ArrayList) term6779).add((Object)null);
        ((ArrayList) term6779).add((Object)null);
        ((ArrayList) term6779).add((Object)null);
        ((ArrayList) term6779).add((Object)null);
        Object term6773 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term6773, term6773.getClass(), "parameters", term6774);
        setField(term6773, term6773.getClass(), "name", "");
        setField(term6773, term6773.getClass(), "type", "");
        setField(term6773, term6773.getClass(), "modifiers", term6779);
        ArrayList term6762 = new ArrayList();
        ((ArrayList) term6762).add(term6764);
        ((ArrayList) term6762).add(term6773);
        ArrayList term6808 = new ArrayList();
        ((ArrayList) term6808).add((Object)null);
        ((ArrayList) term6808).add((Object)null);
        ((ArrayList) term6808).add((Object)null);
        ((ArrayList) term6808).add((Object)null);
        ((ArrayList) term6808).add((Object)null);
        ((ArrayList) term6808).add((Object)null);
        ((ArrayList) term6808).add((Object)null);
        term6697 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term6697, term6697.getClass(), "modifiers", term6698);
        setField(term6697, term6697.getClass(), "attributes", term6722);
        setField(term6697, term6697.getClass(), "methods", term6762);
        setField(term6697, term6697.getClass(), "id", "igCAtimmYB");
        setField(term6697, term6697.getClass(), "name", "DyiXbeYIaN");
        setField(term6697, term6697.getClass(), "relations", term6808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Object[] args = new Object[1];
        args[0] = term6697;
        callMethod(klass, "getClassMembers", argTypes, term6695, args);
    }

};


