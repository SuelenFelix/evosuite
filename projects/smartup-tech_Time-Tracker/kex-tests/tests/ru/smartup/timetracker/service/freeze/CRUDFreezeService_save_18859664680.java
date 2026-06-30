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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;

public class CRUDFreezeService_save_18859664680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6537;

    public CRUDFreezeService_save_18859664680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6614 = new HashMap();
        Set<Object> term6708 =  ((Map) term6614).keySet();
        HashSet term6613 = new HashSet((Collection<? extends Object>) term6708);
        Class<? extends Object> term6710 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term6709 = ((Class) term6710).getDeclaredField((String) "MANAGER");
        ((Field) term6709).setAccessible(true);
        Object enum13 = ((Field) term6709).get((Object) null);
        Float term6625 = new Float(0.80973893F);
        Class<? extends Object> term7048 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term7047 = ((Class) term7048).getDeclaredField((String) "COMPLETED");
        ((Field) term7047).setAccessible(true);
        Object enum14 = ((Field) term7047).get((Object) null);
        term6537 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term6539 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6543 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term6607 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6610 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6619 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term6652 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6655 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term6537, term6537.getClass(), "id", 1743224434);
        setIntField(term6539, term6539.getClass(), "year", 2028);
        setShortField(term6539, term6539.getClass(), "month", (short) 5);
        setShortField(term6539, term6539.getClass(), "day", (short) 29);
        setField(term6537, term6537.getClass(), "freezeDate", term6539);
        setIntField(term6543, term6543.getClass(), "id", 842904495);
        setField(term6543, term6543.getClass(), "firstName", "SPtPatHeOm");
        setField(term6543, term6543.getClass(), "middleName", "ywmcuThdfL");
        setField(term6543, term6543.getClass(), "lastName", "GBOEuByOfr");
        setField(term6543, term6543.getClass(), "email", "NHbOFFjyVK");
        setField(term6543, term6543.getClass(), "passwordHash", "zaloBqlrSo");
        setIntField(term6543, term6543.getClass(), "positionId", 1008080511);
        setBooleanField(term6543, term6543.getClass(), "isArchived", true);
        setIntField(term6607, term6607.getClass(), "nanos", 412000000);
        setLongField(term6607, term6607.getClass(), "fastTime", 1368058638000L);
        setField(term6607, term6607.getClass(), "cdate", null);
        setField(term6543, term6543.getClass(), "createdDate", term6607);
        setIntField(term6610, term6610.getClass(), "nanos", 512000000);
        setLongField(term6610, term6610.getClass(), "fastTime", 1836071279000L);
        setField(term6610, term6610.getClass(), "cdate", null);
        setField(term6543, term6543.getClass(), "lastModifiedDate", term6610);
        setField(term6543, term6543.getClass(), "employeeRoles", term6613);
        setIntField(term6619, term6619.getClass(), "employeeId", 1935707624);
        setIntField(term6619, term6619.getClass(), "projectId", 1507074215);
        setField(term6619, term6619.getClass(), "projectRoleId", enum13);
        setField(term6619, term6619.getClass(), "externalRate", term6625);
        setField(term6543, term6543.getClass(), "employeeProjectRole", term6619);
        setField(term6537, term6537.getClass(), "employee", term6543);
        setField(term6537, term6537.getClass(), "status", enum14);
        setField(term6537, term6537.getClass(), "info", "vvoLrMGCoN");
        setIntField(term6652, term6652.getClass(), "nanos", 745000000);
        setLongField(term6652, term6652.getClass(), "fastTime", 1426386667000L);
        setField(term6652, term6652.getClass(), "cdate", null);
        setField(term6537, term6537.getClass(), "createdDate", term6652);
        setIntField(term6655, term6655.getClass(), "nanos", 42000000);
        setLongField(term6655, term6655.getClass(), "fastTime", 1755540749000L);
        setField(term6655, term6655.getClass(), "cdate", null);
        setField(term6537, term6537.getClass(), "lastModifiedDate", term6655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.CRUDFreezeService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term6537;
        callMethod(klass, "save", argTypes, null, args);
    }

};


