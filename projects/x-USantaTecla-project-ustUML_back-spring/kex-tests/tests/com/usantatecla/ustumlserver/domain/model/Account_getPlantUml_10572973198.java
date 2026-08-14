package com.usantatecla.ustumlserver.domain.model;

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
import static com.usantatecla.ustumlserver.domain.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Account_getPlantUml_10572973198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51495;

    public Account_getPlantUml_10572973198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51590 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term51589 = ((Class) term51590).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term51589).setAccessible(true);
        Object enum121 = ((Field) term51589).get((Object) null);
        ArrayList term51537 = new ArrayList();
        ArrayList term51565 = new ArrayList();
        ((ArrayList) term51565).add((Object)null);
        ((ArrayList) term51565).add((Object)null);
        ((ArrayList) term51565).add((Object)null);
        ((ArrayList) term51565).add((Object)null);
        ((ArrayList) term51565).add((Object)null);
        term51495 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term51495, term51495.getClass(), "email", "nwKkzNpzyC");
        setField(term51495, term51495.getClass(), "password", "CwrsdYnHpH");
        setField(term51495, term51495.getClass(), "role", enum121);
        setField(term51495, term51495.getClass(), "projects", term51537);
        setField(term51495, term51495.getClass(), "id", "jifjXNXluS");
        setField(term51495, term51495.getClass(), "name", "uDayZDXPOP");
        setField(term51495, term51495.getClass(), "relations", term51565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlantUml", argTypes, term51495, args);
    }

};


