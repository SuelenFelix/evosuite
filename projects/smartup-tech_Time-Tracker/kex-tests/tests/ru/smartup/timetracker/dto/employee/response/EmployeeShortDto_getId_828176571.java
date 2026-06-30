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
import java.lang.Object;

public class EmployeeShortDto_getId_828176571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public EmployeeShortDto_getId_828176571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term52 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term53 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term1, term1.getClass(), "id", 568599855);
        setField(term1, term1.getClass(), "firstName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "middleName", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "lastName", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "email", "xxtlPwDYFs");
        setBooleanField(term1, term1.getClass(), "isArchived", false);
        setField(term52, term52.getClass(), "elements", term53);
        setField(term1, term1.getClass(), "roles", term52);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


