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

public class ProjectDetailDto_hashCode_3978031211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17954;

    public ProjectDetailDto_hashCode_3978031211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18032 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term18031 = ((Class) term18032).getDeclaredField((String) "EMPLOYEE");
        ((Field) term18031).setAccessible(true);
        Object enum42 = ((Field) term18031).get((Object) null);
        Float term17964 = new Float(0.9737084F);
        Object term17957 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term17957, term17957.getClass(), "id", -1845499264);
        setField(term17957, term17957.getClass(), "firstName", "");
        setField(term17957, term17957.getClass(), "middleName", "");
        setField(term17957, term17957.getClass(), "lastName", "");
        setField(term17957, term17957.getClass(), "projectRoleId", enum42);
        setField(term17957, term17957.getClass(), "externalRate", term17964);
        Class<? extends Object> term18373 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term18372 = ((Class) term18373).getDeclaredField((String) "EMPLOYEE");
        ((Field) term18372).setAccessible(true);
        Object enum43 = ((Field) term18372).get((Object) null);
        Float term17973 = new Float(0.21723765F);
        Object term17966 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term17966, term17966.getClass(), "id", -505439934);
        setField(term17966, term17966.getClass(), "firstName", "");
        setField(term17966, term17966.getClass(), "middleName", "");
        setField(term17966, term17966.getClass(), "lastName", "");
        setField(term17966, term17966.getClass(), "projectRoleId", enum43);
        setField(term17966, term17966.getClass(), "externalRate", term17973);
        ArrayList term17955 = new ArrayList();
        ((ArrayList) term17955).add(term17957);
        ((ArrayList) term17955).add(term17966);
        Object term17979 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term17979, term17979.getClass(), "id", -7738503207562305297L);
        setField(term17979, term17979.getClass(), "name", "");
        setBooleanField(term17979, term17979.getClass(), "billable", true);
        setBooleanField(term17979, term17979.getClass(), "isArchived", false);
        Object term17984 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term17984, term17984.getClass(), "id", 3825396310311739952L);
        setField(term17984, term17984.getClass(), "name", "");
        setBooleanField(term17984, term17984.getClass(), "billable", false);
        setBooleanField(term17984, term17984.getClass(), "isArchived", true);
        Object term17989 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term17989, term17989.getClass(), "id", -3838084482494604218L);
        setField(term17989, term17989.getClass(), "name", "");
        setBooleanField(term17989, term17989.getClass(), "billable", false);
        setBooleanField(term17989, term17989.getClass(), "isArchived", false);
        Object term17994 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term17994, term17994.getClass(), "id", 3892018155439224435L);
        setField(term17994, term17994.getClass(), "name", "");
        setBooleanField(term17994, term17994.getClass(), "billable", false);
        setBooleanField(term17994, term17994.getClass(), "isArchived", true);
        Object term17999 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term17999, term17999.getClass(), "id", 5953383087795962419L);
        setField(term17999, term17999.getClass(), "name", "");
        setBooleanField(term17999, term17999.getClass(), "billable", true);
        setBooleanField(term17999, term17999.getClass(), "isArchived", false);
        Object term18004 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term18004, term18004.getClass(), "id", 7994303628307559416L);
        setField(term18004, term18004.getClass(), "name", "");
        setBooleanField(term18004, term18004.getClass(), "billable", true);
        setBooleanField(term18004, term18004.getClass(), "isArchived", true);
        ArrayList term17977 = new ArrayList();
        ((ArrayList) term17977).add(term17979);
        ((ArrayList) term17977).add(term17984);
        ((ArrayList) term17977).add(term17989);
        ((ArrayList) term17977).add(term17994);
        ((ArrayList) term17977).add(term17999);
        ((ArrayList) term17977).add(term18004);
        term17954 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto"));
        Object term18011 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term18014 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term17954, term17954.getClass(), "employees", term17955);
        setField(term17954, term17954.getClass(), "tasks", term17977);
        setIntField(term18011, term18011.getClass(), "nanos", 385000000);
        setLongField(term18011, term18011.getClass(), "fastTime", 1347389761000L);
        setField(term18011, term18011.getClass(), "cdate", null);
        setField(term17954, term17954.getClass(), "createdDate", term18011);
        setIntField(term18014, term18014.getClass(), "nanos", 899000000);
        setLongField(term18014, term18014.getClass(), "fastTime", 1502147353000L);
        setField(term18014, term18014.getClass(), "cdate", null);
        setField(term17954, term17954.getClass(), "lastModifiedDate", term18014);
        setIntField(term17954, term17954.getClass(), "id", -344842608);
        setField(term17954, term17954.getClass(), "name", "pXdglvyrQe");
        setBooleanField(term17954, term17954.getClass(), "isArchived", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term17954, args);
    }

};


