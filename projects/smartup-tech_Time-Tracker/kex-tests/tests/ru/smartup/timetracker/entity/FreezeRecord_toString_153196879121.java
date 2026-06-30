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

public class FreezeRecord_toString_153196879121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62079;

    public FreezeRecord_toString_153196879121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term62156 = new HashMap();
        Set<Object> term62250 =  ((Map) term62156).keySet();
        HashSet term62155 = new HashSet((Collection<? extends Object>) term62250);
        Class<? extends Object> term62252 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term62251 = ((Class) term62252).getDeclaredField((String) "EMPLOYEE");
        ((Field) term62251).setAccessible(true);
        Object enum143 = ((Field) term62251).get((Object) null);
        Float term62167 = new Float(0.63008493F);
        Class<? extends Object> term62593 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term62592 = ((Class) term62593).getDeclaredField((String) "UN_FREEZE");
        ((Field) term62592).setAccessible(true);
        Object enum144 = ((Field) term62592).get((Object) null);
        term62079 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term62081 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62085 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term62149 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term62152 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term62161 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term62194 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term62197 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term62079, term62079.getClass(), "id", -1972436591);
        setIntField(term62081, term62081.getClass(), "year", 2018);
        setShortField(term62081, term62081.getClass(), "month", (short) 9);
        setShortField(term62081, term62081.getClass(), "day", (short) 27);
        setField(term62079, term62079.getClass(), "freezeDate", term62081);
        setIntField(term62085, term62085.getClass(), "id", 68922753);
        setField(term62085, term62085.getClass(), "firstName", "UDaboHZHhz");
        setField(term62085, term62085.getClass(), "middleName", "nRvKihUSPj");
        setField(term62085, term62085.getClass(), "lastName", "BbNeQJpYPr");
        setField(term62085, term62085.getClass(), "email", "riMtzCoxNj");
        setField(term62085, term62085.getClass(), "passwordHash", "YAXkVjQZcV");
        setIntField(term62085, term62085.getClass(), "positionId", -220791533);
        setBooleanField(term62085, term62085.getClass(), "isArchived", true);
        setIntField(term62149, term62149.getClass(), "nanos", 116000000);
        setLongField(term62149, term62149.getClass(), "fastTime", 1412666196000L);
        setField(term62149, term62149.getClass(), "cdate", null);
        setField(term62085, term62085.getClass(), "createdDate", term62149);
        setIntField(term62152, term62152.getClass(), "nanos", 541000000);
        setLongField(term62152, term62152.getClass(), "fastTime", 1643336336000L);
        setField(term62152, term62152.getClass(), "cdate", null);
        setField(term62085, term62085.getClass(), "lastModifiedDate", term62152);
        setField(term62085, term62085.getClass(), "employeeRoles", term62155);
        setIntField(term62161, term62161.getClass(), "employeeId", 1741500243);
        setIntField(term62161, term62161.getClass(), "projectId", -2070466617);
        setField(term62161, term62161.getClass(), "projectRoleId", enum143);
        setField(term62161, term62161.getClass(), "externalRate", term62167);
        setField(term62085, term62085.getClass(), "employeeProjectRole", term62161);
        setField(term62079, term62079.getClass(), "employee", term62085);
        setField(term62079, term62079.getClass(), "status", enum144);
        setField(term62079, term62079.getClass(), "info", "pumvwBWvpy");
        setIntField(term62194, term62194.getClass(), "nanos", 123000000);
        setLongField(term62194, term62194.getClass(), "fastTime", 1565576996000L);
        setField(term62194, term62194.getClass(), "cdate", null);
        setField(term62079, term62079.getClass(), "createdDate", term62194);
        setIntField(term62197, term62197.getClass(), "nanos", 172000000);
        setLongField(term62197, term62197.getClass(), "fastTime", 1577262599000L);
        setField(term62197, term62197.getClass(), "cdate", null);
        setField(term62079, term62079.getClass(), "lastModifiedDate", term62197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term62079, args);
    }

};


