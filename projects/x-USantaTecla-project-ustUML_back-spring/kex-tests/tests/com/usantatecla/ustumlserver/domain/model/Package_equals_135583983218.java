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

public class Package_equals_135583983218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57873;
     Object term57906;

    public Package_equals_135583983218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57874 = new ArrayList();
        ((ArrayList) term57874).add((Object)null);
        ArrayList term57902 = new ArrayList();
        ((ArrayList) term57902).add((Object)null);
        term57873 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57873, term57873.getClass(), "members", term57874);
        setField(term57873, term57873.getClass(), "id", "jMQsCLYfKd");
        setField(term57873, term57873.getClass(), "name", "dpcpGqEQLd");
        setField(term57873, term57873.getClass(), "relations", term57902);
        term57906 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term57906;
        callMethod(klass, "equals", argTypes, term57873, args);
    }

};


