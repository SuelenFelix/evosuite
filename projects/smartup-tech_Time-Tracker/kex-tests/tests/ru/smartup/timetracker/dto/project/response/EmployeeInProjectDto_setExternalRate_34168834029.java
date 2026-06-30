package ru.smartup.timetracker.dto.project.response;

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
import static ru.smartup.timetracker.dto.project.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmployeeInProjectDto_setExternalRate_34168834029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11054;

    public EmployeeInProjectDto_setExternalRate_34168834029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11054 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term11054, term11054.getClass(), "id", 0);
        setField(term11054, term11054.getClass(), "firstName", null);
        setField(term11054, term11054.getClass(), "middleName", null);
        setField(term11054, term11054.getClass(), "lastName", null);
        setField(term11054, term11054.getClass(), "projectRoleId", null);
        setField(term11054, term11054.getClass(), "externalRate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Float");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExternalRate", argTypes, term11054, args);
    }

};


