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
     Object term13672;

    public FreezeScheduler_unfreeze_10637355833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13749 = new HashMap();
        Set<Object> term13842 =  ((Map) term13749).keySet();
        HashSet term13748 = new HashSet((Collection<? extends Object>) term13842);
        Class<? extends Object> term13844 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term13843 = ((Class) term13844).getDeclaredField((String) "EMPLOYEE");
        ((Field) term13843).setAccessible(true);
        Object enum28 = ((Field) term13843).get((Object) null);
        Float term13760 = new Float(0.10667074F);
        Class<? extends Object> term14185 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term14184 = ((Class) term14185).getDeclaredField((String) "OUTDATED");
        ((Field) term14184).setAccessible(true);
        Object enum29 = ((Field) term14184).get((Object) null);
        term13672 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term13674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13678 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term13742 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term13745 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term13754 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term13786 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term13789 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term13672, term13672.getClass(), "id", 339372704);
        setIntField(term13674, term13674.getClass(), "year", 2010);
        setShortField(term13674, term13674.getClass(), "month", (short) 7);
        setShortField(term13674, term13674.getClass(), "day", (short) 3);
        setField(term13672, term13672.getClass(), "freezeDate", term13674);
        setIntField(term13678, term13678.getClass(), "id", -851097944);
        setField(term13678, term13678.getClass(), "firstName", "RCOqfVsRHt");
        setField(term13678, term13678.getClass(), "middleName", "TSyCeEZPaT");
        setField(term13678, term13678.getClass(), "lastName", "JeZFtaqkzW");
        setField(term13678, term13678.getClass(), "email", "vOVuNSCCLe");
        setField(term13678, term13678.getClass(), "passwordHash", "fzeqPnzpnt");
        setIntField(term13678, term13678.getClass(), "positionId", 803925431);
        setBooleanField(term13678, term13678.getClass(), "isArchived", false);
        setIntField(term13742, term13742.getClass(), "nanos", 174000000);
        setLongField(term13742, term13742.getClass(), "fastTime", 1838962163000L);
        setField(term13742, term13742.getClass(), "cdate", null);
        setField(term13678, term13678.getClass(), "createdDate", term13742);
        setIntField(term13745, term13745.getClass(), "nanos", 553000000);
        setLongField(term13745, term13745.getClass(), "fastTime", 1498467173000L);
        setField(term13745, term13745.getClass(), "cdate", null);
        setField(term13678, term13678.getClass(), "lastModifiedDate", term13745);
        setField(term13678, term13678.getClass(), "employeeRoles", term13748);
        setIntField(term13754, term13754.getClass(), "employeeId", 76929641);
        setIntField(term13754, term13754.getClass(), "projectId", -2003192918);
        setField(term13754, term13754.getClass(), "projectRoleId", enum28);
        setField(term13754, term13754.getClass(), "externalRate", term13760);
        setField(term13678, term13678.getClass(), "employeeProjectRole", term13754);
        setField(term13672, term13672.getClass(), "employee", term13678);
        setField(term13672, term13672.getClass(), "status", enum29);
        setField(term13672, term13672.getClass(), "info", "RxbhrFBjkO");
        setIntField(term13786, term13786.getClass(), "nanos", 188000000);
        setLongField(term13786, term13786.getClass(), "fastTime", 1619062356000L);
        setField(term13786, term13786.getClass(), "cdate", null);
        setField(term13672, term13672.getClass(), "createdDate", term13786);
        setIntField(term13789, term13789.getClass(), "nanos", 71000000);
        setLongField(term13789, term13789.getClass(), "fastTime", 1275817501000L);
        setField(term13789, term13789.getClass(), "cdate", null);
        setField(term13672, term13672.getClass(), "lastModifiedDate", term13789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeScheduler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        argTypes[1] = Class.forName("ru.smartup.timetracker.service.freeze.FreezeTrackUnitAlgorithm");
        Object[] args = new Object[2];
        args[0] = term13672;
        args[1] = null;
        callMethod(klass, "unfreeze", argTypes, null, args);
    }

};


