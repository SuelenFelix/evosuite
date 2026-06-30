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

public class Employee_getEmail_6835483096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22755;

    public Employee_getEmail_6835483096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term22826 = new HashMap();
        Set<Object> term22897 =  ((Map) term22826).keySet();
        HashSet term22825 = new HashSet((Collection<? extends Object>) term22897);
        Class<? extends Object> term22899 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term22898 = ((Class) term22899).getDeclaredField((String) "MANAGER");
        ((Field) term22898).setAccessible(true);
        Object enum55 = ((Field) term22898).get((Object) null);
        Float term22845 = new Float(0.24413109F);
        term22755 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term22819 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term22822 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term22831 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term22755, term22755.getClass(), "id", 1532716628);
        setField(term22755, term22755.getClass(), "firstName", "ytSBIKXogI");
        setField(term22755, term22755.getClass(), "middleName", "nHXjMycHlU");
        setField(term22755, term22755.getClass(), "lastName", "ieCtQFdkii");
        setField(term22755, term22755.getClass(), "email", "dEnhdmILtU");
        setField(term22755, term22755.getClass(), "passwordHash", "hoicvmsovO");
        setIntField(term22755, term22755.getClass(), "positionId", -1801760683);
        setBooleanField(term22755, term22755.getClass(), "isArchived", true);
        setIntField(term22819, term22819.getClass(), "nanos", 299000000);
        setLongField(term22819, term22819.getClass(), "fastTime", 1762136641000L);
        setField(term22819, term22819.getClass(), "cdate", null);
        setField(term22755, term22755.getClass(), "createdDate", term22819);
        setIntField(term22822, term22822.getClass(), "nanos", 666000000);
        setLongField(term22822, term22822.getClass(), "fastTime", 1395468691000L);
        setField(term22822, term22822.getClass(), "cdate", null);
        setField(term22755, term22755.getClass(), "lastModifiedDate", term22822);
        setField(term22755, term22755.getClass(), "employeeRoles", term22825);
        setIntField(term22831, term22831.getClass(), "employeeId", 1141317871);
        setIntField(term22831, term22831.getClass(), "projectId", 890669485);
        setField(term22831, term22831.getClass(), "projectRoleId", enum55);
        setField(term22831, term22831.getClass(), "externalRate", term22845);
        setField(term22755, term22755.getClass(), "employeeProjectRole", term22831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term22755, args);
    }

};


