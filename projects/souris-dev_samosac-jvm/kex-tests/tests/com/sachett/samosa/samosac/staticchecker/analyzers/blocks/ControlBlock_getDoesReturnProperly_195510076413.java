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

public class ControlBlock_getDoesReturnProperly_195510076413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16673;

    public ControlBlock_getDoesReturnProperly_195510076413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16673 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock"));
        setField(term16673, term16673.getClass(), "parentFnSymbol", null);
        setField(term16673, term16673.getClass(), "parent", null);
        setField(term16673, term16673.getClass(), "type", null);
        setBooleanField(term16673, term16673.getClass(), "doesReturnComputed", false);
        setField(term16673, term16673.getClass(), "children", null);
        setBooleanField(term16673, term16673.getClass(), "doesReturnProperly", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDoesReturnProperly", argTypes, term16673, args);
    }

};


