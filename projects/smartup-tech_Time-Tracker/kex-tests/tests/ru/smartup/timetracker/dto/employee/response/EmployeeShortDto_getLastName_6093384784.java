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

public class EmployeeShortDto_getLastName_6093384784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280;

    public EmployeeShortDto_getLastName_6093384784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term331 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term332 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term280, term280.getClass(), "id", 391863371);
        setField(term280, term280.getClass(), "firstName", "MxlszYVzRf");
        setField(term280, term280.getClass(), "middleName", "LQFpaHEwXR");
        setField(term280, term280.getClass(), "lastName", "oVcInYnLWB");
        setField(term280, term280.getClass(), "email", "aJlieCFVtF");
        setBooleanField(term280, term280.getClass(), "isArchived", false);
        setField(term331, term331.getClass(), "elements", term332);
        setField(term280, term280.getClass(), "roles", term331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term280, args);
    }

};


