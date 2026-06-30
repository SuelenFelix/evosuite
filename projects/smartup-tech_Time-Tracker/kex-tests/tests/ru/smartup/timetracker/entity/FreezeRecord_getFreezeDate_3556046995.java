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

public class FreezeRecord_getFreezeDate_3556046995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46690;

    public FreezeRecord_getFreezeDate_3556046995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term46767 = new HashMap();
        Set<Object> term46861 =  ((Map) term46767).keySet();
        HashSet term46766 = new HashSet((Collection<? extends Object>) term46861);
        Class<? extends Object> term46863 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term46862 = ((Class) term46863).getDeclaredField((String) "EMPLOYEE");
        ((Field) term46862).setAccessible(true);
        Object enum109 = ((Field) term46862).get((Object) null);
        Float term46778 = new Float(0.996533F);
        Class<? extends Object> term47204 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term47203 = ((Class) term47204).getDeclaredField((String) "COMPLETED");
        ((Field) term47203).setAccessible(true);
        Object enum110 = ((Field) term47203).get((Object) null);
        term46690 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term46692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46696 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term46760 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term46763 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term46772 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term46805 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term46808 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term46690, term46690.getClass(), "id", 57189932);
        setIntField(term46692, term46692.getClass(), "year", 2018);
        setShortField(term46692, term46692.getClass(), "month", (short) 1);
        setShortField(term46692, term46692.getClass(), "day", (short) 13);
        setField(term46690, term46690.getClass(), "freezeDate", term46692);
        setIntField(term46696, term46696.getClass(), "id", 1460722225);
        setField(term46696, term46696.getClass(), "firstName", "GrqozDKFOk");
        setField(term46696, term46696.getClass(), "middleName", "CFyoseFGLF");
        setField(term46696, term46696.getClass(), "lastName", "SFqCrhEWLm");
        setField(term46696, term46696.getClass(), "email", "GZdcJyZntS");
        setField(term46696, term46696.getClass(), "passwordHash", "OIHoJeysUi");
        setIntField(term46696, term46696.getClass(), "positionId", 1743224434);
        setBooleanField(term46696, term46696.getClass(), "isArchived", true);
        setIntField(term46760, term46760.getClass(), "nanos", 439000000);
        setLongField(term46760, term46760.getClass(), "fastTime", 1546759187000L);
        setField(term46760, term46760.getClass(), "cdate", null);
        setField(term46696, term46696.getClass(), "createdDate", term46760);
        setIntField(term46763, term46763.getClass(), "nanos", 282000000);
        setLongField(term46763, term46763.getClass(), "fastTime", 1851886086000L);
        setField(term46763, term46763.getClass(), "cdate", null);
        setField(term46696, term46696.getClass(), "lastModifiedDate", term46763);
        setField(term46696, term46696.getClass(), "employeeRoles", term46766);
        setIntField(term46772, term46772.getClass(), "employeeId", 842904495);
        setIntField(term46772, term46772.getClass(), "projectId", 1008080511);
        setField(term46772, term46772.getClass(), "projectRoleId", enum109);
        setField(term46772, term46772.getClass(), "externalRate", term46778);
        setField(term46696, term46696.getClass(), "employeeProjectRole", term46772);
        setField(term46690, term46690.getClass(), "employee", term46696);
        setField(term46690, term46690.getClass(), "status", enum110);
        setField(term46690, term46690.getClass(), "info", "WXMWFDGcLB");
        setIntField(term46805, term46805.getClass(), "nanos", 790000000);
        setLongField(term46805, term46805.getClass(), "fastTime", 1831731929000L);
        setField(term46805, term46805.getClass(), "cdate", null);
        setField(term46690, term46690.getClass(), "createdDate", term46805);
        setIntField(term46808, term46808.getClass(), "nanos", 909000000);
        setLongField(term46808, term46808.getClass(), "fastTime", 1673365151000L);
        setField(term46808, term46808.getClass(), "cdate", null);
        setField(term46690, term46690.getClass(), "lastModifiedDate", term46808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreezeDate", argTypes, term46690, args);
    }

};


