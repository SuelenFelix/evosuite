package ru.smartup.timetracker.dto.employee.request;

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
import static ru.smartup.timetracker.dto.employee.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class EmployeeUpdateDto_setMiddleName_17529485129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6803;

    public EmployeeUpdateDto_setMiddleName_17529485129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6865 = new ArrayList();
        term6803 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term6803, term6803.getClass(), "firstName", "UlajhuVLaP");
        setField(term6803, term6803.getClass(), "middleName", "gGSMzuGICf");
        setField(term6803, term6803.getClass(), "lastName", "hxCBltsObl");
        setField(term6803, term6803.getClass(), "email", "BndsHwAFMv");
        setField(term6803, term6803.getClass(), "password", "GzFkzHGYFt");
        setIntField(term6803, term6803.getClass(), "positionId", 1227103734);
        setField(term6803, term6803.getClass(), "roles", term6865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        callMethod(klass, "setMiddleName", argTypes, term6803, args);
    }

};


