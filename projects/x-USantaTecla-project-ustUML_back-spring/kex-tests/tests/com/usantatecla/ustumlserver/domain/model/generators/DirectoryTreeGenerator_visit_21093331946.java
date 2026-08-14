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

public class DirectoryTreeGenerator_visit_21093331946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2634;
     Object term2635;

    public DirectoryTreeGenerator_visit_21093331946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2634 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.DirectoryTreeGenerator"));
        ArrayList term2660 = new ArrayList();
        ((ArrayList) term2660).add((Object)null);
        ((ArrayList) term2660).add((Object)null);
        ((ArrayList) term2660).add((Object)null);
        ((ArrayList) term2660).add((Object)null);
        term2635 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase"));
        setField(term2635, term2635.getClass(), "id", "nGKItKLYNC");
        setField(term2635, term2635.getClass(), "name", "UiUYnPrcCi");
        setField(term2635, term2635.getClass(), "relations", term2660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.DirectoryTreeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase");
        Object[] args = new Object[1];
        args[0] = term2635;
        callMethod(klass, "visit", argTypes, term2634, args);
    }

};


