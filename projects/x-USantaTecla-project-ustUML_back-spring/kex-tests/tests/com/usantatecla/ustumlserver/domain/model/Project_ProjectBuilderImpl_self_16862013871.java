package com.usantatecla.ustumlserver.domain.model;

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
import static com.usantatecla.ustumlserver.domain.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Project_ProjectBuilderImpl_self_16862013871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88989;

    public Project_ProjectBuilderImpl_self_16862013871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term88990 = new ArrayList();
        ((ArrayList) term88990).add((Object)null);
        ArrayList term89018 = new ArrayList();
        ((ArrayList) term89018).add((Object)null);
        ((ArrayList) term89018).add((Object)null);
        ((ArrayList) term89018).add((Object)null);
        ((ArrayList) term89018).add((Object)null);
        ((ArrayList) term89018).add((Object)null);
        ((ArrayList) term89018).add((Object)null);
        ((ArrayList) term89018).add((Object)null);
        ((ArrayList) term89018).add((Object)null);
        term88989 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project$ProjectBuilderImpl"));
        setField(term88989, term88989.getClass(), "members", term88990);
        setField(term88989, term88989.getClass(), "id", "rfFTBanxEx");
        setField(term88989, term88989.getClass(), "name", "MQJTCGewxT");
        setField(term88989, term88989.getClass(), "relations", term89018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Project$ProjectBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term88989, args);
    }

};


