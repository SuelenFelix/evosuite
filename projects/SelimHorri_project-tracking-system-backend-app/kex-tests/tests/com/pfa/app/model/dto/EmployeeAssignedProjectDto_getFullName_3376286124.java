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
import java.lang.Integer;
import java.lang.Boolean;

public class EmployeeAssignedProjectDto_getFullName_3376286124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12529;

    public EmployeeAssignedProjectDto_getFullName_3376286124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12530 = new Integer(1876565163);
        Boolean term12544 = new Boolean(false);
        term12529 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeAssignedProjectDto"));
        setField(term12529, term12529.getClass(), "employeeId", term12530);
        setField(term12529, term12529.getClass(), "fullName", "BjZQdecXvB");
        setField(term12529, term12529.getClass(), "verif", term12544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeAssignedProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullName", argTypes, term12529, args);
    }

};


