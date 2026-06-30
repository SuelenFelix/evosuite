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

public class FreezeRecord_setInfo_198874871115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56624;

    public FreezeRecord_setInfo_198874871115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term56701 = new HashMap();
        Set<Object> term56807 =  ((Map) term56701).keySet();
        HashSet term56700 = new HashSet((Collection<? extends Object>) term56807);
        Class<? extends Object> term56809 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term56808 = ((Class) term56809).getDeclaredField((String) "EMPLOYEE");
        ((Field) term56808).setAccessible(true);
        Object enum131 = ((Field) term56808).get((Object) null);
        Float term56712 = new Float(0.37161416F);
        Class<? extends Object> term57150 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term57149 = ((Class) term57150).getDeclaredField((String) "COMPLETED");
        ((Field) term57149).setAccessible(true);
        Object enum132 = ((Field) term57149).get((Object) null);
        term56624 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term56626 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56630 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term56694 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term56697 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term56706 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term56739 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term56742 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term56624, term56624.getClass(), "id", -1015274146);
        setIntField(term56626, term56626.getClass(), "year", 2029);
        setShortField(term56626, term56626.getClass(), "month", (short) 8);
        setShortField(term56626, term56626.getClass(), "day", (short) 28);
        setField(term56624, term56624.getClass(), "freezeDate", term56626);
        setIntField(term56630, term56630.getClass(), "id", -49052672);
        setField(term56630, term56630.getClass(), "firstName", "iCCsaLHohG");
        setField(term56630, term56630.getClass(), "middleName", "NJhGgctbdj");
        setField(term56630, term56630.getClass(), "lastName", "MYWYUeLGOp");
        setField(term56630, term56630.getClass(), "email", "tsTGdgQYUL");
        setField(term56630, term56630.getClass(), "passwordHash", "TtGbVmKcnX");
        setIntField(term56630, term56630.getClass(), "positionId", 339372704);
        setBooleanField(term56630, term56630.getClass(), "isArchived", false);
        setIntField(term56694, term56694.getClass(), "nanos", 171000000);
        setLongField(term56694, term56694.getClass(), "fastTime", 1589197776000L);
        setField(term56694, term56694.getClass(), "cdate", null);
        setField(term56630, term56630.getClass(), "createdDate", term56694);
        setIntField(term56697, term56697.getClass(), "nanos", 195000000);
        setLongField(term56697, term56697.getClass(), "fastTime", 1420254676000L);
        setField(term56697, term56697.getClass(), "cdate", null);
        setField(term56630, term56630.getClass(), "lastModifiedDate", term56697);
        setField(term56630, term56630.getClass(), "employeeRoles", term56700);
        setIntField(term56706, term56706.getClass(), "employeeId", -851097944);
        setIntField(term56706, term56706.getClass(), "projectId", 803925431);
        setField(term56706, term56706.getClass(), "projectRoleId", enum131);
        setField(term56706, term56706.getClass(), "externalRate", term56712);
        setField(term56630, term56630.getClass(), "employeeProjectRole", term56706);
        setField(term56624, term56624.getClass(), "employee", term56630);
        setField(term56624, term56624.getClass(), "status", enum132);
        setField(term56624, term56624.getClass(), "info", "GJVkUrCVdD");
        setIntField(term56739, term56739.getClass(), "nanos", 567000000);
        setLongField(term56739, term56739.getClass(), "fastTime", 1379577714000L);
        setField(term56739, term56739.getClass(), "cdate", null);
        setField(term56624, term56624.getClass(), "createdDate", term56739);
        setIntField(term56742, term56742.getClass(), "nanos", 111000000);
        setLongField(term56742, term56742.getClass(), "fastTime", 1416349120000L);
        setField(term56742, term56742.getClass(), "cdate", null);
        setField(term56624, term56624.getClass(), "lastModifiedDate", term56742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zNdorvdUgu";
        callMethod(klass, "setInfo", argTypes, term56624, args);
    }

};


