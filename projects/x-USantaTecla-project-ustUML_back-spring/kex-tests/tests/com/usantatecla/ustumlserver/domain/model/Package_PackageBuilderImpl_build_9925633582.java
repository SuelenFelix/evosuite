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

public class Package_PackageBuilderImpl_build_9925633582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;

    public Package_PackageBuilderImpl_build_9925633582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term120 = new ArrayList();
        ((ArrayList) term120).add((Object)null);
        ((ArrayList) term120).add((Object)null);
        ((ArrayList) term120).add((Object)null);
        ((ArrayList) term120).add((Object)null);
        ArrayList term148 = new ArrayList();
        ((ArrayList) term148).add((Object)null);
        ((ArrayList) term148).add((Object)null);
        ((ArrayList) term148).add((Object)null);
        ((ArrayList) term148).add((Object)null);
        ((ArrayList) term148).add((Object)null);
        term119 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package$PackageBuilderImpl"));
        setField(term119, term119.getClass(), "members", term120);
        setField(term119, term119.getClass(), "id", "MjGYSRKTNF");
        setField(term119, term119.getClass(), "name", "hRNSzYYIrc");
        setField(term119, term119.getClass(), "relations", term148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package$PackageBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term119, args);
    }

};


