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
import java.util.ArrayList;
import java.lang.Object;

public class AssignmentServiceImpl_findByProjectIdAndCommitDateFromAndCommitDateTo_166390935010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3436;

    public AssignmentServiceImpl_findByProjectIdAndCommitDateFromAndCommitDateTo_166390935010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3473 = new ArrayList();
        ((ArrayList) term3473).add((Object)null);
        ((ArrayList) term3473).add((Object)null);
        ((ArrayList) term3473).add((Object)null);
        ((ArrayList) term3473).add((Object)null);
        ((ArrayList) term3473).add((Object)null);
        ((ArrayList) term3473).add((Object)null);
        ((ArrayList) term3473).add((Object)null);
        term3436 = newInstance(Class.forName("com.pfa.app.model.dto.SearchProjectsDto"));
        setField(term3436, term3436.getClass(), "projectId", "EnmiAvfpJv");
        setField(term3436, term3436.getClass(), "commitDateFrom", "AdYzLPMcwe");
        setField(term3436, term3436.getClass(), "commitDateTo", "FrTZLybkKk");
        setField(term3436, term3436.getClass(), "dataProjects", term3473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.service.impl.AssignmentServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pfa.app.model.dto.SearchProjectsDto");
        Object[] args = new Object[1];
        args[0] = term3436;
        callMethod(klass, "findByProjectIdAndCommitDateFromAndCommitDateTo", argTypes, null, args);
    }

};


