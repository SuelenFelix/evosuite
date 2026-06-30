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

public class FreezeRecord_getLastModifiedDate_56810753510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51218;

    public FreezeRecord_getLastModifiedDate_56810753510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term51295 = new HashMap();
        Set<Object> term51389 =  ((Map) term51295).keySet();
        HashSet term51294 = new HashSet((Collection<? extends Object>) term51389);
        Class<? extends Object> term51391 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term51390 = ((Class) term51391).getDeclaredField((String) "MANAGER");
        ((Field) term51390).setAccessible(true);
        Object enum119 = ((Field) term51390).get((Object) null);
        Float term51306 = new Float(0.75592405F);
        Class<? extends Object> term51729 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term51728 = ((Class) term51729).getDeclaredField((String) "UN_FREEZE");
        ((Field) term51728).setAccessible(true);
        Object enum120 = ((Field) term51728).get((Object) null);
        term51218 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term51220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51224 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term51288 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term51291 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term51300 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term51333 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term51336 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term51218, term51218.getClass(), "id", -376422566);
        setIntField(term51220, term51220.getClass(), "year", 2026);
        setShortField(term51220, term51220.getClass(), "month", (short) 12);
        setShortField(term51220, term51220.getClass(), "day", (short) 13);
        setField(term51218, term51218.getClass(), "freezeDate", term51220);
        setIntField(term51224, term51224.getClass(), "id", 306847454);
        setField(term51224, term51224.getClass(), "firstName", "NTlKJDDWlk");
        setField(term51224, term51224.getClass(), "middleName", "vOuMEpOQAg");
        setField(term51224, term51224.getClass(), "lastName", "SIODFGaQhr");
        setField(term51224, term51224.getClass(), "email", "qYzsiuXOgS");
        setField(term51224, term51224.getClass(), "passwordHash", "bxrCBbrrct");
        setIntField(term51224, term51224.getClass(), "positionId", 1745276158);
        setBooleanField(term51224, term51224.getClass(), "isArchived", true);
        setIntField(term51288, term51288.getClass(), "nanos", 920000000);
        setLongField(term51288, term51288.getClass(), "fastTime", 1541705464000L);
        setField(term51288, term51288.getClass(), "cdate", null);
        setField(term51224, term51224.getClass(), "createdDate", term51288);
        setIntField(term51291, term51291.getClass(), "nanos", 618000000);
        setLongField(term51291, term51291.getClass(), "fastTime", 1736130830000L);
        setField(term51291, term51291.getClass(), "cdate", null);
        setField(term51224, term51224.getClass(), "lastModifiedDate", term51291);
        setField(term51224, term51224.getClass(), "employeeRoles", term51294);
        setIntField(term51300, term51300.getClass(), "employeeId", 2009020256);
        setIntField(term51300, term51300.getClass(), "projectId", 2049577015);
        setField(term51300, term51300.getClass(), "projectRoleId", enum119);
        setField(term51300, term51300.getClass(), "externalRate", term51306);
        setField(term51224, term51224.getClass(), "employeeProjectRole", term51300);
        setField(term51218, term51218.getClass(), "employee", term51224);
        setField(term51218, term51218.getClass(), "status", enum120);
        setField(term51218, term51218.getClass(), "info", "CKWpJaaaxX");
        setIntField(term51333, term51333.getClass(), "nanos", 300000000);
        setLongField(term51333, term51333.getClass(), "fastTime", 1267033689000L);
        setField(term51333, term51333.getClass(), "cdate", null);
        setField(term51218, term51218.getClass(), "createdDate", term51333);
        setIntField(term51336, term51336.getClass(), "nanos", 738000000);
        setLongField(term51336, term51336.getClass(), "fastTime", 1446427153000L);
        setField(term51336, term51336.getClass(), "cdate", null);
        setField(term51218, term51218.getClass(), "lastModifiedDate", term51336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term51218, args);
    }

};


