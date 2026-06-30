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

public class EmployeeDetailDto_getCreatedDate_20998424953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2942;

    public EmployeeDetailDto_getCreatedDate_20998424953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2942 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        Object term2943 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term2959 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2962 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2965 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term2966 = (Object[]) newArray("java.lang.Object", 0);
        Object term2968 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2971 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3024 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term3025 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term2943, term2943.getClass(), "id", -117576464);
        setField(term2943, term2943.getClass(), "name", "PHvxnGHptP");
        setFloatField(term2943, term2943.getClass(), "externalRate", 0.3455959F);
        setBooleanField(term2943, term2943.getClass(), "isArchived", true);
        setIntField(term2959, term2959.getClass(), "nanos", 896000000);
        setLongField(term2959, term2959.getClass(), "fastTime", 1645823234000L);
        setField(term2959, term2959.getClass(), "cdate", null);
        setField(term2943, term2943.getClass(), "createdDate", term2959);
        setIntField(term2962, term2962.getClass(), "nanos", 23000000);
        setLongField(term2962, term2962.getClass(), "fastTime", 1500710268000L);
        setField(term2962, term2962.getClass(), "cdate", null);
        setField(term2943, term2943.getClass(), "lastModifiedDate", term2962);
        setField(term2942, term2942.getClass(), "position", term2943);
        setField(term2965, term2965.getClass(), "table", term2966);
        setIntField(term2965, term2965.getClass(), "size", 0);
        setField(term2965, term2965.getClass(), "keySet", null);
        setField(term2965, term2965.getClass(), "values", null);
        setField(term2942, term2942.getClass(), "projectRoles", term2965);
        setIntField(term2968, term2968.getClass(), "nanos", 25000000);
        setLongField(term2968, term2968.getClass(), "fastTime", 1797192828000L);
        setField(term2968, term2968.getClass(), "cdate", null);
        setField(term2942, term2942.getClass(), "createdDate", term2968);
        setIntField(term2971, term2971.getClass(), "nanos", 30000000);
        setLongField(term2971, term2971.getClass(), "fastTime", 1589447121000L);
        setField(term2971, term2971.getClass(), "cdate", null);
        setField(term2942, term2942.getClass(), "lastModifiedDate", term2971);
        setIntField(term2942, term2942.getClass(), "id", -1007160944);
        setField(term2942, term2942.getClass(), "firstName", "TimdotUuNC");
        setField(term2942, term2942.getClass(), "middleName", "PkWMRdJcBb");
        setField(term2942, term2942.getClass(), "lastName", "jSpAteRute");
        setField(term2942, term2942.getClass(), "email", "swZVeJAxjt");
        setBooleanField(term2942, term2942.getClass(), "isArchived", true);
        setField(term3024, term3024.getClass(), "elements", term3025);
        setField(term2942, term2942.getClass(), "roles", term3024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term2942, args);
    }

};


