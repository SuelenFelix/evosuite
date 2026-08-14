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

public class PackageInterpreter_addCommandSections_8368374001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3150;

    public PackageInterpreter_addCommandSections_8368374001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3246 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term3245 = ((Class) term3246).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term3245).setAccessible(true);
        Object enum8 = ((Field) term3245).get((Object) null);
        ArrayList term3193 = new ArrayList();
        ArrayList term3221 = new ArrayList();
        ((ArrayList) term3221).add((Object)null);
        ((ArrayList) term3221).add((Object)null);
        ((ArrayList) term3221).add((Object)null);
        ((ArrayList) term3221).add((Object)null);
        ((ArrayList) term3221).add((Object)null);
        ((ArrayList) term3221).add((Object)null);
        ((ArrayList) term3221).add((Object)null);
        term3150 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.PackageInterpreter"));
        Object term3151 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term3150, term3150.getClass(), "withMembersMemberPersistence", null);
        setField(term3150, term3150.getClass(), "memberPersistence", null);
        setField(term3151, term3151.getClass(), "email", "AijpHYOFuy");
        setField(term3151, term3151.getClass(), "password", "SbAoxhfrkn");
        setField(term3151, term3151.getClass(), "role", enum8);
        setField(term3151, term3151.getClass(), "projects", term3193);
        setField(term3151, term3151.getClass(), "id", "kuTXqwMtDB");
        setField(term3151, term3151.getClass(), "name", "Ghbwtircqb");
        setField(term3151, term3151.getClass(), "relations", term3221);
        setField(term3150, term3150.getClass(), "account", term3151);
        setField(term3150, term3150.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.PackageInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addCommandSections", argTypes, term3150, args);
    }

};


