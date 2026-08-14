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
     Object term9815;

    public CRUDFreezeService_deleteFreezeRecord_130825205011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9892 = new HashMap();
        Set<Object> term9985 =  ((Map) term9892).keySet();
        HashSet term9891 = new HashSet((Collection<? extends Object>) term9985);
        Class<? extends Object> term9987 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term9986 = ((Class) term9987).getDeclaredField((String) "EMPLOYEE");
        ((Field) term9986).setAccessible(true);
        Object enum20 = ((Field) term9986).get((Object) null);
        Float term9903 = new Float(0.5840714F);
        Class<? extends Object> term10328 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term10327 = ((Class) term10328).getDeclaredField((String) "DELETING");
        ((Field) term10327).setAccessible(true);
        Object enum21 = ((Field) term10327).get((Object) null);
        term9815 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term9817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9821 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term9885 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term9888 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term9897 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term9929 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term9932 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term9815, term9815.getClass(), "id", -680920524);
        setIntField(term9817, term9817.getClass(), "year", 2012);
        setShortField(term9817, term9817.getClass(), "month", (short) 8);
        setShortField(term9817, term9817.getClass(), "day", (short) 25);
        setField(term9815, term9815.getClass(), "freezeDate", term9817);
        setIntField(term9821, term9821.getClass(), "id", -916335264);
        setField(term9821, term9821.getClass(), "firstName", "IlvgFINwIa");
        setField(term9821, term9821.getClass(), "middleName", "GEJABPlHSI");
        setField(term9821, term9821.getClass(), "lastName", "aQFUvuaYxd");
        setField(term9821, term9821.getClass(), "email", "zNFLXMifnS");
        setField(term9821, term9821.getClass(), "passwordHash", "HHQcYMSBVc");
        setIntField(term9821, term9821.getClass(), "positionId", -919416536);
        setBooleanField(term9821, term9821.getClass(), "isArchived", true);
        setIntField(term9885, term9885.getClass(), "nanos", 130000000);
        setLongField(term9885, term9885.getClass(), "fastTime", 1374834529000L);
        setField(term9885, term9885.getClass(), "cdate", null);
        setField(term9821, term9821.getClass(), "createdDate", term9885);
        setIntField(term9888, term9888.getClass(), "nanos", 74000000);
        setLongField(term9888, term9888.getClass(), "fastTime", 1608172679000L);
        setField(term9888, term9888.getClass(), "cdate", null);
        setField(term9821, term9821.getClass(), "lastModifiedDate", term9888);
        setField(term9821, term9821.getClass(), "employeeRoles", term9891);
        setIntField(term9897, term9897.getClass(), "employeeId", -43417861);
        setIntField(term9897, term9897.getClass(), "projectId", -1533843432);
        setField(term9897, term9897.getClass(), "projectRoleId", enum20);
        setField(term9897, term9897.getClass(), "externalRate", term9903);
        setField(term9821, term9821.getClass(), "employeeProjectRole", term9897);
        setField(term9815, term9815.getClass(), "employee", term9821);
        setField(term9815, term9815.getClass(), "status", enum21);
        setField(term9815, term9815.getClass(), "info", "wdoqITnaAP");
        setIntField(term9929, term9929.getClass(), "nanos", 107000000);
        setLongField(term9929, term9929.getClass(), "fastTime", 1482193476000L);
        setField(term9929, term9929.getClass(), "cdate", null);
        setField(term9815, term9815.getClass(), "createdDate", term9929);
        setIntField(term9932, term9932.getClass(), "nanos", 540000000);
        setLongField(term9932, term9932.getClass(), "fastTime", 1268660877000L);
        setField(term9932, term9932.getClass(), "cdate", null);
        setField(term9815, term9815.getClass(), "lastModifiedDate", term9932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.CRUDFreezeService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term9815;
        callMethod(klass, "deleteFreezeRecord", argTypes, null, args);
    }

};


