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

public class Package_getPlantUml_34965589010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57601;

    public Package_getPlantUml_34965589010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57602 = new ArrayList();
        ((ArrayList) term57602).add((Object)null);
        ((ArrayList) term57602).add((Object)null);
        ArrayList term57630 = new ArrayList();
        ((ArrayList) term57630).add((Object)null);
        ((ArrayList) term57630).add((Object)null);
        ((ArrayList) term57630).add((Object)null);
        ((ArrayList) term57630).add((Object)null);
        ((ArrayList) term57630).add((Object)null);
        term57601 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57601, term57601.getClass(), "members", term57602);
        setField(term57601, term57601.getClass(), "id", "aDoBLXfFQI");
        setField(term57601, term57601.getClass(), "name", "HTimNhSNVi");
        setField(term57601, term57601.getClass(), "relations", term57630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlantUml", argTypes, term57601, args);
    }

};


