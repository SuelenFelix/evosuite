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

public class FreezeRecord_getId_17646944234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45780;

    public FreezeRecord_getId_17646944234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term45857 = new HashMap();
        Set<Object> term45953 =  ((Map) term45857).keySet();
        HashSet term45856 = new HashSet((Collection<? extends Object>) term45953);
        Class<? extends Object> term45955 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term45954 = ((Class) term45955).getDeclaredField((String) "EMPLOYEE");
        ((Field) term45954).setAccessible(true);
        Object enum107 = ((Field) term45954).get((Object) null);
        Float term45868 = new Float(0.13481021F);
        Class<? extends Object> term46296 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term46295 = ((Class) term46296).getDeclaredField((String) "INTERRUPTED");
        ((Field) term46295).setAccessible(true);
        Object enum108 = ((Field) term46295).get((Object) null);
        term45780 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term45782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45786 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term45850 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term45853 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term45862 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term45897 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term45900 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term45780, term45780.getClass(), "id", 534834644);
        setIntField(term45782, term45782.getClass(), "year", 2015);
        setShortField(term45782, term45782.getClass(), "month", (short) 9);
        setShortField(term45782, term45782.getClass(), "day", (short) 19);
        setField(term45780, term45780.getClass(), "freezeDate", term45782);
        setIntField(term45786, term45786.getClass(), "id", 1959097203);
        setField(term45786, term45786.getClass(), "firstName", "QduALnDSVo");
        setField(term45786, term45786.getClass(), "middleName", "izPpKDErnQ");
        setField(term45786, term45786.getClass(), "lastName", "NnpwZBUTvx");
        setField(term45786, term45786.getClass(), "email", "tlQSNgTkQX");
        setField(term45786, term45786.getClass(), "passwordHash", "PCipZnmBOF");
        setIntField(term45786, term45786.getClass(), "positionId", -209654048);
        setBooleanField(term45786, term45786.getClass(), "isArchived", false);
        setIntField(term45850, term45850.getClass(), "nanos", 973000000);
        setLongField(term45850, term45850.getClass(), "fastTime", 1862647013000L);
        setField(term45850, term45850.getClass(), "cdate", null);
        setField(term45786, term45786.getClass(), "createdDate", term45850);
        setIntField(term45853, term45853.getClass(), "nanos", 379000000);
        setLongField(term45853, term45853.getClass(), "fastTime", 1299420278000L);
        setField(term45853, term45853.getClass(), "cdate", null);
        setField(term45786, term45786.getClass(), "lastModifiedDate", term45853);
        setField(term45786, term45786.getClass(), "employeeRoles", term45856);
        setIntField(term45862, term45862.getClass(), "employeeId", 477625804);
        setIntField(term45862, term45862.getClass(), "projectId", 252575029);
        setField(term45862, term45862.getClass(), "projectRoleId", enum107);
        setField(term45862, term45862.getClass(), "externalRate", term45868);
        setField(term45786, term45786.getClass(), "employeeProjectRole", term45862);
        setField(term45780, term45780.getClass(), "employee", term45786);
        setField(term45780, term45780.getClass(), "status", enum108);
        setField(term45780, term45780.getClass(), "info", "zcorEihhLK");
        setIntField(term45897, term45897.getClass(), "nanos", 231000000);
        setLongField(term45897, term45897.getClass(), "fastTime", 1476959357000L);
        setField(term45897, term45897.getClass(), "cdate", null);
        setField(term45780, term45780.getClass(), "createdDate", term45897);
        setIntField(term45900, term45900.getClass(), "nanos", 453000000);
        setLongField(term45900, term45900.getClass(), "fastTime", 1386170097000L);
        setField(term45900, term45900.getClass(), "cdate", null);
        setField(term45780, term45780.getClass(), "lastModifiedDate", term45900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term45780, args);
    }

};


