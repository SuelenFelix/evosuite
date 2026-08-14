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

public class Package_setMembers_43300247115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57760;
     Object term57793;

    public Package_setMembers_43300247115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57761 = new ArrayList();
        ArrayList term57789 = new ArrayList();
        ((ArrayList) term57789).add((Object)null);
        ((ArrayList) term57789).add((Object)null);
        term57760 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57760, term57760.getClass(), "members", term57761);
        setField(term57760, term57760.getClass(), "id", "FTuOcSieav");
        setField(term57760, term57760.getClass(), "name", "qSnwPXRuzC");
        setField(term57760, term57760.getClass(), "relations", term57789);
        term57793 = new LinkedList();
        ((LinkedList) term57793).add((Object)null);
        ((LinkedList) term57793).add((Object)null);
        ((LinkedList) term57793).add((Object)null);
        ((LinkedList) term57793).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term57793;
        callMethod(klass, "setMembers", argTypes, term57760, args);
    }

};


