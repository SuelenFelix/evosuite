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

public class Project_equals_3937246997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85547;
     Object term85580;

    public Project_equals_3937246997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term85548 = new ArrayList();
        ((ArrayList) term85548).add((Object)null);
        ((ArrayList) term85548).add((Object)null);
        ((ArrayList) term85548).add((Object)null);
        ((ArrayList) term85548).add((Object)null);
        ((ArrayList) term85548).add((Object)null);
        ((ArrayList) term85548).add((Object)null);
        ((ArrayList) term85548).add((Object)null);
        ArrayList term85576 = new ArrayList();
        ((ArrayList) term85576).add((Object)null);
        ((ArrayList) term85576).add((Object)null);
        ((ArrayList) term85576).add((Object)null);
        ((ArrayList) term85576).add((Object)null);
        ((ArrayList) term85576).add((Object)null);
        ((ArrayList) term85576).add((Object)null);
        term85547 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term85547, term85547.getClass(), "members", term85548);
        setField(term85547, term85547.getClass(), "id", "oCsqRJXMBc");
        setField(term85547, term85547.getClass(), "name", "npPxKNoqdS");
        setField(term85547, term85547.getClass(), "relations", term85576);
        term85580 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term85580;
        callMethod(klass, "equals", argTypes, term85547, args);
    }

};


