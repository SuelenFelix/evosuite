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

public class SearchProjectsDto_toString_11143087911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SearchProjectsDto_toString_11143087911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term38 = new ArrayList();
        ((ArrayList) term38).add((Object)null);
        ((ArrayList) term38).add((Object)null);
        ((ArrayList) term38).add((Object)null);
        ((ArrayList) term38).add((Object)null);
        ((ArrayList) term38).add((Object)null);
        term1 = newInstance(Class.forName("com.pfa.app.model.dto.SearchProjectsDto"));
        setField(term1, term1.getClass(), "projectId", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "commitDateFrom", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "commitDateTo", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "dataProjects", term38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.SearchProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1, args);
    }

};


