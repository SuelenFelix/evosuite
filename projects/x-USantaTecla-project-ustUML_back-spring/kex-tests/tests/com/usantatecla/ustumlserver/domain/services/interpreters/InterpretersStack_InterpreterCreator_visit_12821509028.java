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

public class InterpretersStack_InterpreterCreator_visit_12821509028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14957;
     Object term15090;

    public InterpretersStack_InterpreterCreator_visit_12821509028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15140 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term15139 = ((Class) term15140).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term15139).setAccessible(true);
        Object enum35 = ((Field) term15139).get((Object) null);
        ArrayList term15000 = new ArrayList();
        ArrayList term15028 = new ArrayList();
        ((ArrayList) term15028).add((Object)null);
        ((ArrayList) term15028).add((Object)null);
        ((ArrayList) term15028).add((Object)null);
        ArrayList term15058 = new ArrayList();
        ArrayList term15086 = new ArrayList();
        ((ArrayList) term15086).add((Object)null);
        ((ArrayList) term15086).add((Object)null);
        term14957 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.InterpretersStack$InterpreterCreator"));
        Object term14958 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        Object term15032 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term15033 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term14958, term14958.getClass(), "email", "ZKMLioamsY");
        setField(term14958, term14958.getClass(), "password", "WVbxuoDBcn");
        setField(term14958, term14958.getClass(), "role", enum35);
        setField(term14958, term14958.getClass(), "projects", term15000);
        setField(term14958, term14958.getClass(), "id", "pvDEABOxLt");
        setField(term14958, term14958.getClass(), "name", "beAMpkroCQ");
        setField(term14958, term14958.getClass(), "relations", term15028);
        setField(term14957, term14957.getClass(), "account", term14958);
        setField(term15032, term15032.getClass(), "memberPersistence", null);
        setField(term15033, term15033.getClass(), "email", "uSUvKAyuvd");
        setField(term15033, term15033.getClass(), "password", "onQLVONGuf");
        setField(term15033, term15033.getClass(), "role", enum35);
        setField(term15033, term15033.getClass(), "projects", term15058);
        setField(term15033, term15033.getClass(), "id", "SOrEHbcbmn");
        setField(term15033, term15033.getClass(), "name", "bnsyeQXFdu");
        setField(term15033, term15033.getClass(), "relations", term15086);
        setField(term15032, term15032.getClass(), "account", term15033);
        setField(term15032, term15032.getClass(), "member", null);
        setField(term14957, term14957.getClass(), "memberInterpreter", term15032);
        setField(term14957, term14957.getClass(), "this$0", null);
        ArrayList term15115 = new ArrayList();
        ((ArrayList) term15115).add((Object)null);
        ((ArrayList) term15115).add((Object)null);
        term15090 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor"));
        setField(term15090, term15090.getClass(), "id", "BwtdjiefJn");
        setField(term15090, term15090.getClass(), "name", "jDmhBrIoDa");
        setField(term15090, term15090.getClass(), "relations", term15115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.InterpretersStack$InterpreterCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor");
        Object[] args = new Object[1];
        args[0] = term15090;
        callMethod(klass, "visit", argTypes, term14957, args);
    }

};


