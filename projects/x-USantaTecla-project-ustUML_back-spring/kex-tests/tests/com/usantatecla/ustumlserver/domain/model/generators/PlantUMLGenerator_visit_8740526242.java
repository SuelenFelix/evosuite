package com.usantatecla.ustumlserver.domain.model.generators;

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
import static com.usantatecla.ustumlserver.domain.model.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class PlantUMLGenerator_visit_8740526242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4974;
     Object term4976;

    public PlantUMLGenerator_visit_8740526242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4974 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator"));
        setField(term4974, term4974.getClass(), "withMembersMember", null);
        setField(term4974, term4974.getClass(), "origin", null);
        setIntField(term4974, term4974.getClass(), "depthLevel", 1162663216);
        ArrayList term4977 = new ArrayList();
        ((ArrayList) term4977).add((Object)null);
        ((ArrayList) term4977).add((Object)null);
        ((ArrayList) term4977).add((Object)null);
        ((ArrayList) term4977).add((Object)null);
        ((ArrayList) term4977).add((Object)null);
        ArrayList term5005 = new ArrayList();
        ((ArrayList) term5005).add((Object)null);
        term4976 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term4976, term4976.getClass(), "members", term4977);
        setField(term4976, term4976.getClass(), "id", "uWHnvSvaPl");
        setField(term4976, term4976.getClass(), "name", "kBdSllIBVz");
        setField(term4976, term4976.getClass(), "relations", term5005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Object[] args = new Object[1];
        args[0] = term4976;
        callMethod(klass, "visit", argTypes, term4974, args);
    }

};


