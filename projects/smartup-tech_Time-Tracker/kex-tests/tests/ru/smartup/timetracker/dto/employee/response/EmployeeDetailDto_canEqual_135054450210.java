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

public class EmployeeDetailDto_canEqual_135054450210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3936;
     Object term4020;

    public EmployeeDetailDto_canEqual_135054450210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3936 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        Object term3937 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term3953 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3956 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3959 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term3960 = (Object[]) newArray("java.lang.Object", 0);
        Object term3962 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3965 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4018 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term4019 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term3937, term3937.getClass(), "id", -1145578966);
        setField(term3937, term3937.getClass(), "name", "WzMEhMXkKx");
        setFloatField(term3937, term3937.getClass(), "externalRate", 0.40176582F);
        setBooleanField(term3937, term3937.getClass(), "isArchived", true);
        setIntField(term3953, term3953.getClass(), "nanos", 488000000);
        setLongField(term3953, term3953.getClass(), "fastTime", 1405268389000L);
        setField(term3953, term3953.getClass(), "cdate", null);
        setField(term3937, term3937.getClass(), "createdDate", term3953);
        setIntField(term3956, term3956.getClass(), "nanos", 50000000);
        setLongField(term3956, term3956.getClass(), "fastTime", 1822693844000L);
        setField(term3956, term3956.getClass(), "cdate", null);
        setField(term3937, term3937.getClass(), "lastModifiedDate", term3956);
        setField(term3936, term3936.getClass(), "position", term3937);
        setField(term3959, term3959.getClass(), "table", term3960);
        setIntField(term3959, term3959.getClass(), "size", 0);
        setField(term3959, term3959.getClass(), "keySet", null);
        setField(term3959, term3959.getClass(), "values", null);
        setField(term3936, term3936.getClass(), "projectRoles", term3959);
        setIntField(term3962, term3962.getClass(), "nanos", 298000000);
        setLongField(term3962, term3962.getClass(), "fastTime", 1678166815000L);
        setField(term3962, term3962.getClass(), "cdate", null);
        setField(term3936, term3936.getClass(), "createdDate", term3962);
        setIntField(term3965, term3965.getClass(), "nanos", 186000000);
        setLongField(term3965, term3965.getClass(), "fastTime", 1666065487000L);
        setField(term3965, term3965.getClass(), "cdate", null);
        setField(term3936, term3936.getClass(), "lastModifiedDate", term3965);
        setIntField(term3936, term3936.getClass(), "id", 679763016);
        setField(term3936, term3936.getClass(), "firstName", "XOiDvlDhdc");
        setField(term3936, term3936.getClass(), "middleName", "AdxvLJhNLe");
        setField(term3936, term3936.getClass(), "lastName", "lHfTrWKMPk");
        setField(term3936, term3936.getClass(), "email", "JDaAnsVTGV");
        setBooleanField(term3936, term3936.getClass(), "isArchived", false);
        setField(term4018, term4018.getClass(), "elements", term4019);
        setField(term3936, term3936.getClass(), "roles", term4018);
        term4020 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4020;
        callMethod(klass, "canEqual", argTypes, term3936, args);
    }

};


