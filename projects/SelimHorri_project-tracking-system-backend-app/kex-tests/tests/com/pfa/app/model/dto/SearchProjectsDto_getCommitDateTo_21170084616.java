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

public class SearchProjectsDto_getCommitDateTo_21170084616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400;

    public SearchProjectsDto_getCommitDateTo_21170084616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term437 = new ArrayList();
        ((ArrayList) term437).add((Object)null);
        ((ArrayList) term437).add((Object)null);
        ((ArrayList) term437).add((Object)null);
        ((ArrayList) term437).add((Object)null);
        ((ArrayList) term437).add((Object)null);
        ((ArrayList) term437).add((Object)null);
        term400 = newInstance(Class.forName("com.pfa.app.model.dto.SearchProjectsDto"));
        setField(term400, term400.getClass(), "projectId", "tbcdzjIfER");
        setField(term400, term400.getClass(), "commitDateFrom", "HyxfbSQYBe");
        setField(term400, term400.getClass(), "commitDateTo", "pCTimMblYc");
        setField(term400, term400.getClass(), "dataProjects", term437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.SearchProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCommitDateTo", argTypes, term400, args);
    }

};


