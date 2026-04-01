package org.example.toylanguage.context.definition;

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
import static org.example.toylanguage.context.definition.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class FunctionDetails_equals_9773125660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2038;
     Object term2127;

    public FunctionDetails_equals_9773125660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2051 = new ArrayList();
        ((ArrayList) term2051).add("oVkgUUfHis");
        ((ArrayList) term2051).add("hoCKQzIOhx");
        ((ArrayList) term2051).add("znUxTdEvUD");
        ((ArrayList) term2051).add("PvtJhtGffh");
        ((ArrayList) term2051).add("KReGJTSQuY");
        ((ArrayList) term2051).add("hqZmoXoMuS");
        term2038 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDetails"));
        setField(term2038, term2038.getClass(), "name", "UDZJbJPmCC");
        setField(term2038, term2038.getClass(), "arguments", term2051);
        term2127 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.FunctionDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2127;
        callMethod(klass, "equals", argTypes, term2038, args);
    }

};


