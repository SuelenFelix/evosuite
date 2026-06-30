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

public class FreezeRecord_setLastModifiedDate_131612381117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58461;
     Object term58581;

    public FreezeRecord_setLastModifiedDate_131612381117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term58538 = new HashMap();
        Set<Object> term58634 =  ((Map) term58538).keySet();
        HashSet term58537 = new HashSet((Collection<? extends Object>) term58634);
        Class<? extends Object> term58636 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term58635 = ((Class) term58636).getDeclaredField((String) "MANAGER");
        ((Field) term58635).setAccessible(true);
        Object enum135 = ((Field) term58635).get((Object) null);
        Float term58549 = new Float(0.6805867F);
        Class<? extends Object> term58974 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term58973 = ((Class) term58974).getDeclaredField((String) "DELETING");
        ((Field) term58973).setAccessible(true);
        Object enum136 = ((Field) term58973).get((Object) null);
        term58461 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term58463 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58467 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term58531 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term58534 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term58543 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term58575 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term58578 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term58461, term58461.getClass(), "id", -2013924238);
        setIntField(term58463, term58463.getClass(), "year", 2022);
        setShortField(term58463, term58463.getClass(), "month", (short) 11);
        setShortField(term58463, term58463.getClass(), "day", (short) 16);
        setField(term58461, term58461.getClass(), "freezeDate", term58463);
        setIntField(term58467, term58467.getClass(), "id", 579006268);
        setField(term58467, term58467.getClass(), "firstName", "dJGPlmSRnz");
        setField(term58467, term58467.getClass(), "middleName", "DPskuFUobI");
        setField(term58467, term58467.getClass(), "lastName", "wBGfLpNNiZ");
        setField(term58467, term58467.getClass(), "email", "yUGCjlqgJE");
        setField(term58467, term58467.getClass(), "passwordHash", "PXdVZyoJyC");
        setIntField(term58467, term58467.getClass(), "positionId", -1694747156);
        setBooleanField(term58467, term58467.getClass(), "isArchived", true);
        setIntField(term58531, term58531.getClass(), "nanos", 527000000);
        setLongField(term58531, term58531.getClass(), "fastTime", 1449306022000L);
        setField(term58531, term58531.getClass(), "cdate", null);
        setField(term58467, term58467.getClass(), "createdDate", term58531);
        setIntField(term58534, term58534.getClass(), "nanos", 176000000);
        setLongField(term58534, term58534.getClass(), "fastTime", 1423084800000L);
        setField(term58534, term58534.getClass(), "cdate", null);
        setField(term58467, term58467.getClass(), "lastModifiedDate", term58534);
        setField(term58467, term58467.getClass(), "employeeRoles", term58537);
        setIntField(term58543, term58543.getClass(), "employeeId", 1466373988);
        setIntField(term58543, term58543.getClass(), "projectId", -358526505);
        setField(term58543, term58543.getClass(), "projectRoleId", enum135);
        setField(term58543, term58543.getClass(), "externalRate", term58549);
        setField(term58467, term58467.getClass(), "employeeProjectRole", term58543);
        setField(term58461, term58461.getClass(), "employee", term58467);
        setField(term58461, term58461.getClass(), "status", enum136);
        setField(term58461, term58461.getClass(), "info", "vLerpqavFM");
        setIntField(term58575, term58575.getClass(), "nanos", 165000000);
        setLongField(term58575, term58575.getClass(), "fastTime", 1890779014000L);
        setField(term58575, term58575.getClass(), "cdate", null);
        setField(term58461, term58461.getClass(), "createdDate", term58575);
        setIntField(term58578, term58578.getClass(), "nanos", 412000000);
        setLongField(term58578, term58578.getClass(), "fastTime", 1368058638000L);
        setField(term58578, term58578.getClass(), "cdate", null);
        setField(term58461, term58461.getClass(), "lastModifiedDate", term58578);
        term58581 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term58581, term58581.getClass(), "nanos", 512000000);
        setLongField(term58581, term58581.getClass(), "fastTime", 1836071279000L);
        setField(term58581, term58581.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term58581;
        callMethod(klass, "setLastModifiedDate", argTypes, term58461, args);
    }

};


