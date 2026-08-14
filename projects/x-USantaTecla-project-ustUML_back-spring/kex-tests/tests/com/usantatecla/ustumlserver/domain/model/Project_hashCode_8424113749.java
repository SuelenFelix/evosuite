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

public class Project_hashCode_8424113749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85655;

    public Project_hashCode_8424113749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term85656 = new ArrayList();
        ((ArrayList) term85656).add((Object)null);
        ((ArrayList) term85656).add((Object)null);
        ((ArrayList) term85656).add((Object)null);
        ((ArrayList) term85656).add((Object)null);
        ((ArrayList) term85656).add((Object)null);
        ArrayList term85684 = new ArrayList();
        ((ArrayList) term85684).add((Object)null);
        ((ArrayList) term85684).add((Object)null);
        ((ArrayList) term85684).add((Object)null);
        ((ArrayList) term85684).add((Object)null);
        ((ArrayList) term85684).add((Object)null);
        ((ArrayList) term85684).add((Object)null);
        ((ArrayList) term85684).add((Object)null);
        term85655 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term85655, term85655.getClass(), "members", term85656);
        setField(term85655, term85655.getClass(), "id", "JbtvoXZZHr");
        setField(term85655, term85655.getClass(), "name", "eMlkqCfrnK");
        setField(term85655, term85655.getClass(), "relations", term85684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term85655, args);
    }

};


