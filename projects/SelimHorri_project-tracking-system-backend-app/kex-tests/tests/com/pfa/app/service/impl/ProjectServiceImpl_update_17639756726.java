package com.pfa.app.service.impl;

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
import static com.pfa.app.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;

public class ProjectServiceImpl_update_17639756726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698;
     Object term700;

    public ProjectServiceImpl_update_17639756726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term698 = new Integer(158873461);
        ArrayList term749 = new ArrayList();
        ((ArrayList) term749).add("jNxbVmoZgq");
        ((ArrayList) term749).add("PvmBHIXaMY");
        ((ArrayList) term749).add("hulYxtowxw");
        ((ArrayList) term749).add("GNEmuHPNcU");
        term700 = newInstance(Class.forName("com.pfa.app.model.dto.ProjectDTO"));
        setField(term700, term700.getClass(), "title", "zsWKWiTFuo");
        setField(term700, term700.getClass(), "startDate", "UPUbwyHQKN");
        setField(term700, term700.getClass(), "endDate", "lgQkrXANyI");
        setField(term700, term700.getClass(), "status", "MeTmRZXErV");
        setField(term700, term700.getClass(), "assignedEmployees", term749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.service.impl.ProjectServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("com.pfa.app.model.dto.ProjectDTO");
        Object[] args = new Object[2];
        args[0] = term698;
        args[1] = term700;
        callMethod(klass, "update", argTypes, null, args);
    }

};


