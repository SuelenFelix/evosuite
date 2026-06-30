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
import java.lang.Integer;

public class FreezeRecord_setId_46653603911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52117;
     Object term52238;

    public FreezeRecord_setId_46653603911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term52194 = new HashMap();
        Set<Object> term52290 =  ((Map) term52194).keySet();
        HashSet term52193 = new HashSet((Collection<? extends Object>) term52290);
        Class<? extends Object> term52292 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term52291 = ((Class) term52292).getDeclaredField((String) "EMPLOYEE");
        ((Field) term52291).setAccessible(true);
        Object enum121 = ((Field) term52291).get((Object) null);
        Float term52205 = new Float(0.068145275F);
        Class<? extends Object> term52633 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term52632 = ((Class) term52633).getDeclaredField((String) "COMPLETED");
        ((Field) term52632).setAccessible(true);
        Object enum122 = ((Field) term52632).get((Object) null);
        term52117 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term52119 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52123 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term52187 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term52190 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term52199 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term52232 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term52235 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term52117, term52117.getClass(), "id", 1236004505);
        setIntField(term52119, term52119.getClass(), "year", 2020);
        setShortField(term52119, term52119.getClass(), "month", (short) 5);
        setShortField(term52119, term52119.getClass(), "day", (short) 14);
        setField(term52117, term52117.getClass(), "freezeDate", term52119);
        setIntField(term52123, term52123.getClass(), "id", 1050765721);
        setField(term52123, term52123.getClass(), "firstName", "UBRmXJmfrt");
        setField(term52123, term52123.getClass(), "middleName", "WZzvmIHhzZ");
        setField(term52123, term52123.getClass(), "lastName", "doQLHkjpNm");
        setField(term52123, term52123.getClass(), "email", "lCyLIcSuom");
        setField(term52123, term52123.getClass(), "passwordHash", "CGOpQSZZwI");
        setIntField(term52123, term52123.getClass(), "positionId", 474518942);
        setBooleanField(term52123, term52123.getClass(), "isArchived", true);
        setIntField(term52187, term52187.getClass(), "nanos", 18000000);
        setLongField(term52187, term52187.getClass(), "fastTime", 1847823435000L);
        setField(term52187, term52187.getClass(), "cdate", null);
        setField(term52123, term52123.getClass(), "createdDate", term52187);
        setIntField(term52190, term52190.getClass(), "nanos", 416000000);
        setLongField(term52190, term52190.getClass(), "fastTime", 1744259919000L);
        setField(term52190, term52190.getClass(), "cdate", null);
        setField(term52123, term52123.getClass(), "lastModifiedDate", term52190);
        setField(term52123, term52123.getClass(), "employeeRoles", term52193);
        setIntField(term52199, term52199.getClass(), "employeeId", -1656687479);
        setIntField(term52199, term52199.getClass(), "projectId", -249614216);
        setField(term52199, term52199.getClass(), "projectRoleId", enum121);
        setField(term52199, term52199.getClass(), "externalRate", term52205);
        setField(term52123, term52123.getClass(), "employeeProjectRole", term52199);
        setField(term52117, term52117.getClass(), "employee", term52123);
        setField(term52117, term52117.getClass(), "status", enum122);
        setField(term52117, term52117.getClass(), "info", "ypEdrstygY");
        setIntField(term52232, term52232.getClass(), "nanos", 711000000);
        setLongField(term52232, term52232.getClass(), "fastTime", 1312175339000L);
        setField(term52232, term52232.getClass(), "cdate", null);
        setField(term52117, term52117.getClass(), "createdDate", term52232);
        setIntField(term52235, term52235.getClass(), "nanos", 286000000);
        setLongField(term52235, term52235.getClass(), "fastTime", 1380442061000L);
        setField(term52235, term52235.getClass(), "cdate", null);
        setField(term52117, term52117.getClass(), "lastModifiedDate", term52235);
        term52238 = new Integer(1870727665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52238;
        callMethod(klass, "setId", argTypes, term52117, args);
    }

};


