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

public class FreezeRecord_setEmployee_19395556513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53935;
     Object term54055;

    public FreezeRecord_setEmployee_19395556513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term54012 = new HashMap();
        Set<Object> term54197 =  ((Map) term54012).keySet();
        HashSet term54011 = new HashSet((Collection<? extends Object>) term54197);
        Class<? extends Object> term54199 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term54198 = ((Class) term54199).getDeclaredField((String) "EMPLOYEE");
        ((Field) term54198).setAccessible(true);
        Object enum125 = ((Field) term54198).get((Object) null);
        Float term54023 = new Float(0.9571234F);
        Class<? extends Object> term54540 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term54539 = ((Class) term54540).getDeclaredField((String) "OUTDATED");
        ((Field) term54539).setAccessible(true);
        Object enum126 = ((Field) term54539).get((Object) null);
        term53935 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term53937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53941 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term54005 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term54008 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term54017 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term54049 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term54052 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term53935, term53935.getClass(), "id", -1533843432);
        setIntField(term53937, term53937.getClass(), "year", 2024);
        setShortField(term53937, term53937.getClass(), "month", (short) 1);
        setShortField(term53937, term53937.getClass(), "day", (short) 24);
        setField(term53935, term53935.getClass(), "freezeDate", term53937);
        setIntField(term53941, term53941.getClass(), "id", -123338791);
        setField(term53941, term53941.getClass(), "firstName", "onQLVONGuf");
        setField(term53941, term53941.getClass(), "middleName", "SOrEHbcbmn");
        setField(term53941, term53941.getClass(), "lastName", "bnsyeQXFdu");
        setField(term53941, term53941.getClass(), "email", "BwtdjiefJn");
        setField(term53941, term53941.getClass(), "passwordHash", "jDmhBrIoDa");
        setIntField(term53941, term53941.getClass(), "positionId", -1467089634);
        setBooleanField(term53941, term53941.getClass(), "isArchived", true);
        setIntField(term54005, term54005.getClass(), "nanos", 490000000);
        setLongField(term54005, term54005.getClass(), "fastTime", 1840769983000L);
        setField(term54005, term54005.getClass(), "cdate", null);
        setField(term53941, term53941.getClass(), "createdDate", term54005);
        setIntField(term54008, term54008.getClass(), "nanos", 583000000);
        setLongField(term54008, term54008.getClass(), "fastTime", 1402592830000L);
        setField(term54008, term54008.getClass(), "cdate", null);
        setField(term53941, term53941.getClass(), "lastModifiedDate", term54008);
        setField(term53941, term53941.getClass(), "employeeRoles", term54011);
        setIntField(term54017, term54017.getClass(), "employeeId", 413548937);
        setIntField(term54017, term54017.getClass(), "projectId", 1901317214);
        setField(term54017, term54017.getClass(), "projectRoleId", enum125);
        setField(term54017, term54017.getClass(), "externalRate", term54023);
        setField(term53941, term53941.getClass(), "employeeProjectRole", term54017);
        setField(term53935, term53935.getClass(), "employee", term53941);
        setField(term53935, term53935.getClass(), "status", enum126);
        setField(term53935, term53935.getClass(), "info", "SPtPatHeOm");
        setIntField(term54049, term54049.getClass(), "nanos", 891000000);
        setLongField(term54049, term54049.getClass(), "fastTime", 1303208814000L);
        setField(term54049, term54049.getClass(), "cdate", null);
        setField(term53935, term53935.getClass(), "createdDate", term54049);
        setIntField(term54052, term54052.getClass(), "nanos", 741000000);
        setLongField(term54052, term54052.getClass(), "fastTime", 1798201949000L);
        setField(term54052, term54052.getClass(), "cdate", null);
        setField(term53935, term53935.getClass(), "lastModifiedDate", term54052);
        HashMap term54126 = new HashMap();
        Set<Object> term54975 =  ((Map) term54126).keySet();
        HashSet term54125 = new HashSet((Collection<? extends Object>) term54975);
        Class<? extends Object> term54977 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term54976 = ((Class) term54977).getDeclaredField((String) "MANAGER");
        ((Field) term54976).setAccessible(true);
        Object enum127 = ((Field) term54976).get((Object) null);
        Float term54145 = new Float(0.114929974F);
        term54055 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term54119 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term54122 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term54131 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term54055, term54055.getClass(), "id", 1166710220);
        setField(term54055, term54055.getClass(), "firstName", "ywmcuThdfL");
        setField(term54055, term54055.getClass(), "middleName", "GBOEuByOfr");
        setField(term54055, term54055.getClass(), "lastName", "NHbOFFjyVK");
        setField(term54055, term54055.getClass(), "email", "zaloBqlrSo");
        setField(term54055, term54055.getClass(), "passwordHash", "vvoLrMGCoN");
        setIntField(term54055, term54055.getClass(), "positionId", -1070592289);
        setBooleanField(term54055, term54055.getClass(), "isArchived", true);
        setIntField(term54119, term54119.getClass(), "nanos", 367000000);
        setLongField(term54119, term54119.getClass(), "fastTime", 1408283942000L);
        setField(term54119, term54119.getClass(), "cdate", null);
        setField(term54055, term54055.getClass(), "createdDate", term54119);
        setIntField(term54122, term54122.getClass(), "nanos", 410000000);
        setLongField(term54122, term54122.getClass(), "fastTime", 1643970344000L);
        setField(term54122, term54122.getClass(), "cdate", null);
        setField(term54055, term54055.getClass(), "lastModifiedDate", term54122);
        setField(term54055, term54055.getClass(), "employeeRoles", term54125);
        setIntField(term54131, term54131.getClass(), "employeeId", -1464172784);
        setIntField(term54131, term54131.getClass(), "projectId", 32185364);
        setField(term54131, term54131.getClass(), "projectRoleId", enum127);
        setField(term54131, term54131.getClass(), "externalRate", term54145);
        setField(term54055, term54055.getClass(), "employeeProjectRole", term54131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Employee");
        Object[] args = new Object[1];
        args[0] = term54055;
        callMethod(klass, "setEmployee", argTypes, term53935, args);
    }

};


