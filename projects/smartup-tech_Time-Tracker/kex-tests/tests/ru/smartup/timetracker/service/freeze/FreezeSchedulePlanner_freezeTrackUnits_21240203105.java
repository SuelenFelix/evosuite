package ru.smartup.timetracker.service.freeze;

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
import static ru.smartup.timetracker.service.freeze.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;

public class FreezeSchedulePlanner_freezeTrackUnits_21240203105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3861;
     Object term3873;

    public FreezeSchedulePlanner_freezeTrackUnits_21240203105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3861 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term3862 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term3863 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term3864 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term3867 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3861, term3861.getClass(), "crudFreezeService", null);
        setIntField(term3864, term3864.getClass(), "totalSeconds", -25200);
        setField(term3864, term3864.getClass(), "id", "");
        setField(term3863, term3863.getClass(), "timeZone", term3864);
        setByteField(term3867, term3867.getClass(), "hour", (byte) 14);
        setByteField(term3867, term3867.getClass(), "minute", (byte) 42);
        setByteField(term3867, term3867.getClass(), "second", (byte) 31);
        setIntField(term3867, term3867.getClass(), "nano", 16575281);
        setField(term3863, term3863.getClass(), "fixedTimeFreeze", term3867);
        setIntField(term3863, term3863.getClass(), "dayToUnfreeze", 1270666529);
        setField(term3862, term3862.getClass(), "freezeProperties", term3863);
        setField(term3861, term3861.getClass(), "freezeDateUtils", term3862);
        setField(term3861, term3861.getClass(), "freezeScheduler", null);
        setField(term3861, term3861.getClass(), "trackUnitService", null);
        HashMap term3950 = new HashMap();
        Set<Object> term4046 =  ((Map) term3950).keySet();
        HashSet term3949 = new HashSet((Collection<? extends Object>) term4046);
        Class<? extends Object> term4048 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term4047 = ((Class) term4048).getDeclaredField((String) "EMPLOYEE");
        ((Field) term4047).setAccessible(true);
        Object enum7 = ((Field) term4047).get((Object) null);
        Float term3961 = new Float(0.8598297F);
        Class<? extends Object> term4389 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term4388 = ((Class) term4389).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term4388).setAccessible(true);
        Object enum8 = ((Field) term4388).get((Object) null);
        term3873 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term3875 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3879 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term3943 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3946 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3955 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term3990 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3993 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term3873, term3873.getClass(), "id", -1146679443);
        setIntField(term3875, term3875.getClass(), "year", 2025);
        setShortField(term3875, term3875.getClass(), "month", (short) 3);
        setShortField(term3875, term3875.getClass(), "day", (short) 8);
        setField(term3873, term3873.getClass(), "freezeDate", term3875);
        setIntField(term3879, term3879.getClass(), "id", -860131894);
        setField(term3879, term3879.getClass(), "firstName", "CKWpJaaaxX");
        setField(term3879, term3879.getClass(), "middleName", "UBRmXJmfrt");
        setField(term3879, term3879.getClass(), "lastName", "WZzvmIHhzZ");
        setField(term3879, term3879.getClass(), "email", "doQLHkjpNm");
        setField(term3879, term3879.getClass(), "passwordHash", "lCyLIcSuom");
        setIntField(term3879, term3879.getClass(), "positionId", -1022990421);
        setBooleanField(term3879, term3879.getClass(), "isArchived", true);
        setIntField(term3943, term3943.getClass(), "nanos", 171000000);
        setLongField(term3943, term3943.getClass(), "fastTime", 1589197776000L);
        setField(term3943, term3943.getClass(), "cdate", null);
        setField(term3879, term3879.getClass(), "createdDate", term3943);
        setIntField(term3946, term3946.getClass(), "nanos", 195000000);
        setLongField(term3946, term3946.getClass(), "fastTime", 1420254676000L);
        setField(term3946, term3946.getClass(), "cdate", null);
        setField(term3879, term3879.getClass(), "lastModifiedDate", term3946);
        setField(term3879, term3879.getClass(), "employeeRoles", term3949);
        setIntField(term3955, term3955.getClass(), "employeeId", 1045547089);
        setIntField(term3955, term3955.getClass(), "projectId", -1122880881);
        setField(term3955, term3955.getClass(), "projectRoleId", enum7);
        setField(term3955, term3955.getClass(), "externalRate", term3961);
        setField(term3879, term3879.getClass(), "employeeProjectRole", term3955);
        setField(term3873, term3873.getClass(), "employee", term3879);
        setField(term3873, term3873.getClass(), "status", enum8);
        setField(term3873, term3873.getClass(), "info", "CGOpQSZZwI");
        setIntField(term3990, term3990.getClass(), "nanos", 567000000);
        setLongField(term3990, term3990.getClass(), "fastTime", 1379577714000L);
        setField(term3990, term3990.getClass(), "cdate", null);
        setField(term3873, term3873.getClass(), "createdDate", term3990);
        setIntField(term3993, term3993.getClass(), "nanos", 111000000);
        setLongField(term3993, term3993.getClass(), "fastTime", 1416349120000L);
        setField(term3993, term3993.getClass(), "cdate", null);
        setField(term3873, term3873.getClass(), "lastModifiedDate", term3993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term3873;
        callMethod(klass, "freezeTrackUnits", argTypes, term3861, args);
    }

};


