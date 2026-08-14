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

public class SearchProjectsDto_setProjectId_119872053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;

    public SearchProjectsDto_setProjectId_119872053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180 = new ArrayList();
        ((ArrayList) term180).add((Object)null);
        ((ArrayList) term180).add((Object)null);
        ((ArrayList) term180).add((Object)null);
        term143 = newInstance(Class.forName("com.pfa.app.model.dto.SearchProjectsDto"));
        setField(term143, term143.getClass(), "projectId", "SzjVpOQTyS");
        setField(term143, term143.getClass(), "commitDateFrom", "MjGYSRKTNF");
        setField(term143, term143.getClass(), "commitDateTo", "hRNSzYYIrc");
        setField(term143, term143.getClass(), "dataProjects", term180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.SearchProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RMFIsYGgne";
        callMethod(klass, "setProjectId", argTypes, term143, args);
    }

};


