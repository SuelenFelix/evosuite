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

public class Employee_getId_19252728172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20823;

    public Employee_getId_19252728172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20894 = new HashMap();
        Set<Object> term20965 =  ((Map) term20894).keySet();
        HashSet term20893 = new HashSet((Collection<? extends Object>) term20965);
        Class<? extends Object> term20967 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term20966 = ((Class) term20967).getDeclaredField((String) "MANAGER");
        ((Field) term20966).setAccessible(true);
        Object enum51 = ((Field) term20966).get((Object) null);
        Float term20913 = new Float(0.13906479F);
        term20823 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term20887 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term20890 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term20899 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term20823, term20823.getClass(), "id", 444029505);
        setField(term20823, term20823.getClass(), "firstName", "nyiiPDVjAc");
        setField(term20823, term20823.getClass(), "middleName", "aKnKipADSo");
        setField(term20823, term20823.getClass(), "lastName", "wSQxaModmm");
        setField(term20823, term20823.getClass(), "email", "UlajhuVLaP");
        setField(term20823, term20823.getClass(), "passwordHash", "gGSMzuGICf");
        setIntField(term20823, term20823.getClass(), "positionId", -1034506028);
        setBooleanField(term20823, term20823.getClass(), "isArchived", false);
        setIntField(term20887, term20887.getClass(), "nanos", 458000000);
        setLongField(term20887, term20887.getClass(), "fastTime", 1695414469000L);
        setField(term20887, term20887.getClass(), "cdate", null);
        setField(term20823, term20823.getClass(), "createdDate", term20887);
        setIntField(term20890, term20890.getClass(), "nanos", 394000000);
        setLongField(term20890, term20890.getClass(), "fastTime", 1362769763000L);
        setField(term20890, term20890.getClass(), "cdate", null);
        setField(term20823, term20823.getClass(), "lastModifiedDate", term20890);
        setField(term20823, term20823.getClass(), "employeeRoles", term20893);
        setIntField(term20899, term20899.getClass(), "employeeId", -1263114719);
        setIntField(term20899, term20899.getClass(), "projectId", -894662986);
        setField(term20899, term20899.getClass(), "projectRoleId", enum51);
        setField(term20899, term20899.getClass(), "externalRate", term20913);
        setField(term20823, term20823.getClass(), "employeeProjectRole", term20899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term20823, args);
    }

};


