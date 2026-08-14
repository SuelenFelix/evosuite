package com.usantatecla.ustumlserver.domain.model.useCaseDiagram;

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
import static com.usantatecla.ustumlserver.domain.model.useCaseDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class UseCase_toString_6049422137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term844;

    public UseCase_toString_6049422137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term869 = new ArrayList();
        term844 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase"));
        setField(term844, term844.getClass(), "id", "kuTXqwMtDB");
        setField(term844, term844.getClass(), "name", "Ghbwtircqb");
        setField(term844, term844.getClass(), "relations", term869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term844, args);
    }

};


