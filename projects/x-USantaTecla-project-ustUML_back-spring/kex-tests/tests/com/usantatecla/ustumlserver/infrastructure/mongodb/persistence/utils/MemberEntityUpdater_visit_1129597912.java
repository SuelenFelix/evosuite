package com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class MemberEntityUpdater_visit_1129597912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9681;

    public MemberEntityUpdater_visit_1129597912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9776 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term9775 = ((Class) term9776).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term9775).setAccessible(true);
        Object enum21 = ((Field) term9775).get((Object) null);
        ArrayList term9723 = new ArrayList();
        ArrayList term9751 = new ArrayList();
        ((ArrayList) term9751).add((Object)null);
        term9681 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term9681, term9681.getClass(), "email", "EdPAvpluZg");
        setField(term9681, term9681.getClass(), "password", "DzHVBMqWtE");
        setField(term9681, term9681.getClass(), "role", enum21);
        setField(term9681, term9681.getClass(), "projects", term9723);
        setField(term9681, term9681.getClass(), "id", "THZSpzBRYP");
        setField(term9681, term9681.getClass(), "name", "ZfBIVGBQOE");
        setField(term9681, term9681.getClass(), "relations", term9751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.MemberEntityUpdater");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term9681;
        callMethod(klass, "visit", argTypes, null, args);
    }

};


