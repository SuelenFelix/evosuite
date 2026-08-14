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

public class Package_hashCode_90715315720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57981;

    public Package_hashCode_90715315720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57982 = new ArrayList();
        ((ArrayList) term57982).add((Object)null);
        ((ArrayList) term57982).add((Object)null);
        ((ArrayList) term57982).add((Object)null);
        ((ArrayList) term57982).add((Object)null);
        ((ArrayList) term57982).add((Object)null);
        ArrayList term58010 = new ArrayList();
        ((ArrayList) term58010).add((Object)null);
        ((ArrayList) term58010).add((Object)null);
        ((ArrayList) term58010).add((Object)null);
        ((ArrayList) term58010).add((Object)null);
        ((ArrayList) term58010).add((Object)null);
        term57981 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57981, term57981.getClass(), "members", term57982);
        setField(term57981, term57981.getClass(), "id", "lrEkNimddJ");
        setField(term57981, term57981.getClass(), "name", "fkeYGEUxMA");
        setField(term57981, term57981.getClass(), "relations", term58010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term57981, args);
    }

};


