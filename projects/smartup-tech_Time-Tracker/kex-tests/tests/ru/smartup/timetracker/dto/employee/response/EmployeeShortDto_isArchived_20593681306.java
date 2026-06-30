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

public class EmployeeShortDto_isArchived_20593681306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466;

    public EmployeeShortDto_isArchived_20593681306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term517 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term518 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term466, term466.getClass(), "id", -616727354);
        setField(term466, term466.getClass(), "firstName", "hNxWaHcfhY");
        setField(term466, term466.getClass(), "middleName", "RkybSrpybU");
        setField(term466, term466.getClass(), "lastName", "xOEqzGAmDU");
        setField(term466, term466.getClass(), "email", "eZFUvlxvGV");
        setBooleanField(term466, term466.getClass(), "isArchived", true);
        setField(term517, term517.getClass(), "elements", term518);
        setField(term466, term466.getClass(), "roles", term517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isArchived", argTypes, term466, args);
    }

};


