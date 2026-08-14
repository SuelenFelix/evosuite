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

public class Package_getPackageMembers_19739091996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57389;

    public Package_getPackageMembers_19739091996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57390 = new ArrayList();
        ((ArrayList) term57390).add((Object)null);
        ArrayList term57418 = new ArrayList();
        term57389 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57389, term57389.getClass(), "members", term57390);
        setField(term57389, term57389.getClass(), "id", "cyobgydTWP");
        setField(term57389, term57389.getClass(), "name", "moHYQFfLnp");
        setField(term57389, term57389.getClass(), "relations", term57418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPackageMembers", argTypes, term57389, args);
    }

};


