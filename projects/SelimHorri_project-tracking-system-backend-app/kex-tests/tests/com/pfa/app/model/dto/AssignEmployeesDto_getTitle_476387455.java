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

public class AssignEmployeesDto_getTitle_476387455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11841;

    public AssignEmployeesDto_getTitle_476387455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11866 = new ArrayList();
        ((ArrayList) term11866).add("uWqXrwAsDU");
        ((ArrayList) term11866).add("hgFbWAUtsu");
        ((ArrayList) term11866).add("HqoTWlkbwF");
        ((ArrayList) term11866).add("CwNELDTAPP");
        term11841 = newInstance(Class.forName("com.pfa.app.model.dto.AssignEmployeesDto"));
        setField(term11841, term11841.getClass(), "projectId", "btBLMvHzJg");
        setField(term11841, term11841.getClass(), "title", "JdOMfNWgLP");
        setField(term11841, term11841.getClass(), "assignedEmployees", term11866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.AssignEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term11841, args);
    }

};


