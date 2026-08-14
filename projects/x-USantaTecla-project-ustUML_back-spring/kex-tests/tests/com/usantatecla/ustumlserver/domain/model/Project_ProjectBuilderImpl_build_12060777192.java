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

public class Project_ProjectBuilderImpl_build_12060777192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89042;

    public Project_ProjectBuilderImpl_build_12060777192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term89043 = new ArrayList();
        ((ArrayList) term89043).add((Object)null);
        ((ArrayList) term89043).add((Object)null);
        ((ArrayList) term89043).add((Object)null);
        ArrayList term89071 = new ArrayList();
        ((ArrayList) term89071).add((Object)null);
        term89042 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project$ProjectBuilderImpl"));
        setField(term89042, term89042.getClass(), "members", term89043);
        setField(term89042, term89042.getClass(), "id", "DRdgywxCcP");
        setField(term89042, term89042.getClass(), "name", "uelmUHzwnS");
        setField(term89042, term89042.getClass(), "relations", term89071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Project$ProjectBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term89042, args);
    }

};


