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

public class EmployeeDetailDto_equals_21402601659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3801;
     Object term3885;

    public EmployeeDetailDto_equals_21402601659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3801 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        Object term3802 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term3818 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3821 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3824 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term3825 = (Object[]) newArray("java.lang.Object", 0);
        Object term3827 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3830 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3883 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term3884 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term3802, term3802.getClass(), "id", -1530420153);
        setField(term3802, term3802.getClass(), "name", "XylxrMBraH");
        setFloatField(term3802, term3802.getClass(), "externalRate", 0.6880585F);
        setBooleanField(term3802, term3802.getClass(), "isArchived", true);
        setIntField(term3818, term3818.getClass(), "nanos", 101000000);
        setLongField(term3818, term3818.getClass(), "fastTime", 1488715102000L);
        setField(term3818, term3818.getClass(), "cdate", null);
        setField(term3802, term3802.getClass(), "createdDate", term3818);
        setIntField(term3821, term3821.getClass(), "nanos", 361000000);
        setLongField(term3821, term3821.getClass(), "fastTime", 1311549317000L);
        setField(term3821, term3821.getClass(), "cdate", null);
        setField(term3802, term3802.getClass(), "lastModifiedDate", term3821);
        setField(term3801, term3801.getClass(), "position", term3802);
        setField(term3824, term3824.getClass(), "table", term3825);
        setIntField(term3824, term3824.getClass(), "size", 0);
        setField(term3824, term3824.getClass(), "keySet", null);
        setField(term3824, term3824.getClass(), "values", null);
        setField(term3801, term3801.getClass(), "projectRoles", term3824);
        setIntField(term3827, term3827.getClass(), "nanos", 842000000);
        setLongField(term3827, term3827.getClass(), "fastTime", 1595506783000L);
        setField(term3827, term3827.getClass(), "cdate", null);
        setField(term3801, term3801.getClass(), "createdDate", term3827);
        setIntField(term3830, term3830.getClass(), "nanos", 888000000);
        setLongField(term3830, term3830.getClass(), "fastTime", 1464410989000L);
        setField(term3830, term3830.getClass(), "cdate", null);
        setField(term3801, term3801.getClass(), "lastModifiedDate", term3830);
        setIntField(term3801, term3801.getClass(), "id", -469968304);
        setField(term3801, term3801.getClass(), "firstName", "pORebkoRdD");
        setField(term3801, term3801.getClass(), "middleName", "mXGCWJDOqA");
        setField(term3801, term3801.getClass(), "lastName", "dpNsDgfPso");
        setField(term3801, term3801.getClass(), "email", "hCWPJQKpdc");
        setBooleanField(term3801, term3801.getClass(), "isArchived", true);
        setField(term3883, term3883.getClass(), "elements", term3884);
        setField(term3801, term3801.getClass(), "roles", term3883);
        term3885 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3885;
        callMethod(klass, "equals", argTypes, term3801, args);
    }

};


