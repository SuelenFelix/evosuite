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

public class FreezeScheduler_unfreeze_10637355833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13487;

    public FreezeScheduler_unfreeze_10637355833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13564 = new HashMap();
        Set<Object> term13657 =  ((Map) term13564).keySet();
        HashSet term13563 = new HashSet((Collection<? extends Object>) term13657);
        Class<? extends Object> term13659 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term13658 = ((Class) term13659).getDeclaredField((String) "EMPLOYEE");
        ((Field) term13658).setAccessible(true);
        Object enum28 = ((Field) term13658).get((Object) null);
        Float term13575 = new Float(0.10667074F);
        Class<? extends Object> term14000 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term13999 = ((Class) term14000).getDeclaredField((String) "OUTDATED");
        ((Field) term13999).setAccessible(true);
        Object enum29 = ((Field) term13999).get((Object) null);
        term13487 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term13489 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13493 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term13557 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term13560 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term13569 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term13601 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term13604 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term13487, term13487.getClass(), "id", 339372704);
        setIntField(term13489, term13489.getClass(), "year", 2010);
        setShortField(term13489, term13489.getClass(), "month", (short) 7);
        setShortField(term13489, term13489.getClass(), "day", (short) 3);
        setField(term13487, term13487.getClass(), "freezeDate", term13489);
        setIntField(term13493, term13493.getClass(), "id", -851097944);
        setField(term13493, term13493.getClass(), "firstName", "RCOqfVsRHt");
        setField(term13493, term13493.getClass(), "middleName", "TSyCeEZPaT");
        setField(term13493, term13493.getClass(), "lastName", "JeZFtaqkzW");
        setField(term13493, term13493.getClass(), "email", "vOVuNSCCLe");
        setField(term13493, term13493.getClass(), "passwordHash", "fzeqPnzpnt");
        setIntField(term13493, term13493.getClass(), "positionId", 803925431);
        setBooleanField(term13493, term13493.getClass(), "isArchived", false);
        setIntField(term13557, term13557.getClass(), "nanos", 174000000);
        setLongField(term13557, term13557.getClass(), "fastTime", 1838962163000L);
        setField(term13557, term13557.getClass(), "cdate", null);
        setField(term13493, term13493.getClass(), "createdDate", term13557);
        setIntField(term13560, term13560.getClass(), "nanos", 553000000);
        setLongField(term13560, term13560.getClass(), "fastTime", 1498467173000L);
        setField(term13560, term13560.getClass(), "cdate", null);
        setField(term13493, term13493.getClass(), "lastModifiedDate", term13560);
        setField(term13493, term13493.getClass(), "employeeRoles", term13563);
        setIntField(term13569, term13569.getClass(), "employeeId", 76929641);
        setIntField(term13569, term13569.getClass(), "projectId", -2003192918);
        setField(term13569, term13569.getClass(), "projectRoleId", enum28);
        setField(term13569, term13569.getClass(), "externalRate", term13575);
        setField(term13493, term13493.getClass(), "employeeProjectRole", term13569);
        setField(term13487, term13487.getClass(), "employee", term13493);
        setField(term13487, term13487.getClass(), "status", enum29);
        setField(term13487, term13487.getClass(), "info", "RxbhrFBjkO");
        setIntField(term13601, term13601.getClass(), "nanos", 188000000);
        setLongField(term13601, term13601.getClass(), "fastTime", 1619062356000L);
        setField(term13601, term13601.getClass(), "cdate", null);
        setField(term13487, term13487.getClass(), "createdDate", term13601);
        setIntField(term13604, term13604.getClass(), "nanos", 71000000);
        setLongField(term13604, term13604.getClass(), "fastTime", 1275817501000L);
        setField(term13604, term13604.getClass(), "cdate", null);
        setField(term13487, term13487.getClass(), "lastModifiedDate", term13604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeScheduler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        argTypes[1] = Class.forName("ru.smartup.timetracker.service.freeze.FreezeTrackUnitAlgorithm");
        Object[] args = new Object[2];
        args[0] = term13487;
        args[1] = null;
        callMethod(klass, "unfreeze", argTypes, null, args);
    }

};


