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

public class Project_canEqual_4104379308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85601;
     Object term85634;

    public Project_canEqual_4104379308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term85602 = new ArrayList();
        ((ArrayList) term85602).add((Object)null);
        ((ArrayList) term85602).add((Object)null);
        ((ArrayList) term85602).add((Object)null);
        ArrayList term85630 = new ArrayList();
        ((ArrayList) term85630).add((Object)null);
        term85601 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term85601, term85601.getClass(), "members", term85602);
        setField(term85601, term85601.getClass(), "id", "tGgCtmAQPu");
        setField(term85601, term85601.getClass(), "name", "HokisXXNMR");
        setField(term85601, term85601.getClass(), "relations", term85630);
        term85634 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term85634;
        callMethod(klass, "canEqual", argTypes, term85601, args);
    }

};


