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

public class UseCase_hashCode_9418252311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term993;

    public UseCase_hashCode_9418252311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1018 = new ArrayList();
        ((ArrayList) term1018).add((Object)null);
        ((ArrayList) term1018).add((Object)null);
        ((ArrayList) term1018).add((Object)null);
        ((ArrayList) term1018).add((Object)null);
        ((ArrayList) term1018).add((Object)null);
        ((ArrayList) term1018).add((Object)null);
        term993 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase"));
        setField(term993, term993.getClass(), "id", "wSQxaModmm");
        setField(term993, term993.getClass(), "name", "UlajhuVLaP");
        setField(term993, term993.getClass(), "relations", term1018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.UseCase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term993, args);
    }

};


