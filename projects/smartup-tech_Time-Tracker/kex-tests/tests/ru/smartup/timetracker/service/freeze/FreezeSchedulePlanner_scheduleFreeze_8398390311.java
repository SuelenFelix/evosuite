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

public class FreezeSchedulePlanner_scheduleFreeze_8398390311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term899;
     Object term911;

    public FreezeSchedulePlanner_scheduleFreeze_8398390311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term899 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term900 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term901 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term902 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term904 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term905 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term899, term899.getClass(), "crudFreezeService", null);
        setField(term902, term902.getClass(), "id", "");
        setField(term904, term904.getClass(), "standardTransitions", null);
        setField(term904, term904.getClass(), "standardOffsets", null);
        setField(term904, term904.getClass(), "savingsInstantTransitions", null);
        setField(term904, term904.getClass(), "savingsLocalTransitions", null);
        setField(term904, term904.getClass(), "wallOffsets", null);
        setField(term904, term904.getClass(), "lastRules", null);
        setField(term904, term904.getClass(), "lastRulesCache", null);
        setField(term902, term902.getClass(), "rules", term904);
        setField(term901, term901.getClass(), "timeZone", term902);
        setByteField(term905, term905.getClass(), "hour", (byte) 21);
        setByteField(term905, term905.getClass(), "minute", (byte) 50);
        setByteField(term905, term905.getClass(), "second", (byte) 49);
        setIntField(term905, term905.getClass(), "nano", 937411556);
        setField(term901, term901.getClass(), "fixedTimeFreeze", term905);
        setIntField(term901, term901.getClass(), "dayToUnfreeze", -1347358701);
        setField(term900, term900.getClass(), "freezeProperties", term901);
        setField(term899, term899.getClass(), "freezeDateUtils", term900);
        setField(term899, term899.getClass(), "freezeScheduler", null);
        setField(term899, term899.getClass(), "trackUnitService", null);
        HashMap term988 = new HashMap();
        Set<Object> term1082 =  ((Map) term988).keySet();
        HashSet term987 = new HashSet((Collection<? extends Object>) term1082);
        Class<? extends Object> term1107 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term1106 = ((Class) term1107).getDeclaredField((String) "EMPLOYEE");
        ((Field) term1106).setAccessible(true);
        Object enum1 = ((Field) term1106).get((Object) null);
        Float term999 = new Float(0.15826964F);
        Class<? extends Object> term1448 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term1447 = ((Class) term1448).getDeclaredField((String) "COMPLETED");
        ((Field) term1447).setAccessible(true);
        Object enum2 = ((Field) term1447).get((Object) null);
        term911 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term917 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term981 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term984 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term993 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term1026 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1029 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term911, term911.getClass(), "id", 806595993);
        setIntField(term913, term913.getClass(), "year", 2021);
        setShortField(term913, term913.getClass(), "month", (short) 9);
        setShortField(term913, term913.getClass(), "day", (short) 30);
        setField(term911, term911.getClass(), "freezeDate", term913);
        setIntField(term917, term917.getClass(), "id", 548228925);
        setField(term917, term917.getClass(), "firstName", "OcJCIDNIXA");
        setField(term917, term917.getClass(), "middleName", "XfRABIFVEp");
        setField(term917, term917.getClass(), "lastName", "MHGKyEnwKc");
        setField(term917, term917.getClass(), "email", "ShIELyuULw");
        setField(term917, term917.getClass(), "passwordHash", "IpQuOGMgmj");
        setIntField(term917, term917.getClass(), "positionId", -749861210);
        setBooleanField(term917, term917.getClass(), "isArchived", false);
        setIntField(term981, term981.getClass(), "nanos", 85000000);
        setLongField(term981, term981.getClass(), "fastTime", 1597506753000L);
        setField(term981, term981.getClass(), "cdate", null);
        setField(term917, term917.getClass(), "createdDate", term981);
        setIntField(term984, term984.getClass(), "nanos", 303000000);
        setLongField(term984, term984.getClass(), "fastTime", 1644410315000L);
        setField(term984, term984.getClass(), "cdate", null);
        setField(term917, term917.getClass(), "lastModifiedDate", term984);
        setField(term917, term917.getClass(), "employeeRoles", term987);
        setIntField(term993, term993.getClass(), "employeeId", 1694224101);
        setIntField(term993, term993.getClass(), "projectId", 937859191);
        setField(term993, term993.getClass(), "projectRoleId", enum1);
        setField(term993, term993.getClass(), "externalRate", term999);
        setField(term917, term917.getClass(), "employeeProjectRole", term993);
        setField(term911, term911.getClass(), "employee", term917);
        setField(term911, term911.getClass(), "status", enum2);
        setField(term911, term911.getClass(), "info", "pJbnHTYrxn");
        setIntField(term1026, term1026.getClass(), "nanos", 490000000);
        setLongField(term1026, term1026.getClass(), "fastTime", 1840769983000L);
        setField(term1026, term1026.getClass(), "cdate", null);
        setField(term911, term911.getClass(), "createdDate", term1026);
        setIntField(term1029, term1029.getClass(), "nanos", 583000000);
        setLongField(term1029, term1029.getClass(), "fastTime", 1402592830000L);
        setField(term1029, term1029.getClass(), "cdate", null);
        setField(term911, term911.getClass(), "lastModifiedDate", term1029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term911;
        callMethod(klass, "scheduleFreeze", argTypes, term899, args);
    }

};


