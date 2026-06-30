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

public class CRUDFreezeService_deleteFreezeRecord_130825205011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9630;

    public CRUDFreezeService_deleteFreezeRecord_130825205011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9707 = new HashMap();
        Set<Object> term9800 =  ((Map) term9707).keySet();
        HashSet term9706 = new HashSet((Collection<? extends Object>) term9800);
        Class<? extends Object> term9802 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term9801 = ((Class) term9802).getDeclaredField((String) "EMPLOYEE");
        ((Field) term9801).setAccessible(true);
        Object enum20 = ((Field) term9801).get((Object) null);
        Float term9718 = new Float(0.5840714F);
        Class<? extends Object> term10143 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term10142 = ((Class) term10143).getDeclaredField((String) "DELETING");
        ((Field) term10142).setAccessible(true);
        Object enum21 = ((Field) term10142).get((Object) null);
        term9630 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term9632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9636 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term9700 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term9703 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term9712 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term9744 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term9747 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term9630, term9630.getClass(), "id", -680920524);
        setIntField(term9632, term9632.getClass(), "year", 2012);
        setShortField(term9632, term9632.getClass(), "month", (short) 8);
        setShortField(term9632, term9632.getClass(), "day", (short) 25);
        setField(term9630, term9630.getClass(), "freezeDate", term9632);
        setIntField(term9636, term9636.getClass(), "id", -916335264);
        setField(term9636, term9636.getClass(), "firstName", "IlvgFINwIa");
        setField(term9636, term9636.getClass(), "middleName", "GEJABPlHSI");
        setField(term9636, term9636.getClass(), "lastName", "aQFUvuaYxd");
        setField(term9636, term9636.getClass(), "email", "zNFLXMifnS");
        setField(term9636, term9636.getClass(), "passwordHash", "HHQcYMSBVc");
        setIntField(term9636, term9636.getClass(), "positionId", -919416536);
        setBooleanField(term9636, term9636.getClass(), "isArchived", true);
        setIntField(term9700, term9700.getClass(), "nanos", 130000000);
        setLongField(term9700, term9700.getClass(), "fastTime", 1374834529000L);
        setField(term9700, term9700.getClass(), "cdate", null);
        setField(term9636, term9636.getClass(), "createdDate", term9700);
        setIntField(term9703, term9703.getClass(), "nanos", 74000000);
        setLongField(term9703, term9703.getClass(), "fastTime", 1608172679000L);
        setField(term9703, term9703.getClass(), "cdate", null);
        setField(term9636, term9636.getClass(), "lastModifiedDate", term9703);
        setField(term9636, term9636.getClass(), "employeeRoles", term9706);
        setIntField(term9712, term9712.getClass(), "employeeId", -43417861);
        setIntField(term9712, term9712.getClass(), "projectId", -1533843432);
        setField(term9712, term9712.getClass(), "projectRoleId", enum20);
        setField(term9712, term9712.getClass(), "externalRate", term9718);
        setField(term9636, term9636.getClass(), "employeeProjectRole", term9712);
        setField(term9630, term9630.getClass(), "employee", term9636);
        setField(term9630, term9630.getClass(), "status", enum21);
        setField(term9630, term9630.getClass(), "info", "wdoqITnaAP");
        setIntField(term9744, term9744.getClass(), "nanos", 107000000);
        setLongField(term9744, term9744.getClass(), "fastTime", 1482193476000L);
        setField(term9744, term9744.getClass(), "cdate", null);
        setField(term9630, term9630.getClass(), "createdDate", term9744);
        setIntField(term9747, term9747.getClass(), "nanos", 540000000);
        setLongField(term9747, term9747.getClass(), "fastTime", 1268660877000L);
        setField(term9747, term9747.getClass(), "cdate", null);
        setField(term9630, term9630.getClass(), "lastModifiedDate", term9747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.CRUDFreezeService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term9630;
        callMethod(klass, "deleteFreezeRecord", argTypes, null, args);
    }

};


