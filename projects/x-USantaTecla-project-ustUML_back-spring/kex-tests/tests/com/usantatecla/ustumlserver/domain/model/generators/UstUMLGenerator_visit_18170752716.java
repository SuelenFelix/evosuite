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

public class UstUMLGenerator_visit_18170752716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16900;
     Object term16902;

    public UstUMLGenerator_visit_18170752716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16900 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.UstUMLGenerator"));
        setIntField(term16900, term16900.getClass(), "depthLevel", 1622346318);
        ArrayList term16927 = new ArrayList();
        ((ArrayList) term16927).add((Object)null);
        ((ArrayList) term16927).add((Object)null);
        ((ArrayList) term16927).add((Object)null);
        ((ArrayList) term16927).add((Object)null);
        ((ArrayList) term16927).add((Object)null);
        ((ArrayList) term16927).add((Object)null);
        ((ArrayList) term16927).add((Object)null);
        ((ArrayList) term16927).add((Object)null);
        term16902 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor"));
        setField(term16902, term16902.getClass(), "id", "RSaoipUlsg");
        setField(term16902, term16902.getClass(), "name", "cSHGbqKqlN");
        setField(term16902, term16902.getClass(), "relations", term16927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.UstUMLGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor");
        Object[] args = new Object[1];
        args[0] = term16902;
        callMethod(klass, "visit", argTypes, term16900, args);
    }

};


