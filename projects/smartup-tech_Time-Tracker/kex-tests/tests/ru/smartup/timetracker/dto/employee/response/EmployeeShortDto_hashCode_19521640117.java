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

public class EmployeeShortDto_hashCode_19521640117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2430;

    public EmployeeShortDto_hashCode_19521640117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2430 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term2481 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term2482 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term2430, term2430.getClass(), "id", -1456670397);
        setField(term2430, term2430.getClass(), "firstName", "tPlsykYBqO");
        setField(term2430, term2430.getClass(), "middleName", "bLPjGVBhlX");
        setField(term2430, term2430.getClass(), "lastName", "whBvTVIIlC");
        setField(term2430, term2430.getClass(), "email", "IgRJUzaCwW");
        setBooleanField(term2430, term2430.getClass(), "isArchived", true);
        setField(term2481, term2481.getClass(), "elements", term2482);
        setField(term2430, term2430.getClass(), "roles", term2481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2430, args);
    }

};


