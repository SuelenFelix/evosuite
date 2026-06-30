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

public class EmployeeDetailDto_hashCode_169157349011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4071;

    public EmployeeDetailDto_hashCode_169157349011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4071 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        Object term4072 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term4088 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4091 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4094 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term4095 = (Object[]) newArray("java.lang.Object", 0);
        Object term4097 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4100 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4153 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term4154 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term4072, term4072.getClass(), "id", 1962444399);
        setField(term4072, term4072.getClass(), "name", "mLUZFTfjle");
        setFloatField(term4072, term4072.getClass(), "externalRate", 0.8783184F);
        setBooleanField(term4072, term4072.getClass(), "isArchived", false);
        setIntField(term4088, term4088.getClass(), "nanos", 434000000);
        setLongField(term4088, term4088.getClass(), "fastTime", 1426008074000L);
        setField(term4088, term4088.getClass(), "cdate", null);
        setField(term4072, term4072.getClass(), "createdDate", term4088);
        setIntField(term4091, term4091.getClass(), "nanos", 487000000);
        setLongField(term4091, term4091.getClass(), "fastTime", 1632993975000L);
        setField(term4091, term4091.getClass(), "cdate", null);
        setField(term4072, term4072.getClass(), "lastModifiedDate", term4091);
        setField(term4071, term4071.getClass(), "position", term4072);
        setField(term4094, term4094.getClass(), "table", term4095);
        setIntField(term4094, term4094.getClass(), "size", 0);
        setField(term4094, term4094.getClass(), "keySet", null);
        setField(term4094, term4094.getClass(), "values", null);
        setField(term4071, term4071.getClass(), "projectRoles", term4094);
        setIntField(term4097, term4097.getClass(), "nanos", 549000000);
        setLongField(term4097, term4097.getClass(), "fastTime", 1819180838000L);
        setField(term4097, term4097.getClass(), "cdate", null);
        setField(term4071, term4071.getClass(), "createdDate", term4097);
        setIntField(term4100, term4100.getClass(), "nanos", 698000000);
        setLongField(term4100, term4100.getClass(), "fastTime", 1400680978000L);
        setField(term4100, term4100.getClass(), "cdate", null);
        setField(term4071, term4071.getClass(), "lastModifiedDate", term4100);
        setIntField(term4071, term4071.getClass(), "id", 767834723);
        setField(term4071, term4071.getClass(), "firstName", "xIeFjkHkOe");
        setField(term4071, term4071.getClass(), "middleName", "SdCKLMIYnX");
        setField(term4071, term4071.getClass(), "lastName", "OJJtVNPyKZ");
        setField(term4071, term4071.getClass(), "email", "AKNapTAfmD");
        setBooleanField(term4071, term4071.getClass(), "isArchived", false);
        setField(term4153, term4153.getClass(), "elements", term4154);
        setField(term4071, term4071.getClass(), "roles", term4153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4071, args);
    }

};


