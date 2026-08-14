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

public class InterfaceParser_copy_7593802302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15105;
     Object term15257;

    public InterfaceParser_copy_7593802302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15315 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term15314 = ((Class) term15315).getDeclaredField((String) "FINAL");
        ((Field) term15314).setAccessible(true);
        Object enum38 =  ((Field) term15314).get((Object) null);
        Class<? extends Object> term15652 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term15651 = ((Class) term15652).getDeclaredField((String) "PUBLIC");
        ((Field) term15651).setAccessible(true);
        Object enum39 =  ((Field) term15651).get((Object) null);
        Class<? extends Object> term15992 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term15991 = ((Class) term15992).getDeclaredField((String) "NULL");
        ((Field) term15991).setAccessible(true);
        Object enum40 =  ((Field) term15991).get((Object) null);
        Class<? extends Object> term16326 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term16325 = ((Class) term16326).getDeclaredField((String) "PROTECTED");
        ((Field) term16325).setAccessible(true);
        Object enum41 =  ((Field) term16325).get((Object) null);
        Class<? extends Object> term16675 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term16674 = ((Class) term16675).getDeclaredField((String) "FINAL");
        ((Field) term16674).setAccessible(true);
        Object enum42 =  ((Field) term16674).get((Object) null);
        ArrayList term15106 = new ArrayList();
        ((ArrayList) term15106).add(enum38);
        ((ArrayList) term15106).add(enum39);
        ((ArrayList) term15106).add(enum40);
        ((ArrayList) term15106).add(enum41);
        ((ArrayList) term15106).add(enum42);
        ArrayList term15138 = new ArrayList();
        ((ArrayList) term15138).add((Object)null);
        ((ArrayList) term15138).add((Object)null);
        ((ArrayList) term15138).add((Object)null);
        ((ArrayList) term15138).add((Object)null);
        ((ArrayList) term15138).add((Object)null);
        ((ArrayList) term15138).add((Object)null);
        Object term15135 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term15135, term15135.getClass(), "name", "");
        setField(term15135, term15135.getClass(), "type", "");
        setField(term15135, term15135.getClass(), "modifiers", term15138);
        ArrayList term15144 = new ArrayList();
        ((ArrayList) term15144).add((Object)null);
        Object term15141 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term15141, term15141.getClass(), "name", "");
        setField(term15141, term15141.getClass(), "type", "");
        setField(term15141, term15141.getClass(), "modifiers", term15144);
        ArrayList term15133 = new ArrayList();
        ((ArrayList) term15133).add(term15135);
        ((ArrayList) term15133).add(term15141);
        ArrayList term15152 = new ArrayList();
        ((ArrayList) term15152).add((Object)null);
        ((ArrayList) term15152).add((Object)null);
        ((ArrayList) term15152).add((Object)null);
        ((ArrayList) term15152).add((Object)null);
        ((ArrayList) term15152).add((Object)null);
        ((ArrayList) term15152).add((Object)null);
        ((ArrayList) term15152).add((Object)null);
        ArrayList term15157 = new ArrayList();
        ((ArrayList) term15157).add((Object)null);
        ((ArrayList) term15157).add((Object)null);
        ((ArrayList) term15157).add((Object)null);
        Object term15151 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term15151, term15151.getClass(), "parameters", term15152);
        setField(term15151, term15151.getClass(), "name", "");
        setField(term15151, term15151.getClass(), "type", "");
        setField(term15151, term15151.getClass(), "modifiers", term15157);
        ArrayList term15161 = new ArrayList();
        ((ArrayList) term15161).add((Object)null);
        ((ArrayList) term15161).add((Object)null);
        ((ArrayList) term15161).add((Object)null);
        ArrayList term15166 = new ArrayList();
        ((ArrayList) term15166).add((Object)null);
        ((ArrayList) term15166).add((Object)null);
        ((ArrayList) term15166).add((Object)null);
        ((ArrayList) term15166).add((Object)null);
        Object term15160 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term15160, term15160.getClass(), "parameters", term15161);
        setField(term15160, term15160.getClass(), "name", "");
        setField(term15160, term15160.getClass(), "type", "");
        setField(term15160, term15160.getClass(), "modifiers", term15166);
        ArrayList term15149 = new ArrayList();
        ((ArrayList) term15149).add(term15151);
        ((ArrayList) term15149).add(term15160);
        Class<? extends Object> term17032 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term17031 = ((Class) term17032).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term17031).setAccessible(true);
        Object enum43 = ((Field) term17031).get((Object) null);
        ArrayList term15213 = new ArrayList();
        ArrayList term15241 = new ArrayList();
        ((ArrayList) term15241).add((Object)null);
        ((ArrayList) term15241).add((Object)null);
        ((ArrayList) term15241).add((Object)null);
        ((ArrayList) term15241).add((Object)null);
        ((ArrayList) term15241).add((Object)null);
        ((ArrayList) term15241).add((Object)null);
        term15105 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.InterfaceParser"));
        Object term15171 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term15105, term15105.getClass(), "modifiers", term15106);
        setField(term15105, term15105.getClass(), "attributes", term15133);
        setField(term15105, term15105.getClass(), "methods", term15149);
        setField(term15171, term15171.getClass(), "email", "mhQDwIyrRi");
        setField(term15171, term15171.getClass(), "password", "HpZXWDPhlg");
        setField(term15171, term15171.getClass(), "role", enum43);
        setField(term15171, term15171.getClass(), "projects", term15213);
        setField(term15171, term15171.getClass(), "id", "lBOokzEPfe");
        setField(term15171, term15171.getClass(), "name", "dtGZCsKXbW");
        setField(term15171, term15171.getClass(), "relations", term15241);
        setField(term15105, term15105.getClass(), "account", term15171);
        setField(term15105, term15105.getClass(), "name", "bdyhHbDAmJ");
        ArrayList term15282 = new ArrayList();
        ArrayList term15310 = new ArrayList();
        ((ArrayList) term15310).add((Object)null);
        term15257 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term15257, term15257.getClass(), "email", "BBXiTNHqGE");
        setField(term15257, term15257.getClass(), "password", "IEYhJmgCVd");
        setField(term15257, term15257.getClass(), "role", enum43);
        setField(term15257, term15257.getClass(), "projects", term15282);
        setField(term15257, term15257.getClass(), "id", "KSJeYkkvpk");
        setField(term15257, term15257.getClass(), "name", "qUtkFGMNUV");
        setField(term15257, term15257.getClass(), "relations", term15310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.InterfaceParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term15257;
        callMethod(klass, "copy", argTypes, term15105, args);
    }

};


