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

public class InterpretersStack_InterpreterCreator_visit_9478774203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7456;
     Object term7589;

    public InterpretersStack_InterpreterCreator_visit_9478774203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7643 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term7642 = ((Class) term7643).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term7642).setAccessible(true);
        Object enum18 = ((Field) term7642).get((Object) null);
        ArrayList term7499 = new ArrayList();
        ArrayList term7527 = new ArrayList();
        ((ArrayList) term7527).add((Object)null);
        ((ArrayList) term7527).add((Object)null);
        ((ArrayList) term7527).add((Object)null);
        ((ArrayList) term7527).add((Object)null);
        ((ArrayList) term7527).add((Object)null);
        ((ArrayList) term7527).add((Object)null);
        ((ArrayList) term7527).add((Object)null);
        ((ArrayList) term7527).add((Object)null);
        ((ArrayList) term7527).add((Object)null);
        ArrayList term7557 = new ArrayList();
        ArrayList term7585 = new ArrayList();
        ((ArrayList) term7585).add((Object)null);
        ((ArrayList) term7585).add((Object)null);
        ((ArrayList) term7585).add((Object)null);
        term7456 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.InterpretersStack$InterpreterCreator"));
        Object term7457 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        Object term7531 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term7532 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term7457, term7457.getClass(), "email", "PkWMRdJcBb");
        setField(term7457, term7457.getClass(), "password", "jSpAteRute");
        setField(term7457, term7457.getClass(), "role", enum18);
        setField(term7457, term7457.getClass(), "projects", term7499);
        setField(term7457, term7457.getClass(), "id", "swZVeJAxjt");
        setField(term7457, term7457.getClass(), "name", "xOcJIiQQDu");
        setField(term7457, term7457.getClass(), "relations", term7527);
        setField(term7456, term7456.getClass(), "account", term7457);
        setField(term7531, term7531.getClass(), "memberPersistence", null);
        setField(term7532, term7532.getClass(), "email", "GVizqqzXpy");
        setField(term7532, term7532.getClass(), "password", "JqXGgAhZPl");
        setField(term7532, term7532.getClass(), "role", enum18);
        setField(term7532, term7532.getClass(), "projects", term7557);
        setField(term7532, term7532.getClass(), "id", "jiKYgYHqIS");
        setField(term7532, term7532.getClass(), "name", "DfISiziTgG");
        setField(term7532, term7532.getClass(), "relations", term7585);
        setField(term7531, term7531.getClass(), "account", term7532);
        setField(term7531, term7531.getClass(), "member", null);
        setField(term7456, term7456.getClass(), "memberInterpreter", term7531);
        setField(term7456, term7456.getClass(), "this$0", null);
        ArrayList term7590 = new ArrayList();
        ((ArrayList) term7590).add((Object)null);
        ((ArrayList) term7590).add((Object)null);
        ((ArrayList) term7590).add((Object)null);
        ((ArrayList) term7590).add((Object)null);
        ((ArrayList) term7590).add((Object)null);
        ArrayList term7618 = new ArrayList();
        ((ArrayList) term7618).add((Object)null);
        ((ArrayList) term7618).add((Object)null);
        ((ArrayList) term7618).add((Object)null);
        ((ArrayList) term7618).add((Object)null);
        ((ArrayList) term7618).add((Object)null);
        ((ArrayList) term7618).add((Object)null);
        term7589 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term7589, term7589.getClass(), "members", term7590);
        setField(term7589, term7589.getClass(), "id", "XqgfKFvPSD");
        setField(term7589, term7589.getClass(), "name", "JiVRgTZvKc");
        setField(term7589, term7589.getClass(), "relations", term7618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.InterpretersStack$InterpreterCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Object[] args = new Object[1];
        args[0] = term7589;
        callMethod(klass, "visit", argTypes, term7456, args);
    }

};


