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

public class SearchProjectsDto_getProjectId_1747446452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;

    public SearchProjectsDto_getProjectId_1747446452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term109 = new ArrayList();
        ((ArrayList) term109).add((Object)null);
        ((ArrayList) term109).add((Object)null);
        ((ArrayList) term109).add((Object)null);
        ((ArrayList) term109).add((Object)null);
        term72 = newInstance(Class.forName("com.pfa.app.model.dto.SearchProjectsDto"));
        setField(term72, term72.getClass(), "projectId", "xxtlPwDYFs");
        setField(term72, term72.getClass(), "commitDateFrom", "jJCZpVmanW");
        setField(term72, term72.getClass(), "commitDateTo", "EGtDIRbSSb");
        setField(term72, term72.getClass(), "dataProjects", term109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.SearchProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term72, args);
    }

};


