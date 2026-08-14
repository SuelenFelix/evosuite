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

public class Package_findRoute_10926667183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57128;

    public Package_findRoute_10926667183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57129 = new ArrayList();
        ((ArrayList) term57129).add((Object)null);
        ((ArrayList) term57129).add((Object)null);
        ((ArrayList) term57129).add((Object)null);
        ((ArrayList) term57129).add((Object)null);
        ((ArrayList) term57129).add((Object)null);
        ((ArrayList) term57129).add((Object)null);
        ((ArrayList) term57129).add((Object)null);
        ((ArrayList) term57129).add((Object)null);
        ((ArrayList) term57129).add((Object)null);
        ArrayList term57157 = new ArrayList();
        ((ArrayList) term57157).add((Object)null);
        ((ArrayList) term57157).add((Object)null);
        ((ArrayList) term57157).add((Object)null);
        ((ArrayList) term57157).add((Object)null);
        ((ArrayList) term57157).add((Object)null);
        ((ArrayList) term57157).add((Object)null);
        term57128 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57128, term57128.getClass(), "members", term57129);
        setField(term57128, term57128.getClass(), "id", "qrmUWIxufo");
        setField(term57128, term57128.getClass(), "name", "SeWCUkXfZv");
        setField(term57128, term57128.getClass(), "relations", term57157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "woQcQRYwNH";
        callMethod(klass, "findRoute", argTypes, term57128, args);
    }

};


