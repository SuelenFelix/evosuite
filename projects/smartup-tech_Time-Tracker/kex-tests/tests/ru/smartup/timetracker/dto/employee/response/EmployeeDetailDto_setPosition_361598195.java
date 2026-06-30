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

public class EmployeeDetailDto_setPosition_361598195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3210;
     Object term3294;

    public EmployeeDetailDto_setPosition_361598195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3210 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        Object term3211 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term3227 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3230 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3233 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term3234 = (Object[]) newArray("java.lang.Object", 0);
        Object term3236 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3239 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3292 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term3293 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term3211, term3211.getClass(), "id", 865208305);
        setField(term3211, term3211.getClass(), "name", "XqgfKFvPSD");
        setFloatField(term3211, term3211.getClass(), "externalRate", 0.5523636F);
        setBooleanField(term3211, term3211.getClass(), "isArchived", false);
        setIntField(term3227, term3227.getClass(), "nanos", 364000000);
        setLongField(term3227, term3227.getClass(), "fastTime", 1882628084000L);
        setField(term3227, term3227.getClass(), "cdate", null);
        setField(term3211, term3211.getClass(), "createdDate", term3227);
        setIntField(term3230, term3230.getClass(), "nanos", 580000000);
        setLongField(term3230, term3230.getClass(), "fastTime", 1437746523000L);
        setField(term3230, term3230.getClass(), "cdate", null);
        setField(term3211, term3211.getClass(), "lastModifiedDate", term3230);
        setField(term3210, term3210.getClass(), "position", term3211);
        setField(term3233, term3233.getClass(), "table", term3234);
        setIntField(term3233, term3233.getClass(), "size", 0);
        setField(term3233, term3233.getClass(), "keySet", null);
        setField(term3233, term3233.getClass(), "values", null);
        setField(term3210, term3210.getClass(), "projectRoles", term3233);
        setIntField(term3236, term3236.getClass(), "nanos", 825000000);
        setLongField(term3236, term3236.getClass(), "fastTime", 1668558429000L);
        setField(term3236, term3236.getClass(), "cdate", null);
        setField(term3210, term3210.getClass(), "createdDate", term3236);
        setIntField(term3239, term3239.getClass(), "nanos", 647000000);
        setLongField(term3239, term3239.getClass(), "fastTime", 1725111417000L);
        setField(term3239, term3239.getClass(), "cdate", null);
        setField(term3210, term3210.getClass(), "lastModifiedDate", term3239);
        setIntField(term3210, term3210.getClass(), "id", -1275173084);
        setField(term3210, term3210.getClass(), "firstName", "JiVRgTZvKc");
        setField(term3210, term3210.getClass(), "middleName", "XPKmummaqg");
        setField(term3210, term3210.getClass(), "lastName", "BKLfkLiZTH");
        setField(term3210, term3210.getClass(), "email", "SPpkrGcPRr");
        setBooleanField(term3210, term3210.getClass(), "isArchived", true);
        setField(term3292, term3292.getClass(), "elements", term3293);
        setField(term3210, term3210.getClass(), "roles", term3292);
        term3294 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term3310 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3313 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term3294, term3294.getClass(), "id", -244121226);
        setField(term3294, term3294.getClass(), "name", "sEccwbJKYE");
        setFloatField(term3294, term3294.getClass(), "externalRate", 0.8564069F);
        setBooleanField(term3294, term3294.getClass(), "isArchived", true);
        setIntField(term3310, term3310.getClass(), "nanos", 689000000);
        setLongField(term3310, term3310.getClass(), "fastTime", 1550688194000L);
        setField(term3310, term3310.getClass(), "cdate", null);
        setField(term3294, term3294.getClass(), "createdDate", term3310);
        setIntField(term3313, term3313.getClass(), "nanos", 131000000);
        setLongField(term3313, term3313.getClass(), "fastTime", 1804987287000L);
        setField(term3313, term3313.getClass(), "cdate", null);
        setField(term3294, term3294.getClass(), "lastModifiedDate", term3313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Object[] args = new Object[1];
        args[0] = term3294;
        callMethod(klass, "setPosition", argTypes, term3210, args);
    }

};


