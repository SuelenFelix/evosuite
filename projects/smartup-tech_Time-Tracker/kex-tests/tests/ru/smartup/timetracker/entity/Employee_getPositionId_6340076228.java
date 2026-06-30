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

public class Employee_getPositionId_6340076228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23721;

    public Employee_getPositionId_6340076228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23792 = new HashMap();
        Set<Object> term23864 =  ((Map) term23792).keySet();
        HashSet term23791 = new HashSet((Collection<? extends Object>) term23864);
        Class<? extends Object> term23866 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term23865 = ((Class) term23866).getDeclaredField((String) "EMPLOYEE");
        ((Field) term23865).setAccessible(true);
        Object enum57 = ((Field) term23865).get((Object) null);
        Float term23812 = new Float(0.9985961F);
        term23721 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term23785 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term23788 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term23797 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term23721, term23721.getClass(), "id", 1045657203);
        setField(term23721, term23721.getClass(), "firstName", "tPlsykYBqO");
        setField(term23721, term23721.getClass(), "middleName", "bLPjGVBhlX");
        setField(term23721, term23721.getClass(), "lastName", "whBvTVIIlC");
        setField(term23721, term23721.getClass(), "email", "IgRJUzaCwW");
        setField(term23721, term23721.getClass(), "passwordHash", "JUmudUmaaV");
        setIntField(term23721, term23721.getClass(), "positionId", 1386130016);
        setBooleanField(term23721, term23721.getClass(), "isArchived", false);
        setIntField(term23785, term23785.getClass(), "nanos", 543000000);
        setLongField(term23785, term23785.getClass(), "fastTime", 1345912703000L);
        setField(term23785, term23785.getClass(), "cdate", null);
        setField(term23721, term23721.getClass(), "createdDate", term23785);
        setIntField(term23788, term23788.getClass(), "nanos", 277000000);
        setLongField(term23788, term23788.getClass(), "fastTime", 1838346979000L);
        setField(term23788, term23788.getClass(), "cdate", null);
        setField(term23721, term23721.getClass(), "lastModifiedDate", term23788);
        setField(term23721, term23721.getClass(), "employeeRoles", term23791);
        setIntField(term23797, term23797.getClass(), "employeeId", 1072005683);
        setIntField(term23797, term23797.getClass(), "projectId", 1861318859);
        setField(term23797, term23797.getClass(), "projectRoleId", enum57);
        setField(term23797, term23797.getClass(), "externalRate", term23812);
        setField(term23721, term23721.getClass(), "employeeProjectRole", term23797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPositionId", argTypes, term23721, args);
    }

};


