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

public class FreezeRecord_setFreezeDate_180058441712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53021;
     Object term53144;

    public FreezeRecord_setFreezeDate_180058441712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term53098 = new HashMap();
        Set<Object> term53198 =  ((Map) term53098).keySet();
        HashSet term53097 = new HashSet((Collection<? extends Object>) term53198);
        Class<? extends Object> term53200 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term53199 = ((Class) term53200).getDeclaredField((String) "EMPLOYEE");
        ((Field) term53199).setAccessible(true);
        Object enum123 = ((Field) term53199).get((Object) null);
        Float term53109 = new Float(0.10667074F);
        Class<? extends Object> term53541 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term53540 = ((Class) term53541).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term53540).setAccessible(true);
        Object enum124 = ((Field) term53540).get((Object) null);
        term53021 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term53023 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53027 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term53091 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term53094 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term53103 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term53138 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term53141 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term53021, term53021.getClass(), "id", -519881101);
        setIntField(term53023, term53023.getClass(), "year", 2025);
        setShortField(term53023, term53023.getClass(), "month", (short) 4);
        setShortField(term53023, term53023.getClass(), "day", (short) 23);
        setField(term53021, term53021.getClass(), "freezeDate", term53023);
        setIntField(term53027, term53027.getClass(), "id", -680920524);
        setField(term53027, term53027.getClass(), "firstName", "sNQFlATEeQ");
        setField(term53027, term53027.getClass(), "middleName", "ZKMLioamsY");
        setField(term53027, term53027.getClass(), "lastName", "WVbxuoDBcn");
        setField(term53027, term53027.getClass(), "email", "pvDEABOxLt");
        setField(term53027, term53027.getClass(), "passwordHash", "beAMpkroCQ");
        setIntField(term53027, term53027.getClass(), "positionId", -916335264);
        setBooleanField(term53027, term53027.getClass(), "isArchived", true);
        setIntField(term53091, term53091.getClass(), "nanos", 267000000);
        setLongField(term53091, term53091.getClass(), "fastTime", 1599083743000L);
        setField(term53091, term53091.getClass(), "cdate", null);
        setField(term53027, term53027.getClass(), "createdDate", term53091);
        setIntField(term53094, term53094.getClass(), "nanos", 907000000);
        setLongField(term53094, term53094.getClass(), "fastTime", 1623676534000L);
        setField(term53094, term53094.getClass(), "cdate", null);
        setField(term53027, term53027.getClass(), "lastModifiedDate", term53094);
        setField(term53027, term53027.getClass(), "employeeRoles", term53097);
        setIntField(term53103, term53103.getClass(), "employeeId", -919416536);
        setIntField(term53103, term53103.getClass(), "projectId", -43417861);
        setField(term53103, term53103.getClass(), "projectRoleId", enum123);
        setField(term53103, term53103.getClass(), "externalRate", term53109);
        setField(term53027, term53027.getClass(), "employeeProjectRole", term53103);
        setField(term53021, term53021.getClass(), "employee", term53027);
        setField(term53021, term53021.getClass(), "status", enum124);
        setField(term53021, term53021.getClass(), "info", "uSUvKAyuvd");
        setIntField(term53138, term53138.getClass(), "nanos", 85000000);
        setLongField(term53138, term53138.getClass(), "fastTime", 1597506753000L);
        setField(term53138, term53138.getClass(), "cdate", null);
        setField(term53021, term53021.getClass(), "createdDate", term53138);
        setIntField(term53141, term53141.getClass(), "nanos", 303000000);
        setLongField(term53141, term53141.getClass(), "fastTime", 1644410315000L);
        setField(term53141, term53141.getClass(), "cdate", null);
        setField(term53021, term53021.getClass(), "lastModifiedDate", term53141);
        term53144 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term53144, term53144.getClass(), "year", 2012);
        setShortField(term53144, term53144.getClass(), "month", (short) 10);
        setShortField(term53144, term53144.getClass(), "day", (short) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term53144;
        callMethod(klass, "setFreezeDate", argTypes, term53021, args);
    }

};


