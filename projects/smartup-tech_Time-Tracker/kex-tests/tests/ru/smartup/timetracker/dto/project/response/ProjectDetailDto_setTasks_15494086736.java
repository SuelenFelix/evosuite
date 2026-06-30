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
import java.util.LinkedList;

public class ProjectDetailDto_setTasks_15494086736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15084;
     Object term15122;

    public ProjectDetailDto_setTasks_15494086736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15184 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term15183 = ((Class) term15184).getDeclaredField((String) "EMPLOYEE");
        ((Field) term15183).setAccessible(true);
        Object enum35 = ((Field) term15183).get((Object) null);
        Float term15094 = new Float(0.5840714F);
        Object term15087 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term15087, term15087.getClass(), "id", 287287233);
        setField(term15087, term15087.getClass(), "firstName", "");
        setField(term15087, term15087.getClass(), "middleName", "");
        setField(term15087, term15087.getClass(), "lastName", "");
        setField(term15087, term15087.getClass(), "projectRoleId", enum35);
        setField(term15087, term15087.getClass(), "externalRate", term15094);
        ArrayList term15085 = new ArrayList();
        ((ArrayList) term15085).add(term15087);
        ArrayList term15098 = new ArrayList();
        term15084 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto"));
        Object term15102 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term15105 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term15084, term15084.getClass(), "employees", term15085);
        setField(term15084, term15084.getClass(), "tasks", term15098);
        setIntField(term15102, term15102.getClass(), "nanos", 80000000);
        setLongField(term15102, term15102.getClass(), "fastTime", 1745452162000L);
        setField(term15102, term15102.getClass(), "cdate", null);
        setField(term15084, term15084.getClass(), "createdDate", term15102);
        setIntField(term15105, term15105.getClass(), "nanos", 960000000);
        setLongField(term15105, term15105.getClass(), "fastTime", 1349058953000L);
        setField(term15105, term15105.getClass(), "cdate", null);
        setField(term15084, term15084.getClass(), "lastModifiedDate", term15105);
        setIntField(term15084, term15084.getClass(), "id", 962840079);
        setField(term15084, term15084.getClass(), "name", "JppkknKVOw");
        setBooleanField(term15084, term15084.getClass(), "isArchived", false);
        Object term15125 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term15125, term15125.getClass(), "id", 1967728129628047933L);
        setField(term15125, term15125.getClass(), "name", "iljANwuEjk");
        setBooleanField(term15125, term15125.getClass(), "billable", true);
        setBooleanField(term15125, term15125.getClass(), "isArchived", false);
        Object term15142 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term15142, term15142.getClass(), "id", 2120084523938730454L);
        setField(term15142, term15142.getClass(), "name", "");
        setBooleanField(term15142, term15142.getClass(), "billable", true);
        setBooleanField(term15142, term15142.getClass(), "isArchived", false);
        Object term15148 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term15148, term15148.getClass(), "id", 6855071767938501807L);
        setField(term15148, term15148.getClass(), "name", null);
        setBooleanField(term15148, term15148.getClass(), "billable", true);
        setBooleanField(term15148, term15148.getClass(), "isArchived", false);
        term15122 = new LinkedList();
        ((LinkedList) term15122).add(term15125);
        ((LinkedList) term15122).add(term15142);
        ((LinkedList) term15122).add(term15148);
        ((LinkedList) term15122).add((Object)null);
        ((LinkedList) term15122).add((Object)null);
        ((LinkedList) term15122).add((Object)null);
        ((LinkedList) term15122).add((Object)null);
        ((LinkedList) term15122).add((Object)null);
        ((LinkedList) term15122).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term15122;
        callMethod(klass, "setTasks", argTypes, term15084, args);
    }

};


