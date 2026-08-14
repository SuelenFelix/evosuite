package com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class MemberEntityUpdater_visit_9360349049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13803;

    public MemberEntityUpdater_visit_9360349049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13828 = new ArrayList();
        ((ArrayList) term13828).add((Object)null);
        ((ArrayList) term13828).add((Object)null);
        term13803 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor"));
        setField(term13803, term13803.getClass(), "id", "SqjyKmayBx");
        setField(term13803, term13803.getClass(), "name", "XjDhvToxJy");
        setField(term13803, term13803.getClass(), "relations", term13828);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.MemberEntityUpdater");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.useCaseDiagram.Actor");
        Object[] args = new Object[1];
        args[0] = term13803;
        callMethod(klass, "visit", argTypes, null, args);
    }

};


