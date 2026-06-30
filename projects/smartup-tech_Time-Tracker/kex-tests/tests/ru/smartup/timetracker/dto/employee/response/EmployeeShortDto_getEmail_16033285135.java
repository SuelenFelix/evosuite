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

public class EmployeeShortDto_getEmail_16033285135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373;

    public EmployeeShortDto_getEmail_16033285135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term424 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term425 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term373, term373.getClass(), "id", -1922583790);
        setField(term373, term373.getClass(), "firstName", "ZiaGIbnzTs");
        setField(term373, term373.getClass(), "middleName", "tbcdzjIfER");
        setField(term373, term373.getClass(), "lastName", "HyxfbSQYBe");
        setField(term373, term373.getClass(), "email", "pCTimMblYc");
        setBooleanField(term373, term373.getClass(), "isArchived", true);
        setField(term424, term424.getClass(), "elements", term425);
        setField(term373, term373.getClass(), "roles", term424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term373, args);
    }

};


