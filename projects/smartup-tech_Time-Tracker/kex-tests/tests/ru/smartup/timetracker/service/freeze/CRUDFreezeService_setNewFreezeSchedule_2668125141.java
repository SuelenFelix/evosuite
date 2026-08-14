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
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashSet;
import java.lang.Float;
import java.lang.String;

public class CRUDFreezeService_setNewFreezeSchedule_2668125141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7621;
     Object term7744;

    public CRUDFreezeService_setNewFreezeSchedule_2668125141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term7645 = new HashSet();
        Float term7649 = new Float(0.7633268F);
        Class<? extends Object> term7748 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term7747 = ((Class) term7748).getDeclaredField((String) "DELETING");
        ((Field) term7747).setAccessible(true);
        Object enum15 = ((Field) term7747).get((Object) null);
        Object term7624 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term7626 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7630 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term7639 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term7642 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term7646 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term7666 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term7669 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term7624, term7624.getClass(), "id", -282881827);
        setIntField(term7626, term7626.getClass(), "year", 2021);
        setShortField(term7626, term7626.getClass(), "month", (short) 8);
        setShortField(term7626, term7626.getClass(), "day", (short) 11);
        setField(term7624, term7624.getClass(), "freezeDate", term7626);
        setIntField(term7630, term7630.getClass(), "id", -1183353915);
        setField(term7630, term7630.getClass(), "firstName", "");
        setField(term7630, term7630.getClass(), "middleName", "");
        setField(term7630, term7630.getClass(), "lastName", "");
        setField(term7630, term7630.getClass(), "email", "");
        setField(term7630, term7630.getClass(), "passwordHash", "");
        setIntField(term7630, term7630.getClass(), "positionId", -420030135);
        setBooleanField(term7630, term7630.getClass(), "isArchived", true);
        setIntField(term7639, term7639.getClass(), "nanos", 189000000);
        setLongField(term7639, term7639.getClass(), "fastTime", 1619387974000L);
        setField(term7639, term7639.getClass(), "cdate", null);
        setField(term7630, term7630.getClass(), "createdDate", term7639);
        setIntField(term7642, term7642.getClass(), "nanos", 787000000);
        setLongField(term7642, term7642.getClass(), "fastTime", 1665109008000L);
        setField(term7642, term7642.getClass(), "cdate", null);
        setField(term7630, term7630.getClass(), "lastModifiedDate", term7642);
        setField(term7630, term7630.getClass(), "employeeRoles", term7645);
        setIntField(term7646, term7646.getClass(), "employeeId", 267763294);
        setIntField(term7646, term7646.getClass(), "projectId", -1497710478);
        setField(term7646, term7646.getClass(), "projectRoleId", null);
        setField(term7646, term7646.getClass(), "externalRate", term7649);
        setField(term7630, term7630.getClass(), "employeeProjectRole", term7646);
        setField(term7624, term7624.getClass(), "employee", term7630);
        setField(term7624, term7624.getClass(), "status", enum15);
        setField(term7624, term7624.getClass(), "info", "FjOiNAfBOc");
        setIntField(term7666, term7666.getClass(), "nanos", 909000000);
        setLongField(term7666, term7666.getClass(), "fastTime", 1379067035000L);
        setField(term7666, term7666.getClass(), "cdate", null);
        setField(term7624, term7624.getClass(), "createdDate", term7666);
        setIntField(term7669, term7669.getClass(), "nanos", 125000000);
        setLongField(term7669, term7669.getClass(), "fastTime", 1491490440000L);
        setField(term7669, term7669.getClass(), "cdate", null);
        setField(term7624, term7624.getClass(), "lastModifiedDate", term7669);
        Object term7673 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term7675 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7679 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term7684 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term7687 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term7673, term7673.getClass(), "id", 49950830);
        setIntField(term7675, term7675.getClass(), "year", 2014);
        setShortField(term7675, term7675.getClass(), "month", (short) 2);
        setShortField(term7675, term7675.getClass(), "day", (short) 23);
        setField(term7673, term7673.getClass(), "freezeDate", term7675);
        setIntField(term7679, term7679.getClass(), "id", -525257914);
        setField(term7679, term7679.getClass(), "firstName", null);
        setField(term7679, term7679.getClass(), "middleName", null);
        setField(term7679, term7679.getClass(), "lastName", null);
        setField(term7679, term7679.getClass(), "email", null);
        setField(term7679, term7679.getClass(), "passwordHash", null);
        setIntField(term7679, term7679.getClass(), "positionId", 147209682);
        setBooleanField(term7679, term7679.getClass(), "isArchived", true);
        setField(term7679, term7679.getClass(), "createdDate", null);
        setField(term7679, term7679.getClass(), "lastModifiedDate", null);
        setField(term7679, term7679.getClass(), "employeeRoles", null);
        setField(term7679, term7679.getClass(), "employeeProjectRole", null);
        setField(term7673, term7673.getClass(), "employee", term7679);
        setField(term7673, term7673.getClass(), "status", enum15);
        setField(term7673, term7673.getClass(), "info", "");
        setIntField(term7684, term7684.getClass(), "nanos", 256000000);
        setLongField(term7684, term7684.getClass(), "fastTime", 1841956160000L);
        setField(term7684, term7684.getClass(), "cdate", null);
        setField(term7673, term7673.getClass(), "createdDate", term7684);
        setIntField(term7687, term7687.getClass(), "nanos", 93000000);
        setLongField(term7687, term7687.getClass(), "fastTime", 1859212762000L);
        setField(term7687, term7687.getClass(), "cdate", null);
        setField(term7673, term7673.getClass(), "lastModifiedDate", term7687);
        Object term7691 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        setIntField(term7691, term7691.getClass(), "id", 1743683601);
        setField(term7691, term7691.getClass(), "freezeDate", null);
        setField(term7691, term7691.getClass(), "employee", null);
        setField(term7691, term7691.getClass(), "status", null);
        setField(term7691, term7691.getClass(), "info", null);
        setField(term7691, term7691.getClass(), "createdDate", null);
        setField(term7691, term7691.getClass(), "lastModifiedDate", null);
        term7621 = new LinkedList();
        ((LinkedList) term7621).add(term7624);
        ((LinkedList) term7621).add(term7673);
        ((LinkedList) term7621).add(term7691);
        ((LinkedList) term7621).add((Object)null);
        ((LinkedList) term7621).add((Object)null);
        term7744 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.CRUDFreezeService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term7621;
        args[1] = term7744;
        callMethod(klass, "setNewFreezeSchedule", argTypes, null, args);
    }

};


