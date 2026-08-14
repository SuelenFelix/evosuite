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

public class InterpretersStack_InterpreterCreator_create_11397023091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6284;
     Object term6417;

    public InterpretersStack_InterpreterCreator_create_11397023091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6495 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term6494 = ((Class) term6495).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term6494).setAccessible(true);
        Object enum16 = ((Field) term6494).get((Object) null);
        ArrayList term6327 = new ArrayList();
        ArrayList term6355 = new ArrayList();
        ArrayList term6385 = new ArrayList();
        ArrayList term6413 = new ArrayList();
        ((ArrayList) term6413).add((Object)null);
        ((ArrayList) term6413).add((Object)null);
        term6284 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.InterpretersStack$InterpreterCreator"));
        Object term6285 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        Object term6359 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term6360 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term6285, term6285.getClass(), "email", "fhkbdRViHi");
        setField(term6285, term6285.getClass(), "password", "uWHnvSvaPl");
        setField(term6285, term6285.getClass(), "role", enum16);
        setField(term6285, term6285.getClass(), "projects", term6327);
        setField(term6285, term6285.getClass(), "id", "kBdSllIBVz");
        setField(term6285, term6285.getClass(), "name", "TJmVBGfTML");
        setField(term6285, term6285.getClass(), "relations", term6355);
        setField(term6284, term6284.getClass(), "account", term6285);
        setField(term6359, term6359.getClass(), "memberPersistence", null);
        setField(term6360, term6360.getClass(), "email", "tPlsykYBqO");
        setField(term6360, term6360.getClass(), "password", "bLPjGVBhlX");
        setField(term6360, term6360.getClass(), "role", enum16);
        setField(term6360, term6360.getClass(), "projects", term6385);
        setField(term6360, term6360.getClass(), "id", "whBvTVIIlC");
        setField(term6360, term6360.getClass(), "name", "IgRJUzaCwW");
        setField(term6360, term6360.getClass(), "relations", term6413);
        setField(term6359, term6359.getClass(), "account", term6360);
        setField(term6359, term6359.getClass(), "member", null);
        setField(term6284, term6284.getClass(), "memberInterpreter", term6359);
        setField(term6284, term6284.getClass(), "this$0", null);
        ArrayList term6442 = new ArrayList();
        ArrayList term6470 = new ArrayList();
        ((ArrayList) term6470).add((Object)null);
        ((ArrayList) term6470).add((Object)null);
        ((ArrayList) term6470).add((Object)null);
        ((ArrayList) term6470).add((Object)null);
        ((ArrayList) term6470).add((Object)null);
        ((ArrayList) term6470).add((Object)null);
        ((ArrayList) term6470).add((Object)null);
        ((ArrayList) term6470).add((Object)null);
        term6417 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term6417, term6417.getClass(), "email", "JUmudUmaaV");
        setField(term6417, term6417.getClass(), "password", "KoyGrUJeJW");
        setField(term6417, term6417.getClass(), "role", enum16);
        setField(term6417, term6417.getClass(), "projects", term6442);
        setField(term6417, term6417.getClass(), "id", "HqBOwkVqjD");
        setField(term6417, term6417.getClass(), "name", "MAcUBcBckh");
        setField(term6417, term6417.getClass(), "relations", term6470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.InterpretersStack$InterpreterCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        argTypes[1] = Class.forName("com.usantatecla.ustumlserver.domain.model.Member");
        Object[] args = new Object[2];
        args[0] = term6417;
        args[1] = null;
        callMethod(klass, "create", argTypes, term6284, args);
    }

};


