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

public class AssignmentDto_setEmployeeId_1522817612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10480;

    public AssignmentDto_setEmployeeId_1522817612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10480 = newInstance(Class.forName("com.pfa.app.model.dto.AssignmentDto"));
        setField(term10480, term10480.getClass(), "employeeId", "zHvfKaOstO");
        setField(term10480, term10480.getClass(), "projectId", "tOszriqETr");
        setField(term10480, term10480.getClass(), "commitDate", "ncSPTkhKjO");
        setField(term10480, term10480.getClass(), "commitMgrDesc", "jcWKHRWhyj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.AssignmentDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nrQjODRMLD";
        callMethod(klass, "setEmployeeId", argTypes, term10480, args);
    }

};


