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

public class EmployeeShortDto_setFirstName_5330396809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747;

    public EmployeeShortDto_setFirstName_5330396809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term747 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term798 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term799 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term747, term747.getClass(), "id", -1339778481);
        setField(term747, term747.getClass(), "firstName", "AijpHYOFuy");
        setField(term747, term747.getClass(), "middleName", "SbAoxhfrkn");
        setField(term747, term747.getClass(), "lastName", "kuTXqwMtDB");
        setField(term747, term747.getClass(), "email", "Ghbwtircqb");
        setBooleanField(term747, term747.getClass(), "isArchived", false);
        setField(term798, term798.getClass(), "elements", term799);
        setField(term747, term747.getClass(), "roles", term798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xrwlQZdwCp";
        callMethod(klass, "setFirstName", argTypes, term747, args);
    }

};


