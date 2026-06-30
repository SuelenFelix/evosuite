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

public class FreezeRecord_canEqual_99938951119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60270;
     Object term60390;

    public FreezeRecord_canEqual_99938951119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term60347 = new HashMap();
        Set<Object> term60441 =  ((Map) term60347).keySet();
        HashSet term60346 = new HashSet((Collection<? extends Object>) term60441);
        Class<? extends Object> term60443 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term60442 = ((Class) term60443).getDeclaredField((String) "EMPLOYEE");
        ((Field) term60442).setAccessible(true);
        Object enum139 = ((Field) term60442).get((Object) null);
        Float term60358 = new Float(0.28528106F);
        Class<? extends Object> term60784 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term60783 = ((Class) term60784).getDeclaredField((String) "OUTDATED");
        ((Field) term60783).setAccessible(true);
        Object enum140 = ((Field) term60783).get((Object) null);
        term60270 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term60272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60276 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term60340 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term60343 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term60352 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term60384 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term60387 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term60270, term60270.getClass(), "id", -648200466);
        setIntField(term60272, term60272.getClass(), "year", 2019);
        setShortField(term60272, term60272.getClass(), "month", (short) 2);
        setShortField(term60272, term60272.getClass(), "day", (short) 20);
        setField(term60270, term60270.getClass(), "freezeDate", term60272);
        setIntField(term60276, term60276.getClass(), "id", 2007134147);
        setField(term60276, term60276.getClass(), "firstName", "PsqusYmejD");
        setField(term60276, term60276.getClass(), "middleName", "NTWMiBEaDF");
        setField(term60276, term60276.getClass(), "lastName", "SPBstwKFVr");
        setField(term60276, term60276.getClass(), "email", "WxYUTuqmIq");
        setField(term60276, term60276.getClass(), "passwordHash", "OeQLvhVERT");
        setIntField(term60276, term60276.getClass(), "positionId", 993388358);
        setBooleanField(term60276, term60276.getClass(), "isArchived", false);
        setIntField(term60340, term60340.getClass(), "nanos", 909000000);
        setLongField(term60340, term60340.getClass(), "fastTime", 1379067035000L);
        setField(term60340, term60340.getClass(), "cdate", null);
        setField(term60276, term60276.getClass(), "createdDate", term60340);
        setIntField(term60343, term60343.getClass(), "nanos", 125000000);
        setLongField(term60343, term60343.getClass(), "fastTime", 1491490440000L);
        setField(term60343, term60343.getClass(), "cdate", null);
        setField(term60276, term60276.getClass(), "lastModifiedDate", term60343);
        setField(term60276, term60276.getClass(), "employeeRoles", term60346);
        setIntField(term60352, term60352.getClass(), "employeeId", -765191335);
        setIntField(term60352, term60352.getClass(), "projectId", -1697741155);
        setField(term60352, term60352.getClass(), "projectRoleId", enum139);
        setField(term60352, term60352.getClass(), "externalRate", term60358);
        setField(term60276, term60276.getClass(), "employeeProjectRole", term60352);
        setField(term60270, term60270.getClass(), "employee", term60276);
        setField(term60270, term60270.getClass(), "status", enum140);
        setField(term60270, term60270.getClass(), "info", "IlvgFINwIa");
        setIntField(term60384, term60384.getClass(), "nanos", 416000000);
        setLongField(term60384, term60384.getClass(), "fastTime", 1608534423000L);
        setField(term60384, term60384.getClass(), "cdate", null);
        setField(term60270, term60270.getClass(), "createdDate", term60384);
        setIntField(term60387, term60387.getClass(), "nanos", 291000000);
        setLongField(term60387, term60387.getClass(), "fastTime", 1878639582000L);
        setField(term60387, term60387.getClass(), "cdate", null);
        setField(term60270, term60270.getClass(), "lastModifiedDate", term60387);
        term60390 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term60390;
        callMethod(klass, "canEqual", argTypes, term60270, args);
    }

};


