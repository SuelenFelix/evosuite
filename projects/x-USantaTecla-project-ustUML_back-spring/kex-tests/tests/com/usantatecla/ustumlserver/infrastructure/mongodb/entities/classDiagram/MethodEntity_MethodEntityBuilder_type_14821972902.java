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

public class MethodEntity_MethodEntityBuilder_type_14821972902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86728;

    public MethodEntity_MethodEntityBuilder_type_14821972902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86824 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term86823 = ((Class) term86824).getDeclaredField((String) "PUBLIC");
        ((Field) term86823).setAccessible(true);
        Object enum223 =  ((Field) term86823).get((Object) null);
        Class<? extends Object> term87164 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term87163 = ((Class) term87164).getDeclaredField((String) "ABSTRACT");
        ((Field) term87163).setAccessible(true);
        Object enum224 =  ((Field) term87163).get((Object) null);
        Class<? extends Object> term87510 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term87509 = ((Class) term87510).getDeclaredField((String) "FINAL");
        ((Field) term87509).setAccessible(true);
        Object enum225 =  ((Field) term87509).get((Object) null);
        Class<? extends Object> term87847 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term87846 = ((Class) term87847).getDeclaredField((String) "FINAL");
        ((Field) term87846).setAccessible(true);
        Object enum226 =  ((Field) term87846).get((Object) null);
        ArrayList term86753 = new ArrayList();
        ((ArrayList) term86753).add(enum223);
        ((ArrayList) term86753).add(enum224);
        ((ArrayList) term86753).add(enum225);
        ((ArrayList) term86753).add(enum226);
        Object term86777 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term86777, term86777.getClass(), "name", "");
        setField(term86777, term86777.getClass(), "type", "");
        Object term86780 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term86780, term86780.getClass(), "name", "");
        setField(term86780, term86780.getClass(), "type", "");
        Object term86783 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term86783, term86783.getClass(), "name", "");
        setField(term86783, term86783.getClass(), "type", "");
        Object term86786 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term86786, term86786.getClass(), "name", "");
        setField(term86786, term86786.getClass(), "type", "");
        ArrayList term86775 = new ArrayList();
        ((ArrayList) term86775).add(term86777);
        ((ArrayList) term86775).add(term86780);
        ((ArrayList) term86775).add(term86783);
        ((ArrayList) term86775).add(term86786);
        term86728 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity$MethodEntityBuilder"));
        setField(term86728, term86728.getClass(), "name", "fNzFTiRCjp");
        setField(term86728, term86728.getClass(), "type", "yaCGGogKro");
        setField(term86728, term86728.getClass(), "modifiers", term86753);
        setField(term86728, term86728.getClass(), "parametersEntities", term86775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity$MethodEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "frPMFqGmrE";
        callMethod(klass, "type", argTypes, term86728, args);
    }

};


