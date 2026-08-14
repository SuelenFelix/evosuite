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

public class UstUMLGenerator_visit_14142887317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16951;
     Object term16953;

    public UstUMLGenerator_visit_14142887317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16951 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.UstUMLGenerator"));
        setIntField(term16951, term16951.getClass(), "depthLevel", 1048535127);
        ArrayList term16978 = new ArrayList();
        ((ArrayList) term16978).add((Object)null);
        ((ArrayList) term16978).add((Object)null);
        ((ArrayList) term16978).add((Object)null);
        ((ArrayList) term16978).add((Object)null);
        ((ArrayList) term16978).add((Object)null);
        ((ArrayList) term16978).add((Object)null);
        ((ArrayList) term16978).add((Object)null);
        ((ArrayList) term16978).add((Object)null);
        ((ArrayList) term16978).add((Object)null);
        term16953 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase"));
        setField(term16953, term16953.getClass(), "id", "pFAfANnxup");
        setField(term16953, term16953.getClass(), "name", "FbSIUZyBXZ");
        setField(term16953, term16953.getClass(), "relations", term16978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.UstUMLGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase");
        Object[] args = new Object[1];
        args[0] = term16953;
        callMethod(klass, "visit", argTypes, term16951, args);
    }

};


