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

public class Package_accept_10478151738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57495;

    public Package_accept_10478151738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57496 = new ArrayList();
        ((ArrayList) term57496).add((Object)null);
        ((ArrayList) term57496).add((Object)null);
        ArrayList term57524 = new ArrayList();
        ((ArrayList) term57524).add((Object)null);
        ((ArrayList) term57524).add((Object)null);
        ((ArrayList) term57524).add((Object)null);
        ((ArrayList) term57524).add((Object)null);
        ((ArrayList) term57524).add((Object)null);
        ((ArrayList) term57524).add((Object)null);
        term57495 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57495, term57495.getClass(), "members", term57496);
        setField(term57495, term57495.getClass(), "id", "vHxsVQImjS");
        setField(term57495, term57495.getClass(), "name", "jkVaRrZHQX");
        setField(term57495, term57495.getClass(), "relations", term57524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.MemberVisitor");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "accept", argTypes, term57495, args);
    }

};


