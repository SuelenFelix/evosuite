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
     Object term4614;
     Object term4626;
     Object term4749;

    public FreezeSchedulePlanner_unfreeze_6865010407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4614 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term4615 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term4616 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term4617 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term4619 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term4620 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4614, term4614.getClass(), "crudFreezeService", null);
        setField(term4617, term4617.getClass(), "id", "");
        setField(term4619, term4619.getClass(), "standardTransitions", null);
        setField(term4619, term4619.getClass(), "standardOffsets", null);
        setField(term4619, term4619.getClass(), "savingsInstantTransitions", null);
        setField(term4619, term4619.getClass(), "savingsLocalTransitions", null);
        setField(term4619, term4619.getClass(), "wallOffsets", null);
        setField(term4619, term4619.getClass(), "lastRules", null);
        setField(term4619, term4619.getClass(), "lastRulesCache", null);
        setField(term4617, term4617.getClass(), "rules", term4619);
        setField(term4616, term4616.getClass(), "timeZone", term4617);
        setByteField(term4620, term4620.getClass(), "hour", (byte) 0);
        setByteField(term4620, term4620.getClass(), "minute", (byte) 25);
        setByteField(term4620, term4620.getClass(), "second", (byte) 28);
        setIntField(term4620, term4620.getClass(), "nano", 676721313);
        setField(term4616, term4616.getClass(), "fixedTimeFreeze", term4620);
        setIntField(term4616, term4616.getClass(), "dayToUnfreeze", -1254072822);
        setField(term4615, term4615.getClass(), "freezeProperties", term4616);
        setField(term4614, term4614.getClass(), "freezeDateUtils", term4615);
        setField(term4614, term4614.getClass(), "freezeScheduler", null);
        setField(term4614, term4614.getClass(), "trackUnitService", null);
        HashMap term4703 = new HashMap();
        Set<Object> term4808 =  ((Map) term4703).keySet();
        HashSet term4702 = new HashSet((Collection<? extends Object>) term4808);
        Class<? extends Object> term4810 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term4809 = ((Class) term4810).getDeclaredField((String) "EMPLOYEE");
        ((Field) term4809).setAccessible(true);
        Object enum9 = ((Field) term4809).get((Object) null);
        Float term4714 = new Float(0.96323884F);
        Class<? extends Object> term5151 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term5150 = ((Class) term5151).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term5150).setAccessible(true);
        Object enum10 = ((Field) term5150).get((Object) null);
        term4626 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term4628 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4632 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term4696 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4699 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4708 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term4743 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4746 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term4626, term4626.getClass(), "id", -1111249833);
        setIntField(term4628, term4628.getClass(), "year", 2025);
        setShortField(term4628, term4628.getClass(), "month", (short) 11);
        setShortField(term4628, term4628.getClass(), "day", (short) 1);
        setField(term4626, term4626.getClass(), "freezeDate", term4628);
        setIntField(term4632, term4632.getClass(), "id", -1692331299);
        setField(term4632, term4632.getClass(), "firstName", "ypEdrstygY");
        setField(term4632, term4632.getClass(), "middleName", "sNQFlATEeQ");
        setField(term4632, term4632.getClass(), "lastName", "ZKMLioamsY");
        setField(term4632, term4632.getClass(), "email", "WVbxuoDBcn");
        setField(term4632, term4632.getClass(), "passwordHash", "pvDEABOxLt");
        setIntField(term4632, term4632.getClass(), "positionId", 479531250);
        setBooleanField(term4632, term4632.getClass(), "isArchived", true);
        setIntField(term4696, term4696.getClass(), "nanos", 928000000);
        setLongField(term4696, term4696.getClass(), "fastTime", 1765802678000L);
        setField(term4696, term4696.getClass(), "cdate", null);
        setField(term4632, term4632.getClass(), "createdDate", term4696);
        setIntField(term4699, term4699.getClass(), "nanos", 907000000);
        setLongField(term4699, term4699.getClass(), "fastTime", 1598702931000L);
        setField(term4699, term4699.getClass(), "cdate", null);
        setField(term4632, term4632.getClass(), "lastModifiedDate", term4699);
        setField(term4632, term4632.getClass(), "employeeRoles", term4702);
        setIntField(term4708, term4708.getClass(), "employeeId", 1320570890);
        setIntField(term4708, term4708.getClass(), "projectId", -130649791);
        setField(term4708, term4708.getClass(), "projectRoleId", enum9);
        setField(term4708, term4708.getClass(), "externalRate", term4714);
        setField(term4632, term4632.getClass(), "employeeProjectRole", term4708);
        setField(term4626, term4626.getClass(), "employee", term4632);
        setField(term4626, term4626.getClass(), "status", enum10);
        setField(term4626, term4626.getClass(), "info", "beAMpkroCQ");
        setIntField(term4743, term4743.getClass(), "nanos", 965000000);
        setLongField(term4743, term4743.getClass(), "fastTime", 1707075231000L);
        setField(term4743, term4743.getClass(), "cdate", null);
        setField(term4626, term4626.getClass(), "createdDate", term4743);
        setIntField(term4746, term4746.getClass(), "nanos", 8000000);
        setLongField(term4746, term4746.getClass(), "fastTime", 1697606524000L);
        setField(term4746, term4746.getClass(), "cdate", null);
        setField(term4626, term4626.getClass(), "lastModifiedDate", term4746);
        term4749 = newInstance(Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval"));
        Object term4750 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4754 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term4750, term4750.getClass(), "year", 2023);
        setShortField(term4750, term4750.getClass(), "month", (short) 9);
        setShortField(term4750, term4750.getClass(), "day", (short) 22);
        setField(term4749, term4749.getClass(), "startDate", term4750);
        setIntField(term4754, term4754.getClass(), "year", 2013);
        setShortField(term4754, term4754.getClass(), "month", (short) 3);
        setShortField(term4754, term4754.getClass(), "day", (short) 8);
        setField(term4749, term4749.getClass(), "endDate", term4754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        argTypes[1] = Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval");
        Object[] args = new Object[2];
        args[0] = term4626;
        args[1] = term4749;
        callMethod(klass, "unfreeze", argTypes, term4614, args);
    }

};


