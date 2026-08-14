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

public class AssignmentDto_getProjectId_1808614983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10591;

    public AssignmentDto_getProjectId_1808614983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10591 = newInstance(Class.forName("com.pfa.app.model.dto.AssignmentDto"));
        setField(term10591, term10591.getClass(), "employeeId", "PNoWXrsFic");
        setField(term10591, term10591.getClass(), "projectId", "QZBHZqZope");
        setField(term10591, term10591.getClass(), "commitDate", "VBUahCvyxC");
        setField(term10591, term10591.getClass(), "commitMgrDesc", "MlzTkzKMCX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.AssignmentDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term10591, args);
    }

};


