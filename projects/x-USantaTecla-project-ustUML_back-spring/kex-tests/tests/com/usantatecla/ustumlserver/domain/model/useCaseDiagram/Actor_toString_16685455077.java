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

public class Actor_toString_16685455077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219;

    public Actor_toString_16685455077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term244 = new ArrayList();
        ((ArrayList) term244).add((Object)null);
        term219 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor"));
        setField(term219, term219.getClass(), "id", "RMFIsYGgne");
        setField(term219, term219.getClass(), "name", "NRdvgJlhkX");
        setField(term219, term219.getClass(), "relations", term244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term219, args);
    }

};


