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
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Float;

public class TrackUnit_canEqual_3605394035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96844;
     Object term97024;

    public TrackUnit_canEqual_3605394035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97026 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term97025 = ((Class) term97026).getDeclaredField((String) "APPROVED");
        ((Field) term97025).setAccessible(true);
        Object enum213 = ((Field) term97025).get((Object) null);
        HashMap term96967 = new HashMap();
        Set<Object> term97456 =  ((Map) term96967).keySet();
        HashSet term96966 = new HashSet((Collection<? extends Object>) term97456);
        Class<? extends Object> term97458 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term97457 = ((Class) term97458).getDeclaredField((String) "MANAGER");
        ((Field) term97457).setAccessible(true);
        Object enum214 = ((Field) term97457).get((Object) null);
        Float term96978 = new Float(0.5602794F);
        term96844 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term96846 = newInstance(Class.forName("java.sql.Date"));
        Object term96889 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term96892 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term96896 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term96960 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term96963 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term96972 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term96980 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term96995 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term96998 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term97001 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term97018 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term97021 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term96844, term96844.getClass(), "id", 855932984568615096L);
        setLongField(term96846, term96846.getClass(), "fastTime", 1876872800559L);
        setField(term96846, term96846.getClass(), "cdate", null);
        setField(term96844, term96844.getClass(), "workDay", term96846);
        setField(term96844, term96844.getClass(), "status", enum213);
        setFloatField(term96844, term96844.getClass(), "hours", 0.06688923F);
        setField(term96844, term96844.getClass(), "comment", "MpJsPKLTIU");
        setField(term96844, term96844.getClass(), "rejectReason", "IiNCZfdouL");
        setFloatField(term96844, term96844.getClass(), "rate", 0.22417867F);
        setBooleanField(term96844, term96844.getClass(), "billable", false);
        setLongField(term96844, term96844.getClass(), "taskId", -1616722610139554082L);
        setIntField(term96844, term96844.getClass(), "employeeId", 1131398807);
        setIntField(term96889, term96889.getClass(), "nanos", 126000000);
        setLongField(term96889, term96889.getClass(), "fastTime", 1740263354000L);
        setField(term96889, term96889.getClass(), "cdate", null);
        setField(term96844, term96844.getClass(), "createdDate", term96889);
        setIntField(term96892, term96892.getClass(), "nanos", 783000000);
        setLongField(term96892, term96892.getClass(), "fastTime", 1478648822000L);
        setField(term96892, term96892.getClass(), "cdate", null);
        setField(term96844, term96844.getClass(), "lastModifiedDate", term96892);
        setBooleanField(term96844, term96844.getClass(), "frozen", true);
        setIntField(term96896, term96896.getClass(), "id", -344907703);
        setField(term96896, term96896.getClass(), "firstName", "AhOHzCsHKW");
        setField(term96896, term96896.getClass(), "middleName", "UqgLPaaAHi");
        setField(term96896, term96896.getClass(), "lastName", "xypryEkUPF");
        setField(term96896, term96896.getClass(), "email", "zyZTzHNjQr");
        setField(term96896, term96896.getClass(), "passwordHash", "YSrFKQQwXE");
        setIntField(term96896, term96896.getClass(), "positionId", 824341437);
        setBooleanField(term96896, term96896.getClass(), "isArchived", true);
        setIntField(term96960, term96960.getClass(), "nanos", 574000000);
        setLongField(term96960, term96960.getClass(), "fastTime", 1881312966000L);
        setField(term96960, term96960.getClass(), "cdate", null);
        setField(term96896, term96896.getClass(), "createdDate", term96960);
        setIntField(term96963, term96963.getClass(), "nanos", 254000000);
        setLongField(term96963, term96963.getClass(), "fastTime", 1689294094000L);
        setField(term96963, term96963.getClass(), "cdate", null);
        setField(term96896, term96896.getClass(), "lastModifiedDate", term96963);
        setField(term96896, term96896.getClass(), "employeeRoles", term96966);
        setIntField(term96972, term96972.getClass(), "employeeId", -1794965320);
        setIntField(term96972, term96972.getClass(), "projectId", 520504102);
        setField(term96972, term96972.getClass(), "projectRoleId", enum214);
        setField(term96972, term96972.getClass(), "externalRate", term96978);
        setField(term96896, term96896.getClass(), "employeeProjectRole", term96972);
        setField(term96844, term96844.getClass(), "employee", term96896);
        setIntField(term96980, term96980.getClass(), "id", -457396133);
        setField(term96980, term96980.getClass(), "name", "qxhOsmyyjm");
        setBooleanField(term96980, term96980.getClass(), "isArchived", false);
        setIntField(term96995, term96995.getClass(), "nanos", 1000000);
        setLongField(term96995, term96995.getClass(), "fastTime", 1315349443000L);
        setField(term96995, term96995.getClass(), "cdate", null);
        setField(term96980, term96980.getClass(), "createdDate", term96995);
        setIntField(term96998, term96998.getClass(), "nanos", 38000000);
        setLongField(term96998, term96998.getClass(), "fastTime", 1417321281000L);
        setField(term96998, term96998.getClass(), "cdate", null);
        setField(term96980, term96980.getClass(), "lastModifiedDate", term96998);
        setField(term96844, term96844.getClass(), "project", term96980);
        setLongField(term97001, term97001.getClass(), "id", 7495904023107549024L);
        setField(term97001, term97001.getClass(), "name", "DuKcNfVVYR");
        setIntField(term97001, term97001.getClass(), "projectId", -1793950607);
        setBooleanField(term97001, term97001.getClass(), "billable", true);
        setBooleanField(term97001, term97001.getClass(), "isArchived", true);
        setIntField(term97018, term97018.getClass(), "nanos", 927000000);
        setLongField(term97018, term97018.getClass(), "fastTime", 1517229539000L);
        setField(term97018, term97018.getClass(), "cdate", null);
        setField(term97001, term97001.getClass(), "createdDate", term97018);
        setIntField(term97021, term97021.getClass(), "nanos", 135000000);
        setLongField(term97021, term97021.getClass(), "fastTime", 1309437220000L);
        setField(term97021, term97021.getClass(), "cdate", null);
        setField(term97001, term97001.getClass(), "lastModifiedDate", term97021);
        setField(term96844, term96844.getClass(), "task", term97001);
        term97024 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term97024;
        callMethod(klass, "canEqual", argTypes, term96844, args);
    }

};


