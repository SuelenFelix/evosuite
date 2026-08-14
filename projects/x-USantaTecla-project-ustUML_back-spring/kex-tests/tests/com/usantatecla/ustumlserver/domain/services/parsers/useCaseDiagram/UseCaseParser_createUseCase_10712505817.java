package com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram;

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
import static com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UseCaseParser_createUseCase_10712505817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1745;

    public UseCaseParser_createUseCase_10712505817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1745 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.UseCaseParser"));
        setField(term1745, term1745.getClass(), "account", null);
        setField(term1745, term1745.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.UseCaseParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createUseCase", argTypes, term1745, args);
    }

};


