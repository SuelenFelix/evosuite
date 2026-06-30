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
import java.lang.String;
import java.lang.Float;

public class ProjectDetailDto_equals_4884669879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16789;
     Object term16832;

    public ProjectDetailDto_equals_4884669879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16834 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term16833 = ((Class) term16834).getDeclaredField((String) "MANAGER");
        ((Field) term16833).setAccessible(true);
        Object enum39 = ((Field) term16833).get((Object) null);
        Float term16799 = new Float(0.6805867F);
        Object term16792 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term16792, term16792.getClass(), "id", 1240914516);
        setField(term16792, term16792.getClass(), "firstName", "");
        setField(term16792, term16792.getClass(), "middleName", "");
        setField(term16792, term16792.getClass(), "lastName", "");
        setField(term16792, term16792.getClass(), "projectRoleId", enum39);
        setField(term16792, term16792.getClass(), "externalRate", term16799);
        ArrayList term16790 = new ArrayList();
        ((ArrayList) term16790).add(term16792);
        Object term16805 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term16805, term16805.getClass(), "id", -1154553077993834885L);
        setField(term16805, term16805.getClass(), "name", "");
        setBooleanField(term16805, term16805.getClass(), "billable", false);
        setBooleanField(term16805, term16805.getClass(), "isArchived", true);
        ArrayList term16803 = new ArrayList();
        ((ArrayList) term16803).add(term16805);
        term16789 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto"));
        Object term16812 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term16815 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term16789, term16789.getClass(), "employees", term16790);
        setField(term16789, term16789.getClass(), "tasks", term16803);
        setIntField(term16812, term16812.getClass(), "nanos", 689000000);
        setLongField(term16812, term16812.getClass(), "fastTime", 1550688194000L);
        setField(term16812, term16812.getClass(), "cdate", null);
        setField(term16789, term16789.getClass(), "createdDate", term16812);
        setIntField(term16815, term16815.getClass(), "nanos", 131000000);
        setLongField(term16815, term16815.getClass(), "fastTime", 1804987287000L);
        setField(term16815, term16815.getClass(), "cdate", null);
        setField(term16789, term16789.getClass(), "lastModifiedDate", term16815);
        setIntField(term16789, term16789.getClass(), "id", -1465035361);
        setField(term16789, term16789.getClass(), "name", "rYbtIDVdnd");
        setBooleanField(term16789, term16789.getClass(), "isArchived", false);
        term16832 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16832;
        callMethod(klass, "equals", argTypes, term16789, args);
    }

};


