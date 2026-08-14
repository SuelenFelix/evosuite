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

public class EnumInterpreter_modifyCommandSections_6752022465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1972;

    public EnumInterpreter_modifyCommandSections_6752022465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2068 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term2067 = ((Class) term2068).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term2067).setAccessible(true);
        Object enum5 = ((Field) term2067).get((Object) null);
        ArrayList term2015 = new ArrayList();
        ArrayList term2043 = new ArrayList();
        ((ArrayList) term2043).add((Object)null);
        ((ArrayList) term2043).add((Object)null);
        ((ArrayList) term2043).add((Object)null);
        ((ArrayList) term2043).add((Object)null);
        ((ArrayList) term2043).add((Object)null);
        ((ArrayList) term2043).add((Object)null);
        term1972 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.EnumInterpreter"));
        Object term1973 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term1972, term1972.getClass(), "memberPersistence", null);
        setField(term1973, term1973.getClass(), "email", "hNxWaHcfhY");
        setField(term1973, term1973.getClass(), "password", "RkybSrpybU");
        setField(term1973, term1973.getClass(), "role", enum5);
        setField(term1973, term1973.getClass(), "projects", term2015);
        setField(term1973, term1973.getClass(), "id", "xOEqzGAmDU");
        setField(term1973, term1973.getClass(), "name", "eZFUvlxvGV");
        setField(term1973, term1973.getClass(), "relations", term2043);
        setField(term1972, term1972.getClass(), "account", term1973);
        setField(term1972, term1972.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.EnumInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "modifyCommandSections", argTypes, term1972, args);
    }

};


