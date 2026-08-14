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
import java.lang.Object;

public class Enum_addObject_12292183241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62669;

    public Enum_addObject_12292183241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term62670 = new ArrayList();
        ((ArrayList) term62670).add("sZyAwmdGVS");
        ((ArrayList) term62670).add("VoKhXiLAaW");
        ((ArrayList) term62670).add("CaalXzRXQI");
        ((ArrayList) term62670).add("eRBnKPjyVg");
        ArrayList term62722 = new ArrayList();
        ArrayList term62731 = new ArrayList();
        ((ArrayList) term62731).add((Object)null);
        ((ArrayList) term62731).add((Object)null);
        ((ArrayList) term62731).add((Object)null);
        ((ArrayList) term62731).add((Object)null);
        ((ArrayList) term62731).add((Object)null);
        ((ArrayList) term62731).add((Object)null);
        ((ArrayList) term62731).add((Object)null);
        ((ArrayList) term62731).add((Object)null);
        ((ArrayList) term62731).add((Object)null);
        Object term62728 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term62728, term62728.getClass(), "name", "");
        setField(term62728, term62728.getClass(), "type", "");
        setField(term62728, term62728.getClass(), "modifiers", term62731);
        ArrayList term62737 = new ArrayList();
        Object term62734 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term62734, term62734.getClass(), "name", "");
        setField(term62734, term62734.getClass(), "type", "");
        setField(term62734, term62734.getClass(), "modifiers", term62737);
        ArrayList term62726 = new ArrayList();
        ((ArrayList) term62726).add(term62728);
        ((ArrayList) term62726).add(term62734);
        ArrayList term62745 = new ArrayList();
        ((ArrayList) term62745).add((Object)null);
        ArrayList term62750 = new ArrayList();
        ((ArrayList) term62750).add((Object)null);
        ((ArrayList) term62750).add((Object)null);
        ((ArrayList) term62750).add((Object)null);
        ((ArrayList) term62750).add((Object)null);
        ((ArrayList) term62750).add((Object)null);
        ((ArrayList) term62750).add((Object)null);
        ((ArrayList) term62750).add((Object)null);
        Object term62744 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term62744, term62744.getClass(), "parameters", term62745);
        setField(term62744, term62744.getClass(), "name", "");
        setField(term62744, term62744.getClass(), "type", "");
        setField(term62744, term62744.getClass(), "modifiers", term62750);
        ArrayList term62754 = new ArrayList();
        ((ArrayList) term62754).add((Object)null);
        ((ArrayList) term62754).add((Object)null);
        ((ArrayList) term62754).add((Object)null);
        ((ArrayList) term62754).add((Object)null);
        ArrayList term62759 = new ArrayList();
        ((ArrayList) term62759).add((Object)null);
        ((ArrayList) term62759).add((Object)null);
        ((ArrayList) term62759).add((Object)null);
        Object term62753 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term62753, term62753.getClass(), "parameters", term62754);
        setField(term62753, term62753.getClass(), "name", "");
        setField(term62753, term62753.getClass(), "type", "");
        setField(term62753, term62753.getClass(), "modifiers", term62759);
        ArrayList term62742 = new ArrayList();
        ((ArrayList) term62742).add(term62744);
        ((ArrayList) term62742).add(term62753);
        ArrayList term62788 = new ArrayList();
        ((ArrayList) term62788).add((Object)null);
        ((ArrayList) term62788).add((Object)null);
        ((ArrayList) term62788).add((Object)null);
        ((ArrayList) term62788).add((Object)null);
        ((ArrayList) term62788).add((Object)null);
        ((ArrayList) term62788).add((Object)null);
        ((ArrayList) term62788).add((Object)null);
        ((ArrayList) term62788).add((Object)null);
        ((ArrayList) term62788).add((Object)null);
        term62669 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum"));
        setField(term62669, term62669.getClass(), "objects", term62670);
        setField(term62669, term62669.getClass(), "modifiers", term62722);
        setField(term62669, term62669.getClass(), "attributes", term62726);
        setField(term62669, term62669.getClass(), "methods", term62742);
        setField(term62669, term62669.getClass(), "id", "VygCEWaefB");
        setField(term62669, term62669.getClass(), "name", "PqhYfEyDDA");
        setField(term62669, term62669.getClass(), "relations", term62788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fSLHLeuNoa";
        callMethod(klass, "addObject", argTypes, term62669, args);
    }

};


