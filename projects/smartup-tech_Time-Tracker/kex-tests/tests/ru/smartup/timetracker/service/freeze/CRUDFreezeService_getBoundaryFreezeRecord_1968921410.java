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
     Object term8736;

    public CRUDFreezeService_getBoundaryFreezeRecord_1968921410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8813 = new HashMap();
        Set<Object> term8905 =  ((Map) term8813).keySet();
        HashSet term8812 = new HashSet((Collection<? extends Object>) term8905);
        Class<? extends Object> term8907 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term8906 = ((Class) term8907).getDeclaredField((String) "EMPLOYEE");
        ((Field) term8906).setAccessible(true);
        Object enum18 = ((Field) term8906).get((Object) null);
        Float term8824 = new Float(0.10577053F);
        Class<? extends Object> term9248 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term9247 = ((Class) term9248).getDeclaredField((String) "WAITING");
        ((Field) term9247).setAccessible(true);
        Object enum19 = ((Field) term9247).get((Object) null);
        term8736 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term8738 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8742 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term8806 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term8809 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term8818 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term8849 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term8852 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term8736, term8736.getClass(), "id", 474518942);
        setIntField(term8738, term8738.getClass(), "year", 2018);
        setShortField(term8738, term8738.getClass(), "month", (short) 9);
        setShortField(term8738, term8738.getClass(), "day", (short) 1);
        setField(term8736, term8736.getClass(), "freezeDate", term8738);
        setIntField(term8742, term8742.getClass(), "id", -1656687479);
        setField(term8742, term8742.getClass(), "firstName", "QSrDQfEsTR");
        setField(term8742, term8742.getClass(), "middleName", "PsqusYmejD");
        setField(term8742, term8742.getClass(), "lastName", "NTWMiBEaDF");
        setField(term8742, term8742.getClass(), "email", "SPBstwKFVr");
        setField(term8742, term8742.getClass(), "passwordHash", "WxYUTuqmIq");
        setIntField(term8742, term8742.getClass(), "positionId", -249614216);
        setBooleanField(term8742, term8742.getClass(), "isArchived", false);
        setIntField(term8806, term8806.getClass(), "nanos", 981000000);
        setLongField(term8806, term8806.getClass(), "fastTime", 1384826737000L);
        setField(term8806, term8806.getClass(), "cdate", null);
        setField(term8742, term8742.getClass(), "createdDate", term8806);
        setIntField(term8809, term8809.getClass(), "nanos", 246000000);
        setLongField(term8809, term8809.getClass(), "fastTime", 1444695056000L);
        setField(term8809, term8809.getClass(), "cdate", null);
        setField(term8742, term8742.getClass(), "lastModifiedDate", term8809);
        setField(term8742, term8742.getClass(), "employeeRoles", term8812);
        setIntField(term8818, term8818.getClass(), "employeeId", 1870727665);
        setIntField(term8818, term8818.getClass(), "projectId", -519881101);
        setField(term8818, term8818.getClass(), "projectRoleId", enum18);
        setField(term8818, term8818.getClass(), "externalRate", term8824);
        setField(term8742, term8742.getClass(), "employeeProjectRole", term8818);
        setField(term8736, term8736.getClass(), "employee", term8742);
        setField(term8736, term8736.getClass(), "status", enum19);
        setField(term8736, term8736.getClass(), "info", "OeQLvhVERT");
        setIntField(term8849, term8849.getClass(), "nanos", 110000000);
        setLongField(term8849, term8849.getClass(), "fastTime", 1758143407000L);
        setField(term8849, term8849.getClass(), "cdate", null);
        setField(term8736, term8736.getClass(), "createdDate", term8849);
        setIntField(term8852, term8852.getClass(), "nanos", 140000000);
        setLongField(term8852, term8852.getClass(), "fastTime", 1374829393000L);
        setField(term8852, term8852.getClass(), "cdate", null);
        setField(term8736, term8736.getClass(), "lastModifiedDate", term8852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.CRUDFreezeService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term8736;
        callMethod(klass, "getBoundaryFreezeRecord", argTypes, null, args);
    }

};


