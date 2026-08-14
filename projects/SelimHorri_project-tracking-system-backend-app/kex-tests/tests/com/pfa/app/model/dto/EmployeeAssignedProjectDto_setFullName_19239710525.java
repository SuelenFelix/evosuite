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

public class EmployeeAssignedProjectDto_setFullName_19239710525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12556;

    public EmployeeAssignedProjectDto_setFullName_19239710525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12557 = new Integer(-817164822);
        Boolean term12571 = new Boolean(true);
        term12556 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeAssignedProjectDto"));
        setField(term12556, term12556.getClass(), "employeeId", term12557);
        setField(term12556, term12556.getClass(), "fullName", "iUkOOQhEkw");
        setField(term12556, term12556.getClass(), "verif", term12571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeAssignedProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wmVoFoUVmU";
        callMethod(klass, "setFullName", argTypes, term12556, args);
    }

};


