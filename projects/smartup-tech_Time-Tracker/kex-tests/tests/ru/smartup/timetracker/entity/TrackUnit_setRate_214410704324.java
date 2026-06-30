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

public class TrackUnit_setRate_214410704324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85946;
     Object term86127;

    public TrackUnit_setRate_214410704324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86130 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term86129 = ((Class) term86130).getDeclaredField((String) "SUBMITTED");
        ((Field) term86129).setAccessible(true);
        Object enum191 = ((Field) term86129).get((Object) null);
        HashMap term86070 = new HashMap();
        Set<Object> term86563 =  ((Map) term86070).keySet();
        HashSet term86069 = new HashSet((Collection<? extends Object>) term86563);
        Class<? extends Object> term86565 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term86564 = ((Class) term86565).getDeclaredField((String) "MANAGER");
        ((Field) term86564).setAccessible(true);
        Object enum192 = ((Field) term86564).get((Object) null);
        Float term86081 = new Float(0.8704517F);
        term85946 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term85948 = newInstance(Class.forName("java.sql.Date"));
        Object term85992 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term85995 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term85999 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term86063 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term86066 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term86075 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term86083 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term86098 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term86101 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term86104 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term86121 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term86124 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term85946, term85946.getClass(), "id", -5216789073301458893L);
        setLongField(term85948, term85948.getClass(), "fastTime", 1744090065937L);
        setField(term85948, term85948.getClass(), "cdate", null);
        setField(term85946, term85946.getClass(), "workDay", term85948);
        setField(term85946, term85946.getClass(), "status", enum191);
        setFloatField(term85946, term85946.getClass(), "hours", 0.541592F);
        setField(term85946, term85946.getClass(), "comment", "nrQjODRMLD");
        setField(term85946, term85946.getClass(), "rejectReason", "PNoWXrsFic");
        setFloatField(term85946, term85946.getClass(), "rate", 0.13481021F);
        setBooleanField(term85946, term85946.getClass(), "billable", false);
        setLongField(term85946, term85946.getClass(), "taskId", -1832940336320585644L);
        setIntField(term85946, term85946.getClass(), "employeeId", -27944011);
        setIntField(term85992, term85992.getClass(), "nanos", 783000000);
        setLongField(term85992, term85992.getClass(), "fastTime", 1358439033000L);
        setField(term85992, term85992.getClass(), "cdate", null);
        setField(term85946, term85946.getClass(), "createdDate", term85992);
        setIntField(term85995, term85995.getClass(), "nanos", 309000000);
        setLongField(term85995, term85995.getClass(), "fastTime", 1399606535000L);
        setField(term85995, term85995.getClass(), "cdate", null);
        setField(term85946, term85946.getClass(), "lastModifiedDate", term85995);
        setBooleanField(term85946, term85946.getClass(), "frozen", false);
        setIntField(term85999, term85999.getClass(), "id", -20614472);
        setField(term85999, term85999.getClass(), "firstName", "QZBHZqZope");
        setField(term85999, term85999.getClass(), "middleName", "VBUahCvyxC");
        setField(term85999, term85999.getClass(), "lastName", "MlzTkzKMCX");
        setField(term85999, term85999.getClass(), "email", "UqKUbMyPMJ");
        setField(term85999, term85999.getClass(), "passwordHash", "QpYltHAdyY");
        setIntField(term85999, term85999.getClass(), "positionId", 1126618861);
        setBooleanField(term85999, term85999.getClass(), "isArchived", true);
        setIntField(term86063, term86063.getClass(), "nanos", 725000000);
        setLongField(term86063, term86063.getClass(), "fastTime", 1754588786000L);
        setField(term86063, term86063.getClass(), "cdate", null);
        setField(term85999, term85999.getClass(), "createdDate", term86063);
        setIntField(term86066, term86066.getClass(), "nanos", 930000000);
        setLongField(term86066, term86066.getClass(), "fastTime", 1470261390000L);
        setField(term86066, term86066.getClass(), "cdate", null);
        setField(term85999, term85999.getClass(), "lastModifiedDate", term86066);
        setField(term85999, term85999.getClass(), "employeeRoles", term86069);
        setIntField(term86075, term86075.getClass(), "employeeId", 947449400);
        setIntField(term86075, term86075.getClass(), "projectId", -763799087);
        setField(term86075, term86075.getClass(), "projectRoleId", enum192);
        setField(term86075, term86075.getClass(), "externalRate", term86081);
        setField(term85999, term85999.getClass(), "employeeProjectRole", term86075);
        setField(term85946, term85946.getClass(), "employee", term85999);
        setIntField(term86083, term86083.getClass(), "id", 1207142014);
        setField(term86083, term86083.getClass(), "name", "lbmSGBwIiV");
        setBooleanField(term86083, term86083.getClass(), "isArchived", true);
        setIntField(term86098, term86098.getClass(), "nanos", 179000000);
        setLongField(term86098, term86098.getClass(), "fastTime", 1722217558000L);
        setField(term86098, term86098.getClass(), "cdate", null);
        setField(term86083, term86083.getClass(), "createdDate", term86098);
        setIntField(term86101, term86101.getClass(), "nanos", 810000000);
        setLongField(term86101, term86101.getClass(), "fastTime", 1612488714000L);
        setField(term86101, term86101.getClass(), "cdate", null);
        setField(term86083, term86083.getClass(), "lastModifiedDate", term86101);
        setField(term85946, term85946.getClass(), "project", term86083);
        setLongField(term86104, term86104.getClass(), "id", -8033714905181142681L);
        setField(term86104, term86104.getClass(), "name", "DAxyHoTLzZ");
        setIntField(term86104, term86104.getClass(), "projectId", -876426634);
        setBooleanField(term86104, term86104.getClass(), "billable", true);
        setBooleanField(term86104, term86104.getClass(), "isArchived", false);
        setIntField(term86121, term86121.getClass(), "nanos", 152000000);
        setLongField(term86121, term86121.getClass(), "fastTime", 1518499035000L);
        setField(term86121, term86121.getClass(), "cdate", null);
        setField(term86104, term86104.getClass(), "createdDate", term86121);
        setIntField(term86124, term86124.getClass(), "nanos", 304000000);
        setLongField(term86124, term86124.getClass(), "fastTime", 1502154950000L);
        setField(term86124, term86124.getClass(), "cdate", null);
        setField(term86104, term86104.getClass(), "lastModifiedDate", term86124);
        setField(term85946, term85946.getClass(), "task", term86104);
        term86127 = new Float(0.996533F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term86127;
        callMethod(klass, "setRate", argTypes, term85946, args);
    }

};


