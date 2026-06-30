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

public class EmployeeDetailDto_toString_118081380012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4205;

    public EmployeeDetailDto_toString_118081380012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4205 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        Object term4206 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term4222 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4225 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4228 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term4229 = (Object[]) newArray("java.lang.Object", 0);
        Object term4231 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4234 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4287 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term4288 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term4206, term4206.getClass(), "id", -602026508);
        setField(term4206, term4206.getClass(), "name", "xJgPlLxpgC");
        setFloatField(term4206, term4206.getClass(), "externalRate", 0.26413453F);
        setBooleanField(term4206, term4206.getClass(), "isArchived", true);
        setIntField(term4222, term4222.getClass(), "nanos", 811000000);
        setLongField(term4222, term4222.getClass(), "fastTime", 1741433763000L);
        setField(term4222, term4222.getClass(), "cdate", null);
        setField(term4206, term4206.getClass(), "createdDate", term4222);
        setIntField(term4225, term4225.getClass(), "nanos", 322000000);
        setLongField(term4225, term4225.getClass(), "fastTime", 1761983901000L);
        setField(term4225, term4225.getClass(), "cdate", null);
        setField(term4206, term4206.getClass(), "lastModifiedDate", term4225);
        setField(term4205, term4205.getClass(), "position", term4206);
        setField(term4228, term4228.getClass(), "table", term4229);
        setIntField(term4228, term4228.getClass(), "size", 0);
        setField(term4228, term4228.getClass(), "keySet", null);
        setField(term4228, term4228.getClass(), "values", null);
        setField(term4205, term4205.getClass(), "projectRoles", term4228);
        setIntField(term4231, term4231.getClass(), "nanos", 458000000);
        setLongField(term4231, term4231.getClass(), "fastTime", 1695414469000L);
        setField(term4231, term4231.getClass(), "cdate", null);
        setField(term4205, term4205.getClass(), "createdDate", term4231);
        setIntField(term4234, term4234.getClass(), "nanos", 394000000);
        setLongField(term4234, term4234.getClass(), "fastTime", 1362769763000L);
        setField(term4234, term4234.getClass(), "cdate", null);
        setField(term4205, term4205.getClass(), "lastModifiedDate", term4234);
        setIntField(term4205, term4205.getClass(), "id", -157887805);
        setField(term4205, term4205.getClass(), "firstName", "EYtfuJaxiM");
        setField(term4205, term4205.getClass(), "middleName", "gCWtLVKVVe");
        setField(term4205, term4205.getClass(), "lastName", "fWKJoSoCwE");
        setField(term4205, term4205.getClass(), "email", "wfaXBpWAUH");
        setBooleanField(term4205, term4205.getClass(), "isArchived", true);
        setField(term4287, term4287.getClass(), "elements", term4288);
        setField(term4205, term4205.getClass(), "roles", term4287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4205, args);
    }

};


