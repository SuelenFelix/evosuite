package com.usantatecla.ustumlserver.domain.model.generators;

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
import static com.usantatecla.ustumlserver.domain.model.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class UstUMLGenerator_visit_9940001581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11433;
     Object term11435;

    public UstUMLGenerator_visit_9940001581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11433 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.UstUMLGenerator"));
        setIntField(term11433, term11433.getClass(), "depthLevel", -883034806);
        Class<? extends Object> term11530 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term11529 = ((Class) term11530).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term11529).setAccessible(true);
        Object enum28 = ((Field) term11529).get((Object) null);
        ArrayList term11477 = new ArrayList();
        ArrayList term11505 = new ArrayList();
        ((ArrayList) term11505).add((Object)null);
        term11435 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term11435, term11435.getClass(), "email", "CKWpJaaaxX");
        setField(term11435, term11435.getClass(), "password", "UBRmXJmfrt");
        setField(term11435, term11435.getClass(), "role", enum28);
        setField(term11435, term11435.getClass(), "projects", term11477);
        setField(term11435, term11435.getClass(), "id", "WZzvmIHhzZ");
        setField(term11435, term11435.getClass(), "name", "doQLHkjpNm");
        setField(term11435, term11435.getClass(), "relations", term11505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.UstUMLGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term11435;
        callMethod(klass, "visit", argTypes, term11433, args);
    }

};


