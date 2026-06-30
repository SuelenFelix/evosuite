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

public class EmployeeShortDto_setLastName_209928637811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977;

    public EmployeeShortDto_setLastName_209928637811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term1028 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term1029 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term977, term977.getClass(), "id", -522618178);
        setField(term977, term977.getClass(), "firstName", "gGSMzuGICf");
        setField(term977, term977.getClass(), "middleName", "hxCBltsObl");
        setField(term977, term977.getClass(), "lastName", "BndsHwAFMv");
        setField(term977, term977.getClass(), "email", "GzFkzHGYFt");
        setBooleanField(term977, term977.getClass(), "isArchived", false);
        setField(term1028, term1028.getClass(), "elements", term1029);
        setField(term977, term977.getClass(), "roles", term1028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        callMethod(klass, "setLastName", argTypes, term977, args);
    }

};


