package com.usantatecla.ustumlserver.domain.model.classDiagram;

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
import static com.usantatecla.ustumlserver.domain.model.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Method_getParameters_19377711112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37926;

    public Method_getParameters_19377711112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37929 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term37929, term37929.getClass(), "name", "");
        setField(term37929, term37929.getClass(), "type", "");
        Object term37932 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term37932, term37932.getClass(), "name", "");
        setField(term37932, term37932.getClass(), "type", "");
        Object term37935 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term37935, term37935.getClass(), "name", "");
        setField(term37935, term37935.getClass(), "type", "");
        Object term37938 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term37938, term37938.getClass(), "name", "");
        setField(term37938, term37938.getClass(), "type", "");
        Object term37941 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term37941, term37941.getClass(), "name", "");
        setField(term37941, term37941.getClass(), "type", "");
        Object term37944 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term37944, term37944.getClass(), "name", "");
        setField(term37944, term37944.getClass(), "type", "");
        Object term37947 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term37947, term37947.getClass(), "name", "");
        setField(term37947, term37947.getClass(), "type", "");
        ArrayList term37927 = new ArrayList();
        ((ArrayList) term37927).add(term37929);
        ((ArrayList) term37927).add(term37932);
        ((ArrayList) term37927).add(term37935);
        ((ArrayList) term37927).add(term37938);
        ((ArrayList) term37927).add(term37941);
        ((ArrayList) term37927).add(term37944);
        ((ArrayList) term37927).add(term37947);
        ArrayList term37976 = new ArrayList();
        term37926 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term37926, term37926.getClass(), "parameters", term37927);
        setField(term37926, term37926.getClass(), "name", "vbSWeJWOQh");
        setField(term37926, term37926.getClass(), "type", "hyvFdAvkOr");
        setField(term37926, term37926.getClass(), "modifiers", term37976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParameters", argTypes, term37926, args);
    }

};


