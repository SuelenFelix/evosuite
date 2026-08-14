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

public class Project_toString_13531710645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85494;

    public Project_toString_13531710645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term85495 = new ArrayList();
        ArrayList term85523 = new ArrayList();
        ((ArrayList) term85523).add((Object)null);
        ((ArrayList) term85523).add((Object)null);
        ((ArrayList) term85523).add((Object)null);
        term85494 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term85494, term85494.getClass(), "members", term85495);
        setField(term85494, term85494.getClass(), "id", "WADNPbexnT");
        setField(term85494, term85494.getClass(), "name", "rMbsSfMKvX");
        setField(term85494, term85494.getClass(), "relations", term85523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term85494, args);
    }

};


