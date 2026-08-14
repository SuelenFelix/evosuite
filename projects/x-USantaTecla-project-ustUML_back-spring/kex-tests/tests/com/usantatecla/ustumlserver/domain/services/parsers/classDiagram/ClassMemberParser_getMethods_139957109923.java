package com.usantatecla.ustumlserver.domain.services.parsers.classDiagram;

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
import static com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClassMemberParser_getMethods_139957109923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17625;

    public ClassMemberParser_getMethods_139957109923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17625 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.ClassMemberParser"));
        setField(term17625, term17625.getClass(), "attributes", null);
        setField(term17625, term17625.getClass(), "methods", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.ClassMemberParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethods", argTypes, term17625, args);
    }

};


