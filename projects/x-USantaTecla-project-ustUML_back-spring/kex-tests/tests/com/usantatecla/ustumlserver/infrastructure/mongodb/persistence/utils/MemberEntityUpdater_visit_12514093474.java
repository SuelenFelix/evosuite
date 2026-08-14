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

public class MemberEntityUpdater_visit_12514093474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10124;

    public MemberEntityUpdater_visit_12514093474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10125 = new ArrayList();
        ((ArrayList) term10125).add((Object)null);
        ArrayList term10153 = new ArrayList();
        ((ArrayList) term10153).add((Object)null);
        ((ArrayList) term10153).add((Object)null);
        ((ArrayList) term10153).add((Object)null);
        term10124 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term10124, term10124.getClass(), "members", term10125);
        setField(term10124, term10124.getClass(), "id", "NTWMiBEaDF");
        setField(term10124, term10124.getClass(), "name", "SPBstwKFVr");
        setField(term10124, term10124.getClass(), "relations", term10153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.MemberEntityUpdater");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Project");
        Object[] args = new Object[1];
        args[0] = term10124;
        callMethod(klass, "visit", argTypes, null, args);
    }

};


