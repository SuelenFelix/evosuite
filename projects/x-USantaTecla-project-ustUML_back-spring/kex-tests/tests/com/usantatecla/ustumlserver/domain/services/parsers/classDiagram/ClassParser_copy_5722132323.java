package com.usantatecla.ustumlserver.domain.services.parsers.classDiagram;

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
import static com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class ClassParser_copy_5722132323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10521;
     Object term10673;

    public ClassParser_copy_5722132323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10731 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term10730 = ((Class) term10731).getDeclaredField((String) "PACKAGE");
        ((Field) term10730).setAccessible(true);
        Object enum26 =  ((Field) term10730).get((Object) null);
        Class<? extends Object> term11074 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term11073 = ((Class) term11074).getDeclaredField((String) "PROTECTED");
        ((Field) term11073).setAccessible(true);
        Object enum27 =  ((Field) term11073).get((Object) null);
        Class<? extends Object> term11423 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term11422 = ((Class) term11423).getDeclaredField((String) "PRIVATE");
        ((Field) term11422).setAccessible(true);
        Object enum28 =  ((Field) term11422).get((Object) null);
        Class<? extends Object> term11766 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term11765 = ((Class) term11766).getDeclaredField((String) "NULL");
        ((Field) term11765).setAccessible(true);
        Object enum29 =  ((Field) term11765).get((Object) null);
        ArrayList term10522 = new ArrayList();
        ((ArrayList) term10522).add(enum26);
        ((ArrayList) term10522).add(enum26);
        ((ArrayList) term10522).add(enum27);
        ((ArrayList) term10522).add(enum28);
        ((ArrayList) term10522).add(enum29);
        ((ArrayList) term10522).add(enum29);
        ((ArrayList) term10522).add(enum28);
        ArrayList term10551 = new ArrayList();
        ((ArrayList) term10551).add((Object)null);
        ((ArrayList) term10551).add((Object)null);
        ((ArrayList) term10551).add((Object)null);
        ((ArrayList) term10551).add((Object)null);
        ((ArrayList) term10551).add((Object)null);
        ((ArrayList) term10551).add((Object)null);
        Object term10548 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term10548, term10548.getClass(), "name", "");
        setField(term10548, term10548.getClass(), "type", "");
        setField(term10548, term10548.getClass(), "modifiers", term10551);
        ArrayList term10546 = new ArrayList();
        ((ArrayList) term10546).add(term10548);
        ArrayList term10559 = new ArrayList();
        ((ArrayList) term10559).add((Object)null);
        ((ArrayList) term10559).add((Object)null);
        ((ArrayList) term10559).add((Object)null);
        ((ArrayList) term10559).add((Object)null);
        ((ArrayList) term10559).add((Object)null);
        ArrayList term10564 = new ArrayList();
        ((ArrayList) term10564).add((Object)null);
        ((ArrayList) term10564).add((Object)null);
        ((ArrayList) term10564).add((Object)null);
        ((ArrayList) term10564).add((Object)null);
        ((ArrayList) term10564).add((Object)null);
        ((ArrayList) term10564).add((Object)null);
        ((ArrayList) term10564).add((Object)null);
        ((ArrayList) term10564).add((Object)null);
        ((ArrayList) term10564).add((Object)null);
        Object term10558 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term10558, term10558.getClass(), "parameters", term10559);
        setField(term10558, term10558.getClass(), "name", "");
        setField(term10558, term10558.getClass(), "type", "");
        setField(term10558, term10558.getClass(), "modifiers", term10564);
        ArrayList term10568 = new ArrayList();
        ((ArrayList) term10568).add((Object)null);
        ((ArrayList) term10568).add((Object)null);
        ((ArrayList) term10568).add((Object)null);
        ((ArrayList) term10568).add((Object)null);
        ((ArrayList) term10568).add((Object)null);
        ((ArrayList) term10568).add((Object)null);
        ((ArrayList) term10568).add((Object)null);
        ((ArrayList) term10568).add((Object)null);
        ((ArrayList) term10568).add((Object)null);
        ArrayList term10573 = new ArrayList();
        ((ArrayList) term10573).add((Object)null);
        ((ArrayList) term10573).add((Object)null);
        ((ArrayList) term10573).add((Object)null);
        ((ArrayList) term10573).add((Object)null);
        ((ArrayList) term10573).add((Object)null);
        ((ArrayList) term10573).add((Object)null);
        Object term10567 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term10567, term10567.getClass(), "parameters", term10568);
        setField(term10567, term10567.getClass(), "name", "");
        setField(term10567, term10567.getClass(), "type", "");
        setField(term10567, term10567.getClass(), "modifiers", term10573);
        ArrayList term10577 = new ArrayList();
        ((ArrayList) term10577).add((Object)null);
        ((ArrayList) term10577).add((Object)null);
        ((ArrayList) term10577).add((Object)null);
        ((ArrayList) term10577).add((Object)null);
        ((ArrayList) term10577).add((Object)null);
        ((ArrayList) term10577).add((Object)null);
        ((ArrayList) term10577).add((Object)null);
        ((ArrayList) term10577).add((Object)null);
        ((ArrayList) term10577).add((Object)null);
        ArrayList term10582 = new ArrayList();
        ((ArrayList) term10582).add((Object)null);
        ((ArrayList) term10582).add((Object)null);
        ((ArrayList) term10582).add((Object)null);
        ((ArrayList) term10582).add((Object)null);
        ((ArrayList) term10582).add((Object)null);
        ((ArrayList) term10582).add((Object)null);
        Object term10576 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term10576, term10576.getClass(), "parameters", term10577);
        setField(term10576, term10576.getClass(), "name", "");
        setField(term10576, term10576.getClass(), "type", "");
        setField(term10576, term10576.getClass(), "modifiers", term10582);
        ArrayList term10556 = new ArrayList();
        ((ArrayList) term10556).add(term10558);
        ((ArrayList) term10556).add(term10567);
        ((ArrayList) term10556).add(term10576);
        Class<? extends Object> term12120 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term12119 = ((Class) term12120).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term12119).setAccessible(true);
        Object enum30 = ((Field) term12119).get((Object) null);
        ArrayList term10629 = new ArrayList();
        ArrayList term10657 = new ArrayList();
        ((ArrayList) term10657).add((Object)null);
        term10521 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.ClassParser"));
        Object term10587 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term10521, term10521.getClass(), "modifiers", term10522);
        setField(term10521, term10521.getClass(), "attributes", term10546);
        setField(term10521, term10521.getClass(), "methods", term10556);
        setField(term10587, term10587.getClass(), "email", "MYWYUeLGOp");
        setField(term10587, term10587.getClass(), "password", "tsTGdgQYUL");
        setField(term10587, term10587.getClass(), "role", enum30);
        setField(term10587, term10587.getClass(), "projects", term10629);
        setField(term10587, term10587.getClass(), "id", "TtGbVmKcnX");
        setField(term10587, term10587.getClass(), "name", "GJVkUrCVdD");
        setField(term10587, term10587.getClass(), "relations", term10657);
        setField(term10521, term10521.getClass(), "account", term10587);
        setField(term10521, term10521.getClass(), "name", "zNdorvdUgu");
        ArrayList term10698 = new ArrayList();
        ArrayList term10726 = new ArrayList();
        ((ArrayList) term10726).add((Object)null);
        term10673 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term10673, term10673.getClass(), "email", "oPxuZbkYio");
        setField(term10673, term10673.getClass(), "password", "vKitydDVnM");
        setField(term10673, term10673.getClass(), "role", enum30);
        setField(term10673, term10673.getClass(), "projects", term10698);
        setField(term10673, term10673.getClass(), "id", "urCiQnUFBM");
        setField(term10673, term10673.getClass(), "name", "EKjQdtKxAM");
        setField(term10673, term10673.getClass(), "relations", term10726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.ClassParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term10673;
        callMethod(klass, "copy", argTypes, term10521, args);
    }

};


