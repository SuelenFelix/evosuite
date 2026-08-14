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

public class InterpretersStack_InterpreterCreator_visit_4590757892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6870;
     Object term7003;

    public InterpretersStack_InterpreterCreator_visit_4590757892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7081 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term7080 = ((Class) term7081).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term7080).setAccessible(true);
        Object enum17 = ((Field) term7080).get((Object) null);
        ArrayList term6913 = new ArrayList();
        ArrayList term6941 = new ArrayList();
        ((ArrayList) term6941).add((Object)null);
        ((ArrayList) term6941).add((Object)null);
        ((ArrayList) term6941).add((Object)null);
        ((ArrayList) term6941).add((Object)null);
        ((ArrayList) term6941).add((Object)null);
        ((ArrayList) term6941).add((Object)null);
        ArrayList term6971 = new ArrayList();
        ArrayList term6999 = new ArrayList();
        ((ArrayList) term6999).add((Object)null);
        ((ArrayList) term6999).add((Object)null);
        term6870 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.InterpretersStack$InterpreterCreator"));
        Object term6871 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        Object term6945 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term6946 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term6871, term6871.getClass(), "email", "oVgzLbrsFr");
        setField(term6871, term6871.getClass(), "password", "vQVyKLdtaz");
        setField(term6871, term6871.getClass(), "role", enum17);
        setField(term6871, term6871.getClass(), "projects", term6913);
        setField(term6871, term6871.getClass(), "id", "OWKQODBLzb");
        setField(term6871, term6871.getClass(), "name", "wGmYcqUkgE");
        setField(term6871, term6871.getClass(), "relations", term6941);
        setField(term6870, term6870.getClass(), "account", term6871);
        setField(term6945, term6945.getClass(), "memberPersistence", null);
        setField(term6946, term6946.getClass(), "email", "idgaQsnJpQ");
        setField(term6946, term6946.getClass(), "password", "VgZnGoIFwQ");
        setField(term6946, term6946.getClass(), "role", enum17);
        setField(term6946, term6946.getClass(), "projects", term6971);
        setField(term6946, term6946.getClass(), "id", "jUbSRrkrYZ");
        setField(term6946, term6946.getClass(), "name", "bWWfajKbEX");
        setField(term6946, term6946.getClass(), "relations", term6999);
        setField(term6945, term6945.getClass(), "account", term6946);
        setField(term6945, term6945.getClass(), "member", null);
        setField(term6870, term6870.getClass(), "memberInterpreter", term6945);
        setField(term6870, term6870.getClass(), "this$0", null);
        ArrayList term7028 = new ArrayList();
        ArrayList term7056 = new ArrayList();
        ((ArrayList) term7056).add((Object)null);
        term7003 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term7003, term7003.getClass(), "email", "cAPeiZHKGJ");
        setField(term7003, term7003.getClass(), "password", "LvJFtLBaxj");
        setField(term7003, term7003.getClass(), "role", enum17);
        setField(term7003, term7003.getClass(), "projects", term7028);
        setField(term7003, term7003.getClass(), "id", "PHvxnGHptP");
        setField(term7003, term7003.getClass(), "name", "TimdotUuNC");
        setField(term7003, term7003.getClass(), "relations", term7056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.InterpretersStack$InterpreterCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term7003;
        callMethod(klass, "visit", argTypes, term6870, args);
    }

};


