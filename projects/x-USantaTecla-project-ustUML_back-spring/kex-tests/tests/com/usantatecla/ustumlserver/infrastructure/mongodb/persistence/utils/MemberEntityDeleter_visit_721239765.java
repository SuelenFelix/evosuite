package com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class MemberEntityDeleter_visit_721239765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6593;

    public MemberEntityDeleter_visit_721239765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6721 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term6720 = ((Class) term6721).getDeclaredField((String) "FINAL");
        ((Field) term6720).setAccessible(true);
        Object enum14 =  ((Field) term6720).get((Object) null);
        Class<? extends Object> term7058 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term7057 = ((Class) term7058).getDeclaredField((String) "PRIVATE");
        ((Field) term7057).setAccessible(true);
        Object enum15 =  ((Field) term7057).get((Object) null);
        Class<? extends Object> term7401 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term7400 = ((Class) term7401).getDeclaredField((String) "PACKAGE");
        ((Field) term7400).setAccessible(true);
        Object enum16 =  ((Field) term7400).get((Object) null);
        Class<? extends Object> term7744 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term7743 = ((Class) term7744).getDeclaredField((String) "STATIC");
        ((Field) term7743).setAccessible(true);
        Object enum17 =  ((Field) term7743).get((Object) null);
        ArrayList term6594 = new ArrayList();
        ((ArrayList) term6594).add(enum14);
        ((ArrayList) term6594).add(enum15);
        ((ArrayList) term6594).add(enum14);
        ((ArrayList) term6594).add(enum16);
        ((ArrayList) term6594).add(enum16);
        ((ArrayList) term6594).add(enum17);
        ArrayList term6623 = new ArrayList();
        ((ArrayList) term6623).add((Object)null);
        Object term6620 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term6620, term6620.getClass(), "name", "");
        setField(term6620, term6620.getClass(), "type", "");
        setField(term6620, term6620.getClass(), "modifiers", term6623);
        ArrayList term6629 = new ArrayList();
        Object term6626 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term6626, term6626.getClass(), "name", "");
        setField(term6626, term6626.getClass(), "type", "");
        setField(term6626, term6626.getClass(), "modifiers", term6629);
        ArrayList term6635 = new ArrayList();
        ((ArrayList) term6635).add((Object)null);
        ((ArrayList) term6635).add((Object)null);
        ((ArrayList) term6635).add((Object)null);
        ((ArrayList) term6635).add((Object)null);
        ((ArrayList) term6635).add((Object)null);
        ((ArrayList) term6635).add((Object)null);
        Object term6632 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term6632, term6632.getClass(), "name", "");
        setField(term6632, term6632.getClass(), "type", "");
        setField(term6632, term6632.getClass(), "modifiers", term6635);
        ArrayList term6641 = new ArrayList();
        ((ArrayList) term6641).add((Object)null);
        ((ArrayList) term6641).add((Object)null);
        ((ArrayList) term6641).add((Object)null);
        ((ArrayList) term6641).add((Object)null);
        ((ArrayList) term6641).add((Object)null);
        Object term6638 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term6638, term6638.getClass(), "name", "");
        setField(term6638, term6638.getClass(), "type", "");
        setField(term6638, term6638.getClass(), "modifiers", term6641);
        ArrayList term6647 = new ArrayList();
        ((ArrayList) term6647).add((Object)null);
        Object term6644 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term6644, term6644.getClass(), "name", "");
        setField(term6644, term6644.getClass(), "type", "");
        setField(term6644, term6644.getClass(), "modifiers", term6647);
        ArrayList term6618 = new ArrayList();
        ((ArrayList) term6618).add(term6620);
        ((ArrayList) term6618).add(term6626);
        ((ArrayList) term6618).add(term6632);
        ((ArrayList) term6618).add(term6638);
        ((ArrayList) term6618).add(term6644);
        ArrayList term6655 = new ArrayList();
        ((ArrayList) term6655).add((Object)null);
        ArrayList term6660 = new ArrayList();
        ((ArrayList) term6660).add((Object)null);
        Object term6654 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term6654, term6654.getClass(), "parameters", term6655);
        setField(term6654, term6654.getClass(), "name", "");
        setField(term6654, term6654.getClass(), "type", "");
        setField(term6654, term6654.getClass(), "modifiers", term6660);
        ArrayList term6664 = new ArrayList();
        ((ArrayList) term6664).add((Object)null);
        ((ArrayList) term6664).add((Object)null);
        ((ArrayList) term6664).add((Object)null);
        ((ArrayList) term6664).add((Object)null);
        ((ArrayList) term6664).add((Object)null);
        ((ArrayList) term6664).add((Object)null);
        ArrayList term6669 = new ArrayList();
        ((ArrayList) term6669).add((Object)null);
        ((ArrayList) term6669).add((Object)null);
        ((ArrayList) term6669).add((Object)null);
        ((ArrayList) term6669).add((Object)null);
        ((ArrayList) term6669).add((Object)null);
        ((ArrayList) term6669).add((Object)null);
        ((ArrayList) term6669).add((Object)null);
        Object term6663 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term6663, term6663.getClass(), "parameters", term6664);
        setField(term6663, term6663.getClass(), "name", "");
        setField(term6663, term6663.getClass(), "type", "");
        setField(term6663, term6663.getClass(), "modifiers", term6669);
        ArrayList term6673 = new ArrayList();
        ArrayList term6678 = new ArrayList();
        ((ArrayList) term6678).add((Object)null);
        ((ArrayList) term6678).add((Object)null);
        ((ArrayList) term6678).add((Object)null);
        ((ArrayList) term6678).add((Object)null);
        ((ArrayList) term6678).add((Object)null);
        ((ArrayList) term6678).add((Object)null);
        ((ArrayList) term6678).add((Object)null);
        Object term6672 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term6672, term6672.getClass(), "parameters", term6673);
        setField(term6672, term6672.getClass(), "name", "");
        setField(term6672, term6672.getClass(), "type", "");
        setField(term6672, term6672.getClass(), "modifiers", term6678);
        ArrayList term6682 = new ArrayList();
        ((ArrayList) term6682).add((Object)null);
        ArrayList term6687 = new ArrayList();
        ((ArrayList) term6687).add((Object)null);
        ((ArrayList) term6687).add((Object)null);
        ((ArrayList) term6687).add((Object)null);
        ((ArrayList) term6687).add((Object)null);
        ((ArrayList) term6687).add((Object)null);
        ((ArrayList) term6687).add((Object)null);
        Object term6681 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term6681, term6681.getClass(), "parameters", term6682);
        setField(term6681, term6681.getClass(), "name", "");
        setField(term6681, term6681.getClass(), "type", "");
        setField(term6681, term6681.getClass(), "modifiers", term6687);
        ArrayList term6652 = new ArrayList();
        ((ArrayList) term6652).add(term6654);
        ((ArrayList) term6652).add(term6663);
        ((ArrayList) term6652).add(term6672);
        ((ArrayList) term6652).add(term6681);
        ArrayList term6716 = new ArrayList();
        ((ArrayList) term6716).add((Object)null);
        ((ArrayList) term6716).add((Object)null);
        ((ArrayList) term6716).add((Object)null);
        ((ArrayList) term6716).add((Object)null);
        term6593 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term6593, term6593.getClass(), "modifiers", term6594);
        setField(term6593, term6593.getClass(), "attributes", term6618);
        setField(term6593, term6593.getClass(), "methods", term6652);
        setField(term6593, term6593.getClass(), "id", "sZdUNdggUW");
        setField(term6593, term6593.getClass(), "name", "OqbwYQfvAe");
        setField(term6593, term6593.getClass(), "relations", term6716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.MemberEntityDeleter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Object[] args = new Object[1];
        args[0] = term6593;
        callMethod(klass, "visit", argTypes, null, args);
    }

};


