package com.sachett.samosa.samosac.staticchecker.analyzers.blocks;

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
import static com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class ControlBlock_setDoesReturnProperly_28396835414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16676;
     Object term16679;

    public ControlBlock_setDoesReturnProperly_28396835414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16676 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock"));
        setField(term16676, term16676.getClass(), "parentFnSymbol", null);
        setField(term16676, term16676.getClass(), "parent", null);
        setField(term16676, term16676.getClass(), "type", null);
        setBooleanField(term16676, term16676.getClass(), "doesReturnComputed", false);
        setField(term16676, term16676.getClass(), "children", null);
        setBooleanField(term16676, term16676.getClass(), "doesReturnProperly", false);
        term16679 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term16679;
        callMethod(klass, "setDoesReturnProperly", argTypes, term16676, args);
    }

};


