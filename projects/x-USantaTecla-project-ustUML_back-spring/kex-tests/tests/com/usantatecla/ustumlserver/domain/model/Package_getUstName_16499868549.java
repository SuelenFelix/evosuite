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

public class Package_getUstName_16499868549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57548;

    public Package_getUstName_16499868549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57549 = new ArrayList();
        ArrayList term57577 = new ArrayList();
        ((ArrayList) term57577).add((Object)null);
        ((ArrayList) term57577).add((Object)null);
        ((ArrayList) term57577).add((Object)null);
        ((ArrayList) term57577).add((Object)null);
        term57548 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57548, term57548.getClass(), "members", term57549);
        setField(term57548, term57548.getClass(), "id", "gSFFUuJipG");
        setField(term57548, term57548.getClass(), "name", "bQWfIFvxkQ");
        setField(term57548, term57548.getClass(), "relations", term57577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUstName", argTypes, term57548, args);
    }

};


