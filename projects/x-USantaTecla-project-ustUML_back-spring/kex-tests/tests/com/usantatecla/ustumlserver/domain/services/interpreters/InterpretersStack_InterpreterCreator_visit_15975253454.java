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

public class InterpretersStack_InterpreterCreator_visit_15975253454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7998;
     Object term8131;

    public InterpretersStack_InterpreterCreator_visit_15975253454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8185 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term8184 = ((Class) term8185).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term8184).setAccessible(true);
        Object enum19 = ((Field) term8184).get((Object) null);
        ArrayList term8041 = new ArrayList();
        ArrayList term8069 = new ArrayList();
        ((ArrayList) term8069).add((Object)null);
        ((ArrayList) term8069).add((Object)null);
        ((ArrayList) term8069).add((Object)null);
        ((ArrayList) term8069).add((Object)null);
        ((ArrayList) term8069).add((Object)null);
        ArrayList term8099 = new ArrayList();
        ArrayList term8127 = new ArrayList();
        ((ArrayList) term8127).add((Object)null);
        ((ArrayList) term8127).add((Object)null);
        ((ArrayList) term8127).add((Object)null);
        term7998 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.InterpretersStack$InterpreterCreator"));
        Object term7999 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        Object term8073 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term8074 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term7999, term7999.getClass(), "email", "XPKmummaqg");
        setField(term7999, term7999.getClass(), "password", "BKLfkLiZTH");
        setField(term7999, term7999.getClass(), "role", enum19);
        setField(term7999, term7999.getClass(), "projects", term8041);
        setField(term7999, term7999.getClass(), "id", "SPpkrGcPRr");
        setField(term7999, term7999.getClass(), "name", "sEccwbJKYE");
        setField(term7999, term7999.getClass(), "relations", term8069);
        setField(term7998, term7998.getClass(), "account", term7999);
        setField(term8073, term8073.getClass(), "memberPersistence", null);
        setField(term8074, term8074.getClass(), "email", "AWRooQKkdW");
        setField(term8074, term8074.getClass(), "password", "vjxIhXHxGR");
        setField(term8074, term8074.getClass(), "role", enum19);
        setField(term8074, term8074.getClass(), "projects", term8099);
        setField(term8074, term8074.getClass(), "id", "QXzGXbEXMu");
        setField(term8074, term8074.getClass(), "name", "qxSDVejjiY");
        setField(term8074, term8074.getClass(), "relations", term8127);
        setField(term8073, term8073.getClass(), "account", term8074);
        setField(term8073, term8073.getClass(), "member", null);
        setField(term7998, term7998.getClass(), "memberInterpreter", term8073);
        setField(term7998, term7998.getClass(), "this$0", null);
        ArrayList term8132 = new ArrayList();
        ((ArrayList) term8132).add((Object)null);
        ((ArrayList) term8132).add((Object)null);
        ((ArrayList) term8132).add((Object)null);
        ((ArrayList) term8132).add((Object)null);
        ((ArrayList) term8132).add((Object)null);
        ((ArrayList) term8132).add((Object)null);
        ((ArrayList) term8132).add((Object)null);
        ArrayList term8160 = new ArrayList();
        ((ArrayList) term8160).add((Object)null);
        ((ArrayList) term8160).add((Object)null);
        term8131 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term8131, term8131.getClass(), "members", term8132);
        setField(term8131, term8131.getClass(), "id", "xBsXSDjXYK");
        setField(term8131, term8131.getClass(), "name", "sEnIVFtZuQ");
        setField(term8131, term8131.getClass(), "relations", term8160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.InterpretersStack$InterpreterCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Project");
        Object[] args = new Object[1];
        args[0] = term8131;
        callMethod(klass, "visit", argTypes, term7998, args);
    }

};


