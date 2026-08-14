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

public class Package_canEqual_213496483519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57927;
     Object term57960;

    public Package_canEqual_213496483519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57928 = new ArrayList();
        ((ArrayList) term57928).add((Object)null);
        ((ArrayList) term57928).add((Object)null);
        ((ArrayList) term57928).add((Object)null);
        ((ArrayList) term57928).add((Object)null);
        ((ArrayList) term57928).add((Object)null);
        ((ArrayList) term57928).add((Object)null);
        ((ArrayList) term57928).add((Object)null);
        ((ArrayList) term57928).add((Object)null);
        ArrayList term57956 = new ArrayList();
        ((ArrayList) term57956).add((Object)null);
        ((ArrayList) term57956).add((Object)null);
        ((ArrayList) term57956).add((Object)null);
        term57927 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57927, term57927.getClass(), "members", term57928);
        setField(term57927, term57927.getClass(), "id", "pButgbcWlR");
        setField(term57927, term57927.getClass(), "name", "tPiZMhJIXj");
        setField(term57927, term57927.getClass(), "relations", term57956);
        term57960 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term57960;
        callMethod(klass, "canEqual", argTypes, term57927, args);
    }

};


