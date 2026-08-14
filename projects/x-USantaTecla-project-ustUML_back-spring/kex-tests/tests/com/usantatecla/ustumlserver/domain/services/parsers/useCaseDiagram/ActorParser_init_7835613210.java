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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class ActorParser_init_7835613210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1747;

    public ActorParser_init_7835613210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1842 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term1841 = ((Class) term1842).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term1841).setAccessible(true);
        Object enum4 = ((Field) term1841).get((Object) null);
        ArrayList term1789 = new ArrayList();
        ArrayList term1817 = new ArrayList();
        ((ArrayList) term1817).add((Object)null);
        ((ArrayList) term1817).add((Object)null);
        ((ArrayList) term1817).add((Object)null);
        ((ArrayList) term1817).add((Object)null);
        ((ArrayList) term1817).add((Object)null);
        ((ArrayList) term1817).add((Object)null);
        term1747 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term1747, term1747.getClass(), "email", "eZFUvlxvGV");
        setField(term1747, term1747.getClass(), "password", "BYqFIqCKAV");
        setField(term1747, term1747.getClass(), "role", enum4);
        setField(term1747, term1747.getClass(), "projects", term1789);
        setField(term1747, term1747.getClass(), "id", "vrQLuWIDJX");
        setField(term1747, term1747.getClass(), "name", "flxyYxBRtu");
        setField(term1747, term1747.getClass(), "relations", term1817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.ActorParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term1747;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


