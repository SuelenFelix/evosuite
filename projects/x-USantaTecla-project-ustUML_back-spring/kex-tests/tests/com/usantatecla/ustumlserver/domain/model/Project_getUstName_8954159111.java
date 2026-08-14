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
import java.util.ArrayList;
import java.lang.Object;

public class Project_getUstName_8954159111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85388;

    public Project_getUstName_8954159111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term85389 = new ArrayList();
        ((ArrayList) term85389).add((Object)null);
        ((ArrayList) term85389).add((Object)null);
        ((ArrayList) term85389).add((Object)null);
        ((ArrayList) term85389).add((Object)null);
        ((ArrayList) term85389).add((Object)null);
        ((ArrayList) term85389).add((Object)null);
        ArrayList term85417 = new ArrayList();
        ((ArrayList) term85417).add((Object)null);
        ((ArrayList) term85417).add((Object)null);
        ((ArrayList) term85417).add((Object)null);
        ((ArrayList) term85417).add((Object)null);
        ((ArrayList) term85417).add((Object)null);
        term85388 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term85388, term85388.getClass(), "members", term85389);
        setField(term85388, term85388.getClass(), "id", "SUDRrjpChc");
        setField(term85388, term85388.getClass(), "name", "pmpprxfFwy");
        setField(term85388, term85388.getClass(), "relations", term85417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUstName", argTypes, term85388, args);
    }

};


