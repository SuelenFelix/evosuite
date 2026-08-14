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

public class ActorParser_createActor_1260575272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2550;

    public ActorParser_createActor_1260575272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2658 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term2657 = ((Class) term2658).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term2657).setAccessible(true);
        Object enum6 = ((Field) term2657).get((Object) null);
        ArrayList term2593 = new ArrayList();
        ArrayList term2621 = new ArrayList();
        ((ArrayList) term2621).add((Object)null);
        ((ArrayList) term2621).add((Object)null);
        ((ArrayList) term2621).add((Object)null);
        ((ArrayList) term2621).add((Object)null);
        ((ArrayList) term2621).add((Object)null);
        ((ArrayList) term2621).add((Object)null);
        term2550 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.ActorParser"));
        Object term2551 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term2551, term2551.getClass(), "email", "AijpHYOFuy");
        setField(term2551, term2551.getClass(), "password", "SbAoxhfrkn");
        setField(term2551, term2551.getClass(), "role", enum6);
        setField(term2551, term2551.getClass(), "projects", term2593);
        setField(term2551, term2551.getClass(), "id", "kuTXqwMtDB");
        setField(term2551, term2551.getClass(), "name", "Ghbwtircqb");
        setField(term2551, term2551.getClass(), "relations", term2621);
        setField(term2550, term2550.getClass(), "account", term2551);
        setField(term2550, term2550.getClass(), "name", "xrwlQZdwCp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.ActorParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createActor", argTypes, term2550, args);
    }

};


