package ru.smartup.timetracker.dto.project.response;

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
import static ru.smartup.timetracker.dto.project.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;

public class EmployeeInProjectDto_init_13938161300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3737;

    public EmployeeInProjectDto_init_13938161300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3808 = new HashMap();
        Set<Object> term3880 =  ((Map) term3808).keySet();
        HashSet term3807 = new HashSet((Collection<? extends Object>) term3880);
        Class<? extends Object> term3882 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term3881 = ((Class) term3882).getDeclaredField((String) "EMPLOYEE");
        ((Field) term3881).setAccessible(true);
        Object enum9 = ((Field) term3881).get((Object) null);
        Float term3828 = new Float(0.6880585F);
        term3737 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term3801 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3804 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3813 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term3737, term3737.getClass(), "id", 1048535127);
        setField(term3737, term3737.getClass(), "firstName", "pCTimMblYc");
        setField(term3737, term3737.getClass(), "middleName", "hNxWaHcfhY");
        setField(term3737, term3737.getClass(), "lastName", "RkybSrpybU");
        setField(term3737, term3737.getClass(), "email", "xOEqzGAmDU");
        setField(term3737, term3737.getClass(), "passwordHash", "eZFUvlxvGV");
        setIntField(term3737, term3737.getClass(), "positionId", -655067527);
        setBooleanField(term3737, term3737.getClass(), "isArchived", false);
        setIntField(term3801, term3801.getClass(), "nanos", 244000000);
        setLongField(term3801, term3801.getClass(), "fastTime", 1345860612000L);
        setField(term3801, term3801.getClass(), "cdate", null);
        setField(term3737, term3737.getClass(), "createdDate", term3801);
        setIntField(term3804, term3804.getClass(), "nanos", 369000000);
        setLongField(term3804, term3804.getClass(), "fastTime", 1480427551000L);
        setField(term3804, term3804.getClass(), "cdate", null);
        setField(term3737, term3737.getClass(), "lastModifiedDate", term3804);
        setField(term3737, term3737.getClass(), "employeeRoles", term3807);
        setIntField(term3813, term3813.getClass(), "employeeId", -6029667);
        setIntField(term3813, term3813.getClass(), "projectId", -2068769794);
        setField(term3813, term3813.getClass(), "projectRoleId", enum9);
        setField(term3813, term3813.getClass(), "externalRate", term3828);
        setField(term3737, term3737.getClass(), "employeeProjectRole", term3813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Employee");
        Object[] args = new Object[1];
        args[0] = term3737;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


