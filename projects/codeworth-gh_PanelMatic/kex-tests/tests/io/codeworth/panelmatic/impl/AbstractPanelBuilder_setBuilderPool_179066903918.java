package io.codeworth.panelmatic.impl;

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
import static io.codeworth.panelmatic.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class AbstractPanelBuilder_setBuilderPool_179066903918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12774;

    public AbstractPanelBuilder_setBuilderPool_179066903918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12776 = new HashMap();
        Set<Object> term12781 =  ((Map) term12776).keySet();
        HashSet term12775 = new HashSet((Collection<? extends Object>) term12781);
        term12774 = newInstance(Class.forName("io.codeworth.panelmatic.BuilderPool"));
        setField(term12774, term12774.getClass(), "builders", term12775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.AbstractPanelBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.BuilderPool");
        Object[] args = new Object[1];
        args[0] = term12774;
        callMethod(klass, "setBuilderPool", argTypes, null, args);
    }

};


