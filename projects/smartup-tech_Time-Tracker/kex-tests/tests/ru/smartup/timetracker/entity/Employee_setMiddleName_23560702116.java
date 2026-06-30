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

public class Employee_setMiddleName_23560702116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27613;

    public Employee_setMiddleName_23560702116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term27684 = new HashMap();
        Set<Object> term27768 =  ((Map) term27684).keySet();
        HashSet term27683 = new HashSet((Collection<? extends Object>) term27768);
        Class<? extends Object> term27770 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term27769 = ((Class) term27770).getDeclaredField((String) "EMPLOYEE");
        ((Field) term27769).setAccessible(true);
        Object enum65 = ((Field) term27769).get((Object) null);
        Float term27704 = new Float(0.9431611F);
        term27613 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term27677 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term27680 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term27689 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term27613, term27613.getClass(), "id", -1388471422);
        setField(term27613, term27613.getClass(), "firstName", "fztQhjqwdP");
        setField(term27613, term27613.getClass(), "middleName", "eVpkWxjuki");
        setField(term27613, term27613.getClass(), "lastName", "SJiQaLvSKv");
        setField(term27613, term27613.getClass(), "email", "OEXDRUKcFl");
        setField(term27613, term27613.getClass(), "passwordHash", "RYdKCNNMBR");
        setIntField(term27613, term27613.getClass(), "positionId", -1498296052);
        setBooleanField(term27613, term27613.getClass(), "isArchived", false);
        setIntField(term27677, term27677.getClass(), "nanos", 53000000);
        setLongField(term27677, term27677.getClass(), "fastTime", 1531320602000L);
        setField(term27677, term27677.getClass(), "cdate", null);
        setField(term27613, term27613.getClass(), "createdDate", term27677);
        setIntField(term27680, term27680.getClass(), "nanos", 343000000);
        setLongField(term27680, term27680.getClass(), "fastTime", 1264027000000L);
        setField(term27680, term27680.getClass(), "cdate", null);
        setField(term27613, term27613.getClass(), "lastModifiedDate", term27680);
        setField(term27613, term27613.getClass(), "employeeRoles", term27683);
        setIntField(term27689, term27689.getClass(), "employeeId", 2098647989);
        setIntField(term27689, term27689.getClass(), "projectId", 1598895173);
        setField(term27689, term27689.getClass(), "projectRoleId", enum65);
        setField(term27689, term27689.getClass(), "externalRate", term27704);
        setField(term27613, term27613.getClass(), "employeeProjectRole", term27689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yGtHPyvYiQ";
        callMethod(klass, "setMiddleName", argTypes, term27613, args);
    }

};


