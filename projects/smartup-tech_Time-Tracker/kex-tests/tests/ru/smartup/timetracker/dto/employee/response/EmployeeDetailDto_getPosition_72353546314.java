package ru.smartup.timetracker.dto.employee.response;

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
import static ru.smartup.timetracker.dto.employee.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmployeeDetailDto_getPosition_72353546314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4339;

    public EmployeeDetailDto_getPosition_72353546314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4339 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        setField(term4339, term4339.getClass(), "position", null);
        setField(term4339, term4339.getClass(), "projectRoles", null);
        setField(term4339, term4339.getClass(), "createdDate", null);
        setField(term4339, term4339.getClass(), "lastModifiedDate", null);
        setIntField(term4339, term4339.getClass(), "id", 0);
        setField(term4339, term4339.getClass(), "firstName", null);
        setField(term4339, term4339.getClass(), "middleName", null);
        setField(term4339, term4339.getClass(), "lastName", null);
        setField(term4339, term4339.getClass(), "email", null);
        setBooleanField(term4339, term4339.getClass(), "isArchived", false);
        setField(term4339, term4339.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPosition", argTypes, term4339, args);
    }

};


