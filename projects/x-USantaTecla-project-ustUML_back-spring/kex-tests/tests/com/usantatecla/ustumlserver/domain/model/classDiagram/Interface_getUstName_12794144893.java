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

public class Interface_getUstName_12794144893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59485;

    public Interface_getUstName_12794144893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59580 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term59579 = ((Class) term59580).getDeclaredField((String) "PROTECTED");
        ((Field) term59579).setAccessible(true);
        Object enum155 =  ((Field) term59579).get((Object) null);
        Class<? extends Object> term59929 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term59928 = ((Class) term59929).getDeclaredField((String) "STATIC");
        ((Field) term59928).setAccessible(true);
        Object enum156 =  ((Field) term59928).get((Object) null);
        Class<? extends Object> term60269 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term60268 = ((Class) term60269).getDeclaredField((String) "STATIC");
        ((Field) term60268).setAccessible(true);
        Object enum157 =  ((Field) term60268).get((Object) null);
        Class<? extends Object> term60609 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term60608 = ((Class) term60609).getDeclaredField((String) "PROTECTED");
        ((Field) term60608).setAccessible(true);
        Object enum158 =  ((Field) term60608).get((Object) null);
        ArrayList term59486 = new ArrayList();
        ((ArrayList) term59486).add(enum155);
        ((ArrayList) term59486).add(enum156);
        ((ArrayList) term59486).add(enum157);
        ((ArrayList) term59486).add(enum156);
        ((ArrayList) term59486).add(enum156);
        ((ArrayList) term59486).add(enum155);
        ((ArrayList) term59486).add(enum158);
        ArrayList term59515 = new ArrayList();
        ((ArrayList) term59515).add((Object)null);
        ((ArrayList) term59515).add((Object)null);
        ((ArrayList) term59515).add((Object)null);
        ((ArrayList) term59515).add((Object)null);
        Object term59512 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term59512, term59512.getClass(), "name", "");
        setField(term59512, term59512.getClass(), "type", "");
        setField(term59512, term59512.getClass(), "modifiers", term59515);
        ArrayList term59521 = new ArrayList();
        ((ArrayList) term59521).add((Object)null);
        ((ArrayList) term59521).add((Object)null);
        ((ArrayList) term59521).add((Object)null);
        ((ArrayList) term59521).add((Object)null);
        ((ArrayList) term59521).add((Object)null);
        ((ArrayList) term59521).add((Object)null);
        ((ArrayList) term59521).add((Object)null);
        Object term59518 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term59518, term59518.getClass(), "name", "");
        setField(term59518, term59518.getClass(), "type", "");
        setField(term59518, term59518.getClass(), "modifiers", term59521);
        ArrayList term59527 = new ArrayList();
        ((ArrayList) term59527).add((Object)null);
        ((ArrayList) term59527).add((Object)null);
        ((ArrayList) term59527).add((Object)null);
        ((ArrayList) term59527).add((Object)null);
        ((ArrayList) term59527).add((Object)null);
        Object term59524 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term59524, term59524.getClass(), "name", "");
        setField(term59524, term59524.getClass(), "type", "");
        setField(term59524, term59524.getClass(), "modifiers", term59527);
        ArrayList term59533 = new ArrayList();
        ((ArrayList) term59533).add((Object)null);
        ((ArrayList) term59533).add((Object)null);
        ((ArrayList) term59533).add((Object)null);
        ((ArrayList) term59533).add((Object)null);
        ((ArrayList) term59533).add((Object)null);
        ((ArrayList) term59533).add((Object)null);
        Object term59530 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term59530, term59530.getClass(), "name", "");
        setField(term59530, term59530.getClass(), "type", "");
        setField(term59530, term59530.getClass(), "modifiers", term59533);
        ArrayList term59510 = new ArrayList();
        ((ArrayList) term59510).add(term59512);
        ((ArrayList) term59510).add(term59518);
        ((ArrayList) term59510).add(term59524);
        ((ArrayList) term59510).add(term59530);
        ArrayList term59541 = new ArrayList();
        ((ArrayList) term59541).add((Object)null);
        ((ArrayList) term59541).add((Object)null);
        ArrayList term59546 = new ArrayList();
        ((ArrayList) term59546).add((Object)null);
        ((ArrayList) term59546).add((Object)null);
        Object term59540 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term59540, term59540.getClass(), "parameters", term59541);
        setField(term59540, term59540.getClass(), "name", "");
        setField(term59540, term59540.getClass(), "type", "");
        setField(term59540, term59540.getClass(), "modifiers", term59546);
        ArrayList term59538 = new ArrayList();
        ((ArrayList) term59538).add(term59540);
        ArrayList term59575 = new ArrayList();
        ((ArrayList) term59575).add((Object)null);
        ((ArrayList) term59575).add((Object)null);
        ((ArrayList) term59575).add((Object)null);
        ((ArrayList) term59575).add((Object)null);
        ((ArrayList) term59575).add((Object)null);
        term59485 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Interface"));
        setField(term59485, term59485.getClass(), "modifiers", term59486);
        setField(term59485, term59485.getClass(), "attributes", term59510);
        setField(term59485, term59485.getClass(), "methods", term59538);
        setField(term59485, term59485.getClass(), "id", "gDGZwlpOZx");
        setField(term59485, term59485.getClass(), "name", "gkDpxkHPDg");
        setField(term59485, term59485.getClass(), "relations", term59575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Interface");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUstName", argTypes, term59485, args);
    }

};


