package com.pfa.app.model.dto;

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
import static com.pfa.app.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class SearchProjectsDto_setDataProjects_4324825829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term635;
     Object term676;

    public SearchProjectsDto_setDataProjects_4324825829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term672 = new ArrayList();
        ((ArrayList) term672).add((Object)null);
        ((ArrayList) term672).add((Object)null);
        ((ArrayList) term672).add((Object)null);
        ((ArrayList) term672).add((Object)null);
        ((ArrayList) term672).add((Object)null);
        ((ArrayList) term672).add((Object)null);
        ((ArrayList) term672).add((Object)null);
        term635 = newInstance(Class.forName("com.pfa.app.model.dto.SearchProjectsDto"));
        setField(term635, term635.getClass(), "projectId", "OclPbYPkcH");
        setField(term635, term635.getClass(), "commitDateFrom", "IoAlmYsBwc");
        setField(term635, term635.getClass(), "commitDateTo", "TEParAifyi");
        setField(term635, term635.getClass(), "dataProjects", term672);
        term676 = new LinkedList();
        ((LinkedList) term676).add((Object)null);
        ((LinkedList) term676).add((Object)null);
        ((LinkedList) term676).add((Object)null);
        ((LinkedList) term676).add((Object)null);
        ((LinkedList) term676).add((Object)null);
        ((LinkedList) term676).add((Object)null);
        ((LinkedList) term676).add((Object)null);
        ((LinkedList) term676).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.SearchProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term676;
        callMethod(klass, "setDataProjects", argTypes, term635, args);
    }

};


