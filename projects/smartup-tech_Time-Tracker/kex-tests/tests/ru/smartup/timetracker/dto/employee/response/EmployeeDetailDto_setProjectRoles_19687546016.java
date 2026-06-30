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
import java.util.LinkedHashMap;

public class EmployeeDetailDto_setProjectRoles_19687546016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3376;
     Object term3460;

    public EmployeeDetailDto_setProjectRoles_19687546016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3376 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        Object term3377 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term3393 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3396 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3399 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term3400 = (Object[]) newArray("java.lang.Object", 0);
        Object term3402 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3405 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3458 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term3459 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term3377, term3377.getClass(), "id", -203030934);
        setField(term3377, term3377.getClass(), "name", "AWRooQKkdW");
        setFloatField(term3377, term3377.getClass(), "externalRate", 0.5446086F);
        setBooleanField(term3377, term3377.getClass(), "isArchived", true);
        setIntField(term3393, term3393.getClass(), "nanos", 394000000);
        setLongField(term3393, term3393.getClass(), "fastTime", 1538068116000L);
        setField(term3393, term3393.getClass(), "cdate", null);
        setField(term3377, term3377.getClass(), "createdDate", term3393);
        setIntField(term3396, term3396.getClass(), "nanos", 937000000);
        setLongField(term3396, term3396.getClass(), "fastTime", 1744079265000L);
        setField(term3396, term3396.getClass(), "cdate", null);
        setField(term3377, term3377.getClass(), "lastModifiedDate", term3396);
        setField(term3376, term3376.getClass(), "position", term3377);
        setField(term3399, term3399.getClass(), "table", term3400);
        setIntField(term3399, term3399.getClass(), "size", 0);
        setField(term3399, term3399.getClass(), "keySet", null);
        setField(term3399, term3399.getClass(), "values", null);
        setField(term3376, term3376.getClass(), "projectRoles", term3399);
        setIntField(term3402, term3402.getClass(), "nanos", 385000000);
        setLongField(term3402, term3402.getClass(), "fastTime", 1347389761000L);
        setField(term3402, term3402.getClass(), "cdate", null);
        setField(term3376, term3376.getClass(), "createdDate", term3402);
        setIntField(term3405, term3405.getClass(), "nanos", 899000000);
        setLongField(term3405, term3405.getClass(), "fastTime", 1502147353000L);
        setField(term3405, term3405.getClass(), "cdate", null);
        setField(term3376, term3376.getClass(), "lastModifiedDate", term3405);
        setIntField(term3376, term3376.getClass(), "id", -1179120542);
        setField(term3376, term3376.getClass(), "firstName", "vjxIhXHxGR");
        setField(term3376, term3376.getClass(), "middleName", "QXzGXbEXMu");
        setField(term3376, term3376.getClass(), "lastName", "qxSDVejjiY");
        setField(term3376, term3376.getClass(), "email", "xBsXSDjXYK");
        setBooleanField(term3376, term3376.getClass(), "isArchived", true);
        setField(term3458, term3458.getClass(), "elements", term3459);
        setField(term3376, term3376.getClass(), "roles", term3458);
        term3460 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term3460;
        callMethod(klass, "setProjectRoles", argTypes, term3376, args);
    }

};


