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
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.String;
import java.lang.Float;

public class ProjectDetailDto_setEmployees_13849321365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14224;
     Object term14258;

    public ProjectDetailDto_setEmployees_13849321365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14225 = new ArrayList();
        Object term14231 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term14231, term14231.getClass(), "id", -4502405999831680926L);
        setField(term14231, term14231.getClass(), "name", "");
        setBooleanField(term14231, term14231.getClass(), "billable", false);
        setBooleanField(term14231, term14231.getClass(), "isArchived", true);
        ArrayList term14229 = new ArrayList();
        ((ArrayList) term14229).add(term14231);
        term14224 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto"));
        Object term14238 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term14241 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term14224, term14224.getClass(), "employees", term14225);
        setField(term14224, term14224.getClass(), "tasks", term14229);
        setIntField(term14238, term14238.getClass(), "nanos", 25000000);
        setLongField(term14238, term14238.getClass(), "fastTime", 1797192828000L);
        setField(term14238, term14238.getClass(), "cdate", null);
        setField(term14224, term14224.getClass(), "createdDate", term14238);
        setIntField(term14241, term14241.getClass(), "nanos", 30000000);
        setLongField(term14241, term14241.getClass(), "fastTime", 1589447121000L);
        setField(term14241, term14241.getClass(), "cdate", null);
        setField(term14224, term14224.getClass(), "lastModifiedDate", term14241);
        setIntField(term14224, term14224.getClass(), "id", 1225272962);
        setField(term14224, term14224.getClass(), "name", "XYtryyobou");
        setBooleanField(term14224, term14224.getClass(), "isArchived", false);
        Class<? extends Object> term14403 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term14402 = ((Class) term14403).getDeclaredField((String) "EMPLOYEE");
        ((Field) term14402).setAccessible(true);
        Object enum33 = ((Field) term14402).get((Object) null);
        Float term14302 = new Float(0.541592F);
        Object term14261 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term14261, term14261.getClass(), "id", 1324040357);
        setField(term14261, term14261.getClass(), "firstName", "OYbzXylRWW");
        setField(term14261, term14261.getClass(), "middleName", "DSNsTGYXDF");
        setField(term14261, term14261.getClass(), "lastName", "sQvGcVjdEx");
        setField(term14261, term14261.getClass(), "projectRoleId", enum33);
        setField(term14261, term14261.getClass(), "externalRate", term14302);
        Class<? extends Object> term14744 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term14743 = ((Class) term14744).getDeclaredField((String) "EMPLOYEE");
        ((Field) term14743).setAccessible(true);
        Object enum34 = ((Field) term14743).get((Object) null);
        Float term14312 = new Float(0.13481021F);
        Object term14305 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term14305, term14305.getClass(), "id", -1588772968);
        setField(term14305, term14305.getClass(), "firstName", "");
        setField(term14305, term14305.getClass(), "middleName", "");
        setField(term14305, term14305.getClass(), "lastName", "");
        setField(term14305, term14305.getClass(), "projectRoleId", enum34);
        setField(term14305, term14305.getClass(), "externalRate", term14312);
        Float term14317 = new Float(0.996533F);
        Object term14315 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term14315, term14315.getClass(), "id", -93135961);
        setField(term14315, term14315.getClass(), "firstName", null);
        setField(term14315, term14315.getClass(), "middleName", null);
        setField(term14315, term14315.getClass(), "lastName", null);
        setField(term14315, term14315.getClass(), "projectRoleId", enum33);
        setField(term14315, term14315.getClass(), "externalRate", term14317);
        term14258 = new LinkedList();
        ((LinkedList) term14258).add(term14261);
        ((LinkedList) term14258).add(term14305);
        ((LinkedList) term14258).add(term14315);
        ((LinkedList) term14258).add((Object)null);
        ((LinkedList) term14258).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term14258;
        callMethod(klass, "setEmployees", argTypes, term14224, args);
    }

};


