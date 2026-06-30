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
import java.lang.Boolean;

public class TrackUnit_setBillable_34505511025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86922;
     Object term87101;

    public TrackUnit_setBillable_34505511025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87104 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term87103 = ((Class) term87104).getDeclaredField((String) "CREATED");
        ((Field) term87103).setAccessible(true);
        Object enum193 = ((Field) term87103).get((Object) null);
        HashMap term87044 = new HashMap();
        Set<Object> term87531 =  ((Map) term87044).keySet();
        HashSet term87043 = new HashSet((Collection<? extends Object>) term87531);
        Class<? extends Object> term87533 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term87532 = ((Class) term87533).getDeclaredField((String) "EMPLOYEE");
        ((Field) term87532).setAccessible(true);
        Object enum194 = ((Field) term87532).get((Object) null);
        Float term87055 = new Float(0.5873228F);
        term86922 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term86924 = newInstance(Class.forName("java.sql.Date"));
        Object term86966 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term86969 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term86973 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term87037 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term87040 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term87049 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term87057 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term87072 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term87075 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term87078 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term87095 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term87098 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term86922, term86922.getClass(), "id", -9040825890007374809L);
        setLongField(term86924, term86924.getClass(), "fastTime", 1347400561385L);
        setField(term86924, term86924.getClass(), "cdate", null);
        setField(term86922, term86922.getClass(), "workDay", term86924);
        setField(term86922, term86922.getClass(), "status", enum193);
        setFloatField(term86922, term86922.getClass(), "hours", 0.38000882F);
        setField(term86922, term86922.getClass(), "comment", "fhZgTouhCC");
        setField(term86922, term86922.getClass(), "rejectReason", "wrikqJwXvL");
        setFloatField(term86922, term86922.getClass(), "rate", 0.10577053F);
        setBooleanField(term86922, term86922.getClass(), "billable", true);
        setLongField(term86922, term86922.getClass(), "taskId", 1368340889161782793L);
        setIntField(term86922, term86922.getClass(), "employeeId", 213831054);
        setIntField(term86966, term86966.getClass(), "nanos", 901000000);
        setLongField(term86966, term86966.getClass(), "fastTime", 1661774530000L);
        setField(term86966, term86966.getClass(), "cdate", null);
        setField(term86922, term86922.getClass(), "createdDate", term86966);
        setIntField(term86969, term86969.getClass(), "nanos", 871000000);
        setLongField(term86969, term86969.getClass(), "fastTime", 1306034212000L);
        setField(term86969, term86969.getClass(), "cdate", null);
        setField(term86922, term86922.getClass(), "lastModifiedDate", term86969);
        setBooleanField(term86922, term86922.getClass(), "frozen", false);
        setIntField(term86973, term86973.getClass(), "id", 330043745);
        setField(term86973, term86973.getClass(), "firstName", "UiWhvbypdr");
        setField(term86973, term86973.getClass(), "middleName", "CgleElJNje");
        setField(term86973, term86973.getClass(), "lastName", "ZrchvNGMtd");
        setField(term86973, term86973.getClass(), "email", "WaEcyVlcIx");
        setField(term86973, term86973.getClass(), "passwordHash", "ONcbPCQnHd");
        setIntField(term86973, term86973.getClass(), "positionId", -509349195);
        setBooleanField(term86973, term86973.getClass(), "isArchived", true);
        setIntField(term87037, term87037.getClass(), "nanos", 688000000);
        setLongField(term87037, term87037.getClass(), "fastTime", 1368518752000L);
        setField(term87037, term87037.getClass(), "cdate", null);
        setField(term86973, term86973.getClass(), "createdDate", term87037);
        setIntField(term87040, term87040.getClass(), "nanos", 44000000);
        setLongField(term87040, term87040.getClass(), "fastTime", 1639477227000L);
        setField(term87040, term87040.getClass(), "cdate", null);
        setField(term86973, term86973.getClass(), "lastModifiedDate", term87040);
        setField(term86973, term86973.getClass(), "employeeRoles", term87043);
        setIntField(term87049, term87049.getClass(), "employeeId", -1639041228);
        setIntField(term87049, term87049.getClass(), "projectId", 2027686272);
        setField(term87049, term87049.getClass(), "projectRoleId", enum194);
        setField(term87049, term87049.getClass(), "externalRate", term87055);
        setField(term86973, term86973.getClass(), "employeeProjectRole", term87049);
        setField(term86922, term86922.getClass(), "employee", term86973);
        setIntField(term87057, term87057.getClass(), "id", -1494356104);
        setField(term87057, term87057.getClass(), "name", "AobDaplFLl");
        setBooleanField(term87057, term87057.getClass(), "isArchived", false);
        setIntField(term87072, term87072.getClass(), "nanos", 413000000);
        setLongField(term87072, term87072.getClass(), "fastTime", 1585782501000L);
        setField(term87072, term87072.getClass(), "cdate", null);
        setField(term87057, term87057.getClass(), "createdDate", term87072);
        setIntField(term87075, term87075.getClass(), "nanos", 744000000);
        setLongField(term87075, term87075.getClass(), "fastTime", 1368479369000L);
        setField(term87075, term87075.getClass(), "cdate", null);
        setField(term87057, term87057.getClass(), "lastModifiedDate", term87075);
        setField(term86922, term86922.getClass(), "project", term87057);
        setLongField(term87078, term87078.getClass(), "id", -5786861555969446503L);
        setField(term87078, term87078.getClass(), "name", "pDkMNnAGgv");
        setIntField(term87078, term87078.getClass(), "projectId", -695279311);
        setBooleanField(term87078, term87078.getClass(), "billable", false);
        setBooleanField(term87078, term87078.getClass(), "isArchived", false);
        setIntField(term87095, term87095.getClass(), "nanos", 912000000);
        setLongField(term87095, term87095.getClass(), "fastTime", 1288071004000L);
        setField(term87095, term87095.getClass(), "cdate", null);
        setField(term87078, term87078.getClass(), "createdDate", term87095);
        setIntField(term87098, term87098.getClass(), "nanos", 859000000);
        setLongField(term87098, term87098.getClass(), "fastTime", 1386981902000L);
        setField(term87098, term87098.getClass(), "cdate", null);
        setField(term87078, term87078.getClass(), "lastModifiedDate", term87098);
        setField(term86922, term86922.getClass(), "task", term87078);
        term87101 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term87101;
        callMethod(klass, "setBillable", argTypes, term86922, args);
    }

};


