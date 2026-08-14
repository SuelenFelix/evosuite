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
import java.lang.Object;

public class UseCase_UseCaseBuilderImpl_self_5203203091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426;

    public UseCase_UseCaseBuilderImpl_self_5203203091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term451 = new ArrayList();
        ((ArrayList) term451).add((Object)null);
        ((ArrayList) term451).add((Object)null);
        ((ArrayList) term451).add((Object)null);
        ((ArrayList) term451).add((Object)null);
        ((ArrayList) term451).add((Object)null);
        ((ArrayList) term451).add((Object)null);
        ((ArrayList) term451).add((Object)null);
        term426 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase$UseCaseBuilderImpl"));
        setField(term426, term426.getClass(), "id", "tbcdzjIfER");
        setField(term426, term426.getClass(), "name", "HyxfbSQYBe");
        setField(term426, term426.getClass(), "relations", term451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase$UseCaseBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term426, args);
    }

};


