package ru.smartup.timetracker.repository.impl;

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
import static ru.smartup.timetracker.repository.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;
import java.util.HashSet;
import java.lang.Float;

public class TrackUnitBatchRepositoryImpl_deleteTrackUnits_1683461881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1017;

    public TrackUnitBatchRepositoryImpl_deleteTrackUnits_1683461881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1108 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term1107 = ((Class) term1108).getDeclaredField((String) "APPROVED");
        ((Field) term1107).setAccessible(true);
        Object enum2 = ((Field) term1107).get((Object) null);
        HashSet term1078 = new HashSet();
        Float term1082 = new Float(0.8564069F);
        Object term1020 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term1022 = newInstance(Class.forName("java.sql.Date"));
        Object term1056 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1059 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1063 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term1072 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1075 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1079 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term1084 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term1088 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1091 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1094 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term1100 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1103 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1020, term1020.getClass(), "id", -872011222785455006L);
        setLongField(term1022, term1022.getClass(), "fastTime", 1515890130018L);
        setField(term1022, term1022.getClass(), "cdate", null);
        setField(term1020, term1020.getClass(), "workDay", term1022);
        setField(term1020, term1020.getClass(), "status", enum2);
        setFloatField(term1020, term1020.getClass(), "hours", 0.40176582F);
        setField(term1020, term1020.getClass(), "comment", "GzFkzHGYFt");
        setField(term1020, term1020.getClass(), "rejectReason", "tShwQLRGNe");
        setFloatField(term1020, term1020.getClass(), "rate", 0.8783184F);
        setBooleanField(term1020, term1020.getClass(), "billable", true);
        setLongField(term1020, term1020.getClass(), "taskId", -316468845751588286L);
        setIntField(term1020, term1020.getClass(), "employeeId", -1087774327);
        setIntField(term1056, term1056.getClass(), "nanos", 488000000);
        setLongField(term1056, term1056.getClass(), "fastTime", 1405268389000L);
        setField(term1056, term1056.getClass(), "cdate", null);
        setField(term1020, term1020.getClass(), "createdDate", term1056);
        setIntField(term1059, term1059.getClass(), "nanos", 50000000);
        setLongField(term1059, term1059.getClass(), "fastTime", 1822693844000L);
        setField(term1059, term1059.getClass(), "cdate", null);
        setField(term1020, term1020.getClass(), "lastModifiedDate", term1059);
        setBooleanField(term1020, term1020.getClass(), "frozen", true);
        setIntField(term1063, term1063.getClass(), "id", -1530420153);
        setField(term1063, term1063.getClass(), "firstName", "");
        setField(term1063, term1063.getClass(), "middleName", "");
        setField(term1063, term1063.getClass(), "lastName", "");
        setField(term1063, term1063.getClass(), "email", "");
        setField(term1063, term1063.getClass(), "passwordHash", "");
        setIntField(term1063, term1063.getClass(), "positionId", -469968304);
        setBooleanField(term1063, term1063.getClass(), "isArchived", true);
        setIntField(term1072, term1072.getClass(), "nanos", 298000000);
        setLongField(term1072, term1072.getClass(), "fastTime", 1678166815000L);
        setField(term1072, term1072.getClass(), "cdate", null);
        setField(term1063, term1063.getClass(), "createdDate", term1072);
        setIntField(term1075, term1075.getClass(), "nanos", 186000000);
        setLongField(term1075, term1075.getClass(), "fastTime", 1666065487000L);
        setField(term1075, term1075.getClass(), "cdate", null);
        setField(term1063, term1063.getClass(), "lastModifiedDate", term1075);
        setField(term1063, term1063.getClass(), "employeeRoles", term1078);
        setIntField(term1079, term1079.getClass(), "employeeId", -1145578966);
        setIntField(term1079, term1079.getClass(), "projectId", 679763016);
        setField(term1079, term1079.getClass(), "projectRoleId", null);
        setField(term1079, term1079.getClass(), "externalRate", term1082);
        setField(term1063, term1063.getClass(), "employeeProjectRole", term1079);
        setField(term1020, term1020.getClass(), "employee", term1063);
        setIntField(term1084, term1084.getClass(), "id", 1962444399);
        setField(term1084, term1084.getClass(), "name", "");
        setBooleanField(term1084, term1084.getClass(), "isArchived", true);
        setIntField(term1088, term1088.getClass(), "nanos", 434000000);
        setLongField(term1088, term1088.getClass(), "fastTime", 1426008074000L);
        setField(term1088, term1088.getClass(), "cdate", null);
        setField(term1084, term1084.getClass(), "createdDate", term1088);
        setIntField(term1091, term1091.getClass(), "nanos", 487000000);
        setLongField(term1091, term1091.getClass(), "fastTime", 1632993975000L);
        setField(term1091, term1091.getClass(), "cdate", null);
        setField(term1084, term1084.getClass(), "lastModifiedDate", term1091);
        setField(term1020, term1020.getClass(), "project", term1084);
        setLongField(term1094, term1094.getClass(), "id", 5127676408959197577L);
        setField(term1094, term1094.getClass(), "name", "");
        setIntField(term1094, term1094.getClass(), "projectId", 767834723);
        setBooleanField(term1094, term1094.getClass(), "billable", false);
        setBooleanField(term1094, term1094.getClass(), "isArchived", true);
        setIntField(term1100, term1100.getClass(), "nanos", 549000000);
        setLongField(term1100, term1100.getClass(), "fastTime", 1819180838000L);
        setField(term1100, term1100.getClass(), "cdate", null);
        setField(term1094, term1094.getClass(), "createdDate", term1100);
        setIntField(term1103, term1103.getClass(), "nanos", 698000000);
        setLongField(term1103, term1103.getClass(), "fastTime", 1400680978000L);
        setField(term1103, term1103.getClass(), "cdate", null);
        setField(term1094, term1094.getClass(), "lastModifiedDate", term1103);
        setField(term1020, term1020.getClass(), "task", term1094);
        term1017 = new LinkedList();
        ((LinkedList) term1017).add(term1020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.repository.impl.TrackUnitBatchRepositoryImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1017;
        callMethod(klass, "deleteTrackUnits", argTypes, null, args);
    }

};


