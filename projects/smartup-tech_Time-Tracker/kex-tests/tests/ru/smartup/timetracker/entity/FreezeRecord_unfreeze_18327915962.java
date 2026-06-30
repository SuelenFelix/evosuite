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

public class FreezeRecord_unfreeze_18327915962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43951;
     Object term44071;

    public FreezeRecord_unfreeze_18327915962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term44028 = new HashMap();
        Set<Object> term44123 =  ((Map) term44028).keySet();
        HashSet term44027 = new HashSet((Collection<? extends Object>) term44123);
        Class<? extends Object> term44125 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term44124 = ((Class) term44125).getDeclaredField((String) "MANAGER");
        ((Field) term44124).setAccessible(true);
        Object enum103 = ((Field) term44124).get((Object) null);
        Float term44039 = new Float(0.7633268F);
        Class<? extends Object> term44463 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term44462 = ((Class) term44463).getDeclaredField((String) "DELETING");
        ((Field) term44462).setAccessible(true);
        Object enum104 = ((Field) term44462).get((Object) null);
        term43951 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term43953 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43957 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term44021 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term44024 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term44033 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term44065 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term44068 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term43951, term43951.getClass(), "id", -860131894);
        setIntField(term43953, term43953.getClass(), "year", 2021);
        setShortField(term43953, term43953.getClass(), "month", (short) 1);
        setShortField(term43953, term43953.getClass(), "day", (short) 18);
        setField(term43951, term43951.getClass(), "freezeDate", term43953);
        setIntField(term43957, term43957.getClass(), "id", -1022990421);
        setField(term43957, term43957.getClass(), "firstName", "XJJNClzHRf");
        setField(term43957, term43957.getClass(), "middleName", "HDaezxQfQR");
        setField(term43957, term43957.getClass(), "lastName", "iikZEapDlu");
        setField(term43957, term43957.getClass(), "email", "nhoHrZfnIN");
        setField(term43957, term43957.getClass(), "passwordHash", "ZkMALXpEAZ");
        setIntField(term43957, term43957.getClass(), "positionId", 1045547089);
        setBooleanField(term43957, term43957.getClass(), "isArchived", false);
        setIntField(term44021, term44021.getClass(), "nanos", 491000000);
        setLongField(term44021, term44021.getClass(), "fastTime", 1676460842000L);
        setField(term44021, term44021.getClass(), "cdate", null);
        setField(term43957, term43957.getClass(), "createdDate", term44021);
        setIntField(term44024, term44024.getClass(), "nanos", 464000000);
        setLongField(term44024, term44024.getClass(), "fastTime", 1724949706000L);
        setField(term44024, term44024.getClass(), "cdate", null);
        setField(term43957, term43957.getClass(), "lastModifiedDate", term44024);
        setField(term43957, term43957.getClass(), "employeeRoles", term44027);
        setIntField(term44033, term44033.getClass(), "employeeId", -1122880881);
        setIntField(term44033, term44033.getClass(), "projectId", -542712742);
        setField(term44033, term44033.getClass(), "projectRoleId", enum103);
        setField(term44033, term44033.getClass(), "externalRate", term44039);
        setField(term43957, term43957.getClass(), "employeeProjectRole", term44033);
        setField(term43951, term43951.getClass(), "employee", term43957);
        setField(term43951, term43951.getClass(), "status", enum104);
        setField(term43951, term43951.getClass(), "info", "tXfQjSqDzN");
        setIntField(term44065, term44065.getClass(), "nanos", 108000000);
        setLongField(term44065, term44065.getClass(), "fastTime", 1743125992000L);
        setField(term44065, term44065.getClass(), "cdate", null);
        setField(term43951, term43951.getClass(), "createdDate", term44065);
        setIntField(term44068, term44068.getClass(), "nanos", 580000000);
        setLongField(term44068, term44068.getClass(), "fastTime", 1728446946000L);
        setField(term44068, term44068.getClass(), "cdate", null);
        setField(term43951, term43951.getClass(), "lastModifiedDate", term44068);
        term44071 = new Integer(-1254072822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term44071;
        callMethod(klass, "unfreeze", argTypes, term43951, args);
    }

};


