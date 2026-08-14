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

public class AssignmentDto_getCommitDate_18607392355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10791;

    public AssignmentDto_getCommitDate_18607392355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10791 = newInstance(Class.forName("com.pfa.app.model.dto.AssignmentDto"));
        setField(term10791, term10791.getClass(), "employeeId", "wrikqJwXvL");
        setField(term10791, term10791.getClass(), "projectId", "UiWhvbypdr");
        setField(term10791, term10791.getClass(), "commitDate", "CgleElJNje");
        setField(term10791, term10791.getClass(), "commitMgrDesc", "ZrchvNGMtd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.AssignmentDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCommitDate", argTypes, term10791, args);
    }

};


