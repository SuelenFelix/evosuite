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

public class Employee_getMiddleName_12141141074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21789;

    public Employee_getMiddleName_12141141074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21860 = new HashMap();
        Set<Object> term21932 =  ((Map) term21860).keySet();
        HashSet term21859 = new HashSet((Collection<? extends Object>) term21932);
        Class<? extends Object> term21934 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term21933 = ((Class) term21934).getDeclaredField((String) "EMPLOYEE");
        ((Field) term21933).setAccessible(true);
        Object enum53 = ((Field) term21933).get((Object) null);
        Float term21880 = new Float(0.6608425F);
        term21789 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term21853 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term21856 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term21865 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term21789, term21789.getClass(), "id", 1596213415);
        setField(term21789, term21789.getClass(), "firstName", "xLbjWUgOIL");
        setField(term21789, term21789.getClass(), "middleName", "jDtqGUpnZN");
        setField(term21789, term21789.getClass(), "lastName", "nGKItKLYNC");
        setField(term21789, term21789.getClass(), "email", "UiUYnPrcCi");
        setField(term21789, term21789.getClass(), "passwordHash", "UoYtihxVaS");
        setIntField(term21789, term21789.getClass(), "positionId", -268815336);
        setBooleanField(term21789, term21789.getClass(), "isArchived", true);
        setIntField(term21853, term21853.getClass(), "nanos", 545000000);
        setLongField(term21853, term21853.getClass(), "fastTime", 1802984633000L);
        setField(term21853, term21853.getClass(), "cdate", null);
        setField(term21789, term21789.getClass(), "createdDate", term21853);
        setIntField(term21856, term21856.getClass(), "nanos", 357000000);
        setLongField(term21856, term21856.getClass(), "fastTime", 1843204017000L);
        setField(term21856, term21856.getClass(), "cdate", null);
        setField(term21789, term21789.getClass(), "lastModifiedDate", term21856);
        setField(term21789, term21789.getClass(), "employeeRoles", term21859);
        setIntField(term21865, term21865.getClass(), "employeeId", -1210583429);
        setIntField(term21865, term21865.getClass(), "projectId", -663691365);
        setField(term21865, term21865.getClass(), "projectRoleId", enum53);
        setField(term21865, term21865.getClass(), "externalRate", term21880);
        setField(term21789, term21789.getClass(), "employeeProjectRole", term21865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMiddleName", argTypes, term21789, args);
    }

};


