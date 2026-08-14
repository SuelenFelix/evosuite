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

public class Package_PackageBuilderImpl_self_6527915731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;

    public Package_PackageBuilderImpl_self_6527915731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term67 = new ArrayList();
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ArrayList term95 = new ArrayList();
        term66 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package$PackageBuilderImpl"));
        setField(term66, term66.getClass(), "members", term67);
        setField(term66, term66.getClass(), "id", "EGtDIRbSSb");
        setField(term66, term66.getClass(), "name", "SzjVpOQTyS");
        setField(term66, term66.getClass(), "relations", term95);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package$PackageBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term66, args);
    }

};


