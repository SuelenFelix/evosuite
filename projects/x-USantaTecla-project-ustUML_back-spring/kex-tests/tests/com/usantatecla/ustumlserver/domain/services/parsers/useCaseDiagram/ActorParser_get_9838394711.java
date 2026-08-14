package com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram;

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
import static com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class ActorParser_get_9838394711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2137;

    public ActorParser_get_9838394711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2245 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term2244 = ((Class) term2245).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term2244).setAccessible(true);
        Object enum5 = ((Field) term2244).get((Object) null);
        ArrayList term2180 = new ArrayList();
        ArrayList term2208 = new ArrayList();
        ((ArrayList) term2208).add((Object)null);
        ((ArrayList) term2208).add((Object)null);
        term2137 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.ActorParser"));
        Object term2138 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term2138, term2138.getClass(), "email", "OclPbYPkcH");
        setField(term2138, term2138.getClass(), "password", "IoAlmYsBwc");
        setField(term2138, term2138.getClass(), "role", enum5);
        setField(term2138, term2138.getClass(), "projects", term2180);
        setField(term2138, term2138.getClass(), "id", "TEParAifyi");
        setField(term2138, term2138.getClass(), "name", "OWDIEULEFu");
        setField(term2138, term2138.getClass(), "relations", term2208);
        setField(term2137, term2137.getClass(), "account", term2138);
        setField(term2137, term2137.getClass(), "name", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.ActorParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "get", argTypes, term2137, args);
    }

};


