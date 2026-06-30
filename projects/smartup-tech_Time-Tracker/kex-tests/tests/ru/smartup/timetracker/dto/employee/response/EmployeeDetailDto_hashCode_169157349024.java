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

public class EmployeeDetailDto_hashCode_169157349024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4369;

    public EmployeeDetailDto_hashCode_169157349024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4369 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        setField(term4369, term4369.getClass(), "position", null);
        setField(term4369, term4369.getClass(), "projectRoles", null);
        setField(term4369, term4369.getClass(), "createdDate", null);
        setField(term4369, term4369.getClass(), "lastModifiedDate", null);
        setIntField(term4369, term4369.getClass(), "id", 0);
        setField(term4369, term4369.getClass(), "firstName", null);
        setField(term4369, term4369.getClass(), "middleName", null);
        setField(term4369, term4369.getClass(), "lastName", null);
        setField(term4369, term4369.getClass(), "email", null);
        setBooleanField(term4369, term4369.getClass(), "isArchived", false);
        setField(term4369, term4369.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4369, args);
    }

};


