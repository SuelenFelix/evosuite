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

public class EmployeeDetailDto_setLastModifiedDate_9649688208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3664;
     Object term3748;

    public EmployeeDetailDto_setLastModifiedDate_9649688208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3664 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        Object term3665 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term3681 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3684 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3687 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term3688 = (Object[]) newArray("java.lang.Object", 0);
        Object term3690 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3693 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3746 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term3747 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term3665, term3665.getClass(), "id", 1193880199);
        setField(term3665, term3665.getClass(), "name", "OEXDRUKcFl");
        setFloatField(term3665, term3665.getClass(), "externalRate", 0.2857073F);
        setBooleanField(term3665, term3665.getClass(), "isArchived", false);
        setIntField(term3681, term3681.getClass(), "nanos", 367000000);
        setLongField(term3681, term3681.getClass(), "fastTime", 1691857668000L);
        setField(term3681, term3681.getClass(), "cdate", null);
        setField(term3665, term3665.getClass(), "createdDate", term3681);
        setIntField(term3684, term3684.getClass(), "nanos", 632000000);
        setLongField(term3684, term3684.getClass(), "fastTime", 1442359734000L);
        setField(term3684, term3684.getClass(), "cdate", null);
        setField(term3665, term3665.getClass(), "lastModifiedDate", term3684);
        setField(term3664, term3664.getClass(), "position", term3665);
        setField(term3687, term3687.getClass(), "table", term3688);
        setIntField(term3687, term3687.getClass(), "size", 0);
        setField(term3687, term3687.getClass(), "keySet", null);
        setField(term3687, term3687.getClass(), "values", null);
        setField(term3664, term3664.getClass(), "projectRoles", term3687);
        setIntField(term3690, term3690.getClass(), "nanos", 918000000);
        setLongField(term3690, term3690.getClass(), "fastTime", 1659983392000L);
        setField(term3690, term3690.getClass(), "cdate", null);
        setField(term3664, term3664.getClass(), "createdDate", term3690);
        setIntField(term3693, term3693.getClass(), "nanos", 559000000);
        setLongField(term3693, term3693.getClass(), "fastTime", 1876862000000L);
        setField(term3693, term3693.getClass(), "cdate", null);
        setField(term3664, term3664.getClass(), "lastModifiedDate", term3693);
        setIntField(term3664, term3664.getClass(), "id", -1087774327);
        setField(term3664, term3664.getClass(), "firstName", "RYdKCNNMBR");
        setField(term3664, term3664.getClass(), "middleName", "yGtHPyvYiQ");
        setField(term3664, term3664.getClass(), "lastName", "MvRIxilFMJ");
        setField(term3664, term3664.getClass(), "email", "iNwOJRBEjp");
        setBooleanField(term3664, term3664.getClass(), "isArchived", true);
        setField(term3746, term3746.getClass(), "elements", term3747);
        setField(term3664, term3664.getClass(), "roles", term3746);
        term3748 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term3748, term3748.getClass(), "nanos", 366000000);
        setLongField(term3748, term3748.getClass(), "fastTime", 1304521299000L);
        setField(term3748, term3748.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term3748;
        callMethod(klass, "setLastModifiedDate", argTypes, term3664, args);
    }

};


