package com.usantatecla.ustumlserver.domain.services.parsers;

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
import static com.usantatecla.ustumlserver.domain.services.parsers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class MemberType_create_6800612104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum51;
     Object term19818;

    public MemberType_create_6800612104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19979 = Class.forName((String) "com.usantatecla.ustumlserver.domain.services.parsers.MemberType");
        Field term19978 = ((Class) term19979).getDeclaredField((String) "PACKAGE");
        ((Field) term19978).setAccessible(true);
        enum51 = ((Field) term19978).get((Object) null);
        Class<? extends Object> term20342 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term20341 = ((Class) term20342).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term20341).setAccessible(true);
        Object enum52 = ((Field) term20341).get((Object) null);
        ArrayList term19860 = new ArrayList();
        ArrayList term19888 = new ArrayList();
        ((ArrayList) term19888).add((Object)null);
        ((ArrayList) term19888).add((Object)null);
        ((ArrayList) term19888).add((Object)null);
        ((ArrayList) term19888).add((Object)null);
        ((ArrayList) term19888).add((Object)null);
        ((ArrayList) term19888).add((Object)null);
        ((ArrayList) term19888).add((Object)null);
        ((ArrayList) term19888).add((Object)null);
        term19818 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term19818, term19818.getClass(), "email", "aQFUvuaYxd");
        setField(term19818, term19818.getClass(), "password", "zNFLXMifnS");
        setField(term19818, term19818.getClass(), "role", enum52);
        setField(term19818, term19818.getClass(), "projects", term19860);
        setField(term19818, term19818.getClass(), "id", "HHQcYMSBVc");
        setField(term19818, term19818.getClass(), "name", "wdoqITnaAP");
        setField(term19818, term19818.getClass(), "relations", term19888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.MemberType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term19818;
        callMethod(klass, "create", argTypes, enum51, args);
    }

};


