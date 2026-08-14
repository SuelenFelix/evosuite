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

public class FreezeSchedulePlanner_unfreeze_6865010407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4795;
     Object term4807;
     Object term4930;

    public FreezeSchedulePlanner_unfreeze_6865010407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4795 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term4796 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term4797 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term4798 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term4800 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term4801 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4795, term4795.getClass(), "crudFreezeService", null);
        setField(term4798, term4798.getClass(), "id", "");
        setField(term4800, term4800.getClass(), "standardTransitions", null);
        setField(term4800, term4800.getClass(), "standardOffsets", null);
        setField(term4800, term4800.getClass(), "savingsInstantTransitions", null);
        setField(term4800, term4800.getClass(), "savingsLocalTransitions", null);
        setField(term4800, term4800.getClass(), "wallOffsets", null);
        setField(term4800, term4800.getClass(), "lastRules", null);
        setField(term4800, term4800.getClass(), "lastRulesCache", null);
        setField(term4798, term4798.getClass(), "rules", term4800);
        setField(term4797, term4797.getClass(), "timeZone", term4798);
        setByteField(term4801, term4801.getClass(), "hour", (byte) 0);
        setByteField(term4801, term4801.getClass(), "minute", (byte) 25);
        setByteField(term4801, term4801.getClass(), "second", (byte) 28);
        setIntField(term4801, term4801.getClass(), "nano", 676721313);
        setField(term4797, term4797.getClass(), "fixedTimeFreeze", term4801);
        setIntField(term4797, term4797.getClass(), "dayToUnfreeze", -1254072822);
        setField(term4796, term4796.getClass(), "freezeProperties", term4797);
        setField(term4795, term4795.getClass(), "freezeDateUtils", term4796);
        setField(term4795, term4795.getClass(), "freezeScheduler", null);
        setField(term4795, term4795.getClass(), "trackUnitService", null);
        HashMap term4884 = new HashMap();
        Set<Object> term4989 =  ((Map) term4884).keySet();
        HashSet term4883 = new HashSet((Collection<? extends Object>) term4989);
        Class<? extends Object> term4991 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term4990 = ((Class) term4991).getDeclaredField((String) "EMPLOYEE");
        ((Field) term4990).setAccessible(true);
        Object enum9 = ((Field) term4990).get((Object) null);
        Float term4895 = new Float(0.96323884F);
        Class<? extends Object> term5332 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term5331 = ((Class) term5332).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term5331).setAccessible(true);
        Object enum10 = ((Field) term5331).get((Object) null);
        term4807 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term4809 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4813 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term4877 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4880 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4889 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term4924 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4927 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term4807, term4807.getClass(), "id", -1111249833);
        setIntField(term4809, term4809.getClass(), "year", 2025);
        setShortField(term4809, term4809.getClass(), "month", (short) 11);
        setShortField(term4809, term4809.getClass(), "day", (short) 1);
        setField(term4807, term4807.getClass(), "freezeDate", term4809);
        setIntField(term4813, term4813.getClass(), "id", -1692331299);
        setField(term4813, term4813.getClass(), "firstName", "ypEdrstygY");
        setField(term4813, term4813.getClass(), "middleName", "sNQFlATEeQ");
        setField(term4813, term4813.getClass(), "lastName", "ZKMLioamsY");
        setField(term4813, term4813.getClass(), "email", "WVbxuoDBcn");
        setField(term4813, term4813.getClass(), "passwordHash", "pvDEABOxLt");
        setIntField(term4813, term4813.getClass(), "positionId", 479531250);
        setBooleanField(term4813, term4813.getClass(), "isArchived", true);
        setIntField(term4877, term4877.getClass(), "nanos", 928000000);
        setLongField(term4877, term4877.getClass(), "fastTime", 1765802678000L);
        setField(term4877, term4877.getClass(), "cdate", null);
        setField(term4813, term4813.getClass(), "createdDate", term4877);
        setIntField(term4880, term4880.getClass(), "nanos", 907000000);
        setLongField(term4880, term4880.getClass(), "fastTime", 1598702931000L);
        setField(term4880, term4880.getClass(), "cdate", null);
        setField(term4813, term4813.getClass(), "lastModifiedDate", term4880);
        setField(term4813, term4813.getClass(), "employeeRoles", term4883);
        setIntField(term4889, term4889.getClass(), "employeeId", 1320570890);
        setIntField(term4889, term4889.getClass(), "projectId", -130649791);
        setField(term4889, term4889.getClass(), "projectRoleId", enum9);
        setField(term4889, term4889.getClass(), "externalRate", term4895);
        setField(term4813, term4813.getClass(), "employeeProjectRole", term4889);
        setField(term4807, term4807.getClass(), "employee", term4813);
        setField(term4807, term4807.getClass(), "status", enum10);
        setField(term4807, term4807.getClass(), "info", "beAMpkroCQ");
        setIntField(term4924, term4924.getClass(), "nanos", 965000000);
        setLongField(term4924, term4924.getClass(), "fastTime", 1707075231000L);
        setField(term4924, term4924.getClass(), "cdate", null);
        setField(term4807, term4807.getClass(), "createdDate", term4924);
        setIntField(term4927, term4927.getClass(), "nanos", 8000000);
        setLongField(term4927, term4927.getClass(), "fastTime", 1697606524000L);
        setField(term4927, term4927.getClass(), "cdate", null);
        setField(term4807, term4807.getClass(), "lastModifiedDate", term4927);
        term4930 = newInstance(Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval"));
        Object term4931 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4935 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term4931, term4931.getClass(), "year", 2023);
        setShortField(term4931, term4931.getClass(), "month", (short) 9);
        setShortField(term4931, term4931.getClass(), "day", (short) 22);
        setField(term4930, term4930.getClass(), "startDate", term4931);
        setIntField(term4935, term4935.getClass(), "year", 2013);
        setShortField(term4935, term4935.getClass(), "month", (short) 3);
        setShortField(term4935, term4935.getClass(), "day", (short) 8);
        setField(term4930, term4930.getClass(), "endDate", term4935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        argTypes[1] = Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval");
        Object[] args = new Object[2];
        args[0] = term4807;
        args[1] = term4930;
        callMethod(klass, "unfreeze", argTypes, term4795, args);
    }

};


