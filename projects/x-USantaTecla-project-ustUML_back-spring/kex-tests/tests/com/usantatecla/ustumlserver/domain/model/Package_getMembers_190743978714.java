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

public class Package_getMembers_190743978714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57707;

    public Package_getMembers_190743978714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57708 = new ArrayList();
        ((ArrayList) term57708).add((Object)null);
        ((ArrayList) term57708).add((Object)null);
        ((ArrayList) term57708).add((Object)null);
        ArrayList term57736 = new ArrayList();
        ((ArrayList) term57736).add((Object)null);
        ((ArrayList) term57736).add((Object)null);
        ((ArrayList) term57736).add((Object)null);
        ((ArrayList) term57736).add((Object)null);
        ((ArrayList) term57736).add((Object)null);
        ((ArrayList) term57736).add((Object)null);
        ((ArrayList) term57736).add((Object)null);
        ((ArrayList) term57736).add((Object)null);
        ((ArrayList) term57736).add((Object)null);
        term57707 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57707, term57707.getClass(), "members", term57708);
        setField(term57707, term57707.getClass(), "id", "AscVKZhCwm");
        setField(term57707, term57707.getClass(), "name", "HCvSsQWjLn");
        setField(term57707, term57707.getClass(), "relations", term57736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMembers", argTypes, term57707, args);
    }

};


