package org.graph4j.examples;

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
import static org.graph4j.examples.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Person_getName_14047683201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221;

    public Person_getName_14047683201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term238 = new ArrayList();
        ((ArrayList) term238).add((Object)null);
        ((ArrayList) term238).add((Object)null);
        ((ArrayList) term238).add((Object)null);
        ((ArrayList) term238).add((Object)null);
        Object term236 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term236, term236.getClass(), "name", "");
        setField(term236, term236.getClass(), "friends", term238);
        ArrayList term243 = new ArrayList();
        ((ArrayList) term243).add((Object)null);
        Object term241 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term241, term241.getClass(), "name", "");
        setField(term241, term241.getClass(), "friends", term243);
        ArrayList term248 = new ArrayList();
        ((ArrayList) term248).add((Object)null);
        ((ArrayList) term248).add((Object)null);
        ((ArrayList) term248).add((Object)null);
        Object term246 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term246, term246.getClass(), "name", "");
        setField(term246, term246.getClass(), "friends", term248);
        ArrayList term253 = new ArrayList();
        ((ArrayList) term253).add((Object)null);
        ((ArrayList) term253).add((Object)null);
        Object term251 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term251, term251.getClass(), "name", "");
        setField(term251, term251.getClass(), "friends", term253);
        ArrayList term258 = new ArrayList();
        ((ArrayList) term258).add((Object)null);
        ((ArrayList) term258).add((Object)null);
        ((ArrayList) term258).add((Object)null);
        ((ArrayList) term258).add((Object)null);
        ((ArrayList) term258).add((Object)null);
        ((ArrayList) term258).add((Object)null);
        Object term256 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term256, term256.getClass(), "name", "");
        setField(term256, term256.getClass(), "friends", term258);
        ArrayList term234 = new ArrayList();
        ((ArrayList) term234).add(term236);
        ((ArrayList) term234).add(term241);
        ((ArrayList) term234).add(term246);
        ((ArrayList) term234).add(term251);
        ((ArrayList) term234).add(term256);
        term221 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term221, term221.getClass(), "name", "UoYtihxVaS");
        setField(term221, term221.getClass(), "friends", term234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.examples.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term221, args);
    }

};


