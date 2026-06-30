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

public class ProjectDetailDto_setLastModifiedDate_6868243588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16352;
     Object term16435;

    public ProjectDetailDto_setLastModifiedDate_6868243588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16439 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term16438 = ((Class) term16439).getDeclaredField((String) "EMPLOYEE");
        ((Field) term16438).setAccessible(true);
        Object enum38 = ((Field) term16438).get((Object) null);
        Float term16362 = new Float(0.022591352F);
        Object term16355 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term16355, term16355.getClass(), "id", 1655935355);
        setField(term16355, term16355.getClass(), "firstName", "");
        setField(term16355, term16355.getClass(), "middleName", "");
        setField(term16355, term16355.getClass(), "lastName", "");
        setField(term16355, term16355.getClass(), "projectRoleId", enum38);
        setField(term16355, term16355.getClass(), "externalRate", term16362);
        ArrayList term16353 = new ArrayList();
        ((ArrayList) term16353).add(term16355);
        Object term16368 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term16368, term16368.getClass(), "id", -6645965768855543712L);
        setField(term16368, term16368.getClass(), "name", "");
        setBooleanField(term16368, term16368.getClass(), "billable", false);
        setBooleanField(term16368, term16368.getClass(), "isArchived", false);
        Object term16373 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term16373, term16373.getClass(), "id", 4784595517102746672L);
        setField(term16373, term16373.getClass(), "name", "");
        setBooleanField(term16373, term16373.getClass(), "billable", false);
        setBooleanField(term16373, term16373.getClass(), "isArchived", true);
        Object term16378 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term16378, term16378.getClass(), "id", -7612550318181586304L);
        setField(term16378, term16378.getClass(), "name", "");
        setBooleanField(term16378, term16378.getClass(), "billable", true);
        setBooleanField(term16378, term16378.getClass(), "isArchived", false);
        Object term16383 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term16383, term16383.getClass(), "id", -2170847986967241072L);
        setField(term16383, term16383.getClass(), "name", "");
        setBooleanField(term16383, term16383.getClass(), "billable", false);
        setBooleanField(term16383, term16383.getClass(), "isArchived", false);
        Object term16388 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term16388, term16388.getClass(), "id", 4044358158040652353L);
        setField(term16388, term16388.getClass(), "name", "");
        setBooleanField(term16388, term16388.getClass(), "billable", false);
        setBooleanField(term16388, term16388.getClass(), "isArchived", false);
        Object term16393 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term16393, term16393.getClass(), "id", -4443169559037975007L);
        setField(term16393, term16393.getClass(), "name", "");
        setBooleanField(term16393, term16393.getClass(), "billable", false);
        setBooleanField(term16393, term16393.getClass(), "isArchived", false);
        Object term16398 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term16398, term16398.getClass(), "id", -3842548265506930260L);
        setField(term16398, term16398.getClass(), "name", "");
        setBooleanField(term16398, term16398.getClass(), "billable", false);
        setBooleanField(term16398, term16398.getClass(), "isArchived", true);
        Object term16403 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term16403, term16403.getClass(), "id", -5788180182343976541L);
        setField(term16403, term16403.getClass(), "name", "");
        setBooleanField(term16403, term16403.getClass(), "billable", false);
        setBooleanField(term16403, term16403.getClass(), "isArchived", false);
        Object term16408 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term16408, term16408.getClass(), "id", 2936323121573284007L);
        setField(term16408, term16408.getClass(), "name", "");
        setBooleanField(term16408, term16408.getClass(), "billable", true);
        setBooleanField(term16408, term16408.getClass(), "isArchived", true);
        ArrayList term16366 = new ArrayList();
        ((ArrayList) term16366).add(term16368);
        ((ArrayList) term16366).add(term16373);
        ((ArrayList) term16366).add(term16378);
        ((ArrayList) term16366).add(term16383);
        ((ArrayList) term16366).add(term16388);
        ((ArrayList) term16366).add(term16393);
        ((ArrayList) term16366).add(term16398);
        ((ArrayList) term16366).add(term16403);
        ((ArrayList) term16366).add(term16408);
        term16352 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto"));
        Object term16415 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term16418 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term16352, term16352.getClass(), "employees", term16353);
        setField(term16352, term16352.getClass(), "tasks", term16366);
        setIntField(term16415, term16415.getClass(), "nanos", 580000000);
        setLongField(term16415, term16415.getClass(), "fastTime", 1437746523000L);
        setField(term16415, term16415.getClass(), "cdate", null);
        setField(term16352, term16352.getClass(), "createdDate", term16415);
        setIntField(term16418, term16418.getClass(), "nanos", 825000000);
        setLongField(term16418, term16418.getClass(), "fastTime", 1668558429000L);
        setField(term16418, term16418.getClass(), "cdate", null);
        setField(term16352, term16352.getClass(), "lastModifiedDate", term16418);
        setIntField(term16352, term16352.getClass(), "id", -481533957);
        setField(term16352, term16352.getClass(), "name", "pJbnHTYrxn");
        setBooleanField(term16352, term16352.getClass(), "isArchived", false);
        term16435 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term16435, term16435.getClass(), "nanos", 647000000);
        setLongField(term16435, term16435.getClass(), "fastTime", 1725111417000L);
        setField(term16435, term16435.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term16435;
        callMethod(klass, "setLastModifiedDate", argTypes, term16352, args);
    }

};


