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

public class Package_accept_3160921967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57442;

    public Package_accept_3160921967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57443 = new ArrayList();
        ((ArrayList) term57443).add((Object)null);
        ArrayList term57471 = new ArrayList();
        ((ArrayList) term57471).add((Object)null);
        ((ArrayList) term57471).add((Object)null);
        ((ArrayList) term57471).add((Object)null);
        ((ArrayList) term57471).add((Object)null);
        ((ArrayList) term57471).add((Object)null);
        ((ArrayList) term57471).add((Object)null);
        ((ArrayList) term57471).add((Object)null);
        term57442 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57442, term57442.getClass(), "members", term57443);
        setField(term57442, term57442.getClass(), "id", "BrPqlvIbEQ");
        setField(term57442, term57442.getClass(), "name", "JDTrhGRsDT");
        setField(term57442, term57442.getClass(), "relations", term57471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.Generator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "accept", argTypes, term57442, args);
    }

};


