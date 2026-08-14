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

public class EmployeeAssignedProjectDto_setEmployeeId_21381403223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12500;
     Object term12517;

    public EmployeeAssignedProjectDto_setEmployeeId_21381403223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12501 = new Integer(-602026508);
        Boolean term12515 = new Boolean(false);
        term12500 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeAssignedProjectDto"));
        setField(term12500, term12500.getClass(), "employeeId", term12501);
        setField(term12500, term12500.getClass(), "fullName", "iVOvTzOxwt");
        setField(term12500, term12500.getClass(), "verif", term12515);
        term12517 = new Integer(-157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeAssignedProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term12517;
        callMethod(klass, "setEmployeeId", argTypes, term12500, args);
    }

};


