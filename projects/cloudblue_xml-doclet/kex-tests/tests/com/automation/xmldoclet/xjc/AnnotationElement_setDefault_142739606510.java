package com.automation.xmldoclet.xjc;

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
import static com.automation.xmldoclet.xjc.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class AnnotationElement_setDefault_142739606510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7054;

    public AnnotationElement_setDefault_142739606510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7057 = new ArrayList();
        ((ArrayList) term7057).add((Object)null);
        ((ArrayList) term7057).add((Object)null);
        ((ArrayList) term7057).add((Object)null);
        ((ArrayList) term7057).add((Object)null);
        ((ArrayList) term7057).add((Object)null);
        ArrayList term7061 = new ArrayList();
        ((ArrayList) term7061).add((Object)null);
        ((ArrayList) term7061).add((Object)null);
        ((ArrayList) term7061).add((Object)null);
        Object term7067 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term7067, term7067.getClass(), "wildcard", null);
        setField(term7067, term7067.getClass(), "generic", null);
        setField(term7067, term7067.getClass(), "qualified", null);
        setField(term7067, term7067.getClass(), "dimension", null);
        Object term7068 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term7068, term7068.getClass(), "wildcard", null);
        setField(term7068, term7068.getClass(), "generic", null);
        setField(term7068, term7068.getClass(), "qualified", null);
        setField(term7068, term7068.getClass(), "dimension", null);
        Object term7069 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term7069, term7069.getClass(), "wildcard", null);
        setField(term7069, term7069.getClass(), "generic", null);
        setField(term7069, term7069.getClass(), "qualified", null);
        setField(term7069, term7069.getClass(), "dimension", null);
        Object term7070 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term7070, term7070.getClass(), "wildcard", null);
        setField(term7070, term7070.getClass(), "generic", null);
        setField(term7070, term7070.getClass(), "qualified", null);
        setField(term7070, term7070.getClass(), "dimension", null);
        Object term7071 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term7071, term7071.getClass(), "wildcard", null);
        setField(term7071, term7071.getClass(), "generic", null);
        setField(term7071, term7071.getClass(), "qualified", null);
        setField(term7071, term7071.getClass(), "dimension", null);
        Object term7072 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term7072, term7072.getClass(), "wildcard", null);
        setField(term7072, term7072.getClass(), "generic", null);
        setField(term7072, term7072.getClass(), "qualified", null);
        setField(term7072, term7072.getClass(), "dimension", null);
        ArrayList term7065 = new ArrayList();
        ((ArrayList) term7065).add(term7067);
        ((ArrayList) term7065).add(term7068);
        ((ArrayList) term7065).add(term7067);
        ((ArrayList) term7065).add(term7069);
        ((ArrayList) term7065).add(term7070);
        ((ArrayList) term7065).add(term7071);
        ((ArrayList) term7065).add(term7070);
        ((ArrayList) term7065).add(term7072);
        ((ArrayList) term7065).add(term7072);
        term7054 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term7055 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term7056 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term7056, term7056.getClass(), "extendsBound", term7057);
        setField(term7056, term7056.getClass(), "superBound", term7061);
        setField(term7055, term7055.getClass(), "wildcard", term7056);
        setField(term7055, term7055.getClass(), "generic", term7065);
        setField(term7055, term7055.getClass(), "qualified", "hJCqADrhuV");
        setField(term7055, term7055.getClass(), "dimension", "RyPUBlRpNZ");
        setField(term7054, term7054.getClass(), "type", term7055);
        setField(term7054, term7054.getClass(), "name", "ardfVpCueq");
        setField(term7054, term7054.getClass(), "qualified", "wEYAmGJIEF");
        setField(term7054, term7054.getClass(), "_default", "iXEhfXJomO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KEoUMzNdMA";
        callMethod(klass, "setDefault", argTypes, term7054, args);
    }

};


