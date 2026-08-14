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

public class Package_toString_39639346716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57820;

    public Package_toString_39639346716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57821 = new ArrayList();
        ArrayList term57849 = new ArrayList();
        ((ArrayList) term57849).add((Object)null);
        ((ArrayList) term57849).add((Object)null);
        ((ArrayList) term57849).add((Object)null);
        ((ArrayList) term57849).add((Object)null);
        term57820 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57820, term57820.getClass(), "members", term57821);
        setField(term57820, term57820.getClass(), "id", "gqhqalMaKC");
        setField(term57820, term57820.getClass(), "name", "qkMduZHBXR");
        setField(term57820, term57820.getClass(), "relations", term57849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term57820, args);
    }

};


