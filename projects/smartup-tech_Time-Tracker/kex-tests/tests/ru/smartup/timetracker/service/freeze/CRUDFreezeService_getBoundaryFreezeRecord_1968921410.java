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

public class CRUDFreezeService_getBoundaryFreezeRecord_1968921410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8921;

    public CRUDFreezeService_getBoundaryFreezeRecord_1968921410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8998 = new HashMap();
        Set<Object> term9090 =  ((Map) term8998).keySet();
        HashSet term8997 = new HashSet((Collection<? extends Object>) term9090);
        Class<? extends Object> term9092 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term9091 = ((Class) term9092).getDeclaredField((String) "EMPLOYEE");
        ((Field) term9091).setAccessible(true);
        Object enum18 = ((Field) term9091).get((Object) null);
        Float term9009 = new Float(0.10577053F);
        Class<? extends Object> term9433 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term9432 = ((Class) term9433).getDeclaredField((String) "WAITING");
        ((Field) term9432).setAccessible(true);
        Object enum19 = ((Field) term9432).get((Object) null);
        term8921 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term8923 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8927 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term8991 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term8994 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term9003 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term9034 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term9037 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term8921, term8921.getClass(), "id", 474518942);
        setIntField(term8923, term8923.getClass(), "year", 2018);
        setShortField(term8923, term8923.getClass(), "month", (short) 9);
        setShortField(term8923, term8923.getClass(), "day", (short) 1);
        setField(term8921, term8921.getClass(), "freezeDate", term8923);
        setIntField(term8927, term8927.getClass(), "id", -1656687479);
        setField(term8927, term8927.getClass(), "firstName", "QSrDQfEsTR");
        setField(term8927, term8927.getClass(), "middleName", "PsqusYmejD");
        setField(term8927, term8927.getClass(), "lastName", "NTWMiBEaDF");
        setField(term8927, term8927.getClass(), "email", "SPBstwKFVr");
        setField(term8927, term8927.getClass(), "passwordHash", "WxYUTuqmIq");
        setIntField(term8927, term8927.getClass(), "positionId", -249614216);
        setBooleanField(term8927, term8927.getClass(), "isArchived", false);
        setIntField(term8991, term8991.getClass(), "nanos", 981000000);
        setLongField(term8991, term8991.getClass(), "fastTime", 1384826737000L);
        setField(term8991, term8991.getClass(), "cdate", null);
        setField(term8927, term8927.getClass(), "createdDate", term8991);
        setIntField(term8994, term8994.getClass(), "nanos", 246000000);
        setLongField(term8994, term8994.getClass(), "fastTime", 1444695056000L);
        setField(term8994, term8994.getClass(), "cdate", null);
        setField(term8927, term8927.getClass(), "lastModifiedDate", term8994);
        setField(term8927, term8927.getClass(), "employeeRoles", term8997);
        setIntField(term9003, term9003.getClass(), "employeeId", 1870727665);
        setIntField(term9003, term9003.getClass(), "projectId", -519881101);
        setField(term9003, term9003.getClass(), "projectRoleId", enum18);
        setField(term9003, term9003.getClass(), "externalRate", term9009);
        setField(term8927, term8927.getClass(), "employeeProjectRole", term9003);
        setField(term8921, term8921.getClass(), "employee", term8927);
        setField(term8921, term8921.getClass(), "status", enum19);
        setField(term8921, term8921.getClass(), "info", "OeQLvhVERT");
        setIntField(term9034, term9034.getClass(), "nanos", 110000000);
        setLongField(term9034, term9034.getClass(), "fastTime", 1758143407000L);
        setField(term9034, term9034.getClass(), "cdate", null);
        setField(term8921, term8921.getClass(), "createdDate", term9034);
        setIntField(term9037, term9037.getClass(), "nanos", 140000000);
        setLongField(term9037, term9037.getClass(), "fastTime", 1374829393000L);
        setField(term9037, term9037.getClass(), "cdate", null);
        setField(term8921, term8921.getClass(), "lastModifiedDate", term9037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.CRUDFreezeService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term8921;
        callMethod(klass, "getBoundaryFreezeRecord", argTypes, null, args);
    }

};


