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

public class EmployeeShortDto_toString_31554328918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2523;

    public EmployeeShortDto_toString_31554328918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2523 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term2574 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term2575 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term2523, term2523.getClass(), "id", 1622346318);
        setField(term2523, term2523.getClass(), "firstName", "JUmudUmaaV");
        setField(term2523, term2523.getClass(), "middleName", "KoyGrUJeJW");
        setField(term2523, term2523.getClass(), "lastName", "HqBOwkVqjD");
        setField(term2523, term2523.getClass(), "email", "MAcUBcBckh");
        setBooleanField(term2523, term2523.getClass(), "isArchived", false);
        setField(term2574, term2574.getClass(), "elements", term2575);
        setField(term2523, term2523.getClass(), "roles", term2574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2523, args);
    }

};


