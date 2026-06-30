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

public class FreezeRecord_equals_180355214018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59359;
     Object term59482;

    public FreezeRecord_equals_180355214018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term59436 = new HashMap();
        Set<Object> term59533 =  ((Map) term59436).keySet();
        HashSet term59435 = new HashSet((Collection<? extends Object>) term59533);
        Class<? extends Object> term59535 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term59534 = ((Class) term59535).getDeclaredField((String) "EMPLOYEE");
        ((Field) term59534).setAccessible(true);
        Object enum137 = ((Field) term59534).get((Object) null);
        Float term59447 = new Float(0.51208574F);
        Class<? extends Object> term59876 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term59875 = ((Class) term59876).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term59875).setAccessible(true);
        Object enum138 = ((Field) term59875).get((Object) null);
        term59359 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term59361 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59365 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term59429 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term59432 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term59441 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term59476 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term59479 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term59359, term59359.getClass(), "id", 1843268026);
        setIntField(term59361, term59361.getClass(), "year", 2024);
        setShortField(term59361, term59361.getClass(), "month", (short) 8);
        setShortField(term59361, term59361.getClass(), "day", (short) 31);
        setField(term59359, term59359.getClass(), "freezeDate", term59361);
        setIntField(term59365, term59365.getClass(), "id", 954660603);
        setField(term59365, term59365.getClass(), "firstName", "qnvxzwuGKX");
        setField(term59365, term59365.getClass(), "middleName", "EdPAvpluZg");
        setField(term59365, term59365.getClass(), "lastName", "DzHVBMqWtE");
        setField(term59365, term59365.getClass(), "email", "THZSpzBRYP");
        setField(term59365, term59365.getClass(), "passwordHash", "ZfBIVGBQOE");
        setIntField(term59365, term59365.getClass(), "positionId", -1351605385);
        setBooleanField(term59365, term59365.getClass(), "isArchived", true);
        setIntField(term59429, term59429.getClass(), "nanos", 745000000);
        setLongField(term59429, term59429.getClass(), "fastTime", 1426386667000L);
        setField(term59429, term59429.getClass(), "cdate", null);
        setField(term59365, term59365.getClass(), "createdDate", term59429);
        setIntField(term59432, term59432.getClass(), "nanos", 42000000);
        setLongField(term59432, term59432.getClass(), "fastTime", 1755540749000L);
        setField(term59432, term59432.getClass(), "cdate", null);
        setField(term59365, term59365.getClass(), "lastModifiedDate", term59432);
        setField(term59365, term59365.getClass(), "employeeRoles", term59435);
        setIntField(term59441, term59441.getClass(), "employeeId", 278355793);
        setIntField(term59441, term59441.getClass(), "projectId", -310648604);
        setField(term59441, term59441.getClass(), "projectRoleId", enum137);
        setField(term59441, term59441.getClass(), "externalRate", term59447);
        setField(term59365, term59365.getClass(), "employeeProjectRole", term59441);
        setField(term59359, term59359.getClass(), "employee", term59365);
        setField(term59359, term59359.getClass(), "status", enum138);
        setField(term59359, term59359.getClass(), "info", "QSrDQfEsTR");
        setIntField(term59476, term59476.getClass(), "nanos", 189000000);
        setLongField(term59476, term59476.getClass(), "fastTime", 1619387974000L);
        setField(term59476, term59476.getClass(), "cdate", null);
        setField(term59359, term59359.getClass(), "createdDate", term59476);
        setIntField(term59479, term59479.getClass(), "nanos", 787000000);
        setLongField(term59479, term59479.getClass(), "fastTime", 1665109008000L);
        setField(term59479, term59479.getClass(), "cdate", null);
        setField(term59359, term59359.getClass(), "lastModifiedDate", term59479);
        term59482 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term59482;
        callMethod(klass, "equals", argTypes, term59359, args);
    }

};


