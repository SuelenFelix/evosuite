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

public class EmployeeShortDto_getRoles_20183355257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559;

    public EmployeeShortDto_getRoles_20183355257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term610 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term611 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term559, term559.getClass(), "id", -1955890973);
        setField(term559, term559.getClass(), "firstName", "BYqFIqCKAV");
        setField(term559, term559.getClass(), "middleName", "vrQLuWIDJX");
        setField(term559, term559.getClass(), "lastName", "flxyYxBRtu");
        setField(term559, term559.getClass(), "email", "OclPbYPkcH");
        setBooleanField(term559, term559.getClass(), "isArchived", true);
        setField(term610, term610.getClass(), "elements", term611);
        setField(term559, term559.getClass(), "roles", term610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term559, args);
    }

};


