package com.usantatecla.ustumlserver.domain.services.interpreters;

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
import static com.usantatecla.ustumlserver.domain.services.interpreters.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class InterpretersStack_InterpreterCreator_visit_19492131009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15495;
     Object term15628;

    public InterpretersStack_InterpreterCreator_visit_19492131009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15678 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term15677 = ((Class) term15678).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term15677).setAccessible(true);
        Object enum36 = ((Field) term15677).get((Object) null);
        ArrayList term15538 = new ArrayList();
        ArrayList term15566 = new ArrayList();
        ((ArrayList) term15566).add((Object)null);
        ((ArrayList) term15566).add((Object)null);
        ((ArrayList) term15566).add((Object)null);
        ((ArrayList) term15566).add((Object)null);
        ((ArrayList) term15566).add((Object)null);
        ArrayList term15596 = new ArrayList();
        ArrayList term15624 = new ArrayList();
        ((ArrayList) term15624).add((Object)null);
        ((ArrayList) term15624).add((Object)null);
        ((ArrayList) term15624).add((Object)null);
        ((ArrayList) term15624).add((Object)null);
        term15495 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.InterpretersStack$InterpreterCreator"));
        Object term15496 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        Object term15570 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term15571 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term15496, term15496.getClass(), "email", "SPtPatHeOm");
        setField(term15496, term15496.getClass(), "password", "ywmcuThdfL");
        setField(term15496, term15496.getClass(), "role", enum36);
        setField(term15496, term15496.getClass(), "projects", term15538);
        setField(term15496, term15496.getClass(), "id", "GBOEuByOfr");
        setField(term15496, term15496.getClass(), "name", "NHbOFFjyVK");
        setField(term15496, term15496.getClass(), "relations", term15566);
        setField(term15495, term15495.getClass(), "account", term15496);
        setField(term15570, term15570.getClass(), "memberPersistence", null);
        setField(term15571, term15571.getClass(), "email", "zaloBqlrSo");
        setField(term15571, term15571.getClass(), "password", "vvoLrMGCoN");
        setField(term15571, term15571.getClass(), "role", enum36);
        setField(term15571, term15571.getClass(), "projects", term15596);
        setField(term15571, term15571.getClass(), "id", "pXdglvyrQe");
        setField(term15571, term15571.getClass(), "name", "OcfNzHYdki");
        setField(term15571, term15571.getClass(), "relations", term15624);
        setField(term15570, term15570.getClass(), "account", term15571);
        setField(term15570, term15570.getClass(), "member", null);
        setField(term15495, term15495.getClass(), "memberInterpreter", term15570);
        setField(term15495, term15495.getClass(), "this$0", null);
        ArrayList term15653 = new ArrayList();
        ((ArrayList) term15653).add((Object)null);
        ((ArrayList) term15653).add((Object)null);
        ((ArrayList) term15653).add((Object)null);
        ((ArrayList) term15653).add((Object)null);
        ((ArrayList) term15653).add((Object)null);
        ((ArrayList) term15653).add((Object)null);
        ((ArrayList) term15653).add((Object)null);
        ((ArrayList) term15653).add((Object)null);
        term15628 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase"));
        setField(term15628, term15628.getClass(), "id", "uPuCVuZYOI");
        setField(term15628, term15628.getClass(), "name", "TweMFhxNdj");
        setField(term15628, term15628.getClass(), "relations", term15653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.InterpretersStack$InterpreterCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase");
        Object[] args = new Object[1];
        args[0] = term15628;
        callMethod(klass, "visit", argTypes, term15495, args);
    }

};


