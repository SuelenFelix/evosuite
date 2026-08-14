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

public class MemberInterpreter_isInvalidModifyKeys_2464039318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19199;

    public MemberInterpreter_isInvalidModifyKeys_2464039318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19295 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term19294 = ((Class) term19295).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term19294).setAccessible(true);
        Object enum45 = ((Field) term19294).get((Object) null);
        ArrayList term19242 = new ArrayList();
        ArrayList term19270 = new ArrayList();
        ((ArrayList) term19270).add((Object)null);
        ((ArrayList) term19270).add((Object)null);
        ((ArrayList) term19270).add((Object)null);
        ((ArrayList) term19270).add((Object)null);
        ((ArrayList) term19270).add((Object)null);
        term19199 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter"));
        Object term19200 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term19199, term19199.getClass(), "memberPersistence", null);
        setField(term19200, term19200.getClass(), "email", "GEJABPlHSI");
        setField(term19200, term19200.getClass(), "password", "aQFUvuaYxd");
        setField(term19200, term19200.getClass(), "role", enum45);
        setField(term19200, term19200.getClass(), "projects", term19242);
        setField(term19200, term19200.getClass(), "id", "zNFLXMifnS");
        setField(term19200, term19200.getClass(), "name", "HHQcYMSBVc");
        setField(term19200, term19200.getClass(), "relations", term19270);
        setField(term19199, term19199.getClass(), "account", term19200);
        setField(term19199, term19199.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.MemberInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isInvalidModifyKeys", argTypes, term19199, args);
    }

};


