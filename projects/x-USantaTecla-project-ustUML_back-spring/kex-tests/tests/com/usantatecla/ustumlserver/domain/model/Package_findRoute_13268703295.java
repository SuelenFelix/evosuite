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
import java.util.LinkedList;

public class Package_findRoute_13268703295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57256;
     Object term57289;

    public Package_findRoute_13268703295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57257 = new ArrayList();
        ((ArrayList) term57257).add((Object)null);
        ((ArrayList) term57257).add((Object)null);
        ((ArrayList) term57257).add((Object)null);
        ((ArrayList) term57257).add((Object)null);
        ((ArrayList) term57257).add((Object)null);
        ((ArrayList) term57257).add((Object)null);
        ((ArrayList) term57257).add((Object)null);
        ((ArrayList) term57257).add((Object)null);
        ArrayList term57285 = new ArrayList();
        ((ArrayList) term57285).add((Object)null);
        term57256 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57256, term57256.getClass(), "members", term57257);
        setField(term57256, term57256.getClass(), "id", "hNWRuNEgOf");
        setField(term57256, term57256.getClass(), "name", "CEtjGBplmv");
        setField(term57256, term57256.getClass(), "relations", term57285);
        term57289 = new LinkedList();
        ((LinkedList) term57289).add("XosDTAzIAT");
        ((LinkedList) term57289).add("lcCEhCpiZM");
        ((LinkedList) term57289).add("");
        ((LinkedList) term57289).add((Object)null);
        ((LinkedList) term57289).add((Object)null);
        ((LinkedList) term57289).add((Object)null);
        ((LinkedList) term57289).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Deque");
        Object[] args = new Object[1];
        args[0] = term57289;
        callMethod(klass, "findRoute", argTypes, term57256, args);
    }

};


