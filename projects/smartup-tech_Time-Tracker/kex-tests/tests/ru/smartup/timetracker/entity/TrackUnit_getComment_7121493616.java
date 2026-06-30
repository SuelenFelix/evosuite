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

public class TrackUnit_getComment_7121493616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68400;

    public TrackUnit_getComment_7121493616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68581 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term68580 = ((Class) term68581).getDeclaredField((String) "APPROVED");
        ((Field) term68580).setAccessible(true);
        Object enum155 = ((Field) term68580).get((Object) null);
        HashMap term68523 = new HashMap();
        Set<Object> term69011 =  ((Map) term68523).keySet();
        HashSet term68522 = new HashSet((Collection<? extends Object>) term69011);
        Class<? extends Object> term69013 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term69012 = ((Class) term69013).getDeclaredField((String) "EMPLOYEE");
        ((Field) term69012).setAccessible(true);
        Object enum156 = ((Field) term69012).get((Object) null);
        Float term68534 = new Float(0.22417867F);
        term68400 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term68402 = newInstance(Class.forName("java.sql.Date"));
        Object term68445 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term68448 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term68452 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term68516 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term68519 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term68528 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term68536 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term68551 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term68554 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term68557 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term68574 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term68577 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term68400, term68400.getClass(), "id", -7612550318181586304L);
        setLongField(term68402, term68402.getClass(), "fastTime", 1442639565302L);
        setField(term68402, term68402.getClass(), "cdate", null);
        setField(term68400, term68400.getClass(), "workDay", term68402);
        setField(term68400, term68400.getClass(), "status", enum155);
        setFloatField(term68400, term68400.getClass(), "hours", 0.40176582F);
        setField(term68400, term68400.getClass(), "comment", "MgLCedQfoj");
        setField(term68400, term68400.getClass(), "rejectReason", "zgKiINdgNu");
        setFloatField(term68400, term68400.getClass(), "rate", 0.8783184F);
        setBooleanField(term68400, term68400.getClass(), "billable", false);
        setLongField(term68400, term68400.getClass(), "taskId", -2170847986967241072L);
        setIntField(term68400, term68400.getClass(), "employeeId", 1820784228);
        setIntField(term68445, term68445.getClass(), "nanos", 870000000);
        setLongField(term68445, term68445.getClass(), "fastTime", 1560275598000L);
        setField(term68445, term68445.getClass(), "cdate", null);
        setField(term68400, term68400.getClass(), "createdDate", term68445);
        setIntField(term68448, term68448.getClass(), "nanos", 21000000);
        setLongField(term68448, term68448.getClass(), "fastTime", 1791283637000L);
        setField(term68448, term68448.getClass(), "cdate", null);
        setField(term68400, term68400.getClass(), "lastModifiedDate", term68448);
        setBooleanField(term68400, term68400.getClass(), "frozen", true);
        setIntField(term68452, term68452.getClass(), "id", 1390820006);
        setField(term68452, term68452.getClass(), "firstName", "zLMTXDQHYH");
        setField(term68452, term68452.getClass(), "middleName", "PqywFWJlpE");
        setField(term68452, term68452.getClass(), "lastName", "OzXRsFGTIp");
        setField(term68452, term68452.getClass(), "email", "TjWpyghUWN");
        setField(term68452, term68452.getClass(), "passwordHash", "dkZFDZxcde");
        setIntField(term68452, term68452.getClass(), "positionId", -828982065);
        setBooleanField(term68452, term68452.getClass(), "isArchived", false);
        setIntField(term68516, term68516.getClass(), "nanos", 924000000);
        setLongField(term68516, term68516.getClass(), "fastTime", 1407915818000L);
        setField(term68516, term68516.getClass(), "cdate", null);
        setField(term68452, term68452.getClass(), "createdDate", term68516);
        setIntField(term68519, term68519.getClass(), "nanos", 151000000);
        setLongField(term68519, term68519.getClass(), "fastTime", 1536051461000L);
        setField(term68519, term68519.getClass(), "cdate", null);
        setField(term68452, term68452.getClass(), "lastModifiedDate", term68519);
        setField(term68452, term68452.getClass(), "employeeRoles", term68522);
        setIntField(term68528, term68528.getClass(), "employeeId", 1221443226);
        setIntField(term68528, term68528.getClass(), "projectId", 908108726);
        setField(term68528, term68528.getClass(), "projectRoleId", enum156);
        setField(term68528, term68528.getClass(), "externalRate", term68534);
        setField(term68452, term68452.getClass(), "employeeProjectRole", term68528);
        setField(term68400, term68400.getClass(), "employee", term68452);
        setIntField(term68536, term68536.getClass(), "id", 1023209512);
        setField(term68536, term68536.getClass(), "name", "WXcZEtUKlI");
        setBooleanField(term68536, term68536.getClass(), "isArchived", false);
        setIntField(term68551, term68551.getClass(), "nanos", 26000000);
        setLongField(term68551, term68551.getClass(), "fastTime", 1337912177000L);
        setField(term68551, term68551.getClass(), "cdate", null);
        setField(term68536, term68536.getClass(), "createdDate", term68551);
        setIntField(term68554, term68554.getClass(), "nanos", 444000000);
        setLongField(term68554, term68554.getClass(), "fastTime", 1549827958000L);
        setField(term68554, term68554.getClass(), "cdate", null);
        setField(term68536, term68536.getClass(), "lastModifiedDate", term68554);
        setField(term68400, term68400.getClass(), "project", term68536);
        setLongField(term68557, term68557.getClass(), "id", 4044358158040652353L);
        setField(term68557, term68557.getClass(), "name", "IkpjUOuWQU");
        setIntField(term68557, term68557.getClass(), "projectId", 1084849225);
        setBooleanField(term68557, term68557.getClass(), "billable", false);
        setBooleanField(term68557, term68557.getClass(), "isArchived", true);
        setIntField(term68574, term68574.getClass(), "nanos", 447000000);
        setLongField(term68574, term68574.getClass(), "fastTime", 1889588747000L);
        setField(term68574, term68574.getClass(), "cdate", null);
        setField(term68557, term68557.getClass(), "createdDate", term68574);
        setIntField(term68577, term68577.getClass(), "nanos", 673000000);
        setLongField(term68577, term68577.getClass(), "fastTime", 1511083798000L);
        setField(term68577, term68577.getClass(), "cdate", null);
        setField(term68557, term68557.getClass(), "lastModifiedDate", term68577);
        setField(term68400, term68400.getClass(), "task", term68557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComment", argTypes, term68400, args);
    }

};


