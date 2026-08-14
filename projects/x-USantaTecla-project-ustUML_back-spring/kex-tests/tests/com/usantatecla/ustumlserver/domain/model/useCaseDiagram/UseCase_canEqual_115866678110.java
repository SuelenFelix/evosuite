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

public class UseCase_canEqual_115866678110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943;
     Object term972;

    public UseCase_canEqual_115866678110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term968 = new ArrayList();
        ((ArrayList) term968).add((Object)null);
        ((ArrayList) term968).add((Object)null);
        ((ArrayList) term968).add((Object)null);
        ((ArrayList) term968).add((Object)null);
        ((ArrayList) term968).add((Object)null);
        ((ArrayList) term968).add((Object)null);
        ((ArrayList) term968).add((Object)null);
        ((ArrayList) term968).add((Object)null);
        term943 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase"));
        setField(term943, term943.getClass(), "id", "nyiiPDVjAc");
        setField(term943, term943.getClass(), "name", "aKnKipADSo");
        setField(term943, term943.getClass(), "relations", term968);
        term972 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term972;
        callMethod(klass, "canEqual", argTypes, term943, args);
    }

};


