package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;

public class FreezeRecord_hashCode_204272848120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61169;

    public FreezeRecord_hashCode_204272848120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term61246 = new HashMap();
        Set<Object> term61342 =  ((Map) term61246).keySet();
        HashSet term61245 = new HashSet((Collection<? extends Object>) term61342);
        Class<? extends Object> term61344 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term61343 = ((Class) term61344).getDeclaredField((String) "EMPLOYEE");
        ((Field) term61343).setAccessible(true);
        Object enum141 = ((Field) term61343).get((Object) null);
        Float term61257 = new Float(0.30827713F);
        Class<? extends Object> term61685 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term61684 = ((Class) term61685).getDeclaredField((String) "INTERRUPTED");
        ((Field) term61684).setAccessible(true);
        Object enum142 = ((Field) term61684).get((Object) null);
        term61169 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term61171 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61175 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term61239 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term61242 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term61251 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term61286 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term61289 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term61169, term61169.getClass(), "id", 1295839803);
        setIntField(term61171, term61171.getClass(), "year", 2027);
        setShortField(term61171, term61171.getClass(), "month", (short) 3);
        setShortField(term61171, term61171.getClass(), "day", (short) 14);
        setField(term61169, term61169.getClass(), "freezeDate", term61171);
        setIntField(term61175, term61175.getClass(), "id", -1891015523);
        setField(term61175, term61175.getClass(), "firstName", "GEJABPlHSI");
        setField(term61175, term61175.getClass(), "middleName", "aQFUvuaYxd");
        setField(term61175, term61175.getClass(), "lastName", "zNFLXMifnS");
        setField(term61175, term61175.getClass(), "email", "HHQcYMSBVc");
        setField(term61175, term61175.getClass(), "passwordHash", "wdoqITnaAP");
        setIntField(term61175, term61175.getClass(), "positionId", -1560631747);
        setBooleanField(term61175, term61175.getClass(), "isArchived", true);
        setIntField(term61239, term61239.getClass(), "nanos", 256000000);
        setLongField(term61239, term61239.getClass(), "fastTime", 1841956160000L);
        setField(term61239, term61239.getClass(), "cdate", null);
        setField(term61175, term61175.getClass(), "createdDate", term61239);
        setIntField(term61242, term61242.getClass(), "nanos", 93000000);
        setLongField(term61242, term61242.getClass(), "fastTime", 1859212762000L);
        setField(term61242, term61242.getClass(), "cdate", null);
        setField(term61175, term61175.getClass(), "lastModifiedDate", term61242);
        setField(term61175, term61175.getClass(), "employeeRoles", term61245);
        setIntField(term61251, term61251.getClass(), "employeeId", 1215150180);
        setIntField(term61251, term61251.getClass(), "projectId", -1422859977);
        setField(term61251, term61251.getClass(), "projectRoleId", enum141);
        setField(term61251, term61251.getClass(), "externalRate", term61257);
        setField(term61175, term61175.getClass(), "employeeProjectRole", term61251);
        setField(term61169, term61169.getClass(), "employee", term61175);
        setField(term61169, term61169.getClass(), "status", enum142);
        setField(term61169, term61169.getClass(), "info", "rIPMBcrNqB");
        setIntField(term61286, term61286.getClass(), "nanos", 839000000);
        setLongField(term61286, term61286.getClass(), "fastTime", 1466687124000L);
        setField(term61286, term61286.getClass(), "cdate", null);
        setField(term61169, term61169.getClass(), "createdDate", term61286);
        setIntField(term61289, term61289.getClass(), "nanos", 643000000);
        setLongField(term61289, term61289.getClass(), "fastTime", 1441796944000L);
        setField(term61289, term61289.getClass(), "cdate", null);
        setField(term61169, term61169.getClass(), "lastModifiedDate", term61289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term61169, args);
    }

};


