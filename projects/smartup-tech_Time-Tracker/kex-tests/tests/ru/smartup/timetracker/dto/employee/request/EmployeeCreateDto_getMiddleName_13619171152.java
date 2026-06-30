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

public class EmployeeCreateDto_getMiddleName_13619171152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15579;

    public EmployeeCreateDto_getMiddleName_13619171152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15641 = new ArrayList();
        term15579 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term15579, term15579.getClass(), "firstName", "SPpkrGcPRr");
        setField(term15579, term15579.getClass(), "middleName", "sEccwbJKYE");
        setField(term15579, term15579.getClass(), "lastName", "AWRooQKkdW");
        setField(term15579, term15579.getClass(), "email", "vjxIhXHxGR");
        setField(term15579, term15579.getClass(), "password", "QXzGXbEXMu");
        setIntField(term15579, term15579.getClass(), "positionId", -655067527);
        setField(term15579, term15579.getClass(), "roles", term15641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMiddleName", argTypes, term15579, args);
    }

};


