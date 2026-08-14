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

public class SearchProjectsDto_setCommitDateTo_11226676377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471;

    public SearchProjectsDto_setCommitDateTo_11226676377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term508 = new ArrayList();
        ((ArrayList) term508).add((Object)null);
        ((ArrayList) term508).add((Object)null);
        term471 = newInstance(Class.forName("com.pfa.app.model.dto.SearchProjectsDto"));
        setField(term471, term471.getClass(), "projectId", "hNxWaHcfhY");
        setField(term471, term471.getClass(), "commitDateFrom", "RkybSrpybU");
        setField(term471, term471.getClass(), "commitDateTo", "xOEqzGAmDU");
        setField(term471, term471.getClass(), "dataProjects", term508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.SearchProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eZFUvlxvGV";
        callMethod(klass, "setCommitDateTo", argTypes, term471, args);
    }

};


