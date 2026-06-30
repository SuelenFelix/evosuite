package ru.smartup.timetracker.dto.employee.request.param;

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
import static ru.smartup.timetracker.dto.employee.request.param.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmployeeParamRequestDto_isArchive_2865283201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;

    public EmployeeParamRequestDto_isArchive_2865283201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.param.EmployeeParamRequestDto"));
        setField(term5, term5.getClass(), "query", "");
        setBooleanField(term5, term5.getClass(), "archive", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.param.EmployeeParamRequestDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isArchive", argTypes, term5, args);
    }

};


