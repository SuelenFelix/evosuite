package com.usantatecla.ustumlserver.domain.model.useCaseDiagram;

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
import static com.usantatecla.ustumlserver.domain.model.useCaseDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Actor_equals_7090991429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268;
     Object term297;

    public Actor_equals_7090991429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term293 = new ArrayList();
        ((ArrayList) term293).add((Object)null);
        ((ArrayList) term293).add((Object)null);
        ((ArrayList) term293).add((Object)null);
        ((ArrayList) term293).add((Object)null);
        ((ArrayList) term293).add((Object)null);
        ((ArrayList) term293).add((Object)null);
        term268 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor"));
        setField(term268, term268.getClass(), "id", "uuaPigETmJ");
        setField(term268, term268.getClass(), "name", "MxlszYVzRf");
        setField(term268, term268.getClass(), "relations", term293);
        term297 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term297;
        callMethod(klass, "equals", argTypes, term268, args);
    }

};


