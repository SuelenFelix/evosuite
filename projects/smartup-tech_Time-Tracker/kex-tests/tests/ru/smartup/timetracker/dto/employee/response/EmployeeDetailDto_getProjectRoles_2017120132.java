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

public class EmployeeDetailDto_getProjectRoles_2017120132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2808;

    public EmployeeDetailDto_getProjectRoles_2017120132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2808 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        Object term2809 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term2825 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2828 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2831 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term2832 = (Object[]) newArray("java.lang.Object", 0);
        Object term2834 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2837 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2890 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term2891 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term2809, term2809.getClass(), "id", -6029667);
        setField(term2809, term2809.getClass(), "name", "VgZnGoIFwQ");
        setFloatField(term2809, term2809.getClass(), "externalRate", 0.2707036F);
        setBooleanField(term2809, term2809.getClass(), "isArchived", true);
        setIntField(term2825, term2825.getClass(), "nanos", 302000000);
        setLongField(term2825, term2825.getClass(), "fastTime", 1442628765000L);
        setField(term2825, term2825.getClass(), "cdate", null);
        setField(term2809, term2809.getClass(), "createdDate", term2825);
        setIntField(term2828, term2828.getClass(), "nanos", 18000000);
        setLongField(term2828, term2828.getClass(), "fastTime", 1515879330000L);
        setField(term2828, term2828.getClass(), "cdate", null);
        setField(term2809, term2809.getClass(), "lastModifiedDate", term2828);
        setField(term2808, term2808.getClass(), "position", term2809);
        setField(term2831, term2831.getClass(), "table", term2832);
        setIntField(term2831, term2831.getClass(), "size", 0);
        setField(term2831, term2831.getClass(), "keySet", null);
        setField(term2831, term2831.getClass(), "values", null);
        setField(term2808, term2808.getClass(), "projectRoles", term2831);
        setIntField(term2834, term2834.getClass(), "nanos", 389000000);
        setLongField(term2834, term2834.getClass(), "fastTime", 1429013051000L);
        setField(term2834, term2834.getClass(), "cdate", null);
        setField(term2808, term2808.getClass(), "createdDate", term2834);
        setIntField(term2837, term2837.getClass(), "nanos", 288000000);
        setLongField(term2837, term2837.getClass(), "fastTime", 1495346663000L);
        setField(term2837, term2837.getClass(), "cdate", null);
        setField(term2808, term2808.getClass(), "lastModifiedDate", term2837);
        setIntField(term2808, term2808.getClass(), "id", -2068769794);
        setField(term2808, term2808.getClass(), "firstName", "jUbSRrkrYZ");
        setField(term2808, term2808.getClass(), "middleName", "bWWfajKbEX");
        setField(term2808, term2808.getClass(), "lastName", "cAPeiZHKGJ");
        setField(term2808, term2808.getClass(), "email", "LvJFtLBaxj");
        setBooleanField(term2808, term2808.getClass(), "isArchived", true);
        setField(term2890, term2890.getClass(), "elements", term2891);
        setField(term2808, term2808.getClass(), "roles", term2890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectRoles", argTypes, term2808, args);
    }

};


