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

public class EmployeeAssignedProjectDto_setVerif_18142293197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12632;
     Object term12649;

    public EmployeeAssignedProjectDto_setVerif_18142293197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12633 = new Integer(-1968847291);
        Boolean term12647 = new Boolean(true);
        term12632 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeAssignedProjectDto"));
        setField(term12632, term12632.getClass(), "employeeId", term12633);
        setField(term12632, term12632.getClass(), "fullName", "PsMKIIEwdR");
        setField(term12632, term12632.getClass(), "verif", term12647);
        term12649 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeAssignedProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term12649;
        callMethod(klass, "setVerif", argTypes, term12632, args);
    }

};


