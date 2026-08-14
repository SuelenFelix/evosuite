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

public class Package_add_11940589341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57000;

    public Package_add_11940589341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57001 = new ArrayList();
        ((ArrayList) term57001).add((Object)null);
        ((ArrayList) term57001).add((Object)null);
        ArrayList term57029 = new ArrayList();
        ((ArrayList) term57029).add((Object)null);
        ((ArrayList) term57029).add((Object)null);
        ((ArrayList) term57029).add((Object)null);
        ((ArrayList) term57029).add((Object)null);
        ((ArrayList) term57029).add((Object)null);
        ((ArrayList) term57029).add((Object)null);
        ((ArrayList) term57029).add((Object)null);
        ((ArrayList) term57029).add((Object)null);
        term57000 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57000, term57000.getClass(), "members", term57001);
        setField(term57000, term57000.getClass(), "id", "cdXvvxXVTz");
        setField(term57000, term57000.getClass(), "name", "tXsfWIqIPn");
        setField(term57000, term57000.getClass(), "relations", term57029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Member");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term57000, args);
    }

};


