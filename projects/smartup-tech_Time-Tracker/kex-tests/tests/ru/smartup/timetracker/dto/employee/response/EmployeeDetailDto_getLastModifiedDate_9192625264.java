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

public class EmployeeDetailDto_getLastModifiedDate_9192625264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3076;

    public EmployeeDetailDto_getLastModifiedDate_9192625264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3076 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        Object term3077 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term3093 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3096 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3099 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term3100 = (Object[]) newArray("java.lang.Object", 0);
        Object term3102 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3105 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3158 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term3159 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term3077, term3077.getClass(), "id", 1135664017);
        setField(term3077, term3077.getClass(), "name", "xOcJIiQQDu");
        setFloatField(term3077, term3077.getClass(), "externalRate", 0.09123778F);
        setBooleanField(term3077, term3077.getClass(), "isArchived", false);
        setIntField(term3093, term3093.getClass(), "nanos", 80000000);
        setLongField(term3093, term3093.getClass(), "fastTime", 1745452162000L);
        setField(term3093, term3093.getClass(), "cdate", null);
        setField(term3077, term3077.getClass(), "createdDate", term3093);
        setIntField(term3096, term3096.getClass(), "nanos", 960000000);
        setLongField(term3096, term3096.getClass(), "fastTime", 1349058953000L);
        setField(term3096, term3096.getClass(), "cdate", null);
        setField(term3077, term3077.getClass(), "lastModifiedDate", term3096);
        setField(term3076, term3076.getClass(), "position", term3077);
        setField(term3099, term3099.getClass(), "table", term3100);
        setIntField(term3099, term3099.getClass(), "size", 0);
        setField(term3099, term3099.getClass(), "keySet", null);
        setField(term3099, term3099.getClass(), "values", null);
        setField(term3076, term3076.getClass(), "projectRoles", term3099);
        setIntField(term3102, term3102.getClass(), "nanos", 457000000);
        setLongField(term3102, term3102.getClass(), "fastTime", 1706067372000L);
        setField(term3102, term3102.getClass(), "cdate", null);
        setField(term3076, term3076.getClass(), "createdDate", term3102);
        setIntField(term3105, term3105.getClass(), "nanos", 992000000);
        setLongField(term3105, term3105.getClass(), "fastTime", 1863620294000L);
        setField(term3105, term3105.getClass(), "cdate", null);
        setField(term3076, term3076.getClass(), "lastModifiedDate", term3105);
        setIntField(term3076, term3076.getClass(), "id", 590364439);
        setField(term3076, term3076.getClass(), "firstName", "GVizqqzXpy");
        setField(term3076, term3076.getClass(), "middleName", "JqXGgAhZPl");
        setField(term3076, term3076.getClass(), "lastName", "jiKYgYHqIS");
        setField(term3076, term3076.getClass(), "email", "DfISiziTgG");
        setBooleanField(term3076, term3076.getClass(), "isArchived", false);
        setField(term3158, term3158.getClass(), "elements", term3159);
        setField(term3076, term3076.getClass(), "roles", term3158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term3076, args);
    }

};


