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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Float;

public class FreezeRecord_init_5929039190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42177;
     Object enum99;
     Object term42194;

    public FreezeRecord_init_5929039190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42177 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term42177, term42177.getClass(), "year", 2012);
        setShortField(term42177, term42177.getClass(), "month", (short) 8);
        setShortField(term42177, term42177.getClass(), "day", (short) 25);
        Class<? extends Object> term42287 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term42286 = ((Class) term42287).getDeclaredField((String) "UN_FREEZE");
        ((Field) term42286).setAccessible(true);
        enum99 = ((Field) term42286).get((Object) null);
        HashMap term42265 = new HashMap();
        Set<Object> term42715 =  ((Map) term42265).keySet();
        HashSet term42264 = new HashSet((Collection<? extends Object>) term42715);
        Class<? extends Object> term42717 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term42716 = ((Class) term42717).getDeclaredField((String) "MANAGER");
        ((Field) term42716).setAccessible(true);
        Object enum100 = ((Field) term42716).get((Object) null);
        Float term42284 = new Float(0.43692183F);
        term42194 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term42258 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term42261 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term42270 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term42194, term42194.getClass(), "id", 982388293);
        setField(term42194, term42194.getClass(), "firstName", "iljANwuEjk");
        setField(term42194, term42194.getClass(), "middleName", "kNqaJKIATy");
        setField(term42194, term42194.getClass(), "lastName", "vKQukfbJUd");
        setField(term42194, term42194.getClass(), "email", "lFRJFUMVbx");
        setField(term42194, term42194.getClass(), "passwordHash", "sZdUNdggUW");
        setIntField(term42194, term42194.getClass(), "positionId", -159494544);
        setBooleanField(term42194, term42194.getClass(), "isArchived", true);
        setIntField(term42258, term42258.getClass(), "nanos", 597000000);
        setLongField(term42258, term42258.getClass(), "fastTime", 1758762464000L);
        setField(term42258, term42258.getClass(), "cdate", null);
        setField(term42194, term42194.getClass(), "createdDate", term42258);
        setIntField(term42261, term42261.getClass(), "nanos", 295000000);
        setLongField(term42261, term42261.getClass(), "fastTime", 1303878982000L);
        setField(term42261, term42261.getClass(), "cdate", null);
        setField(term42194, term42194.getClass(), "lastModifiedDate", term42261);
        setField(term42194, term42194.getClass(), "employeeRoles", term42264);
        setIntField(term42270, term42270.getClass(), "employeeId", -75206835);
        setIntField(term42270, term42270.getClass(), "projectId", -1618206977);
        setField(term42270, term42270.getClass(), "projectRoleId", enum100);
        setField(term42270, term42270.getClass(), "externalRate", term42284);
        setField(term42194, term42194.getClass(), "employeeProjectRole", term42270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.time.LocalDate");
        argTypes[1] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        argTypes[2] = Class.forName("ru.smartup.timetracker.entity.Employee");
        Object[] args = new Object[3];
        args[0] = term42177;
        args[1] = enum99;
        args[2] = term42194;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


