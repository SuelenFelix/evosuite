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

public class Package_find_2938014612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57053;

    public Package_find_2938014612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57054 = new ArrayList();
        ((ArrayList) term57054).add((Object)null);
        ((ArrayList) term57054).add((Object)null);
        ((ArrayList) term57054).add((Object)null);
        ((ArrayList) term57054).add((Object)null);
        ((ArrayList) term57054).add((Object)null);
        ((ArrayList) term57054).add((Object)null);
        ArrayList term57082 = new ArrayList();
        ((ArrayList) term57082).add((Object)null);
        ((ArrayList) term57082).add((Object)null);
        ((ArrayList) term57082).add((Object)null);
        ((ArrayList) term57082).add((Object)null);
        ((ArrayList) term57082).add((Object)null);
        ((ArrayList) term57082).add((Object)null);
        ((ArrayList) term57082).add((Object)null);
        ((ArrayList) term57082).add((Object)null);
        ((ArrayList) term57082).add((Object)null);
        term57053 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57053, term57053.getClass(), "members", term57054);
        setField(term57053, term57053.getClass(), "id", "tDmfqEyHaN");
        setField(term57053, term57053.getClass(), "name", "mTSMXFkWRr");
        setField(term57053, term57053.getClass(), "relations", term57082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qdIiMKwfzT";
        callMethod(klass, "find", argTypes, term57053, args);
    }

};


